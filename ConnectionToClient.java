import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.Server;

/*
 * To do: figure out if Client Socket is correct type or
 * needs its own class
 */


public class ConnectionToClient extends DB {
    private DB database;
    private ServerSocket serverSocket;
    private ServerSocket clientSocket;
    private ObjectInputStream input;
    private OutputStream out;

    /*
     * To do: implement sendToClient method
     */
    public void sentToClient(Object msg) {

    }

    /*
     * Main constructor of ConnectionToClient class
     * To do: figure out how to initialize this class and what values to use to initialize it
     */
    public void run() {

    }

    /*
     * To do: figure out how to close connection (with attributes)
     */
    public void close() {

    }

    /*
     * To do: figure out how to retireve I net address
     */
    public InetAddress getInetAddress() {

    }

}
