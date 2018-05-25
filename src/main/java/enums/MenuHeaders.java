package enums;

public enum MenuHeaders {
    ELECTRONICS("Электротехника"),
    CONSTRUCTION("Строительство"),
    TRANSPORT("Транспорт");
    //TODO add other headers

    public String text;

    MenuHeaders(String text) {
        this.text = text;
    }
}
