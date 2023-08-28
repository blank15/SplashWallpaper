pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "wallpaper"
include(":app")
include(":data")
include(":domain")
include(":core")
include(":designsystem")
include(":feature:home")
include(":feature:about")
include(":feature:collection")
include(":ui")
