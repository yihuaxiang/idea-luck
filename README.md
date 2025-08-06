# Random Number Generator

[![Build](https://github.com/yihuaxiang/idea-luck/workflows/Build/badge.svg)](https://github.com/yihuaxiang/idea-luck/actions)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

<!-- Plugin description -->
Random Number Generator is a simple and fun plugin for IntelliJ Platform IDEs that provides random number generation functionality. Generate random numbers from 1 to 100 with just a click in a convenient tool window.

## ✨ 功能特性

- 🎲 **随机数生成**: 在 IDE 工具窗口中生成 1-100 的随机数
- 🖱️ **一键刷新**: 点击按钮即可生成新的随机数
- 🎯 **简单易用**: 无需复杂配置，开箱即用
- 🎨 **界面友好**: 集成在 IDE 工具窗口中，操作便捷

## 🚀 安装方式

### 方式一：通过 IDE 内置插件系统安装

1. 打开 IntelliJ IDEA
2. 进入 `Settings/Preferences` → `Plugins` → `Marketplace`
3. 搜索 "Random Number Generator"
4. 点击 `Install` 安装

### 方式二：手动安装

1. 下载 [最新版本](https://github.com/yihuaxiang/idea-luck/releases/latest)
2. 进入 `Settings/Preferences` → `Plugins` → `⚙️` → `Install plugin from disk...`
3. 选择下载的插件文件进行安装

## 📖 使用说明

1. **打开工具窗口**: 安装插件后，在 IDE 底部或侧边栏找到 "Random Generator" 工具窗口
2. **生成随机数**: 点击 "Shuffle" 按钮即可生成一个新的随机数
3. **查看结果**: 随机数会显示在工具窗口中

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
│       │   └── MyProjectService.kt       # 随机数生成服务
│       ├── startup/
│       │   └── MyProjectActivity.kt      # 启动活动
│       └── toolWindow/
│           └── MyToolWindowFactory.kt    # 工具窗口工厂
└── src/main/resources/
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
- 🎲 实现随机数生成功能
- 🖱️ 添加工具窗口界面
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
