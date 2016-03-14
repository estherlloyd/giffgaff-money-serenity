## Automated web tests using Serenity, Cucumber and Maven (written in Java)

A simple example of some BDD-style cucumber automated acceptance criteria, running against http://staging.giffgaff.com 

Run the tests like this:

```
mvn clean verify
```

By default, the tests run with PhantomJS, so you will need this installed. Otherwise, if you prefer Chrome, modify the serenity.properties file or run the tests like this:
```
mvn clean verify -Dwebdriver.driver=chrome
```

The reports will be generated in `target/site/serenity`.
