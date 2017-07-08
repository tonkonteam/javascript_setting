package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "d3d1f01f-43ff-481d-91f0-063b31588f3f"
    extId = "JavaScript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
