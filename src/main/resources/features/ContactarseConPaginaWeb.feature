# language: es

@FeatureName:ContactarseConLaPaginaWeb
Característica: Contactarse con pagina Web
  Yo como usuario de la página web automationpractice.com
  deseo enviar una peticion
  para realizar contactar con servicio al cliente

  @ScenarioName:ContactarseConlaPlataformaWeb
  Escenario: Contactarse con pagina Web
    Dado que el cliente se encuentra en la seccion principal de la pagina web y desea contactarse con servicio al cliente
    Cuando el cliente ingresa los datos y el mensaje de requerimiento
    Entonces como resultado el cliente recibira un mensaje de confirmacion exitosa

  @ScenarioName:EnviarPeticionGerencia
  Escenario: Enviar Mensaje de peticion al Administrador
    Dado que el cliente se encuentra en la seccion de contactarse con servicio al cliente de la pagina web
    Cuando el cliente  ingresa y envia los datos sin  mensaje
    Entonces como resultado el cliente recibira un mensaje de alerta sobre mensaje vacio