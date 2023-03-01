plugins {
    id("kmm-module-convention")
    id("io.kotest.multiplatform")
}

group = "ru.tetraquark.ton.explorer.lib.entryfield"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.kotest.framework.engine)
                implementation(libs.kotest.assertions.core)
            }
        }
        val androidMain by getting
        val desktopMain by getting
    }
}
