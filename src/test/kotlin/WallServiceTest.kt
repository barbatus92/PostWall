
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WallServiceTest {

   /* @Before
    fun clearBeforeTest() {
        WallService.clear()
    }*/
    @Test
    fun wallServiceTestAddPost() {
        val service = WallService()
        val newPost = service.add(
            Post(
                1,
                12_12_2022,
                "Hello",
                false,
                Comments(1, true, true, false, true),
                null,
                Likes(52, true, true, true),
                Views(5),
                true,
                true,
                true,
                null,
            )
        )
        assertTrue(newPost.id > 0)
    }


    @Test
    fun updateExisting() {
        val service = WallService()
        val post1 = Post(
            1,
            12_12_2022,
            "Hello",
            false,
            Comments(1, true, true, false, true),
            null,
            Likes(52, true, true, true),
            Views(5),
            true,
            true,
            true,
            null,
        )

        val post2 = Post(
            2,
            13_12_2022,
            "My name is Alex",
            false,
            Comments(3, true, true, false, true),
            null,
            Likes(2, true, true, true),
            Views(0),
            true,
            false,
            false,
            null,
        )
        val update = Post(
            2,
            13_10_2022,
            "My name is Marina",
            false,
            Comments(3, true, true, false, true),
            null,
            Likes(2, true, true, true),
            Views(0),
            true,
            false,
            false,
            null,
        )
        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertTrue(result)
    }


    @Test
    fun updateNonExisting() {
        val service = WallService()
        val post1 = Post(
            1,
            12_12_2022,
            "Hello",
            false,
            Comments(1, true, true, false, true),
            null,
            Likes(52, true, true, true),
            Views(5),
            true,
            true,
            true,
            null,
        )

        val post2 = Post(
            2,
            13_12_2022,
            "My name is Alex",
            false,
            Comments(3, true, true, false, true),
            null,
            Likes(2, true, true, true),
            Views(0),
            true,
            false,
            false,
            null,
        )
        val update = Post(
            56,
            13_10_2022,
            "My name is Marina",
            false,
            Comments(3, true, true, false, true),
            null,
            Likes(2, true, true, true),
            Views(0),
            true,
            false,
            false,
            null,
        )
        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertFalse(result)
    }
@Test
fun createCommentWithoutException() {
    val service = WallService()
    val post1 = Post(
        87,
        12_12_2022,
        "Hello",
        false,
        Comments(1, true, true, false, true),
        null,
        Likes(52, true, true, true),
        Views(5),
        true,
        true,
        true,
        null,
    )
    service.add(post1)

    val comment1 = Comment(
        222,
        1,
        14,
        5_02_98,
        "Hi people",
        null,
        null,
        null,
        null
    )

    val result = service.createComment(comment1)
    assertTrue(result)
}

    @Test(expected = WallService.PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        val post1 = Post(
            87,
            12_12_2022,
            "Hello",
            false,
            Comments(1, true, true, false, true),
            null,
            Likes(52, true, true, true),
            Views(5),
            true,
            true,
            true,
            null,
        )
        service.add(post1)

        val comment1 = Comment(
            222,
            2,
            14,
            5_02_98,
            "Hi people",
            null,
            null,
            null,
            null
        )
        service.createComment(comment1)
    }
}