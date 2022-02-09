package com.github.shcatlee.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.shcatlee.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
