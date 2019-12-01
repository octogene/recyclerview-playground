plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(configs.AndroidConfig.compileSdk)
    buildToolsVersion(configs.AndroidConfig.buildToolsVersion)

    defaultConfig {
        applicationId = configs.AndroidConfig.applicationId
        minSdkVersion(configs.AndroidConfig.minSdk)
        targetSdkVersion(configs.AndroidConfig.targetSdk)
        versionCode = Versioning.version.code
        versionName = Versioning.version.name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    sourceSets {
    	getByName("androidTest").java.srcDirs("src/androidTest/kotlin")
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }
}

dependencies {
    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.coroutinesCore)
    implementation(Libraries.coroutinesAndroid)
    implementation(Libraries.appCompat)
    implementation(Libraries.coreAndroidx)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.recyclerView)
    
    implementation(Libraries.materialDesign)
    testImplementation(Libraries.jUnit)
    androidTestImplementation(Libraries.androidTestRunner)
    androidTestImplementation(Libraries.espressoCore)
}
