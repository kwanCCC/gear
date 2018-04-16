package org.dora.gear.example;

import org.apache.curator.test.TestingServer;
import org.junit.Before;
import org.junit.Test;

public class LeaderElectionTest {

    private TestingServer server;

    @Before
    public void setup() throws Exception {
        server = new TestingServer();
    }

    @Test
    public void testLatch() {
        
    }
}
