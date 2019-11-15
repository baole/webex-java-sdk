package com.ciscospark

import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Room (
    var id: String? = null,
    var title: String,
    var teamId: String,
    var isLocked: Boolean? = null,
    var created: Date? = null,
    var lastActivity: Date? = null,
    var type: String,
    var sipAddress: String? = null
)
