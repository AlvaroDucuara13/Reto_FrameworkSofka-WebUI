package co.com.client.webproject.test.controllers.AgregarCompraCarrito;

import co.com.client.webproject.test.page.AgregarCompraCarritoPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.client.webproject.test.helpers.Dictionary.SCROLL_DOWN;


public class AgregarCompraCarritoDressesController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void AgregarProductoDressesAlCarrito(){
        try{
            AgregarCompraCarritoPage AddToCar = new AgregarCompraCarritoPage(webAction.getDriver());

            webAction.click(AddToCar.getTShirts(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getTShirtsYellow(), 10, true);
            webAction.click(AddToCar.getAddToCartAll(), 10, true);
            webAction.click(AddToCar.getContinueShoppingAll(), 10, true);
            webAction.click(AddToCar.getDresses(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getDressesPrintedChiffon(), 10, true);
            webAction.click(AddToCar.getDressesPrintedChiffonGreen(), 10, true);
            webAction.click(AddToCar.getDressesPrintedChiffonGreenAddToCart(), 10, true);
            webAction.click(AddToCar.getProceedcheckoutAll(), 10, true);
            webAction.click(AddToCar.getNextProceedcheckoutAll(), 10, true);
            webAction.click(AddToCar.getNextToNextProceedcheckoutAll(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getAcceptConditionsAll(), 10, true);
            webAction.click(AddToCar.getNextToProceedcheckoutWayPayAll(), 10, true);
            webAction.scroll(SCROLL_DOWN);
            webAction.click(AddToCar.getDressesPayCheck(), 10, true);
            webAction.click(AddToCar.getConfirmPayAll(), 10, true);


        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar agregar producto al carrito de compras.", e);
        }
    }


}
