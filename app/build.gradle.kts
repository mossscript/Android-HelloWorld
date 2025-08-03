plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "io.mossscript.hello"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.mossscript.hello"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true 
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
           isMinifyEnabled = true
           isShrinkResources = true
           proguardFiles(
              getDefaultProguardFile("proguard-android-optimize.txt"),
              "proguard-rules.pro"
           )
        }
    }
    compileOptions {
       sourceCompatibility = JavaVersion.VERSION_17
       targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
       jvmToolchain(17)
    }
}

dependencies {
    //implementation("androidx.core:core-ktx:1.13.1")
    //implementation("androidx.appcompat:appcompat:1.6.1")
    //implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //implementation("com.google.android.material:material:1.11.0")
}
