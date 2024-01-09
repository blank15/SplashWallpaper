plugins {
    id("wallpaper.android.library")
    id("wallpaper.android.hilt")
}

android {
    namespace = "com.blank.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.bundles.network)
    implementation(libs.kotlinx.serialization.json)
    implementation(project(":domain"))
}