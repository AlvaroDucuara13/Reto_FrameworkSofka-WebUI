package co.com.client.webproject.test.controllers.ContactarseConPaginaWeb;

import co.com.client.webproject.test.model.Customer;
import co.com.client.webproject.test.page.ContactarsePaginaWebPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.client.webproject.test.helpers.Dictionary.*;
import static co.com.client.webproject.test.helpers.Helper.generateCustomer;


public class ContactarseConPaginaWebExitosoController {
    private WebAction webAction;
    private Customer customer;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void ContactarseConPaginaWeb(){
        try{
            ContactarsePaginaWebPage ContactUs = new ContactarsePaginaWebPage(webAction.getDriver());
            customer = generateCustomer(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);

            webAction.selectByPartialText(ContactUs.getSubjectHeading(), CUSTOMERSERVICE, 5, true);
            webAction.sendText( ContactUs.getEmailAddress(), customer.getEmail(),  5, true);
            webAction.sendText(ContactUs.getOrderReference(), ORDER_REFERENCE, 5,true);
            webAction.sendText(ContactUs.getMessage(), MESSAGE_CONTACTUS, 5,true);
            webAction.click(ContactUs.getSubmitContacUs(), 5, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar Contactarse con la pagina web.", e);
        }
    }


}
