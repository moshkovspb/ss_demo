package enums;

public enum SearchPeriod {
    ALL("Среди всех объявлений"),
    TODAY("Среди сегодняшних объявлений"),
    DAY3("За последних 3 дня"),
    WEEK("Среди сегодняшних объявлений"),
    MONTH("За последних 3 дня");

    public String text;

    SearchPeriod(String text) {
        this.text = text;
    }

}
