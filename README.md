# dev-agent

[![Build](https://github.com/yihuaxiang/idea-luck/workflows/Build/badge.svg)](https://github.com/yihuaxiang/idea-luck/actions)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

<!-- Plugin description -->
dev-agent is an IntelliJ Platform plugin that embeds the dev-agent web interface directly into your IDE. Access dev-agent tools and features without leaving your development environment.

## ✨ 功能特性

- 🌐 **内嵌网页**: 在 IDE 右侧工具窗口中直接访问 dev-agent 网页
- 🎯 **快速访问**: 通过侧边栏图标一键打开
- 🚀 **无缝集成**: 无需在浏览器和 IDE 之间切换
- 🎨 **界面友好**: 集成在 IDE 工具窗口中，操作便捷

## 🚀 安装方式

### 方式一：通过 IDE 内置插件系统安装

1. 打开 IntelliJ IDEA
2. 进入 `Settings/Preferences` → `Plugins` → `Marketplace`
3. 搜索 "dev-agent"
4. 点击 `Install` 安装

### 方式二：手动安装

1. 下载 [最新版本](https://github.com/yihuaxiang/idea-luck/releases/latest)
2. 进入 `Settings/Preferences` → `Plugins` → `⚙️` → `Install plugin from disk...`
3. 选择下载的插件文件进行安装

## 📖 使用说明

1. **打开工具窗口**: 安装插件后，在 IDE 右侧边栏找到 DevAgent 图标
2. **访问网页**: 点击图标即可在工具窗口中打开 dev-agent 网页界面
3. **使用功能**: 在内嵌的网页中使用 dev-agent 的各项功能

## 🛠️ 技术栈

- **开发语言**: Kotlin
- **目标平台**: IntelliJ Platform 2024.3.6+
- **最低支持版本**: IntelliJ IDEA 2024.3 (Build 243)
- **构建工具**: Gradle

## 🏗️ 项目结构

```
idea-luck/
├── src/main/kotlin/
│   └── com/github/yihuaxiang/idealuck/
│       ├── MyBundle.kt                    # 国际化资源管理
│       ├── services/
│       │   └── MyProjectService.kt       # 项目服务
│       ├── startup/
│       │   └── MyProjectActivity.kt      # 启动活动
│       └── toolWindow/
│           └── MyToolWindowFactory.kt    # 工具窗口工厂（内嵌网页）
└── src/main/resources/
    ├── d.png                             # 工具窗口图标
    ├── messages/                         # 国际化消息
    └── META-INF/                        # 插件配置
```

## 🔧 开发环境

### 环境要求

- JDK 21+
- IntelliJ IDEA 2024.3+
- Gradle 9.0+

### 本地开发

1. 克隆项目
   ```bash
   git clone https://github.com/yihuaxiang/idea-luck.git
   cd idea-luck
   ```

2. 运行插件
   ```bash
   ./gradlew runIde
   ```

3. 构建插件
   ```bash
   ./gradlew buildPlugin
   ```

## 📝 更新日志

### v0.0.1
- ✨ 初始版本发布
- 🌐 实现内嵌网页功能
- 🎯 添加工具窗口界面
- 🔧 集成 IntelliJ Platform 插件框架

## 🤝 贡献指南

欢迎提交 Issue 和 Pull Request！

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开 Pull Request

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 🙏 致谢

- 基于 [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template) 构建
- 感谢 JetBrains 提供的优秀开发平台

---

⭐ 如果这个插件对您有帮助，请给个 Star 支持一下！
<!-- Plugin description end -->
