import java.util.*

data class Post(
    var id: Long = 0,
    val date: Long,
    val text: String?,
    val friendsOnly: Boolean,
    val comments: Comments?,
    val donut: Donut?,
    val likes: Likes?,
    val views: Views?,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isFavorite: Boolean,
    val attachments: Array<Attachment>? = emptyArray(),
    )

data class Views(
    val count: Long
)
data class Comment(
    val id : Int,
    val postId : Long,
    val fromId : Int,
    val date : Int,
    val text : String,
    val donut : Donut?,
    val attachments : Array<Attachment>? = emptyArray(),
    val parentsStack : Array<Int>? = emptyArray(),
    val thread : Thread?
)
data class Comments(
    val count : Int,
    val canPost : Boolean,
    val groupsCanPost : Boolean,
    val canClose : Boolean,
    val canOpen : Boolean
)
data class Donut(
    val isDonut : Boolean,
    val paidDuration : Int,
    val placeholder : String,
    val canPublishFreeCopy : Boolean,
    val editMode : String
)
data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

data class Note(
    val id: Int, // Идентификатор заметки.
    val owner_id: Int, // Идентификатор владельца заметки.
    val title: String, // Заголовок заметки.
    val text: String, // Текст заметки.
    val date: Int, // Дата создания заметки в формате Unixtime.
    val comments: Int, // Количество комментариев.
    val readComments: Int, // Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl: String, // URL страницы для отображения заметки.
    val privacyView: String, // Настройки приватности просмотра заметки
    val privacyComment: String, // Настройки приватности комментирования заметки
    val canComment: Boolean, // Есть ли возможность оставлять комментарии
    val textWiki: String // Тэги ссылок на wiki
)

data class Audio(
    val id: Int, // Идентификатор аудиозаписи.
    val owner_id: Int, // Идентификатор владельца аудиозаписи.
    val artist: String, // Исполнитель
    val title: String, // Название композиции
    val duration: Int, // Длительность аудиозаписи в секундах
    val url: String, // Ссылка на mp3.
    val lyrics_id: Int, // Идентификатор текста аудиозаписи (если доступно).
    val album_id: Int, // Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genre_id: Int, // Идентификатор жанра из списка аудио жанров.
    val date: Int, // Дата добавления.
    val no_search: Int, // 1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val is_hq: Int, // 1, если аудио в высоком качестве.
)

data class Graffiti(
    val id: Int, // Идентификатор граффити.
    val owner_id: Int, // Идентификатор пользователя, загрузившего графити
    val url: String, // Адрес граффити, по которому его можно загрузить.
    val width: Int, // Ширина изображения в px.
    val height: Int, // Высота изображения в px.
)

data class Gift(
    val id: Int, // Идентификатор подарка.
    val thumb_256: String, // URL изображения 256x256px.
    val thumb_96: String, // URL изображения 96x96px.
    val thumb_48: String, // URL изображения 48x48px.
)

data class Link(
    val url: String, // URL ссылки
    val title: String, // Заголовок ссылки
    val caption: String, // Подпись ссылки (если имеется)
    val description: String, //Описание ссылки.
    val photo: Objects?, // Изображение превью, объект фотографии (если имеется)
    val product: Objects?, // Информация о продукте (если имеется)
    val button: Objects?, // Информация о кнопке для перехода (если имеется). Объект описан на отдельной странице.
    val previewPage: String, // Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val previewUrl: String, // URL страницы с контентом для предпросмотра содержимого страницы.
)
