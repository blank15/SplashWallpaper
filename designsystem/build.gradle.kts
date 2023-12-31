plugins {
    id("wallpaper.android.library")
    id("wallpaper.android.library.compose")
}

android {
    namespace = "com.blank.designsystem"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    api(libs.core.ktx)
    api(libs.bundles.compose)
}