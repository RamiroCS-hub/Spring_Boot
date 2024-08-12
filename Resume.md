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
#### IoC
El princio de IoC o Inversión de control se basa en dejar el control del flujo a, en este caso, el contenedor IoC de Spring boot. Esto quiere decir que Spring se va a encargar de hacer las inyección de dependencia necesarias para que todo funcione si es que se usan las anotaciones correctas (@Component para clases, @Bean para métodos). Un ejemplo es la utilización de la anotación @Service que le dice al IoC de Spring boot que esa clase tiene que ser tomada en cuenta para ser inyectada en otro lado. La mayoría de notaciones, @Repository @Service @RestController tienen dentro la anotación @Component, por eso Spring boot las detecta. 

## CONSIDERACIONES
  Si el Spring boot devTool tira error buscar la carpeta borrarla y volver a instalar la dependencia con maven