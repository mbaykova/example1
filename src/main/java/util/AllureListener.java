package util;

import io.qameta.allure.junit4.AllureJunit4;
import org.junit.runner.notification.Failure;
import steps.BaseSteps;

/**
 * Created by 777 on 08.05.2017.
 */
public class AllureListener extends AllureJunit4 {

    @Override
    public void testFailure(Failure failure) throws Exception {
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }
}
