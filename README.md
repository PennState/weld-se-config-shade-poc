# Weld-SE Microprofile-Config Shaded Proof-of-Concept

This project provides a demonstration of one way to create a
[twelve-factor app](https://12factor.net/) using Java EE technologies.  It
specifically satisfies the following twelve-factor app attributes:

* III. Config - Store config in the environment
* IX. Disposability - Maximize robustness with fast startup and graceful shutdown
* XI. Logs - Treat logs as event streams

## Technologies

This project uses the following technologies to provide the basis for the
production of a twelve-factor app:

* Weld-SE (Java EE CDI)
* Wildfly's implementation of the microprofile-config specification<sup>1</sup>
* Maven with the maven-shade-plugin

## Building

This application can be build using the following command:

```(shell)
mvn clean install
```

## Execution

This program can be run, demonstrating that there are three required
configuration properties missing when the application is run:

```(shell)
java -jar target/weld-se-config-shade-poc.jar
```

The program can be rerun with the configuration properties supplied which
will result in the successful completion of the application:

```
java -Dsome.string=some.string -Danother.string=another.string -Da.third.string=a.third.string -jar target/weld-se-config-shade-poc.jar
```

## Notes

1. When [JSR-382](https://github.com/eclipse/ConfigJSR) is adopted, the use
   of the microprofile-config will be standardized for Java SE.