import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {

        HandBook test = new HandBook();
        test.add("antonyan", "8999123327");
        test.add("antonyan", "8912155326");
        test.add("bobov", "8917155552");
        test.add("bobov", "8913455672");
        test.add("antonyan", "899999999");
        test.add("igoryan", "899111111");
        test.add("bobov", "89923231999");
        test.add("smetanov", "8888123113");
        test.add("igoryan", "8324325234");

        System.out.println(test.get("antonyan"));
        System.out.println(test.get("igoryan"));
        System.out.println(test.get("bobov"));
        System.out.println(test.get("smetanov"));

       findword();

    }

    public static void findword() {
        HashMap<String, Integer> findwords = new HashMap<>();
        String[] words = {
                "Картошка", "Арбуз", "Ньютон",
                "Винигрет", "Тест", "Вектор",
                "Собака", "Кошка", "Java",
                "Yava", "Кошка", "Картошка",
                "Собака", "Тест", "Охотник",
                "Мышь", "Java", "Yava", "Мышь"
        };

        for (int i = 0; i < words.length; i++) {
            if (findwords.containsKey(words[i]))
                findwords.put(words[i], findwords.get(words[i]) + 1);
            else
                findwords.put(words[i], 1);
        }
        System.out.println(findwords);
    }
}

class HandBook{
    HashMap<String,ArrayList<String>> list_book = new HashMap<>();
    ArrayList<String>number = new ArrayList<>();

    public void add(String surname, String  phone_number){
        if (list_book.containsKey(surname)){
            number = list_book.get(surname);
            number.add(phone_number);
            list_book.put(surname,number);
        }else{
            number = new ArrayList<>();
            number.add(phone_number);
            list_book.put(surname,number);
        }
    }
    public ArrayList<String> get(String surname){
        return list_book.get(surname);
    }





}

