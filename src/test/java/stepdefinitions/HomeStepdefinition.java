package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Driver;

public class HomeStepdefinition {



    @Given("Anasayfaya git ve kontrol et")
    public void anasayfaya_git_ve_kontrol_et() {
        Driver.getAppiumDriver();

    }
    @When("Je Me Connect butonuna tikla")
    public void je_me_connect_butonuna_tikla() {

    }
}
