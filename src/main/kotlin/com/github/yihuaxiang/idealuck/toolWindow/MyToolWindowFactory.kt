package com.github.yihuaxiang.idealuck.toolWindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.jcef.JBCefBrowser
import com.intellij.ui.content.ContentFactory
import java.awt.BorderLayout
import javax.swing.JPanel


class MyToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val myToolWindow = MyToolWindow()
        val content = ContentFactory.getInstance().createContent(myToolWindow.getContent(), null, false)
        toolWindow.contentManager.addContent(content)
    }

    override fun shouldBeAvailable(project: Project) = true

    class MyToolWindow {

        fun getContent(): JPanel {
            val panel = JPanel(BorderLayout())
            val browser = JBCefBrowser("https://dev-agent.alibaba-inc.com/")
            panel.add(browser.component, BorderLayout.CENTER)
            return panel
        }
    }
}
