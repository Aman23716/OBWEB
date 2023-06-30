package org.OptimaBus.UI.pages;

import org.OptimaBus.UI.dataProvider.MockDataGenerator;
import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    WebElementActions elementActions = new WebElementActions();

    MockDataGenerator mockDataGenerator = new MockDataGenerator();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
