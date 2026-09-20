package transport;

public class Ship  implements Transport {
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Ship delivering " + cargo + " to " + destination);
    }

}
