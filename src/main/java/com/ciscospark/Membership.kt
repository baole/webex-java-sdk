package com.ciscospark

import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Membership(
        var id: String? = null,
        var roomId: String? = null,
        var personId: String? = null,
        var personDisplayName: String? = null,
        var personEmail: String? = null,
        var isModerator: Boolean? = null,
        var isMonitor: Boolean? = null,
        var created: Date? = null

)
