Druidry Query Model project!
=======================================
This project is a simplified version of [Druidry](https://github.com/zapr-oss/druidry) for those who handle http querying themselves.

Removed code
-----------
Whole package `in.zapr.druid.druidry.client` including `DruidConfiguration` and `DruidClient`.

Removed dependencies
-----------
- `logback-classic`, `logback-core`
- `commons-lang3`
- `jersey-client`, `jersey-media-json-jackson`, `jersey-hk2`, `jersey-apache-connector`

Usage
-----------
Add this in your pom.xml (assuming maven based project)

```xml
        <dependency>
            <groupId>pl.szymeker.druid</groupId>
            <artifactId>druidry-query-model</artifactId>
            <version>${LATEST_VERSION}</version>
        </dependency>
```

Replace ${LATEST_VERSION} with the latest release version 

