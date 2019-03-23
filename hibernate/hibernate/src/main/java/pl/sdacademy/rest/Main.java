package pl.sdacademy.rest;

import org.restlet.Component;
import org.restlet.data.Protocol;
import pl.sdacademy.rest.endPoints.RunEndPoint;

public class Main {
    public static void main(String[] args) throws Exception {
        Component component = new Component();
        component.getServers().add(Protocol.HTTP, 9000);

        component.getDefaultHost()
                .attach("/runs", RunEndPoint.class);
        component.getDefaultHost()
                .attach("/runs/{runId}", RunEndPoint.class);

        component.start();
    }

}
