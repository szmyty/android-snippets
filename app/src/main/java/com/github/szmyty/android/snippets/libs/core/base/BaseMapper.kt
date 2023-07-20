package com.github.szmyty.android.snippets.libs.core.base

interface BaseMapper<FROM, TO> {
    fun map(from: FROM): TO
}
