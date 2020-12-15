package runner;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = {"src/test/java/features/gitgetapi.feature"},
        glue = {"runner","stepDef"},
        monochrome=true,
       // strict=true,
       // dryRun=true,
       //tags = {" not @Testabc"},
//        format = {
//                "pretty",
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt"},
        ///facebookoauth2setup.feature
        plugin = {"json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt",
        "html:target/cucumber-reports/cucumber.html"})

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", 
dataProvider = "scenarios")
    public void runScenario(PickleEventWrapper 
pickleWrapper,CucumberFeatureWrapper featureWrapper) throws Throwable  {
       try {
testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
}  catch (SkipException e) {
    System.out.println("Complete undefined steps using code snippet given below and run the test");
    } catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
} 
      
    }
 
    @DataProvider(name="scenarios",parallel=false)
    public Object[][] features() {
    Object[][] scenarios=null;
    try {
        scenarios= testNGCucumberRunner.provideScenarios();
    }
    catch(Exception exception) {
    exception.printStackTrace();
    }
    if(scenarios==null) {
    throw new IllegalArgumentException("test");
    }
    return (scenarios);
    
    
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
