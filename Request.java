import java.util.HashSet;
import java.util.HashMap;

/*
 * Abstract class Request and its appropiate attributes
 */
public abstract class Request {
    private HashSet<String> receivers;
    private int frequency;
    private Account creator;
    private HashMap<String, Double> userToTotal;
    private HashMap<String, Boolean> receiversPaid;
    private String name;

    /*
     * Simple getter for Receivers HashSet<String>
     */
    public HashSet<String> getReceivers() {
        return this.receivers;
    }

    /*
     * Simple method that adds members to receivers list
     * To do: make sure that I need to add them only to receivers list
     */
    public void addMembers(HashSet<String> list) {
        if (this.receivers == null) {
            this.receivers = new HashSet<String>;
        }
        HashSet<String> modified = this.getReceivers();
        for (String s: list) {
            modified.add(s);
        }
        this.receivers = modified;
    }

    /*
     * To do: make sure addMembers method works correctly and double check
     * method chaining
     */
    public void addMember(String username) {
        HashSet<String> current = new HashSet<>();
        current.add(username);
        addMembers(current);
    }

    /*
     * To do: figure out what total refers to in Request class
     */
    public int getTotal() {
        return 0;
    }

    /*
     * To do: figure out determine if Request is paid or not
     */
    public boolean isPaid() {
        return false;
    }

    /*
     * To do: figure out how to implement updateRequestPayment method
     */
    public void updateRequestPayment(String user, Boolean paid) {

    }

    /*
     * Simple getter for frequency attribute
     */
    public int getFrequency() {
        return this.frequency;
    }

    /*
     * Abstract method needed to implement abstract Request class
     */
    public abstract boolean calculate();

    /*
     * Simple setter for frequency attribute
     */
    public void assignFrequency(int new_frequency){
        this.frequency = new_frequency;
    }

}
