import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hi {
    public static void main(String[] arr){

        System.out.println("Hi");
        List<String> list = new ArrayList();
        list.add("123");
        list.add("234");
        List newList =list.stream().filter(x-> x.contains("1")).collect(Collectors.toList());
        list.forEach(x-> System.out.println(x));

    }

}
