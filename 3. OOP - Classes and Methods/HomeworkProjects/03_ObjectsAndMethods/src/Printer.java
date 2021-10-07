public class Printer {
    String queue = "";
    int pendingPagesCount = 0;
    int totalPendingPagesCount = 0;
    String commonTitle = "СТАНДАРТНЫЙ ЗАГОЛОВОК";

    public void append(String text) {
        append(text, commonTitle, 1);
    }
    public void append(String text, int amountOfPages) {
        append(text, commonTitle, amountOfPages);
    }
    public void append(String text, String title) {
        append(text, title, 1);
    }
    public void append(String text, String title, int amountOfPages) {
        queue = queue +
                "\n" + "Заголовок документа: " + title +
                "\n" + "Текст документа: " + text +
                "\n" + "Общее количество страниц: " + amountOfPages + "\n";
        pendingPagesCount += amountOfPages;
        totalPendingPagesCount += amountOfPages;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print() {
        System.out.print(queue);
        clear();
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getTotalPendingPagesCount() {
        return totalPendingPagesCount;
    }
}
