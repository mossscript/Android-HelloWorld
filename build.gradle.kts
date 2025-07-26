plugins {
    id("com.android.application") version "8.1.0"
    kotlin("android") version "1.9.0"
}

android {
    namespace = "io.mossscript.hello"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.mossscript.hello"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
