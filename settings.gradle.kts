pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "wChat"
include(":app")
include(":core:network")
include(":core:database")
include(":domain")
include(":data")
include(":feature:common")
include(":feature:home")
include(":feature:chat")
include(":feature:story")
include(":feature:profile")
