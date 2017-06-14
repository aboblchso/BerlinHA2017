import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;

/**
 * Created by volot on 13.06.2017.
 */
public class BerlinRunner {
    public static void main(String[] args) {
        Config config = ConfigUtils.loadConfig("config.xml");
        config.controler().setOverwriteFileSetting(OutputDirectoryHierarchy.OverwriteFileSetting.deleteDirectoryIfExists);
        Scenario scenario = ScenarioUtils.createScenario(config);
        Controler controler = new Controler(config);


        controler.run();

    }
}
