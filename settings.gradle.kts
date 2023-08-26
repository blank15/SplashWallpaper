pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
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
include(":build-logic:convention")
