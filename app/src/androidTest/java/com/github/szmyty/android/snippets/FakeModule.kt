package com.github.szmyty.android.snippets

import com.github.szmyty.android.snippets.di.RepositoryModule
import com.github.szmyty.android.snippets.repository.FakeSimpleRepository
import com.github.szmyty.android.snippets.repository.SimpleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
abstract class FakeModule {

    @Singleton
    @Binds
    abstract fun bindSimpleRepository(
        fakeSimpleRepository: FakeSimpleRepository
    ): SimpleRepository
}
