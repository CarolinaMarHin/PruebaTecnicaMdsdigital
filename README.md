# Explicacion

Para la solución de la prueba
se crea un api para la consulta de los productos 
el cual sera el encargado de mostar todos los productos 
y la cantidad de cada uno, en la parte del front se 
realizaria la validacion si el producto puede ser 
agregado o no segun la cantidad de cada uno, 
y en este se haria la respectiva suma o resta segun agregue 
o quite productos del carro. Y en el front se haria tambien la 
validacion si se debe eliminar el producto completamente 
del carrito.

Con respecto al diagrama de clase, entre mas parametrizadas 
esten las clases se puede dar un mejor manejo
a la aplicacion. Por lo cual se podria analizar de manejar 
las cantidades en una clase aparte y sea esta la clase que 
se modifique cada que se deba actualizar el inventario.
Adicional tambien se puede manejar una clase de tipo de producto,
y que cada producto haga referencia a esa clase dado que se deba modificar
alguna categoria o tipo de producto pueda aplicar para todos los productos
con una sola actualizacion en la base de datos.