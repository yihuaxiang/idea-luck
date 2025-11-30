# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an IntelliJ Platform plugin called "dev-agent" that embeds the dev-agent web interface (https://dev-agent.alibaba-inc.com/) directly into the IDE through a tool window. Built using Kotlin and the IntelliJ Platform Plugin Template.

**Key Details:**
- Plugin ID: `com.github.yihuaxiang.idealuck`
- Package: `com.github.yihuaxiang.idealuck`
- Platform: IntelliJ IDEA Community Edition (IC) 2024.3.6+
- Min Build: 243
- Language: Kotlin (JVM 21)
- Build Tool: Gradle 9.0.0

## Development Commands

### Running the Plugin
```bash
./gradlew runIde
```
Launches a sandboxed IDE instance with the plugin installed for testing.

### Building
```bash
./gradlew buildPlugin
```
Produces the plugin distribution ZIP in `build/distributions/`.

### Testing
```bash
# Run all tests
./gradlew test

# Run with coverage (Kover)
./gradlew koverXmlReport
```
Tests are in `src/test/kotlin/` and use `BasePlatformTestCase` from the IntelliJ Platform Testing Framework.

### Code Quality
```bash
# Run Qodana code quality checks
./gradlew qodana

# Verify plugin compatibility with IDE versions
./gradlew verifyPlugin
```

### Publishing
```bash
# Publish to JetBrains Marketplace (requires PUBLISH_TOKEN env var)
./gradlew publishPlugin
```

## Architecture

### Plugin Registration (plugin.xml)
The plugin is configured in `src/main/resources/META-INF/plugin.xml`:
- **Tool Window**: Registered via `MyToolWindowFactory`, displays on the right side with ID "DevAgent"
- **Icon**: Uses custom icon `/d.png` from resources
- **Startup Activity**: `MyProjectActivity` runs on project startup
- **Resource Bundle**: Internationalization via `messages.MyBundle`

### Core Components

**Service Layer (`services/MyProjectService.kt`)**
- Project-level service (`@Service(Service.Level.PROJECT)`)
- Currently minimal - can be extended for plugin-specific business logic
- Accessed via IntelliJ's service system: `project.service<MyProjectService>()`

**UI Layer (`toolWindow/MyToolWindowFactory.kt`)**
- Implements `ToolWindowFactory` to create the tool window content
- `MyToolWindow` inner class builds UI using `JBCefBrowser` to embed web content
- Embeds https://dev-agent.alibaba-inc.com/ using IntelliJ's JCEF (Java Chromium Embedded Framework)
- Uses `BorderLayout` with browser component in center for full window coverage

**Internationalization (`MyBundle.kt`)**
- Wraps `DynamicBundle` to load messages from `messages/MyBundle.properties`
- Used throughout for UI strings and logging messages
- Supports message parameters via `message(key, vararg params)`

**Startup Hook (`startup/MyProjectActivity.kt`)**
- Implements `ProjectActivity` interface
- Executes asynchronously on project startup via `suspend fun execute()`
- Currently minimal (just logging) - extend here for initialization logic

### Key Patterns

1. **Service Retrieval**: Use `project.service<MyProjectService>()` to get the project-scoped service instance
2. **Embedded Web Content**: Use `JBCefBrowser` from `com.intellij.ui.jcef` to embed web pages in tool windows
3. **Tool Window Icons**: Reference icon files from resources using absolute paths (e.g., `/d.png`)
4. **Logging**: Use `thisLogger()` from `com.intellij.openapi.diagnostic` for component-specific logging
5. **Messages**: All user-facing strings go through `MyBundle.message()` for i18n support

## Testing Strategy

Tests extend `BasePlatformTestCase` which provides:
- `myFixture`: Test fixture for PSI operations
- `project`: Test project instance
- Service access via standard service locator

Example test pattern:
```kotlin
fun testProjectService() {
    val projectService = project.service<MyProjectService>()
    assertNotNull(projectService)
}
```

## Build Configuration Notes

- Plugin description is auto-extracted from `README.md` between `<!-- Plugin description -->` markers
- Change notes come from `CHANGELOG.md` via the Gradle Changelog Plugin
- Version info in `gradle.properties`: `pluginVersion`, `pluginSinceBuild`, `platformVersion`
- Signing requires env vars: `CERTIFICATE_CHAIN`, `PRIVATE_KEY`, `PRIVATE_KEY_PASSWORD`
- Publishing requires: `PUBLISH_TOKEN` env var

## GitHub Actions

The project includes workflows in `.github/workflows/`:
- `build.yml`: Runs on push/PR - builds, tests, and verifies plugin
- `release.yml`: Handles releases and publishing to marketplace
- `run-ui-tests.yml`: UI testing automation

## Important File Locations

- Plugin descriptor: `src/main/resources/META-INF/plugin.xml`
- Tool window icon: `src/main/resources/d.png`
- Message bundles: `src/main/resources/messages/MyBundle.properties`
- Source code: `src/main/kotlin/com/github/yihuaxiang/idealuck/`
- Tests: `src/test/kotlin/com/github/yihuaxiang/idealuck/`
- Test data: `src/test/testData/`
