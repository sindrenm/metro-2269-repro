import dev.zacsweers.metro.gradle.ExperimentalMetroGradleApi

plugins {
    id("buildlogic.kotlin-application-conventions")
    alias(libs.plugins.metro)
}

metro {
    @OptIn(ExperimentalMetroGradleApi::class)
    generateContributionProviders.set(true)
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainClass = "app.AppKt"
}
