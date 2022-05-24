import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.provider.Provider

@Suppress("UnstableApiUsage")
fun Provider<MinimalExternalModuleDependency>.dependencyName(): String {
    val module = get().module
    return "${module.group}:${module.name}"
}

@Suppress("UnstableApiUsage")
val ProjectDependency.projectName: String
    get() = ":$name"
