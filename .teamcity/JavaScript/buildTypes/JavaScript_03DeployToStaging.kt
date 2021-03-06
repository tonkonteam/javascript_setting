package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "eff33de2-cb41-4922-b2f7-b7322fa4f300"
    extId = "JavaScript_03DeployToStaging"
    name = "03. Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComTonkonteamTeamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02FireFox) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02IE) {
            snapshot {
            }
        }
    }
    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
