package com.github.szmyty.android

/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
@Suppress("unused")
enum class AppBuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
    BENCHMARK(".benchmark")
}
