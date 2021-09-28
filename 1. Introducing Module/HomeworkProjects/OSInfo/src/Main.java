public class Main {
    public static void main(String[] args) {
        System.out.println("Информация о системе:");
        System.out.println("Операционная система: " +
                System.getProperty("os.name") + " " +
                System.getProperty("os.version"));
        System.out.println("Количество ядер процессора: " +
                Runtime.getRuntime().availableProcessors());
        System.out.println("Количество памяти, доступной JVM: " +
                Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }
}
