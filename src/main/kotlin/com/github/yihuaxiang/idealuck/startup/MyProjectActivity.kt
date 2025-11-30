package com.github.yihuaxiang.idealuck.startup

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class MyProjectActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        // Plugin initialization logic can be added here
    }
}