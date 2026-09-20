package app;

import gui.Button;
import gui.CheckBox;
import gui.GUIFactory;
import transport.Logistics;

public class DeliveryApplication {
    private final GUIFactory guiFactory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }


    public void launch(String cargo, String destination) {
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        button.paint();
        checkBox.paint();

        logistics.planDelivery(cargo, destination);

    }
}
