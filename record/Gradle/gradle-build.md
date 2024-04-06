# gradle
![img.png](img.png)

## Gradle inaction

### 项目自动化

- 防止手动介入
- 创建可重复的构建
- 让构建便携
  - 不再受限于特定环境

### 项目自动化的类型

- 按需构建
- 触发构建
- 预定构建

### 构建工具

- 可编程工具
- 有向非循环图（DAG）

#### 构建工具剖析

- 构建文件：表达构建逻辑
- 输入和输出
- 构建引擎
- 依赖管理
  - 依赖传递

#### Ant

- Java
- build文件：XML

##### 构建脚本构成

project、target、task

![image-20240405172746236](C:\Users\99356\AppData\Roaming\Typora\typora-user-images\image-20240405172746236.png)



## 基本语法

### Groovy

### task
```groovy
task <taskName> {
    // 任务的配置
}
```

### dependsOn

```groovy
task taskName1(param: ParamType) {
    // 任务的配置
}

task taskName2(param1: ParamType) {
    dependsOn taskName1(param1)
    // 任务的配置
}
```

### plugins

```groovy
plugins {
    id '<pluginId>' version '<pluginVersion>'
}
```

### dependencies

声明式：

```groovy
dependencies {
    testImplementation group: 'junit', name: 'junit', version: '4.12'
}
```

函数式：

```groovy
dependencies {
    # 当依赖项目当中的其他模块是，则可以定义如下：
    implementation (project('sub-project-1'))
    # 定义只有运行单元测试是才需要的依赖时，可以定义如下：
    testImplementation ('junit:junit:4.12')
    # 当在build.properties文件中定义了相应的版本变量时
    # javaxValidationVersion=x.x.x则可以定义如下：
    implementation ("javax.validation:validation-api:$javaxValidationVersion")
    # 注意，''中的字符串中表示的是纯字符串，无法插入占位符
    # ""中的字符串则可插入占位符$javaxValidationVersion
}
```



## 项目结构

```text
root-project
  |--gradle #目录下gradle的配置信息和gradle的jar包
  |  |--wraper
  |  |--gradle-wraper.jar #的jar包
  |  |--gradle-wraper.properties #gradle的配置信息
  |--sub-porject-1
  |  |--build.gradle #子模块sub-project-1的配置信息文件
  |  |--sub-project-a
  |    |--build.gradle #子模块sub-project-a的配置信息文件
  |  |--sub-project-b
  |    |--build.gradle #子模块sub-project-b的配置信息文件
  |--sub-project-2
  |  |--build.gradle #子模块sub-project-2的配置信息文件
  |--build.gradle #项目配置信息问题
  |--gradle.properties #项目全局参数文件
  |--settings.gradle #项目模块信息文件
  |--gradlew #gradle shell脚本适用于linux系统上执行gradle命令
  |--gradle.bat #gradle bat脚本适用于windows系统上执行gradle命令
```

## Properties

### settings.gradle

定义项目的模块结构

### build.gradle

- 构建脚本
- 支持java和groovy
- 项目构建入口
- 配置版本和插件依赖库等
- 
