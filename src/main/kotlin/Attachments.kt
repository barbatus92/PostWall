interface Attachment {
    val type: String

}
class AudioAttachment(func : Audio) : Attachment {
    override val type: String = "audio"
    private val audio = func

    override fun toString() : String{
        return "\n  $audio"
    }
}
class NoteAttachment(func : Note) : Attachment {
    override val type: String = "note"
    private val note = func

    override fun toString() : String{
        return "\n  $note"
    }
}

class GiftAttachment(func : Gift) : Attachment {
    override val type: String = "gift"
    private val gift = func

    override fun toString() : String{
        return "\n  $gift"
    }
}

class GraffitiAttachment(func : Graffiti) : Attachment {
    override val type: String = "graffiti"
    private val graffiti = func

    override fun toString() : String{
        return "\n  $graffiti"
    }
}
class LinkAttachment(func : Link) : Attachment {
    override val type: String = "link"
    private val link = func

    override fun toString() : String{
        return "\n  $link"
    }
}
