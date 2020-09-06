import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

sourceSets["main"].withConvention(KotlinSourceSet::class) {
    kotlin.srcDir("src/")
}
