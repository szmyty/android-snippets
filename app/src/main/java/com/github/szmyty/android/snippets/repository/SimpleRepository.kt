package com.github.szmyty.android.snippets.repository

import kotlinx.coroutines.flow.Flow

interface SimpleRepository {

    fun observeCount(): Flow<Any>
}
