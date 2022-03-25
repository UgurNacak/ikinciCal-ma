import java.util.ArrayList;
import java.util.List;

public class StringDeneme {
    public static void main(String[]args){
        List<String> harfler =new ArrayList<>();
        harfler.add("D");//[D]
        harfler.add("M");// D, M
        harfler.add(1," T");
        harfler.add(0,"T");
        System.out.println(harfler);
        System.out.println(harfler.contains("T")); // true dönecek
        System.out.println(harfler.contains("F")); // false dönecek



    }
}
