package com.ciscospark

import java.net.URI
import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Message(
        var id: String? = null,
        var roomId: String? = null,
        var toPersonId: String? = null,
        var toPersonEmail: String? = null,
        var personId: String? = null,
        var personEmail: String? = null,
        var text: String? = null,
        var file: String? = null,
        var roomType: String? = null,
        var created: Date? = null,
        var files: Array<URI>? = null,
        var markdown: String? = null,
        var html: String? = null,
        var mentionedPeople: Array<String>? = null,
        var attachments: List<Card>? = null
)
