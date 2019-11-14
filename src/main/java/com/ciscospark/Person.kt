package com.ciscospark

import java.util.*

/**
 * Copyright (c) 2015 Cisco Systems, Inc. See LICENSE file.
 */
class Person(
    var id: String? = null,
    var displayName: String? = null,
    var emails: List<String>? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var avatar: String? = null,
    var orgId: String? = null,
    var roles: List<String>? = null,
    var licenses: List<String>? = null,
    var created: Date? = null,
    var timeZone: String? = null,
    var lastActivity: Date? = null,
    var status: String? = null,
    var type: String? = null,
    var phoneNumbers: List<PhoneNumber>? = null,
    var loginEnabled: Boolean? = null,
    var lastModified: Date? = null,
    var nickName: String? = null,
    var invitePending: Boolean? = null

)
