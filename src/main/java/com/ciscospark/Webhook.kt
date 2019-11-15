package com.ciscospark

import java.net.URI
import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Webhook(
    var id: String? = null,
    var name: String,
    var resource: String,
    var event: String,
    var filter: String? = null,
    var targetUrl: URI,
    var secret: String? = null,
    var created: Date? = null

)
