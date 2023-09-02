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
    implementation(project(":designsystem"))
    implementation(project(":domain"))
    api(libs.bundles.compose)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso.core)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}