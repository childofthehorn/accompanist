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

// Commonly Used Applied Plugins
object BuildPlugins {

    object Id {
        const val app = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "kotlin-android"
        const val androidBase = "android"
        const val core = "jvm"
        const val kapt = "kapt"
        const val dokka = "org.jetbrains.dokka"
        const val kotlinKapt = "kotlin-kapt"
    }

}