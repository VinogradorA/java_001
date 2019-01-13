package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {



  private final NavigationHelper navigationHelper = new NavigationHelper();
  private ContactHelper contactHelper;;
  private SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    navigationHelper.wd = new FirefoxDriver();
    navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(navigationHelper.wd);
    navigationHelper = new NavigationHelper(navigationHelper.wd);
    sessionHelper = new SessionHelper(navigationHelper.wd);
    sessionHelper.login("admin", "secret");
    contactHelper = new ContactHelper(navigationHelper.wd);
  }

  public void stop() {
    navigationHelper.wd.quit();
  }

  public boolean isElementPresent(By by) {
    try {
      navigationHelper.wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
