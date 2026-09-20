package transport;

public abstract class Logistics {
    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        transport.deliver(cargo,destination);
    }

    protected abstract Transport createTransport();
}
