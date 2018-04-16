package gear;

import java.io.Closeable;

public interface Client extends Closeable {

    /**
     * start client
     */
    void start();

    /**
     * stop clients
     */
    void stop();

}
