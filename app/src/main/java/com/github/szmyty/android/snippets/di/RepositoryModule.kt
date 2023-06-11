package com.github.szmyty.android.snippets.di

import com.github.szmyty.android.snippets.repository.SimpleRepository
import com.github.szmyty.android.snippets.repository.SimpleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSimpleRepository(
        simpleRepositoryImpl: SimpleRepositoryImpl
    ): SimpleRepository
}