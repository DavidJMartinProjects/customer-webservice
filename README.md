# RESTful Springboot Microservice
> A RESTful web based microservice used to perform CRUD operations on Customer records.

This project demonstrates the development of a RESTful web-service using an _"api-driven first"_ approach.
- Integration Tests location:  
```sh
  \src\test\java\com\customer\CustomerControllerTests.java
```

- OpenAPI Spec location: 
```sh
  \src\main\resources\openapi-spec\customer-service-api.v1.yaml
```

With focus on clean, maintainable code & testing at the appropriate level.


## Installation

OS X, Windows, Linux:

```sh
>> mvn clean install 
```

## Frameworks used
- build
  - maven, maven code generator
- db
  - jpa, h2, RDBMS 
- utils
  - model-mapper
- doc generation
  - open-api spec, swagger ui
- test :
  - Integration Testing
    - @SpringBootTest 
  - Contract Testing
    - Spring Cloud Contract 
    
## API documentation
 * The microservice exposes its api documentation through its actuator endpoints.
 * To view the service api docs, run the project & navigate to the below service management urls:

    - http://localhost:9090/actuator/openapi    
    - http://localhost:9090/actuator/swaggerui   

## Additional info 
 - api docs are automatically generated from the OpenAPI specification.
 - controller models and interfaces are generated from the OpenAPI spec, allowing them to be introduced in the code base.
    - by integrating the generated controller interfaces and response models, the code must always align to the behaviour outlined in the openapi specification.  
    - now, the OpenAPI spec is _"the single source of truth"_ in terms of the behaviour of the microservice.
    - this solves the production problem of changes in api's not being reflected in the microservice documentation. 

 - NB: for integration testing, Flux TestWebClient was used in favour of RestTemplate(soon to be deprecated).

## Usage example

A few motivating and useful examples of how your product can be used. Spice this up with code blocks and potentially more screenshots.

_For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

To generate the required sources, build the project using the below command

```sh
>> mvn clean install 
```

## Release History

* 0.1.0
    * Introduced OpenAPI Spec
    * Introduced @SpringBootTest integration tests
* 0.0.1
    * Initial Release

## Meta


Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/davidjmartinprojects](https://github.com/DavidJMartinProjects/customer-webservice/)

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki

https://github.com/dbader/readme-template/blob/master/README.md