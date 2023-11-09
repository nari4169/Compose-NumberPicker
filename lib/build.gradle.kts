plugins {
    id("com.android.library")
    id("kotlin-android")
    id("common")
    id("com.vanniktech.maven.publish")
}

mavenPublish {
    sonatypeHost = com.vanniktech.maven.publish.SonatypeHost.S01
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
    api("androidx.compose.material:material:${Versions.compose}")

    testImplementation("junit:junit:4.13.2")
}

repositories {
    google()
    mavenCentral()
}
android {
    namespace = "com.chargemap.compose.numberpicker"
}
