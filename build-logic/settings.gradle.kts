@file:Suppress("UnstableApiUsage")

// https://docs.gradle.org/current/userguide/build_cache.html
buildCache {
    local {
        directory = File(rootDir, ".cache")
        removeUnusedEntriesAfterDays = 7
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io")}
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
        create("androidLibs") {
            from(files("../gradle/catalogs/androidx.toml"))
        }
        create("extraLibs") {
            from(files("../gradle/catalogs/extra.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")
