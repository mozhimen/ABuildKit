package com.mozhimen.buildk.basic

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

/**
 * @ClassName Flavor
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/6/17
 * @Version 1.0
 */
fun CommonExtension<*, *, *, *, *, *>.configureAndroidCommon() {
    this.apply {
        compileSdk = 35

        buildTypes {
            named("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }
}

fun KotlinJvmOptions.configureAndroidKotlin() {
    this.apply {
        jvmTarget = "1.8"
    }
}

fun CommonExtension<*,*,*,*,*,*>.configureAndroidFlavor(dimensions:String,flavors:List<String>){
    this.apply {
        flavorDimensions += dimensions
        productFlavors {
            flavors.forEach { flavorName->
                create(flavorName) {
                    dimension = dimensions
                    // 可以在这里添加其他特定配置
                    // manifestPlaceholders.put("CHANNEL", "guanwang")
                    // buildConfigField("String", "CHANNEL", "\"guanwang\"")
                }
            }
        }
    }
}