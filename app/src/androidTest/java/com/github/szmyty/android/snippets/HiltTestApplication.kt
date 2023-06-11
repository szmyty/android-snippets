package com.github.szmyty.android.snippets

import com.github.szmyty.android.snippets.base.BaseApplication
import dagger.hilt.android.testing.CustomTestApplication

@CustomTestApplication(BaseApplication::class)
interface HiltTestApplication
