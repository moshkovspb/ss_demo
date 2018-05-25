package enums;

public enum SubHeading {
    SELL("Продают"),
    BUY("Покупают"),
    OTHER("Разное");

    public String text;

    SubHeading(String text) {
        this.text = text;
    }
}
