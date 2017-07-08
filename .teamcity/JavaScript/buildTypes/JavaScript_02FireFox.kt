package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02FireFox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "2bbdb594-ebb6-4f5b-bf7b-9636493ea4e9"
    extId = "JavaScript_02FireFox"
    name = "02. FireFox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
