# Social Media API RESTful📱
## About 📕
  <p>This project is a social media API, it has a user crud and GET methods for user posts. This project was developed with instructions from Nelio Alves' Java and Spring Boot course, in order to exercise and improve the skills acquired during the course.</p>

## Features 🛠️
  -  CRUD of Users
  -  GET of Posts
  
## Techs 💻
  <ul>
    <li><a href="https://www.java.com">Java</a>: language used during api development.</li>
    <li><a href="https://spring.io">Spring Boot</a>: framework used for developing the web api using Spring Web and Spring Data JPA.</li>
    <li><a href="https://www.mongodb.com/try/download/community">MongoDB</a>: NoSQL database used during application development</li>
  </ul>
  
## Requiriments 📝
  <ul>
    <li>Have <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java</a> version 17 installed</li>
    <li>Have <a target="_blank" href="https://www.postman.com/downloads/">Postman</a> installed(but the application can be used in browser)</li>
  </ul>
  
## initialization 🔌
- Use <a target="_blank" href="https://www.postman.com/downloads/">Postman</a> to make better use of the API's features.
``` bash 
  # Clone project
  $ git clone git@github.com:victordantas1/social-media-api.git
````

 ``` bash 
   # Install dependencies
   $ mvn install
  ````

 ``` bash 
   # Run project
   $ mvn spring-boot:run
 ````
-  The application will run at http://localhost:8080.
### Endpoints
#### GET
  - /users: find a users list
  - /posts: find a post list
  - /posts/titlesearch?text=<title>: find a post by title
#### POST
  - /users: add a user
#### PUT
  - /users: update a user
#### DELETE
  - /user: delete a user

## Future implementations ⌨️
  - CRUD of other entities
  - Anothers endpoints to find with others atributes
