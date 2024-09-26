plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id ("kotlin-kapt")
    id("com.google.gms.google-services")
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    id("kotlin-kapt")
//    id("com.google.gms.google-services")

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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3" // Đảm bảo rằng phiên bản là mới nhất
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
    implementation(libs.firebase.auth)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    // Firebase Dependencies
    implementation("com.google.firebase:firebase-auth-ktx:21.0.1")
    implementation(platform("com.google.firebase:firebase-bom:33.5.0"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.android.gms:play-services-auth:21.2.0")
    implementation("com.google.firebase:firebase-analytics")
    implementation("androidx.credentials:credentials:1.3.0")
    implementation("androidx.credentials:credentials-play-services-auth:1.3.0")
    implementation("com.google.android.libraries.identity.googleid:googleid:1.1.1")

    // Jetpack Compose Core Libraries
    implementation("androidx.compose.ui:ui:1.4.0")           // Core UI library
    implementation("androidx.compose.material:material:1.6.2") // Material Design components
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.4") // Preview support in Android Studio
    implementation("androidx.activity:activity-compose:1.7.2") // Compose support for Activity
    implementation("androidx.compose.foundation:foundation") // Compose foundation components

    // Kotlin Extensions
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Coroutines for async tasks

    // Navigation (Optional but often required)
    implementation("androidx.navigation:navigation-compose:2.7.2")

    // Icons (Optional)
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")

    // For ViewModel support in Compose (Optional)
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // LiveData support for Compose (Optional)
    implementation("androidx.compose.runtime:runtime-livedata")

    // Animations (Optional)
    implementation("androidx.compose.animation:animation:1.6.2")

    // Testing (Optional)
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling") // For the UI Debugging tools

    // Accompanist for system UI controls like insets, status bar colors
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.31.2-alpha")

    // For adding paging in Compose (Optional)
    implementation("com.google.accompanist:accompanist-pager:0.31.2-alpha")

    // For handling navigation animation transitions
    implementation("com.google.accompanist:accompanist-navigation-animation:0.31.2-alpha")

    // For loading images via Coil in Compose
    implementation("io.coil-kt:coil-compose:2.4.0") // Image loading library with Jetpack Compose support

    implementation ("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.0.0")

    implementation ("com.github.bumptech.glide:glide:4.12.0")
    kapt ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("com.google.android.exoplayer:exoplayer:2.18.1")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    // media player
    implementation ("androidx.media:media:1.5.0")
    implementation ("com.google.android.exoplayer:exoplayer:2.17.0")
    implementation ("com.google.android.exoplayer:extension-mediasession:2.17.0")

    implementation ("androidx.compose.material3:material3:1.0.0")
    implementation ("androidx.room:room-runtime:2.5.0")
    kapt ("androidx.room:room-compiler:2.5.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.0")
}