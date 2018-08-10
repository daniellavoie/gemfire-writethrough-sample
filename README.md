# Gemfire Writethrough Sample

## Build

```
mvn clean package
```

## GFSH Commands

```
deploy --jar target/gemfire-writethrough-sample-0.0.1-SNAPSHOT.jar
create region --name=customer-profile --cache-listener=io.daniellavoie.gemfire.writethrough.SpringCacheListener --type=PARTITION
```
