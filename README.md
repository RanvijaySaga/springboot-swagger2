# Swagger 2 (SpringFox) with Spring Boot 2.x.x version
This project is a simple Spring Boot application that demonstrates how to use Swagger 2 for documenting a Spring REST API.
Using the Springfox implementation of the Swagger 2 specification.

> Note
It’s important to mention that the latest version of Swagger specification, now known as OpenAPI 3.0, is better supported 
by the Springdoc project and should be used for documenting Spring REST API. Moreover, Spring Boot 3 doesn’t support this library.

# Prerequisites
* Java Development Kit (JDK) 17
* Apache Maven 3.6.3
* Lombok plugin installed in IDE


# Verification
To verify that Springfox is working, we can visit this URL in our browser:
- swagger api-doc : http://localhost:8080/v2/api-docs
- swaggerUI : http://localhost:8081/swagger-ui/#/

# Things Covered in this project
* Swagger 2 integration with Spring Boot using springfox-boot-starter
* Swagger 2 working with Spring Data REST 
* Swagger 2 working with Bean Validations
* Bean Validations
* Filtering API for Swagger’s Response
* Adding Custom API specification

> **Learning Notes**:
>* Springfox provides support for Spring Data REST through its `springfox-data-rest` library.
<br> To enable this we need to add the `springfox-data-rest` dependency to our project and import the 
`SpringDataRestConfiguration` class to the SpringFoxConfig class.
<br><br>
>* Springfox also supports the bean validation annotations through its `springfox-bean-validators` library.
<br>To enable this we need to add the `springfox-bean-validators` dependency to our project and import 
the `BeanValidatorPluginsConfiguration` class to the SpringFoxConfig class:
<br><br>
>* We can restrict Swagger’s response by passing parameters to the apis() and paths() methods of the Docket class.
<br><br>
>*  `springfox-boot-starter` is a new starter module that includes all the necessary dependencies to enable Swagger in a 
Spring Boot application.
>>* if You are using` springfox-boot-starter` dependency, you don't need to add springfox-data-rest, springfox-bean-validators 
or any other springfox dependencies explicitly, it's already included in the springfox-boot-starter dependency.
>>
>>* if you are using `springfox-boot-starter` dependency, you don't need to add exclusive imports like SpringDataRestConfiguration, 
 BeanValidatorPluginsConfiguration are not needed 


