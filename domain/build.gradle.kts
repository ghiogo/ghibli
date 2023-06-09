plugins {
    id(Plugins.javaLibrary)
    id(Plugins.kotlinJvm)
}
dependencies {
    implementation(Dependencies.Coroutines.coroutines)
    implementation(Dependencies.Coroutines.inject)
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}