package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02IE : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "javascript_02ie_1001"
    extId = "JavaScript_02IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTest) {
            snapshot {
            }
        }
    }
})
