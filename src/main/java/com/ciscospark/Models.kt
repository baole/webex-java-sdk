package com.ciscospark


/**
 * https://docs.microsoft.com/en-us/azure/bot-service/rest-api/bot-framework-rest-connector-add-suggested-actions?view=azure-bot-service-3.0
 */
data class SuggestedActions(val actions: List<CardButton>)

/**
 * Card definition
 * see more details in https://adaptivecards.io/explorer/AdaptiveCard.html
 */
data class Card(val content: CardContent, val contentType: String = CONTENT_TYPE_ADAPTIVE) {
    companion object {
        const val CONTENT_TYPE_HERO = "application/vnd.microsoft.card.hero"
        const val CONTENT_TYPE_ADAPTIVE = "application/vnd.microsoft.card.adaptive"
    }

    fun estimateSize() = 0
}

open class CardContent(val version: String = "1.0",
                       val `$schema`: String = "http://adaptivecards.io/schemas/adaptive-card.json")

data class HeroCard(val title: String? = null,
                    val subtitle: String? = null,
                    val text: String? = null,
                    val images: List<Url>? = null,
                    val buttons: List<CardButton>) : CardContent()

data class Url(val url: String)


abstract class CardButton(val type: String) {
    companion object {
        const val TYPE_OPENURL = "openUrl"
        const val TYPE_MESSAGE_BACK = "messageBack"
        const val TYPE_IM_BACK = "imBack"
        const val TYPE_INVOKE = "invoke"
        const val TYPE_SIGNIN = "signin"
    }
}

data class OpenUrlButton(val title: String,
                         val value: String) :
        CardButton(type = TYPE_OPENURL)

data class MessageBackButton(val title: String,
                             val value: String,
                             val text: String,
                             val displayText: String? = null) :
        CardButton(type = TYPE_MESSAGE_BACK)

data class ImBackButton(val title: String,
                        val value: String,
                        val text: String? = null) :
        CardButton(type = TYPE_IM_BACK)

data class InvokeButton(val title: String,
                        val value: Map<String, String>) :
        CardButton(type = TYPE_INVOKE)


data class AdaptiveCard(val body: List<CardBody>,
                       val actions: List<CardAction>? = null,
                       val type: String = TYPE_ADAPTIVE_CARD,
                       val selectAction: String? = null,
                       val fallbackText: String? = null,
                       val backgroundImage: String? = null

) : CardContent() {
    companion object {
        const val TYPE_ADAPTIVE_CARD = "AdaptiveCard"
    }
}

abstract class CardBody(val type: String) {
    companion object {
        const val TYPE_TEXTBLOCK = "TextBlock"

        const val TYPE_INPUT_TEXT = "Input.Text"
        const val TYPE_INPUT_NUMBER = "Input.Number"
        const val TYPE_INPUT_DATE = "Input.Date"
        const val TYPE_INPUT_TIME = "Input.Time"
        const val TYPE_INPUT_TOGGLE = "Input.Toggle"
        const val TYPE_INPUT_CHOICE_SET = "Input.ChoiceSet"
        const val TYPE_INPUT_CHOICE = "Input.Choice"

        const val TYPE_IMAGE = "Image"
        const val TYPE_MEDIA = "Media"

        const val TYPE_CONTAINER = "Container"
        const val TYPE_COLUMN_SET = "ColumnSet"
        const val TYPE_FACT_SET = "FactSet"
        const val TYPE_IMAGE_SET = "ImageSet"
    }
}

data class TextBlockCard(val text: String,
                         val id: String? = null,
                         val color: String? = null,
                         val horizontalAlignment: String? = null,
                         val isSubtle: Boolean? = null,
                         val maxLines: Int? = null,
                         val size: String? = null,
                         val weight: String? = null,
                         val wrap: Boolean? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null
) : CardBody(TYPE_TEXTBLOCK)

data class InputTextCard(val id: String,
                         val isMultiline: Boolean = false,
                         val maxLength: Int? = null,
                         val placeholder: String? = null,
                         val style: String? = null,
                         val value: String? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null
) : CardBody(TYPE_INPUT_TEXT)

data class InputNumberCard(val id: String,
                           val min: Int? = null,
                           val max: Int? = null,
                           val placeholder: String? = null,
                           val value: String? = null,
                           val spacing: String? = null,
                           val separator: Boolean? = null
) : CardBody(TYPE_INPUT_NUMBER)


