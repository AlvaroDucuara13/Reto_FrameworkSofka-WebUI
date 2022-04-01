package co.com.client.webproject.test.helpers;

public class Dictionary {

    public static final String  MESSAGE_CONFIRME_ORDER = "ORDER CONFIRMATION";
    public static final String  MESSAGE_ALERT_NO_ACCEPT_TERMS = "You must agree to the terms of service before continuing.";
    public static final String  MESSAGE_TO_COMMENT = "Hola, me gustaria saber si hay devoluciones";
    public static final String CUSTOMERSERVICE = "Customer service";
    public static final String WEBMASTER = "Webmaster";
    public static final String ORDER_REFERENCE = "Deseo Pedir la referencia del administrador";
    public static final String MESSAGE_CONTACTUS = "Buen dia apreciado administrador, cordial saludo, " +
            "deseo informarle que el pedido nunca llego en la fecha establecida. ";
    public static final String MESSAGE_VALIDATION_CONTACTUS = "Your message has been successfully sent to our team.";
    public static final String MESSAGE_ERROR = "The message cannot be blank.";


    public static final int  SCROLL_UP = -800;
    public static final int  SCROLL_DOWN = 800;

    public static final String STATE_BY_DEFAULT_FLORIDA = "Florida";

    public static final String EMPTY_STRING = "";
    public static final String SPACE_STRING = " ";

    public static final String SPANISH_CODE_LANGUAGE = "es";
    public static final String COUNTRY_CODE = "CO";

    public static final String EMAIL_DOMAIN = "@sofmail.com";

    public static final String FILE_EVIDENCE_PROPERTY = "files.evidence";
    public static final String APP_URL_PROPERTY = "app.url";

    private static final String PROPERTIES_FILE_BASE_PATH = "src/main/resources/properties/";

    public static final String CONFIGURATION_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH + "configuration.properties";

    public static final String MAIL_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH +"mail.properties";
}
