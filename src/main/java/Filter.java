import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    private int filtrationThreshold;

    public Filter(int filtrationThreshold) {
        this.filtrationThreshold = filtrationThreshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> listOut;

        listOut = list.stream()
                .filter((i) ->
                {
                    logger.log(String.format("Элемент \"%d\"%s проходит",
                            i, i >= filtrationThreshold ? " " : " не"));
                    return i >= filtrationThreshold;
                })
                .collect(Collectors.toList());

        logger.log("Прошло фильтр " + listOut.size() + " элемента из " + list.size());
        return listOut;
    }
}