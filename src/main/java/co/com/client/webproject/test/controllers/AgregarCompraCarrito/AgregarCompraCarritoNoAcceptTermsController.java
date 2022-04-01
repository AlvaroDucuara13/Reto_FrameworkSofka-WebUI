package co.com.client.webproject.test.controllers.AgregarCompraCarrito;

import co.com.client.webproject.test.page.AgregarCompraCarritoPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.client.webproject.test.helpers.Dictionary.SCROLL_DOWN;

public class AgregarCompraCarritoNoAcceptTermsController {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void AgregarProductoWomenCarrito(){

        try{
            AgregarCompraCarritoPage AddToCar = new AgregarCompraCarritoPage(webAction.getDriver());

            webAction.click(AddToCar.getWomen(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getPintedChifonWomen(), 10, true);
            webAction.click(AddToCar.getAddToCartAll(), 10, true);
            webAction.click(AddToCar.getProceedcheckoutAll(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getNextProceedcheckoutAll(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getNextToNextProceedcheckoutAll(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getNextToProceedcheckoutWayPayAll(), 10, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar Comprar un producto.", e);
        }
    }
}
