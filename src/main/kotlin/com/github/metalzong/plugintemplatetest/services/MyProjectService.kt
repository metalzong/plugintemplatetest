package com.github.metalzong.plugintemplatetest.services

import com.github.metalzong.plugintemplatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
