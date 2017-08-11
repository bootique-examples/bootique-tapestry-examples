[![Build Status](https://travis-ci.org/bootique-examples/bootique-tapestry-demo.svg)](https://travis-ci.org/bootique-examples/bootique-tapestry-demo)
# bootique-tapestry-demo

An example of simple login page for [Tapestry](http://tapestry.apache.org) integrated into [Bootique](http://bootique.io).

*For additional help/questions about this example send a message to
[Bootique forum](https://groups.google.com/forum/#!forum/bootique-user).*
   
## Prerequisites
      
    * Java 1.8 or newer.
    * Apache Maven.
      
## Build the Demo
      
Here is how to build it:
        
    git clone git@github.com:bootique-examples/bootique-tapestry-demo.git
    cd bootique-tapesrty-demo
    mvn package
      
## Run the Demo

Check the options available in your app:
```bash
java -jar target/bootique-tapestry-demo-1.0-SNAPSHOT.jar
```

```
OPTIONS
      -c yaml_location, --config=yaml_location
           Specifies YAML config location, which can be a file path or a URL.

      -h, --help
           Prints this message.

      -H, --help-config
           Prints information about application modules and their configuration options.

      -s, --server
           Starts Jetty server.
```

Run the demo:
```bash
java -jar target/bootique.jcache.demo-1.0-SNAPSHOT.jar --config=config.yml --server
```

Open URL:
```
http://localhost:8080/
```
