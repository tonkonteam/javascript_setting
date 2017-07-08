package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTest : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "3a605506-57c9-41e0-b591-5cba0dbb7af9"
    extId = "JavaScript_01FastTest"
    name = "01. Fast Test"

    params {
        param("Browser", "PhantomJS")
    }
})
