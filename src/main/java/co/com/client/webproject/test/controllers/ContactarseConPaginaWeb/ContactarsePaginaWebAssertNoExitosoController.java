package co.com.client.webproject.test.controllers.ContactarseConPaginaWeb;

import co.com.client.webproject.test.page.ContactarsePaginaWebPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

public class ContactarsePaginaWebAssertNoExitosoController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public String MessageAlert(){
        String MessageAlert = "";
        try{
            ContactarsePaginaWebPage ContacUs = new ContactarsePaginaWebPage(webAction.getDriver());

            MessageAlert = webAction.getText(ContacUs.getContactUsMessageError(), 5, true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar contactarse con la pagina web.", e);
        }

        return MessageAlert;
    }
}
