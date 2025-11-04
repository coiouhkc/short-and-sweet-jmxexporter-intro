## Download jmx-exporter
```shell
curl -s -L https://github.com/prometheus/jmx_exporter/releases/download/1.5.0/jmx_prometheus_javaagent-1.5.0.jar -o jmx_prometheus_javaagent-1.5.0.jar
```

## Download jmx-exporter standalone
```shell
curl -s -L https://github.com/prometheus/jmx_exporter/releases/download/1.5.0/jmx_prometheus_standalone-1.5.0.jar -o jmx_prometheus_standalone-1.5.0.jar
```

## Start app with JMX
```shell
-Dcom.sun.management.jmxremote=true
-Dcom.sun.management.jmxremote.port=12345
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
```

## Start standalone jmx-exporter
 ```shell
java -jar jmx_prometheus_standalone-1.5.0.jar 8080 exporter.yaml

java -Djava.util.logging.config.file=logging.properties -jar jmx_prometheus_standalone-1.5.0.jar 8080 exporter.yaml
 ```