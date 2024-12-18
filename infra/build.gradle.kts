dependencies {
    implementation(project(":common"))
    implementation(project(":domain"))

    implementation(Dependencies.SPRING_BOOT_WEBFLUX)
    implementation(Dependencies.SPRING_BOOT_DATA_R2DBC)
    implementation(Dependencies.MYSQL_R2DBC_CONNECTOR)
}