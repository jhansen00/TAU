package keyPresses;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class keyPresses extends BaseTest {

    @Test
    public void clickKeyPresses(){
        KeyPressesPage keyPresses = homepage.clickKeyPresses();
        keyPresses.getKeyPressesContent();
        Assert.assertTrue(keyPresses.getKeyPressesContent().contains("Key Presses"), "Failed to find 'Key Presses' title");

        keyPresses.keyPressesBody();
        Assert.assertTrue(keyPresses.getDynamicText().contains("C"), "Unable to find the entered text.");

        keyPresses.keyPressesInputField();
        Assert.assertTrue(keyPresses.getDynamicText().contains("F"), "Unable to find the enetered text.");
    }
}
