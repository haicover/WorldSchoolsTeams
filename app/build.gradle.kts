plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.worldschoolsteams"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.worldschoolsteams"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Jetpack Compose Core Libraries
    implementation("androidx.compose.ui:ui")           // Core UI library
    implementation("androidx.compose.material:material") // Material Design components
    implementation("androidx.compose.ui:ui-tooling-preview") // Preview support in Android Studio
    implementation("androidx.activity:activity-compose:1.7.2") // Compose support for Activity
    implementation("androidx.compose.foundation:foundation") // Compose foundation components

    // Kotlin Extensions
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Coroutines for async tasks

    // Navigation (Optional but often required)
    implementation ("androidx.navigation:navigation-compose:2.7.2")

    // Icons (Optional)
    implementation ("androidx.compose.material:material-icons-core")
    implementation ("androidx.compose.material:material-icons-extended")

    // For ViewModel support in Compose (Optional)
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // LiveData support for Compose (Optional)
    implementation ("androidx.compose.runtime:runtime-livedata")

    // Animations (Optional)
    implementation ("androidx.compose.animation:animation:1.6.2")

    // Testing (Optional)
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling") // For the UI Debugging tools

    // Accompanist for system UI controls like insets, status bar colors
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.31.2-alpha")

    // For adding paging in Compose (Optional)
    implementation ("com.google.accompanist:accompanist-pager:0.31.2-alpha")

    // For handling navigation animation transitions
    implementation ("com.google.accompanist:accompanist-navigation-animation:0.31.2-alpha")

    // For loading images via Coil in Compose
    implementation ("io.coil-kt:coil-compose:2.4.0") // Image loading library with Jetpack Compose support
}