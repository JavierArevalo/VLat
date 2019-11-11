import java.util.ArrayList;
import java.util.HashMap;

/*
 * To do: create Tuple class to fix compiler errors in this class
 */
public class Itemize extends Request {
    private HashMap<String, ArrayList<Tuple(String item, Double price)> userToItems> userToItems;
    private HashMap<String, ArrayList<String>> itemsToPriceAndUsers;

    /*
     * To do: double check if any sequence of events could lead me to return fales
     */
    public boolean populateHashMap(HashMap<String, ArrayList<String> itemsToPriceAndUser>) {
        this.itemsToPriceAndUsers = itemsToPriceAndUser;
    }

    /*
     * To do: figure out how to implement calculate method for itemize class
     */
    public  boolean calculate() {

    }



}
