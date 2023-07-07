dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
        create("coilLibs") {
            from(files("../gradle/catalogs/coil.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")
