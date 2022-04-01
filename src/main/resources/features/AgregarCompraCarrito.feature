# language: es

@FeatureName:AgregarProductoCarrito
Característica: AgregarCompraCarrito
  Como cliente registrado en la plataforma
  necesito agregar productos al carrito de compras
  para poder comprarlo

  @ScenarioName:AgregarCompraCarrito
  Escenario: Agregar un producto de la seccion T-Shirts y de la seccion Dresses
    Dado que el cliente esta registrado en la pagina web
    Cuando el cliente escoge un producto para agregarlo al carrito
    Entonces como resultado el cliente recibira un mensaje de confirmacion


  @ScenarioName:AgregarOtraCompraCarrito
  Escenario: Agregar un producto de la seccion Women
    Dado que el cliente esta registrado en la plataforma web
    Cuando el cliente escoge un producto de la seccion Women, escoge el color del producto e ingresa un comentario para agregarlo al carrito
    Entonces como resultado el cliente recibira un mensaje donde confirma la orden

  @ScenarioName:AgregarCompraCarritoNoExitoso
  Escenario: No aceptar los terminos y condiciones
    Dado que el cliente esta registrado en la aplicacion web
    Cuando el cliente  agrega un producto al carritp y continua a la compra, pero no acepto los terminos y condiciones de uso.
    Entonces como resultado el cliente recibira un mensaje de advertencia



