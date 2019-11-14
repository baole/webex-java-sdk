package com.ciscospark

import java.net.URI
import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Webhook(
    var id: String? = null,
    var name: String? = null,
    var resource: String? = null,
    var event: String? = null,
    var filter: String? = null,
    var targetUrl: URI? = null,
    var secret: String? = null,
    var created: Date? = null

)
