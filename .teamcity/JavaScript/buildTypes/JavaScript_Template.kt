package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_Template : Template({
    uuid = "c6527195-5b98-4438-b5cf-ba40c4754564"
    extId = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComTonkonteamTeamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_1"
            scriptContent = "npm install"
        }
        script {
            name = "PhantomJS"
            id = "RUNNER_2"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
