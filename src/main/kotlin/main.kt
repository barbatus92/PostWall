fun main() {

    val note1 = Note(
        123,
        43,
        "Не забыть",
        "La-La_Pum",
        12_12_12,
        23,
        1,
        "www.notes.ru",
        "privat",
        "privat",
        true,
        "www.wiki.ru",
    )
    val audio1 = Audio(
        999,
        12,
        "artist",
        "title",
        1233,
        "www.music.ru",
        4,
        1,
        3,
        23_12_21,
        67,
        4
    )
    val graffiti1 = Graffiti(
        45,
        12,
        "www.graffiti.ru",
        23,
        34,
    )
    val gift1 = Gift(
        31,
        "124",
        "34",
        "56"
    )
    val link1 = Link(
        "www.link.ru", // URL ссылки
        "Link", // Заголовок ссылки
        "", // Подпись ссылки (если имеется)
        "la la lu lu", //Описание ссылки.
        null,
        null,
        null,
        "owner_id_page_id",
        "www.post.ru",
    )
    val attachmentNote1 = NoteAttachment(note1)
    val attachmentLink1 = LinkAttachment(link1)
    val attachmentGraffiti1 = GraffitiAttachment(graffiti1)
    val attachmentGift1 = GiftAttachment(gift1)
    val attachmentAudio1 = AudioAttachment(audio1)

    val post1 = Post(
        1,
        12_12_2022,
        "Hello",
        false,
        Comments(1, true, true, false, true),
        null,
        Views(5),
        true,
        true,
        true,
        arrayOf(attachmentGift1)
    )

    val post2 = Post(
        2,
        13_12_2022,
        "My name is Alex",
        false,
        Comments(3, true, true, false, true),
       null,
        Views(0),
        true,
        false,
        false,
        null
    )

    WallService.add(post1)
    WallService.add(post2)
    WallService.print()

/*    if (WallService.update(post4)) WallService.print()
    if (WallService.update(post3)) WallService.print()*/
}