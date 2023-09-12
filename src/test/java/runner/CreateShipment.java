package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        tags = "@MasterDataProduct",
        features = "src/test/scenarios/createShipment.feature"
)
public class CreateShipment {
    // Tidak ada implementasi tambahan yang diperlukan
}
