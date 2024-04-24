package com.ecommerce.selenium.tests;

import com.ecommerce.selenium.driver.DriverManager;
import com.ecommerce.selenium.utilities.Helper;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestListener extends DriverManager implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
    }

    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        Helper.takeScreenshot(driver, extensionContext.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable ) {
    }
}
