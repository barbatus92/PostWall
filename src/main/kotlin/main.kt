fun main() {

    val post1 = Post(
        1,
        12_12_2022,
        "Hello",
        false,
        Comments(1, true, true, false, true),
        Likes(52, true, true, true),
        Views(5),
        true,
        true,
        true,
    )

    val post2 = Post(
        2,
        13_12_2022,
        "My name is Alex",
        false,
        Comments(3, true, true, false, true),
        Likes(2, true, true, true),
        Views(0),
        true,
        false,
        false,
    )

/*    WallService.add(post1)
    WallService.add(post2)
    WallService.print()

    if (WallService.update(post4)) WallService.print()
    if (WallService.update(post3)) WallService.print()*/
}