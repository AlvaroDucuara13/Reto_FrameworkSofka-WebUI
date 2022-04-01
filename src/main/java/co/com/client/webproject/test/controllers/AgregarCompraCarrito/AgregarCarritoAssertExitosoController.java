package co.com.client.webproject.test.controllers.AgregarCompraCarrito;

import co.com.client.webproject.test.page.AgregarCompraCarritoPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

public class AgregarCarritoAssertExitosoController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public String MessageConfirm(){
        String ConfirmOrder = "";
        try{
            AgregarCompraCarritoPage carritoPage = new AgregarCompraCarritoPage(webAction.getDriver());

            ConfirmOrder = webAction.getText(carritoPage.getOrderConfirmPayAll(), 5, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar validar la compra del producto .", e);
        }

        return ConfirmOrder;
    }
}
