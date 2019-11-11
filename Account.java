import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Account  {
    private String username;
    private int balance;
    private HashSet<String> friends;
    private HashMap<String, Request> RRequest;
    private HashMap<String, Request> IncompleteRequests;
    private ClientGUI clientGUI;

    /*
     * Simple getter for balance attribute
     */
    public int getBalance() {
        return this.balance;
    }

    /*
     * Simple setter/updater for balance attribute
     */
    public void updateBalance(int balance) {
        this.balance = balance;
    }

    /*
     * To do: better error handling if not enough money to withdraw
     */
    public void withdraw(int amount) {
        int a = this.balance;
        try {
            if (amount > a) {
                throw new Exception("Not enough funds to withdraw that amount. ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        a -= amount;
    }

    /*
     * @param username: username that will try to be added to Account's instance list of friends
     * @return true if adding was sucessful
     * @return false otherwise
     */
    public boolean addFriend(String username) {
        if (this.getFriends() == null) {
            this.friends = new HashSet<>();
        }
        HashSet<String> friends = this.getFriends();
        friends.add(username);
        return true;
    }

    /*
     * @param username: username that will try to be removed from current account instance
     * @return false if param username not in current list
     * @return true if succesfully deleted username from friends list
     */
    public boolean deleteFriend(String username) {
        if (checkUser(username)) {
            HashSet<String> friends = this.getFriends();
            return friends.remove(username);
        }
        return false;
    }

    /*
     * To do: finish addRequest method
     * To do: figure out what it means for a request to be succcesful (complete or incomplete)
     * and add to appropiate list based on that
     */
    public boolean addRequest(Request req) {
        return false;
    }

    public HashSet<String> getFriends() {
        return this.friends;
    }

    /*
     * Simple getter for complete Request on current account
     */
    public HashSet<Request> getRRequests() {
        HashMap<String, Request> current = this.RRequest;
        HashSet<Request> ans = new HashSet<Request>();
        Collection<Request> reqs = current.values();
        for(Iterator<Request> iterator = reqs.iterator(); iterator.hasNext(); ) {
            ans.add(iterator.next());
        }
        return ans;
    }

    /*
     * To do: better error handling if not found
     * To do: make sure that Request class has a .getName function.
     */
    public Request getRRequest(String RequestName) {
        HashSet<Request> list = this.getRRequests();
        for (Request r : list) {
            if (r.getName().equals(RequestName)) {
                return r;
            }
        }
        return null;
    }

    /*
     * Simple getter for incomplete requests on current account
     */
    public HashSet<Request> getIncompleteRs() {
        HashMap<String, Request> current = this.IncompleteRequests;
        HashSet<Request> ans = new HashSet<Request>();
        Collection<Request> inReqs = current.values();
        for(Iterator<Request> iterator = reqs.iterator(); iterator.hasNext(); ) {
            ans.add(iterator.next());
        }
        return ans;
    }

    /*
     * To do: better error handling if not found
     * To do: make sure that Request class has a .getName function.
     */
    public Request getIncompleteR(String RequestName) {
        HashSet<Request> list = this.getIncompleteRs();
        for (Request r : list) {
            if (r.getName().equals(RequestName)) {
                return r;
            }
        }
        return null;
    }

    /*
     * @param username: name of username to check if in current list of friends of account instance
     * @return true if username parameter is in list of friends of current account
     * @return false otherwise
     */
    public boolean checkUser(String username) {
        HashSet<String> friends = this.getFriends();
        for (String current: friends) {
            if (current.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /*
     * To do: figure out a way to send as request to Data base (figure out which
     * DB method and instance to use)
     */
    public void sendToDB(Request req) {

    }

    /*
     * To do: figure out a way to send message to Data base instance (figure out which DB method
     * to use and what instance to call)
     */
    public void sendToDB(String msg) {

    }

    /*
     * To do: carefully analyze and implement this key method to make
     * payments between between different Account instances
     * To do: later set up what authentication steps are required for payment to
     * be approved and succesful
     */
    public void makePayment(String request_name, double amount) {

    }

    /*
     * To do: figure out if this means interacting with DB or simply
     * removing from either RReq list or InReq list
     */
    public void deleteRequest(Request req) {

    }

    /*
     * To do: figure out a way to modify Request (Request class method or hash map where
     * string is the key?)
     */
    public void modifyRequest(String requestName, Request modified) {

    }

    /*
     * To do: figure out what updating (key method) means for an account
     */
    public void update() {

    }

    /*
     * To do: figure out how to implement handleMessageFromDB method
     */
    public void handleMessageFromDB(Object msg) {

    }

    /*
     * To do: figure out how to implement assignRequestName method
     */
    public void assignRequestName() {

    }

}
