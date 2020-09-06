object Deps {
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin_coroutines}"

    object kotest {
        const val runner = "io.kotest:kotest-runner-junit5:${Versions.kotest}"
        const val assertions = "io.kotest:kotest-assertions-core:${Versions.kotest}"
    }
}

object Versions {
    const val kotlin = "1.4.0"
    const val kotlin_coroutines = "1.3.9"

    const val kotest = "4.2.3"
}
