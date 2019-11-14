package com.ciscospark

class PhoneNumber(
        var type: String? = null,
        var value: String? = null
) {

    override fun toString(): String {
        return "type: $type number: $value"
    }
}

