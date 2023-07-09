@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
        create("extraLibs") {
            from(files("../gradle/catalogs/extra.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")
