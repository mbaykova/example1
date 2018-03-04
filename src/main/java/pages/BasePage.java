package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Maria on 04.03.2018.
 */
public class BasePage {



			public void selectCollection(String itemName, List<WebElement> collection){
				for(WebElement item : collection){
					if (item.getText().equalsIgnoreCase(itemName)){
						item.click();
						return;
					}
				}
				Assert.fail("Не найден пункт меню - " + itemName);
			}


}
