package telephone_book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        //        We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
        //
        //        Create a map with the following key-value pairs.
        //
        //                Name (key)	Phone number (value)
        //                William A. Lathan	405-709-1865
        //        John K. Miller	402-247-8568
        //        Hortensia E. Foster	606-481-6467
        //        Amanda D. Newland	319-243-5613
        //        Brooke P. Askew	307-687-2982
        //        Create an application which solves the following problems.
        //
        //        What is John K. Miller's phone number?
        //        Whose phone number is 307-687-2982?
        //                Do we know Chris E. Myers' phone number?

        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("William A. Lathan", "405-709-1865");
        phoneNumbers.put("John K. Miller", "402-247-8568");
        phoneNumbers.put("Hortensia E. Foster", "606-481-6467");
        phoneNumbers.put("Amanda D. Newland", "319-243-5613");
        phoneNumbers.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phoneNumbers.get("John K. Miller"));
        List<String> name = new ArrayList<>();
        for (Map.Entry < String, String > item: phoneNumbers.entrySet()){
            if (item.getValue() == "307-687-2982"){
                name.add(item.getKey());
            }
        }
        System.out.println(name);
        System.out.println(phoneNumbers.containsKey("Chris E. Myers"));
    }
}