data class InputDateCard(val id: String,
                         val min: String? = null,
                         val max: String? = null,
                         val placeholder: String? = null,
                         val value: String? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null
) : CardBody(TYPE_INPUT_DATE)


data class InputTimeCard(val id: String,
                         val min: String? = null,
                         val max: String? = null,
                         val placeholder: String? = null,
                         val value: String? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null
) : CardBody(TYPE_INPUT_TIME)

data class InputToggleCard(val id: String,
                           val title: String,
                           val value: String? = null,
                           val valueOff: String? = null,
                           val valueOn: String? = null,
                           val spacing: String? = null,
                           val separator: Boolean? = null
) : CardBody(TYPE_INPUT_TOGGLE)


data class InputChoiceSetCard(val id: String,
                              val choices: List<InputChoiceItem>,
                              val isMultiSelect: Boolean = false,
                              val style: String? = null,
                              val value: String? = null,
                              val spacing: String? = null,
                              val separator: Boolean? = null
) : CardBody(TYPE_INPUT_CHOICE_SET)

data class InputChoiceCard(val id: String,
                           val title: String,
                           val value: String
) : CardBody(TYPE_INPUT_CHOICE)

data class InputChoiceItem(val title: String,
                           val value: String,
                           val isSelected: Boolean? = null)


data class ContainerCard(val items: List<CardBody>,
                         val selectAction: String? = null,
                         val style: String? = null,
                         val verticalContentAlignment: String? = null,
                         val id: String? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null

) : CardBody(TYPE_CONTAINER)


data class ColumnSetCard(val columns: List<ColumnCardItem>,
                         val selectAction: String? = null,
                         val id: String? = null,
                         val spacing: String? = null,
                         val separator: Boolean? = null
) : CardBody(TYPE_COLUMN_SET)

data class ColumnCardItem(val items: List<CardBody>,
                          val type: String = "Column",
                          val selectAction: String? = null,
                          val style: String? = null,
                          val width: String? = null,
                          val id: String? = null,
                          val spacing: String? = null,
                          val separator: Boolean? = null
)

data class FactSetCard(val facts: List<FactCardItem>,
                       val id: String? = null,
                       val spacing: String? = null,
                       val separator: Boolean? = null
) : CardBody(TYPE_FACT_SET)


data class FactCardItem(val title: String,
                        val value: String,
                        val type: String = "Fact"
)


data class ImageSetCard(val images: List<ImageCardItem>,
                        val imageSize: String? = null,
                        val id: String? = null,
                        val spacing: String? = null,
                        val separator: Boolean? = null
) : CardBody(TYPE_IMAGE_SET)


data class ImageCardItem(val url: String,
                         val type: String = "Image"
)


data class ImageCard(val url: String,
                     val id: String? = null,
                     val altText: String? = null,
                     val horizontalAlignment: String? = null,
                     val isSubtle: Boolean = false,
                     val maxLines: Int? = null,
                     val size: String? = null,
                     val style: String? = null,
                     val spacing: String? = null,
                     val separator: Boolean? = null
) : CardBody(TYPE_IMAGE)

data class MediaCard(val poster: String? = null,
                     val id: String? = null,
                     val altText: String? = null,
                     val spacing: String? = null,
                     val separator: Boolean = false,
                     val sources: List<MediaCardSource>? = null
) : CardBody(TYPE_MEDIA)

data class MediaCardSource(val mimeType: String, val url: String)

abstract class CardAction(val type: String) {
    companion object {
        const val TYPE_OPEN_URL = "Action.OpenUrl"
        const val TYPE_SUBMIT = "Action.Submit"
        const val TYPE_SHOWCARD = "Action.ShowCard"
    }
}

data class HttpAction(val url: String,
                      val title: String? = null,
                      val iconUrl: String? = null) :
        CardAction(type = TYPE_OPEN_URL)

data class SubmitAction(val title: String? = null,
                        val data: Map<String, Any>? = null,
                        val iconUrl: String? = null
                        ) :
        CardAction(type = TYPE_SUBMIT)

data class ShowCardAction(val title: String? = null,
                          val iconUrl: String? = null,
                          val card: CardContent) :
        CardAction(type = TYPE_SHOWCARD)
