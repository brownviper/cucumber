package pkg.stepdefs

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

/**
  * Created by user on 06/03/16.
  */
object AbstractDriver {

  //private val driver
private var driver: WebDriver = null
    def getDriver:WebDriver={
    if(driver == null) {
      driver = new FirefoxDriver ()
      driver.navigate().to("http://www.amazon.co.uk")
      driver.manage().window().maximize()
     }
      driver
    }
    def close:Unit={
      driver.close()
    }

}
