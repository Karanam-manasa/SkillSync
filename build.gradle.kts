//buildscript {
//    dependencies {
//        classpath("com.google.gms:google-services:4.4.2")
//    }
//}
//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.2.2" apply false
//}
// Project-level build.gradle

// File: build.gradle.kts (Project level)
// Top-level build file where you can add configuration options common to all sub-projects/modules.
// build.gradle.kts at the project level
// Project-level build.gradle.kts

// Project-level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath(kotlin("gradle-plugin", version = "1.8.10"))
        classpath("com.google.gms:google-services:4.4.2")
    }
}





// Ensure you have a settings.gradle.kts file to include modules


/*plugins {
    kotlin("jvm") version "1.8.0" // Use the version compatible with your project
    id("com.android.application") version "8.0.0" // Ensure this matches the Gradle plugin version you are using
}

repositories {
    google()
    mavenCentral()
}

// Project-level build.gradle.kts
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("com.google.gms:google-services:4.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
        classpath("com.android.tools.build:gradle:8.0.0")
    }
}*/


