import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * Abstract class database and its appropiate attributes and methods
 */

public abstract class  Database {
    private ServerSocket serverSocket;
    private Thread ConnectionListener;
    private int port;
    private int timeout;
    private ThreadGroup clientThreadGroup;
    private boolean readyToStop;

    /*
     * To do: implement listen(): probably open connection Listener
     * Google how to open a connection from a database (ask Mau)
     */
    public void listen() {

    }

    /*
     * To do: implement stopListening(): probably close connection, same as above
     */
    public void stopListening() {

    }

    /*
     * To do: implement close method
     */
    public void close() {

    }

    /*
     * To do: implement sendToAllClients method
     */
    public void sentToAllClients(Object msg) {

    }

    /*
     * To do: figure out which attribute directly tells me if class isListening() or not
     */
    public boolean isListening() {

    }

    /*
     *To do: figure out which attribute directly tells me above
     * To do: once I have this attribute, perform its opposite in this method
     */
    public boolean isClosed() {

    }

    /*
     * Simple getter for port attribute
     */
    public int getPort() {
        return this.port;
    }

    /*
     * Simple setter for the port attribute
     */
    public void setPort(int port) {
        this.port = port;
    }

    /*
     * To do: figure out structure of ThreadGroup class to pass to Thread array
     */
    public Thread[] getClientConnections() {
        ThreadGroup current = this.clientThreadGroup;
        //To do: change null after implementation is correct
        return null;
    }

    /*
     * Constructor of class.
     * To do: figure out what values I need to initialize in a database
     * and to what values I should initialize them to.
     * What do initialization values depend on?
     */
    public void run() {

    }

    /*
     * Abstract method that needs to be overwritten by any and every
     * class that extends to the type Database.
     */
    public abstract void handleMessageFromClient(Object msg);


}
