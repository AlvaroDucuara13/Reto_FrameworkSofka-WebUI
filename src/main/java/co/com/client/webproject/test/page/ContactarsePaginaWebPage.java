package co.com.client.webproject.test.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactarsePaginaWebPage {


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement SubjectHeading;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement EmailAddress;

    @CacheLookup
    @FindBy(id = "id_order")
    WebElement OrderReference;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement Message;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
    WebElement SubmitContacUs;


    //Assert
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement ContactUsValidation;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/ol")
    WebElement ContactUsMessageError;

    public ContactarsePaginaWebPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
    }

    public WebElement getSubjectHeading() {
        return SubjectHeading;
    }

    public void setSubjectHeading(WebElement subjectHeading) {
        SubjectHeading = subjectHeading;
    }

    public WebElement getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(WebElement emailAddress) {
        EmailAddress = emailAddress;
    }

    public WebElement getOrderReference() {
        return OrderReference;
    }

    public void setOrderReference(WebElement orderReference) {
        OrderReference = orderReference;
    }

    public WebElement getMessage() {
        return Message;
    }

    public void setMessage(WebElement message) {
        Message = message;
    }

    public WebElement getSubmitContacUs() {
        return SubmitContacUs;
    }

    public void setSubmitContacUs(WebElement submitContacUs) {
        SubmitContacUs = submitContacUs;
    }

    public WebElement getContactUsValidation() {
        return ContactUsValidation;
    }

    public void setContactUsValidation(WebElement contactUsValidation) {
        ContactUsValidation = contactUsValidation;
    }

    public WebElement getContactUsMessageError() {
        return ContactUsMessageError;
    }

    public void setContactUsMessageError(WebElement contactUsMessageError) {
        ContactUsMessageError = contactUsMessageError;
    }
}
