package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object JavaScript_HttpsGithubComTonkonteamJavascriptSetting : GitVcsRoot({
    uuid = "f52e0475-e880-421a-a82d-28907ba1cbcc"
    extId = "JavaScript_HttpsGithubComTonkonteamJavascriptSetting"
    name = "https://github.com/tonkonteam/javascript_setting"
    url = "https://github.com/tonkonteam/javascript_setting"
    authMethod = password {
        userName = "zhaoshunmail@163.com"
        password = "credentialsJSON:6af5f0e0-3210-4e5b-897b-4fef2abbd3c5"
    }
})
