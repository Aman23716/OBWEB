package OptimaBusTests.uiTests;

import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.helper.CustomAssertions;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBus.UI.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTests {


    CustomAssertions customAssertions;

    WebElementActions webElementActions;
    WebDriver driver;
    LoginPage loginPage;

    MainPage mainPage;

    OperationHistory operationHistory;

    Documents documents;

    Imports imports;

    Settings settings;

    More more;

    Staff staff;

    Converting converting;

    @BeforeClass
    public void setUpUiTest(){
        loginPage=new LoginPage();
        webElementActions = new WebElementActions();
        driver= Driver.getDriver();
        mainPage = new MainPage();
        operationHistory= new OperationHistory();
        documents = new Documents();
        imports= new  Imports();
        settings= new Settings();
        more = new More();
        staff = new Staff();
        converting= new Converting();
        customAssertions = new CustomAssertions();
    }
    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
