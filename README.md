# Reto Backend



La logica del proyecto consistio en ir desarrolando por capas sus contenidos, inciando por la capa de Pasajeros, continuando con la capa de Buses, y finalizar con la capa de Destinos y registro de Viajes.

Incialmente se tuvo en cuenta que para poder realizar el registro de los viajes se debia contar con la capa buses y pasajeros, una vez se verifico que estas cumplieran su funcion se añadieron las opciones de incluir destinos adicionales y por ultimo se realizo la gestion de viajes.

Para la ejecucion del mismo se requiere iniciar desde RetoBackendApplication.java utilizando el IDE de su preferencia, elproyectofue realizado usando Java 17 y SpringBoot.


Gracias a que se implemento Springboot lasopciones de ingresar y validar los Buses, Pasajeros, Destinos y Viajes pueden ser realizados desde una aplicacion como Postman sin la necesidad de ingresardatos por la consola del IDE.

Los endpoints de la API REST se encuentran diferenciados entre si dentro del codigo pero manteniendo un estandar entre ellos, para añadir se uso la convencion /ADD y para validar se uso la convencion /GET y añadiendo al final lo que se desea consultar en lestrasminusculas, en este caso y comoun ejemplo si se desea consulta la lista de buses previamente agregados se debe utilizar el endpoint http://localhost:8080/api/v1/GETbuses y si se desea añadir un bus se debe usar el endpoint http://localhost:8080/api/v1/ADDbuses, de esta manera se busco dar un estandar a los endpoints.



Se identificaron oportunidades de mejora a la hora de implementar la API REST que seran verificadas, estudiadas y aprovechadas para no repetirlas a futuro.



