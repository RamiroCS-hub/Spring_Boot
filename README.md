## SPRING BOOT COURSE

#### Que es spring?

Spring es un conjunto de proyectos Java con el objetivo de facilitar el desarrollo de ciertas aplicaciones en el lenguaje. Específicamente Springo boot es un framework parte de Spring que sirve para el desarrollo del lado del servidor con Java

### DECORATORS

- _**@RequestMapping**_ -> Funciona como el router en node js. Se le puede pasar el atributo **value** para establecer la ruta y el atributo **method = RequestMethod.METODO** para establecer que tipo de petición se peude hacer a esa ruta. **Si se deja vacío acepta todas las peticiones**
También se pueden usar decoradores mas específicos si es que una ruta solamente va a utilizar un metodo HTTP. Para cada uno de estos hay un decorador específico, por ejemplo:
- _**@GetMapping**_ -> Sirve para aceptar peticiones get en la ruta especifícada entre (value="ruta")
- _**@Transactional**_ -> Sirve para definir metodos que funcionen como transacciones. Que significa esto? Las transacciones son una serie de intrucciones que Java ejecuta en bloques y para que pueda ser consumido tiene que primero haberse finalizado la transacción (tanto de forma existosa como no) esto se utiliza para mantener la consistencia de los datos en operaciones con externos, en muchos casos bases de datos
- _**@RestController**_ -> Es una combinación entre el @Controller normal y el use de @ResponseBody en los métodos. Esto es para que no se tenga que utilizar el decorador @ResponseBody ya que el @RestController detectas automaticamente cada respuesta de los métodos como peticiones http
- 
### ATTRIBUTES
- _**@PathVariable**_ -> Estos son los parametros que se le envían mediante el path de la ruta o endpoint. Su equivalente en express sería req.params
- _**@RequestParam**_ -> Estos son los valores que se envía en la query de la ruta, es decir (?nombreDeVariable=Valor). Su equivalente en node sería el req.query

### DEPENDENCIES
- _**Thymeleaf**_ -> Sirve para comunicar variables desde la lógica hacia la vista. No es útil al hacer una API Rest o GraphQL.

### PRINCIPIOS DE SOTWARE EN JAVA
#### IoC - Inversion of control
El princio de IoC o Inversión de control se basa en dejar el control del flujo a, en este caso, el contenedor IoC de Spring boot. Esto quiere decir que Spring se va a encargar de hacer las inyección de dependencia necesarias para que todo funcione si es que se usan las anotaciones correctas (@Component para clases, @Bean para métodos). Un ejemplo es la utilización de la anotación @Service que le dice al IoC de Spring boot que esa clase tiene que ser tomada en cuenta para ser inyectada en otro lado. La mayoría de notaciones, @Repository @Service @RestController tienen dentro la anotación @Component, por eso Spring boot las detecta. 

#### AOP - Aspect oriented programming
El paradigma de programación AOP se utiliza cuando tenemos una funcionalidad que se dice que tiene responsabilidad tranversal. Esto significa que es un método que tiene que ejecutarse en todas o en varias de nuestras clases. La mejor solución para esto es la utilización de AOP, el AOP te permite crear Aspectos (@Aspect) que van a ser clases que pueden ser utilizadas tranversalmente en todo el código. Por ejemplo si necesitamos hacer un login de un usuario o verificar sus datos podemos convertir ese método en un aspecto para poder usarlo en todas las clases que lo requieran, luego nosotros podremos definir un **Pointcut** que es en donde especificamente se ejecutara ese aspect. Para tener una analogía parecida de como funciona se podría comparar a los middlewares de express, donde se crea una funcionalidad y se establece que se tiene que ejecutar, por ejemplo, cada vez que se llame a X endpoint

##### TERMINOLOGÍA DE AOP
* Aspect -> El aspect en la nueva responsabilidad/funcionalidad que estamos tratando de implementar
* Advice -> La acción particular en un join point dentro del aspecto que se va a ejecutar 
* Pointcut -> El pointcut es la expresión que determina en que métodos es que nuestro Advice se tiene que ejecutar 
* Joint point -> El joint point representa el método que se esta ejecutando o que se ejecuto. A diferencia de las otras metodologías esta tiene que ver con el tiempo de ejecución de nuestro programa
* Weaving -> El weaving es otra metodología que se refiere a algo que sucede durante tiempo de ejecución. Especificamente se llama weaving a lo que conecta nuestro Pointcut y nuestro Advice, a esa conexión que le dice a nuestro Advice cuando tiene que ejecutarse se le llama Weaving.

## CONSIDERACIONES
  * Si el Spring boot devTool tira error buscar la carpeta borrarla y volver a instalar la dependencia con maven
  * **Java no admite la herencia multiple**