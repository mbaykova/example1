package steps;

import io.qameta.allure.Step;
import pages.MainPage;

/**
 * Created by Maria on 04.03.2018.
 */
public class MainSteps {


				@Step("выбран пункт меню {0}")
				public void stepSelectMainMenu(String menuName){
						new MainPage().selectMainMenu(menuName);
				}

				@Step("выбран пункт подменю {0}")
				public void stepSelectSubMenu(String menuName){
					new MainPage().selectSubMenu(menuName);
				}
}
