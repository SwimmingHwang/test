import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

description = "adapter-output-persistence-memory"

plugins {
//    id("org.springframework.boot") version "3.0.1"
//    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")

}

//group = "hello"
//version = "1.0.0-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation(project(":zep-application-core"))
    implementation(project(":zep-common"))

//    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}
//tasks.withType<KotlinCompile> { // Settings for `KotlinCompile` tasks
//    kotlinOptions { // Kotlin compiler options
//        freeCompilerArgs = listOf("-Xjsr305=strict") // `-Xjsr305=strict` enables the strict mode for JSR-305 annotations
//        jvmTarget = "17" // This option specifies the target version of the generated JVM bytecode
//    }
//}
//

tasks.withType<Test> {
    useJUnitPlatform()
}

//
//repositories {
//    mavenCentral()
//}
//
//plugins {
//    kotlin("jvm")
//    kotlin("plugin.spring")
//    id("org.springframework.boot") version "3.2.1"
//}

//
//dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
////    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//
//}
//
//tasks.withType<KotlinCompile> { // Settings for `KotlinCompile` tasks
//    kotlinOptions { // Kotlin compiler options
//        freeCompilerArgs = listOf("-Xjsr305=strict") // `-Xjsr305=strict` enables the strict mode for JSR-305 annotations
//        jvmTarget = "17" // This option specifies the target version of the generated JVM bytecode
//    }
//}
//
//tasks.withType<Test> {
//    useJUnitPlatform()
//}
//
//kotlin {
//    jvmToolchain(8)
//}
//plugins {
//    id("org.springframework.boot") version "3.2.1"
//    id("io.spring.dependency-management") version "1.1.4"
//    kotlin("jvm") version "1.9.21"
//    kotlin("plugin.spring") version "1.9.21"
//}
//
//dependencies {
//
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//}

tasks.register("prepareKotlinBuildScriptModel"){}