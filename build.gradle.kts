import cz.bs.Config

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        // FIXME: THIS WORKS
        classpath("com.android.tools.build:gradle:3.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.11")

        // FIXME: THIS DIDN'T WORK when use KTS. When I was using build.gradle file, it works
//        classpath("com.android.tools.build:gradle:${Config.Versions.gradleBuildTools}")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Config.Versions.kotlinVersion}")

        // FIXME: THIS DIDN'T WORK when use KTS. When I was using build.gradle file, it works
//        classpath(Config.BuildPlugins.androidPlugin)
//        classpath(Config.BuildPlugins.kotlinPlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

// tasks.withType(Wrapper::class.java).configureEach {
tasks.withType<Wrapper> {
    // https://services.gradle.org/distributions/
    gradleVersion = "5.0"

    distributionUrl = distributionUrl.replace("bin", "all")
}
