package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.JavaScript_HttpsGithubComTonkonteamJavascriptSetting
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "ad0fdb32-4ce8-40e4-b8c9-021dd5096732"
    extId = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"
    description = "My JavaScript Project in Team City"
    
    vcsRoot(JavaScript_HttpsGithubComTonkonteamTeamcityCourseCards)
    vcsRoot(JavaScript_HttpsGithubComTonkonteamJavascriptSetting)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_01FastTest)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_02FireFox)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = JavaScript_HttpsGithubComTonkonteamJavascriptSetting.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
