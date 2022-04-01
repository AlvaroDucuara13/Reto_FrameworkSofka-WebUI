package co.com.client.webproject.test.controllers.AgregarCompraCarrito;

import co.com.client.webproject.test.page.AgregarCompraCarritoPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

public class AgregarCarritoAssertNoExitosoController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public String MessageAlert(){
        String TermsNoAccept = "";
        try{
            AgregarCompraCarritoPage carritoPage = new AgregarCompraCarritoPage(webAction.getDriver());

            TermsNoAccept = webAction.getText(carritoPage.getMessageAlertTermsService(), 5, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar validar la creación de un cuenta.", e);
        }

        return TermsNoAccept;
    }
}
