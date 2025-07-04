plugins {
    `kotlin-dsl`
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}
dependencies {
    compileOnly("com.android.tools.build:gradle:8.6.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.25")
}