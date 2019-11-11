/*
 * Concrete DB class that implements Database interface
 */

import java.util.HashMap;
import java.util.ArrayList;

/*
 * To do: create a Tuple class to solve errors in this one
 */
public class DB extends Database {
    private HashMap<String, Tuple (Account, ConnectionToDB)> userInfo>;
    private ArrayList<Request>[] recurringRequests;
    private HashMap<String, Request incompleteRequests;

    /*
     * To do: implement sendRRequest method
     */
    public void sendRRequests() {

    }

    /*
     * To do: implement handle Request method
     */
    public void handleRequest(Request req) {

    }

    /*
     * To do: implement handle String Message method
     */
    public void handleStringMessage(String message) {

    }

    /*
     * To do: implement updatePaymentStatus method
     */
    public void updatePaymentStatus(Request r, String username, boolean paid) {

    }

    /*
     * To do: implement addRR method
     */
    public void addRR(Request req) {

    }

    /*
     * To do: implement addRequest method
     */
    public void addRequest(Request req) {

    }

    /*
     * To do: implement transfer method
     */
    public boolean transfer(double total, String sender, String receiver) {

    }

    /*
     * To do: implement sendMessageToClient method
     */
    public void sendMessageToClient(Object message, String username) {

    }

    /*
     * To do: implement handleMessageFromClient method
     */
    public void handleMessageFromClient(Object msg) {

    }

    /*
     * To do: implement checkUsername method
     */
    public boolean checkUsername(String user) {

    }

    /*
     * To do: implement deleteRequest method
     */
    public void deleteRequest(String requestName) {

    }

    /*
     * To do: implement deleteAccount method
     */
    public void deleteAccount(String userName) {

    }

}
