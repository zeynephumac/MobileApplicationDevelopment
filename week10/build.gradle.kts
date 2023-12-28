// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath ("com.google.gms:google-services:4.3.13")
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
}