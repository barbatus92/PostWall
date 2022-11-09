class WallService {
    private var posts: Array<Post> = emptyArray()
    var nextId: Long = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val newPost = post.copy(id = nextId)
        posts += newPost
        nextId += 1
        return posts.last()
    }

    fun update(updatePost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatePost.id) {
                posts[index] = updatePost.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false

    }
    fun print() {
        for (post in posts) {
            println(post)
        }
        println("  NextId=$nextId")
    }

    fun clear() {
        posts = emptyArray()
    }
    class PostNotFoundException (message: String) : RuntimeException(message)

    fun createComment(comment: Comment): Boolean {
        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Такой пост не найден")
    }
}