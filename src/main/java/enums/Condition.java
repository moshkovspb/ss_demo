package enums;

public enum Condition {
    NEW("нов."),
    USED("б/у");

    public String text;

    Condition(String text) {
        this.text = text;
    }
}
