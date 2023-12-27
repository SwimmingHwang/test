rootProject.name = "modules"
include(
        "zep-common",
        "zep-admin",
        "zep-application-core",
        "adapter-output:persistence:memory",
        "adapter-output:persistence:h2",
)
