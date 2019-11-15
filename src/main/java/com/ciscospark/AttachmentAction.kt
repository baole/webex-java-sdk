package com.ciscospark

data class AttachmentAction (
        var id: String? = null,
        var personId: String? = null,
        var roomId: String? = null,
        var type: String? = null,
        var messageId: String? = null,
        var created: String? = null,
        var inputs: MutableMap<String, Any>? = null
)
