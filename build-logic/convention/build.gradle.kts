import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly("com.android.tools.build:gradle:8.6.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.25")
    implementation(project(":ABuildKit:basic"))
}

//tasks {
//    validatePlugins {
//        enableStricterValidation = true
//        failOnWarning = true
//    }
//}

gradlePlugin {
    plugins {
        register("androidApplicationCommon") {
            id = "android.application.common"
            implementationClass = "AndroidApplicationCommonConventionPlugin"
        }
//        register("androidLibraryFlavor") {
//            id = "android.library.flavor"
//            implementationClass = "AndroidLibraryFlavorConventionPlugin"
//        }
    }
}