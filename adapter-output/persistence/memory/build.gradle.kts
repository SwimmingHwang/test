description = "adapter-output-persistence-memory"

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":zep-application-core"))
    implementation(project(":zep-common"))
}
