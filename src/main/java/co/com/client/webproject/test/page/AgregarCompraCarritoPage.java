package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgregarCompraCarritoPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement TShirts;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    WebElement TShirtsYellow;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    WebElement AddToCartAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    WebElement ContinueShoppingAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement Dresses;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/h5/a")
    WebElement DressesPrintedChiffon;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"color_15\"]")
    WebElement DressesPrintedChiffonGreen;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    WebElement DressesPrintedChiffonGreenAddToCart;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement ProceedcheckoutAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    WebElement NextProceedcheckoutAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement NextToNextProceedcheckoutAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"form\"]/div/p[2]/label")
    WebElement AcceptConditionsAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    WebElement NextToProceedcheckoutWayPayAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    WebElement 	DressesPayCheck;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement ConfirmPayAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement 	Women;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/h5/a")
    WebElement 	PintedSummerWomen;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"color_11\"]")
    WebElement 	PintedSummerBlackColorWomen;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[7]/div/div[2]/h5/a")
    WebElement 	PintedChifonWomen;



    @CacheLookup
    @FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
    WebElement 	WomenAddComment;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement 	WomenBankPay;


    //Assert

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    WebElement OrderConfirmPayAll;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order\"]/div[2]/div/div/div/div/p")
    WebElement 	MessageAlertTermsService;

    public AgregarCompraCarritoPage(WebDriver webDriver) {

        PageFactory.initElements(webDriver, this);
    }

    public WebElement getTShirts() {
        return TShirts;
    }

    public void setTShirts(WebElement TShirts) {
        this.TShirts = TShirts;
    }

    public WebElement getTShirtsYellow() {
        return TShirtsYellow;
    }

    public void setTShirtsYellow(WebElement TShirtsYellow) {
        this.TShirtsYellow = TShirtsYellow;
    }

    public WebElement getAddToCartAll() {
        return AddToCartAll;
    }

    public void setAddToCartAll(WebElement addToCartAll) {
        this.AddToCartAll = addToCartAll;
    }

    public WebElement getContinueShoppingAll() {
        return ContinueShoppingAll;
    }

    public void setContinueShoppingAll(WebElement continueShoppingAll) {
        this.ContinueShoppingAll = continueShoppingAll;
    }

    public WebElement getDresses() {
        return Dresses;
    }

    public void setDresses(WebElement dresses) {
        Dresses = dresses;
    }

    public WebElement getDressesPrintedChiffon() {
        return DressesPrintedChiffon;
    }

    public void setDressesPrintedChiffon(WebElement dressesPrintedChiffon) {
        DressesPrintedChiffon = dressesPrintedChiffon;
    }

    public WebElement getDressesPrintedChiffonGreen() {
        return DressesPrintedChiffonGreen;
    }

    public void setDressesPrintedChiffonGreen(WebElement dressesPrintedChiffonGreen) {
        DressesPrintedChiffonGreen = dressesPrintedChiffonGreen;
    }

    public WebElement getDressesPrintedChiffonGreenAddToCart() {
        return DressesPrintedChiffonGreenAddToCart;
    }

    public void setDressesPrintedChiffonGreenAddToCart(WebElement dressesPrintedChiffonGreenAddToCart) {
        DressesPrintedChiffonGreenAddToCart = dressesPrintedChiffonGreenAddToCart;
    }

    public WebElement getProceedcheckoutAll() {
        return ProceedcheckoutAll;
    }

    public void setProceedcheckoutAll(WebElement proceedcheckoutAll) {
        ProceedcheckoutAll = proceedcheckoutAll;
    }

    public WebElement getNextProceedcheckoutAll() {
        return NextProceedcheckoutAll;
    }

    public void setNextProceedcheckoutAll(WebElement nextProceedcheckoutAll) {
        NextProceedcheckoutAll = nextProceedcheckoutAll;
    }

    public WebElement getNextToNextProceedcheckoutAll() {
        return NextToNextProceedcheckoutAll;
    }

    public void setNextToNextProceedcheckoutAll(WebElement nextToNextProceedcheckoutAll) {
        NextToNextProceedcheckoutAll = nextToNextProceedcheckoutAll;
    }

    public WebElement getAcceptConditionsAll() {
        return AcceptConditionsAll;
    }

    public void setAcceptConditionsAll(WebElement acceptConditionsAll) {
        AcceptConditionsAll = acceptConditionsAll;
    }

    public WebElement getNextToProceedcheckoutWayPayAll() {
        return NextToProceedcheckoutWayPayAll;
    }

    public void setNextToProceedcheckoutWayPayAll(WebElement nextToProceedcheckoutWayPayAll) {
        NextToProceedcheckoutWayPayAll = nextToProceedcheckoutWayPayAll;
    }

    public WebElement getDressesPayCheck() {
        return DressesPayCheck;
    }

    public void setDressesPayCheck(WebElement dressesPayCheck) {
        DressesPayCheck = dressesPayCheck;
    }

    public WebElement getConfirmPayAll() {
        return ConfirmPayAll;
    }

    public void setConfirmPayAll(WebElement confirmPayAll) {
        ConfirmPayAll = confirmPayAll;
    }


    public WebElement getWomen() {
        return Women;
    }

    public void setWomen(WebElement women) {
        Women = women;
    }

    public WebElement getPintedSummerWomen() {
        return PintedSummerWomen;
    }

    public void setPintedSummerWomen(WebElement pintedSummerWomen) {
        PintedSummerWomen = pintedSummerWomen;
    }

    public WebElement getPintedSummerBlackColorWomen() {
        return PintedSummerBlackColorWomen;
    }

    public void setPintedSummerBlackColorWomen(WebElement pintedSummerBlackColorWomen) {
        PintedSummerBlackColorWomen = pintedSummerBlackColorWomen;
    }

    public WebElement getPintedChifonWomen() {
        return PintedChifonWomen;
    }

    public void setPintedChifonWomen(WebElement pintedChifonWomen) {
        PintedChifonWomen = pintedChifonWomen;
    }

    public WebElement getWomenAddComment() {
        return WomenAddComment;
    }

    public void setWomenAddComment(WebElement womenAddComment) {
        WomenAddComment = womenAddComment;
    }

    public WebElement getWomenBankPay() {
        return WomenBankPay;
    }

    public void setWomenBankPay(WebElement womenBankPay) {
        WomenBankPay = womenBankPay;
    }

    public WebElement getOrderConfirmPayAll() {
        return OrderConfirmPayAll;
    }

    public void setOrderConfirmPayAll(WebElement orderConfirmPayAll) {
        OrderConfirmPayAll = orderConfirmPayAll;
    }

    public WebElement getMessageAlertTermsService() {
        return MessageAlertTermsService;
    }

    public void setMessageAlertTermsService(WebElement messageAlertTermsService) {
        MessageAlertTermsService = messageAlertTermsService;
    }
}
