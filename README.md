# HTTP Request Message
- Request line: HTTP command
- Header variable: request metadata
- Message body: contents of message
# HTTP Response Message
- Request line: status code
- Header Variable: response metadata
- Message body: Content
# MIME Content Type
- Message format is described by MIME content type
- Multipurpose Internet Mail-Extension
- Basic syntax: type/sub-type, 
  - text/html, text/plain, application/json, application/xml

# Java JSON Data Binding
- Data binding is the process of converting JSON data to a Java POJO
- also called marshalling/unmarshalling
- A plain old Java object (POJO) is a class definition that is not tied to any Java framework so any Java program can use it
## Jackson (POJO to JSON and JSON to POJO)
- Jackson handles data binding between JSON and Java POJO
- Jackson will call appropriate getter/setter method
- JSON data being passed to REST controller is converted to POJO
- Java object being returned from REST controller is converted to JSON
- this happens automatically as it is already integrated in spring

# @PathVariable
- used to bind path variable in url
- both the variable names should match

# ExceptionHandling
1. create a custom error response class
  - custom error response will be sent back to client as JSON
  - we will define as Java Class
  - Jackson will handle converting it to JSON
2. Create Custom exception
  - custom exception will be used by REST service
3. Update REST service to throw exception
4. Add exception Handler Method
  - Define exception handler method with `@ExceptionHandler` annotation
  - Exception Handler will return a ResponseEntity
  - `@ResponseEntity` is a wrapper for HTTP response object
  - `@ResponseEntity` provides fine-grained control to specify
    - HTTP status code, HTTP header, Response body