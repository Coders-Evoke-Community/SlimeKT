object Jetbrains {
    private const val kotlin = "1.6.21"
    private const val serializationGradleVersion = "1.6.0-RC2"
    private const val serializationCoreVersion = "1.3.3"

    const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin"

    // Serialization
    const val serializationGradle =
        "org.jetbrains.kotlin:kotlin-serialization:$serializationGradleVersion"
    const val serializationCore =
        "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationCoreVersion"

    // Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.2"

    // Ktor
    private const val ktorVersion = "2.0.2"
    const val ktorJvm = "io.ktor:ktor-http-jvm:$ktorVersion"
    const val ktorUtils = "io.ktor:ktor-utils-jvm:$ktorVersion"
    const val ktorClientCore = "io.ktor:ktor-client-core-jvm:$ktorVersion"
}
