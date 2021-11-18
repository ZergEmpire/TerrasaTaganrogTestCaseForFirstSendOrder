package FirstTestCase;

import org.junit.Test;

public class TestClass extends TestBase {






    @Test
    public void userCanSendOrder() {
        openURL();
        restSelect();
        mathRandomHead();
        pickRandCards();
        goBasket();
        selectDeliveryTypePickUp();
        selectTerminalForPickUp();
        goNextOrderReg();
        fillInFields();
        selectPayType();
        sendOrder();
        waitForComplete();





    }


}