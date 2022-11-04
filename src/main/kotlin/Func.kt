data class Post(
    var id: Long = 0,
    val date: Long,
    val text: String,
    val friendsOnly: Boolean,
    val comments: Comments,
    val likes: Likes,
    val views: Views,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isFavorite: Boolean,
)

data class Views(
    val count: Long
)

data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)
