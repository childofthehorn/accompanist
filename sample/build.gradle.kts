/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id(BuildPlugins.Id.app)
    id(BuildPlugins.Kotlin.android)
}

android {
    //This way is now outdated
    //compileSdkVersion(31)
    //android.compileSdkVersion(31)

    defaultConfig {
        applicationId = "com.google.accompanist.sample"
        minSdk = 21
        targetSdk = 31
        compileSdk = 31 // This is the modern way ;)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    //This is just good practice
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.get()
    }
}

dependencies {
    implementation(project(":drawablepainter"))
    implementation(project(":insets"))
    implementation(project(":insets-ui"))
    implementation(project(":navigation-animation"))
    implementation(project(":navigation-material"))
    implementation(project(":pager"))
    implementation(project(":pager-indicators"))
    implementation(project(":permissions"))
    implementation(project(":placeholder"))
    implementation(project(":placeholder-material"))
    implementation(project(":flowlayout"))
    implementation(project(":systemuicontroller"))
    implementation(project(":swiperefresh"))
    implementation(project(":web"))

    implementation(libs.androidx.appcompat)

    implementation(libs.coil.compose)
    implementation(libs.coil.gif)

    implementation(libs.compose.material.material)
    implementation(libs.compose.material.iconsext)
    implementation(libs.compose.foundation.layout)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.util)

    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.core)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.lifecycle.runtime)

    implementation(libs.kotlin.stdlib)

    lintChecks(project(":permissions-lint"))
}