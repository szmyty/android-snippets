package com.github.szmyty.android.snippets

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.szmyty.android.snippets.repository.FakeSimpleRepository
import com.github.szmyty.android.snippets.repository.SimpleRepository
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * Testing using Kotlin Flows.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 * See [Testing Kotlin flows on Android](https://developer.android.com/kotlin/flow/test)
 */
@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class KotlinFlowTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    lateinit var context: Context

    @Inject
    lateinit var simpleRepository: SimpleRepository

    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()
        hiltRule.inject()
    }

    @Test
    fun testSimpleRepositoryFlows() {
        // Given a class with fake dependencies:
//        val sut = MyUnitUnderTest(MyFakeRepository())
        // Trigger and verify

        simpleRepository.observeCount()

    }


}