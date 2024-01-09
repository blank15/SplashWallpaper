plugins {
    id("wallpaper.android.library")
    kotlin("kapt")
}

android {
    namespace = "com.blank.domain"

}

dependencies {

    implementation(libs.hilt.android)
    implementation(libs.kotlinx.coroutines.android)
    kapt(libs.hilt.compiler)
}