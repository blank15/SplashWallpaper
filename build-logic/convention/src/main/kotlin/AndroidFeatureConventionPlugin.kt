
import com.blank.wallpaper.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("wallpaper.android.library")
            }


            dependencies {
                add("implementation", project(":designsystem"))
                add("implementation", project(":ui"))
                add("implementation", project(":data"))
                add("implementation", project(":domain"))

                add("testImplementation", kotlin("test"))
                add("androidTestImplementation", kotlin("test"))
                add("implementation",libs.findLibrary("compose-navigation").get())
                add("implementation", libs.findLibrary("kotlinx.coroutines.android").get())
            }
        }
    }
}
