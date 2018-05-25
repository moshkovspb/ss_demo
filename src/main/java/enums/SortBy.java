package enums;

public enum SortBy {
    NULL(""),
    PRICE("Цена");

    public String text;

    SortBy(String text) {
        this.text = text;
    }
}
