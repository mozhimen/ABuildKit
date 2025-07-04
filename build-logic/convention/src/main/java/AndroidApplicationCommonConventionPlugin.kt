import com.android.build.api.dsl.ApplicationExtension
import com.mozhimen.buildk.basic.configureAndroidCommon
import com.mozhimen.buildk.basic.configureAndroidKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

/**
 * @ClassName AndroidFlavorConventionPlugin
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/6/17
 * @Version 1.0
 */
class AndroidApplicationCommonConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            extensions.configure<ApplicationExtension> {
                configureAndroidCommon()
            }
            extensions.configure<KotlinJvmOptions> {
                configureAndroidKotlin()
            }
        }
    }
}