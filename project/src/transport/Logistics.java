package transport;

public abstract class Logistics {
    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();

    }

    protected abstract Transport createTransport();
}
