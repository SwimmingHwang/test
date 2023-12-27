import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	repositories {
		mavenCentral()
		maven(url = "https://repo.spring.io/snapshot")
		maven(url = "https://repo.spring.io/milestone")
		maven(url = "https://plugins.gradle.org/m2/")
	}
	dependencies {
		classpath("org.jmailen.gradle:kotlinter-gradle:2.3.0")
	}
}

plugins {
	base
	java
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.jetbrains.kotlin.jvm") version "1.9.21"
	id("org.jetbrains.kotlin.plugin.spring") version "1.9.21"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.9.21"
}

allprojects {
	val javaVersion = "17"

	group = "us.zep"
	version = "0.0.1-SNAPSHOT"

	tasks.withType<JavaCompile> {
		sourceCompatibility = javaVersion
		targetCompatibility = javaVersion
	}

	repositories {
		mavenCentral()
	}

	tasks.withType<KotlinCompile>().configureEach {
		kotlinOptions {
			freeCompilerArgs += "-Xjsr305=strict"
			jvmTarget = javaVersion
		}
	}
//
//	tasks.named("test") {
//		useJUnitPlatform()
//	}

}
subprojects {
	apply(plugin = "java")

	val valiktorVersion: String by project

	dependencies {
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.valiktor:valiktor-spring-boot-starter:$valiktorVersion")
		implementation("org.valiktor:valiktor-javatime:$valiktorVersion")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
	}
}
