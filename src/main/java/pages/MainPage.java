package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

/**
 * Created by Maria on 04.03.2018.
 */
public class MainPage extends BasePage{


			@FindBy(xpath = "//ul[@id='desktopMenuMain']//li[contains(@class,'menu-item')]")
			public List<WebElement> menuList;


			@FindBy(xpath = "//ul[contains(@class,'main-menu__list main-menu')]//li")
			public List<WebElement> subMenu;

			public MainPage(){
					PageFactory.initElements(BaseSteps.getDriver(), this);
			}

			public void selectMainMenu(String menuItem){
						selectCollection(menuItem, menuList );
			}

			public void selectSubMenu(String menuItem){
						selectCollection(menuItem, subMenu );
			}

}
