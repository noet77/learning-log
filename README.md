# Learning Log

记录我每天在写什么、卡在哪、怎么解决的。

**目标：2027 年 2 月拿到第一段后端实习 offer。**

- 身份：2029 届 · 计算机 · 双非二本
- 起点：零基础（只学过 C/Java 课程语法）
- 主线：Java 后端工程 + Python AI 服务层

---

## 我在学什么

**当前阶段：Phase A 地基期（2026.10 – 2027.02，共 18 周）**

- Java 后端工程：Java 基础 → SQL/JDBC → Spring Boot → Redis → Docker
- AI 应用开发：Python/FastAPI → 模型 API → Function Calling → RAG → Agent
- 算法：LeetCode，每天 1 题

## 进度

| 阶段 | 时间 | 内容 | 状态 |
|---|---|---|---|
| W1 | 10.05–10.11 | 工具链 & Git 全流程 | 进行中 |
| W2 | 10.12–10.18 | Java 语法与 OOP | 未开始 |
| W3 | 10.19–10.25 | 集合框架 | 未开始 |
| W4 | 10.26–11.01 | 泛型与异常 | 未开始 |
| W5 | 11.02–11.08 | SQL 起步 | 未开始 |
| W6 | 11.09–11.15 | JDBC + 项目 1 收口 | 未开始 |
| W7–13 | 11.16–01.03 | Spring Boot → 部署上线（项目 2） | 未开始 |
| W14–18 | 01.04–02.07 | Python + FastAPI + 联调（项目 3）→ 开始投递 | 未开始 |

> 每周日更新这张表。

## 项目

| 项目 | 内容 | 状态 |
|---|---|---|
| 项目 1 | JDBC 员工管理系统 | 未开始 |
| 项目 2 | Spring Boot 带权限后端服务（需公网可访问） | 未开始 |
| 项目 3 | Java 业务后端 + Python AI 服务混合架构 | 未开始 |

## 怎么用这个仓库

每个月建一个 `YYYY-MM/` 文件夹，每天建一个 `MM-DD-主题/` 文件夹：

```
learning-log/
├── README.md              # 本文件：总览与进度
├── _template-note.md      # 每日笔记模板，复制它来新建 note.md
└── 2026-10/               # 按月归档
    └── 10-12-bank-account/
        ├── Account.java   # 当天写的代码
        └── note.md        # 当天笔记（由模板复制而来）
```

**每日流程**

```bash
mkdir -p 2026-10/10-12-bank-account           # 1. 建当天文件夹
cp _template-note.md 2026-10/10-12-bank-account/note.md   # 2. 复制模板
# 3. 写代码 + 填 note.md
git add .                                     # 4. 提交
git commit -m "docs: add day-8 bank account"
git push
```
