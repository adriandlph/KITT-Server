
Technologies
- Java 25
- SpringBoot
    - Starter web
    - Security (maybe will be deleted in future)
    - JPA: Hibernate
    - SQLite (we dont need a specific database server)

## Logger decision

We use **Logback** (via `spring-boot-starter-logging`, included automatically in `spring-boot-starter-web`) instead of Log4j 1.2.x because:

1. **Log4j 1.x is End-Of-Life** since 2015 — no more security patches or bug fixes.
2. **Logback is the default in Spring Boot** — zero extra dependencies, auto-configured, and natively integrated with the Spring lifecycle.
3. **Better performance** — asynchronous logging, faster internals, lower memory footprint compared to Log4j 1.x.
4. **Native SLF4J support** — Logback implements SLF4J directly, which is the standard logging facade in the Spring ecosystem.
5. **Configuration via `application.properties`** — no need for a separate XML file for basic setups; Spring Boot exposes `logging.*` properties that map directly to Logback configuration.