package enums;

public enum HeaderMenu {
    SUBMIT_AD("Подать объявление"),
    MY_AD("Мои объявления"),
    SEARCH("Поиск"),
    BOOKMARKS("Закладки");

    public String text;

    HeaderMenu(String text) {
        this.text = text;
    }
}
