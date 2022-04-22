import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите рамер списка: ");
        int sizeList = Integer.parseInt(sc.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        int topBorder = Integer.parseInt(sc.nextLine());

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            list.add(random.nextInt(topBorder));
        }

        System.out.print("Вот случайный список: ");
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filtrationThreshold = Integer.parseInt(sc.nextLine());

        Filter filter = new Filter(filtrationThreshold);
        List<Integer> listOut = filter.filterOut(list);

        System.out.print("Отфильтрованный список: ");
        listOut.forEach(x -> System.out.print(x + " "));
    }
}