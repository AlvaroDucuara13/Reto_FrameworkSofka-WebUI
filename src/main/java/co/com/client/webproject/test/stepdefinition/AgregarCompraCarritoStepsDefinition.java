package co.com.client.webproject.test.stepdefinition;

import co.com.client.webproject.test.controllers.AgregarCompraCarrito.*;
import co.com.client.webproject.test.controllers.CreateAccount.CreateAnAccountWebController;
import co.com.client.webproject.test.controllers.CreateAccount.LoginPageController;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.client.webproject.test.helpers.Dictionary.MESSAGE_ALERT_NO_ACCEPT_TERMS;
import static co.com.client.webproject.test.helpers.Dictionary.MESSAGE_CONFIRME_ORDER;

public class AgregarCompraCarritoStepsDefinition extends Setup{
   /* private WebAction webAction;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

   @Dado("que el cliente esta registrado en la pagina web")
    public void queElClienteEstaRegistradoEnLaPaginaWeb() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();

    }
    @Cuando("el cliente escoge un producto para agregarlo al carrito")
    public void elClienteEscogeUnProductoParaAgregarloAlCarrito() {
        AgregarCompraCarritoDressesController AddToCar = new AgregarCompraCarritoDressesController();
        AddToCar.setWebAction(webAction);
        AddToCar.AgregarProductoDressesAlCarrito();

    }
    @Entonces("como resultado el cliente recibira un mensaje de confirmacion")
    public void comoResultadoElClienteRecibiraUnMensajeDeConfirmacion() {
        AgregarCarritoAssertExitosoController AddToCar = new AgregarCarritoAssertExitosoController();
        AddToCar.setWebAction(webAction);

        String OrderConfirm = AddToCar.MessageConfirm();

        Assert
                .Hard
                .thatString(OrderConfirm)
                .isEqualTo(MESSAGE_CONFIRME_ORDER);

    }

   @Dado("que el cliente esta registrado en la plataforma web")
    public void queElClienteEstaRegistradoEnLaPlataformaWeb() {
       StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
       startBrowserWebController.setWebAction(webAction);
       startBrowserWebController.setBrowser(browser());
       startBrowserWebController.setFeatue(testInfo.getFeatureName());
       startBrowserWebController.abrirTiendaOnline();

       LoginPageController loginPageController = new LoginPageController();
       loginPageController.setWebAction(webAction);
       loginPageController.irHaciaLoginPage();

       CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
       createAnAccountWebController.setWebAction(webAction);
       createAnAccountWebController.crearUnaCuenta();

    }
    @Cuando("el cliente escoge un producto de la seccion Women, escoge el color del producto e ingresa un comentario para agregarlo al carrito")
    public void elClienteEscogeUnProductoDeLaSeccionWomenEscogeElColorDelProductoEIngresaUnComentarioParaAgregarloAlCarrito() {
        AgregarCompraCarritoWomenController AddToCar = new AgregarCompraCarritoWomenController();
        AddToCar.setWebAction(webAction);
        AddToCar.AgregarProductoWomenCarrito();

    }
    @Entonces("como resultado el cliente recibira un mensaje donde confirma la orden")
    public void comoResultadoElClienteRecibiraUnMensajeDondeConfirmaLaOrden() {

        AgregarCarritoAssertExitosoController AddToCar = new AgregarCarritoAssertExitosoController();
        AddToCar.setWebAction(webAction);

        String OrderConfirm = AddToCar.MessageConfirm();

        Assert
                .Hard
                .thatString(OrderConfirm)
                .isEqualTo(MESSAGE_CONFIRME_ORDER);

    }


    @Dado("que el cliente esta registrado en la aplicacion web")
    public void queElClienteEstaRegistradoEnLaAplicacionWeb() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();


    }
    @Cuando("el cliente  agrega un producto al carritp y continua a la compra, pero no acepto los terminos y condiciones de uso.")
    public void elClienteAgregaUnProductoAlCarritpYContinuaALaCompraPeroNoAceptoLosTerminosYCondicionesDeUso() {

        AgregarCompraCarritoNoAcceptTermsController AddToCar = new AgregarCompraCarritoNoAcceptTermsController();
        AddToCar.setWebAction(webAction);
        AddToCar.AgregarProductoWomenCarrito();

    }
    @Entonces("como resultado el cliente recibira un mensaje de advertencia")
    public void comoResultadoElClienteRecibiraUnMensajeDeAdvertencia() {

        AgregarCarritoAssertNoExitosoController AddToCar = new AgregarCarritoAssertNoExitosoController();
        AddToCar.setWebAction(webAction);

        String OrderConfirm = AddToCar.MessageAlert();

        Assert
                .Hard
                .thatString(OrderConfirm)
                .isEqualTo(MESSAGE_ALERT_NO_ACCEPT_TERMS);

    }


    @After
    public void cerrarDriver() throws InterruptedException {

        Thread.sleep(5000);

        if (webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("***** HA FINALIZADO LA PRUEBA******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }

*/
}
