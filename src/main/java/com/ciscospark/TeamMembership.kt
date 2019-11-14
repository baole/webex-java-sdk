package com.ciscospark

import java.util.*

/**
 * Copyright (c) 2016 Cisco Systems, Inc. See LICENSE file.
 */
class TeamMembership(
        var id: String? = null,
        var teamId: String? = null,
        var personId: String? = null,
        var personDisplayName: String? = null,
        var personEmail: String? = null,
        var isModerator: Boolean? = null,
        var created: Date? = null
)
