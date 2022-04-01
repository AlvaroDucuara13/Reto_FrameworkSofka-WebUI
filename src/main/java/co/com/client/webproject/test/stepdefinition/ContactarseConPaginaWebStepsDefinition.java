package co.com.client.webproject.test.stepdefinition;

import co.com.client.webproject.test.controllers.ContactarseConPaginaWeb.*;
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

import static co.com.client.webproject.test.helpers.Dictionary.MESSAGE_ERROR;
import static co.com.client.webproject.test.helpers.Dictionary.MESSAGE_VALIDATION_CONTACTUS;

public class ContactarseConPaginaWebStepsDefinition extends Setup{

    /*private WebAction webAction;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Dado("que el cliente se encuentra en la seccion principal de la pagina web y desea contactarse con servicio al cliente")
    public void queElClienteSeEncuentraEnLaSeccionPrincipalDeLaPaginaWebYDeseaContactarseConServicioAlCliente() {

        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

        LoginContacUsPageController loginPageController = new LoginContacUsPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

    }
    @Cuando("el cliente ingresa los datos y el mensaje de requerimiento")
    public void elClienteIngresaLosDatosYElMensajeDeRequerimiento() {

        ContactarseConPaginaWebExitosoController ContacUs = new ContactarseConPaginaWebExitosoController();
        ContacUs.setWebAction(webAction);
        ContacUs.ContactarseConPaginaWeb();

    }
    @Entonces("como resultado el cliente recibira un mensaje de confirmacion exitosa")
    public void comoResultadoElClienteRecibiraUnMensajeDeConfirmacionExitosa() {
        ContactarsePaginaWebAssertExitosoController ContactUs = new ContactarsePaginaWebAssertExitosoController();
        ContactUs.setWebAction(webAction);

        String OrderConfirm = ContactUs.MessageConfirm();

        Assert
                .Hard
                .thatString(OrderConfirm)
                .isEqualTo(MESSAGE_VALIDATION_CONTACTUS);

    }

    @Dado("que el cliente se encuentra en la seccion de contactarse con servicio al cliente de la pagina web")
    public void queElClienteSeEncuentraEnLaSeccionDeContactarseConServicioAlClienteDeLaPaginaWeb() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

        LoginContacUsPageController loginPageController = new LoginContacUsPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();


    }
    @Cuando("el cliente  ingresa y envia los datos sin  mensaje")
    public void elClienteIngresaYEnviaLosDatosSinMensaje() {

        ContactarseConPaginaWebNoExitosoController ContacUs = new ContactarseConPaginaWebNoExitosoController();
        ContacUs.setWebAction(webAction);
        ContacUs.ContactarseConPaginaWeb();

    }
    @Entonces("como resultado el cliente recibira un mensaje de alerta sobre mensaje vacio")
    public void comoResultadoElClienteRecibiraUnMensajeDeAlertaSobreMensajeVacio() {


        ContactarsePaginaWebAssertNoExitosoController ContactUs = new ContactarsePaginaWebAssertNoExitosoController();
        ContactUs.setWebAction(webAction);

        String OrderConfirm = ContactUs.MessageAlert();

        Assert
                .Hard
                .thatString(OrderConfirm)
                .isEqualTo(MESSAGE_ERROR);

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
    }*/

}
