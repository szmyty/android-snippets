package com.github.szmyty.android.snippets.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SimpleRepositoryImpl @Inject constructor() : SimpleRepository {

    override fun observeCount(): Flow<Any> = flow {
        emit(1)
    }
}
