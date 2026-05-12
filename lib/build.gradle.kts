import dev.zacsweers.metro.gradle.ExperimentalMetroGradleApi

plugins {
    id("buildlogic.kotlin-library-conventions")
    alias(libs.plugins.metro)
}

metro {
    @OptIn(ExperimentalMetroGradleApi::class)
    generateContributionProviders.set(true)
}
