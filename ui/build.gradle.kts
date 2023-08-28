plugins {
    id("wallpaper.android.library")
    id("wallpaper.android.library.compose")
}

android {
    namespace = "com.blank.ui"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    implementation(libs.core.ktx)
    api(libs.bundles.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso.core)
}