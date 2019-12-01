package configs

import java.util.Collections.emptySet

object AndroidConfig {

    const val applicationId = "fr.hadaly.recyclerviewplayground"

    const val compileSdk = 29
    const val minSdk = 23
    const val targetSdk = compileSdk

    const val buildToolsVersion = "29.0.2"

    const val instrumentationTestRunner = "androidx.test.runner.AndroidJUnitRunner"

    val noGeneratedDensities = emptySet<String>().toTypedArray()
}
