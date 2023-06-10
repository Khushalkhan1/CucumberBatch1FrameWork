package steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start() {
        setUp();

    }
    @After
    public void end(Scenario scenario){
        byte [] pic;
        if (scenario.isFailed()){
            pic=takeScreenShot("failed/" + scenario.getName());
        }else {
            pic=takeScreenShot("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png", scenario.getName());

        closBrowser();
    }


}
