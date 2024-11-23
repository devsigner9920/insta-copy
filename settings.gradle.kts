pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}

rootProject.children.forEach {
    it.apply {
        buildFileName = "build.gradle.kts"
    }
}

rootProject.name = "insta-copy"

include("api")
include("domain")
include("common")
include("infra")
