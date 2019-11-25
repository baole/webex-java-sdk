package com.ciscospark

import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Membership(
        var id: String? = null,
        var roomId: String = "",
        var personId: String = "",
        var personDisplayName: String? = null,
        var personEmail: String? = null,
        var personOrgId: String? = null,
        var isModerator: Boolean? = null,
        var isMonitor: Boolean? = null,
        var roomType: String? = null,
        var created: Date? = null
)
