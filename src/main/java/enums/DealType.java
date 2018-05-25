package enums;

public enum DealType {
    SELL("Продажа"),
    BUY("Покупка"),
    REPAIRS("Ремонт"),
    ALL("Все");

    public String text;

    DealType(String text) {
        this.text = text;
    }
}
