package enums;

public enum CityDistrict {
    ALL("Все объявления"),
    RIGA("Рига"),
    YURMALA("Юрмала");
    //TODO add others districts and cities

    public String text;

    CityDistrict(String text) {
        this.text = text;
    }
}
