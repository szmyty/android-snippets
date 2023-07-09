@file:Suppress("UnstableApiUsage")

// https://docs.gradle.org/current/userguide/build_cache.html
buildCache {
    local {
        directory = File(rootDir, ".cache")
        removeUnusedEntriesAfterDays = 7
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")

            // https://github.com/ben-manes/gradle-versions-plugin/issues/541#issuecomment-957483372
            content {
                excludeGroupByRegex("com/github/ben-manes/*")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
    }

    versionCatalogs {
        create("extraLibs") {
            from(files("./gradle/catalogs/extra.toml"))
        }
    }
}

rootProject.name = "android-snippets"
include(":app")
