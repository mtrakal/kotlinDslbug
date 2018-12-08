package cz.bs

import org.gradle.api.JavaVersion

// https://github.com/gradle/kotlin-dsl/issues/1088
// https://expertise.jetruby.com/how-to-write-gradle-scripts-with-kotlin-dsl-better-than-groovy-a63ffc9be2e3

object Config {

    object Versions {
        const val kotlinVersion = "1.3.11"
        const val gradleBuildTools = "3.2.1"

        val sourceCompatibility = JavaVersion.VERSION_1_8
        val targetCompatibility = JavaVersion.VERSION_1_8

        // sdk and tools
        const val compileSdkVersion = 28
        const val buildToolsVersion = "28.0.3"
        const val minSdkVersion = 16
        const val targetSdkVersion = 26

        object Google {
            object Android {
                const val material = "1.0.0"
            }
        }

        object AndroidX {
            // https://developer.android.com/topic/libraries/support-library/androidx-rn
            const val core = "1.0.1"
            const val appcompat = "1.0.2"
            const val cardview = "1.0.0"

            object KTX {
                // https://developer.android.com/kotlin/ktx
                const val core = AndroidX.core
                const val collection = "1.0.0"
            }
        }

        object Firebase {
            // https://firebase.google.com/support/release-notes/android
            // https://dl.google.com/dl/android/maven2/index.html > com.google.firebase
            const val core = "16.0.4"
        }

        object Testing {
            const val jUnitVersion = "4.12"
        }

        const val ankoVersion = "0.10.7" // https://github.com/Kotlin/anko/
    }

    object BuildPlugins {
        const val androidPlugin = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlinPlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }

    object Libs {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    }
}