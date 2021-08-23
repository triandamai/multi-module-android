object ApplicationId{
    val id = "com.cexup.app"
}

object Modules{

}

object Releases{
    val versionCode =1
    val versionName="1.0"
}

/**
 * Arranged alphabetically
 */
object Versions {
    val kotlinVersion = "1.5.20"
    val safeArgs = "2.2.2"
    val compileSdkVersion = 30
    val buildTool = "28"
    val minSdk = 22
    val targetSdk = 30
}

object Compose{

    private const val compose_version = "1.0.1"
    val compose_ui = "androidx.compose.ui:ui:$compose_version"
    val compose_ui_material ="androidx.compose.material:material:$compose_version"
    val compose_ui_preview ="androidx.compose.ui:ui-tooling-preview:$compose_version"
    val compose_ui_activity =  "androidx.activity:activity-compose:1.3.1"

}

object Libraries {

}

object KotlinLibraries {
    private const val kotlin_version = "1.5.20"
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlin_version}"
    val coreKotlinCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${kotlin_version}"
    val androidKotlinCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${kotlin_version}"
}
object LifeCycle{
    private const val  lifecycle_runtime_ktx = "2.3.1"
    val lifeCycleRuntimeKtx= "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_runtime_ktx"
}
object AndroidLibraries {
    private const val ktx_core = "1.6.0"
    private const val appcompat = "1.3.1"
    private const val material = "1.4.0"
    val ktxCore= "androidx.core:core-ktx:$ktx_core"
    val androidMaterial ="com.google.android.material:$material"
    val app_compat =  "androidx.appcompat:appcompat:$appcompat"
}

object TestLibraries {
    private const val espresso_core = "3.4.0"
    private const val android_testRunner = "1.1.0"
    private const val junitTest = "4.13.2"
    private const val compose_version = "1.0.1"
    // ANDROID TEST
    val androidTestRunner = "androidx.test:runner:${android_testRunner}"
    val espressoCore = "androidx.test.espresso:espresso-core:${espresso_core}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${espresso_core}"
    val junit = "androidx.test.ext:junit:${junitTest}"

    val compose_test_junit= "androidx.compose.ui:ui-test-junit4:$compose_version"
    val compose_test_ui_tooling ="androidx.compose.ui:ui-tooling:$compose_version"

}
