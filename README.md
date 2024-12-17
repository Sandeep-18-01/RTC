# RTC
 Own Transport Application

 # Clarities
1) Entities(Tables) and DTOs(Models). are used seperetaly for seperation of concerns. They can be same but used to serve diff purpose, So its wise to use them even though it is code duplicity
2) WebClient and restTemplete differs in Perofrmnace . restTemplete is less paerformance and used in Single Thread environmanet and it blocks the main thread and delays the response. While WebCleint is Asynchronus and supported in SpringBoot. WebCleint >>>> RestTemplete
3) Spring Confuration class is by default singleton. So no need to create  singleton class. Beans created in  config class are also singlton and spring manages their life cycle.
4) Bean properties - when creating a bean , there should not be any methods with parameters. If u want to invoke some params, they should be from app.props or configyuration.props file to fetch those params. The params should not be in arguments (String a, int b)❌❌
5) When we want to inject beans in spring using autowired, the beans has to be non static .
6) In Swagger API, when u only give requestMapping by not specifieng weather its get or POST, It will create everything. Every method in Swagger. put post 


    # Initial Set Up
  1) Run mvn clean install
  2) run mvn spring-boot:run
  3) http://localhost:8080/RTC - access the WebSite
    # DB Design
  1) 
