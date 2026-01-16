rootProject.name = "Automobility"

pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        maven("https://maven.neoforged.net/releases")

        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://maven.fabricmc.net")
        maven("https://maven.quiltmc.org/repository/release")
        maven("https://maven.isxander.dev/releases")
    }
}

include("common", "fabric", "neoforge")
