# PAF
Running the application locally
Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run

Application Properties File
In application.properties file replace details with your database url, batabase user and database password.

In Postman Body
 use snake case in JSON body,when creating or updating an entity.
Ex;
{ 'product_code': '1234', 'product_name': 'Sample Product' }

The process of that is converting product_code to productCode and product_name to productName. 
If it is unnesasary you need to remove, spring.jackson.property-naming-strategy=SNAKE_CASE line from application.properties file.

When using url in 'put' and 'delete' use id at the end.
ex;
@PutMapping("/demo/products/{id}")
@DeleteMapping("demo/products/{id}")
