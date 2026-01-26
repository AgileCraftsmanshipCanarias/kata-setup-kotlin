plugins {
    kotlin("jvm") version "2.3.0"
    application
}

group = "dev.kata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:6.1.1")
    testImplementation("io.kotest:kotest-assertions-core:6.1.1")
    testImplementation("io.kotest:kotest-property:6.1.1")
    testImplementation("io.mockk:mockk:1.14.9")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

application {
    mainClass.set("MainKt")
}