plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

//repositories {
//    mavenLocal()
//    mavenCentral()
//}

android {
    namespace = "com.example.blankproject"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.blankproject"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

//    implementation(project(":test-react-native-aar"))


    // you have to build this version in WalleePayment project and release to maven local there is script for it
//    implementation("com.walleepaymentreact:walleepayment:0.0.1-local")
//    implementation("com.walleepaymentreact:walleepayment:0.0.2-turbo-modules")
//    implementation("com.walleepaymentreact:walleepayment:0.0.3-turbo-modules")
//    implementation("com.walleepaymentreact:walleepayment:0.0.4-turbo-modules-imports")
    implementation("com.walleepaymentreact:walleepayment:0.0.5-turbo-modules-newpackage")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}