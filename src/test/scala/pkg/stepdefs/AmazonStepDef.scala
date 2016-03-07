package pkg.stepdefs


import java.util.concurrent.TimeUnit
import cucumber.api.scala.{ScalaDsl, EN}
import junit.framework.Assert
import org.apache.http.util.Asserts
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.{WebDriver, By}
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.Matchers
import org.openqa.selenium.interactions.Actions;

/**
  * Created by user on 05/03/16.
  */
class AmazonStepDef extends ScalaDsl with EN {
  var driver: WebDriver=null

  When("""^I open amazon$"""){ () =>
    driver = AbstractDriver.getDriver
  }
  Then("""^I shoud see pages$"""){ () =>
    Assert.assertEquals(driver.getTitle,"Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more")
  }
  When("""^I click on Hello,Signin option$"""){ () =>
    driver.findElement(By.id("nav-link-yourAccount")).click()
  }
  Then("""^It should go on to login page$"""){ () =>
    Assert.assertEquals(driver.getTitle,"Amazon Sign In")
  }
  Then("""^Enter the E-mail and Password and click on the Sign in button$"""){ () =>
    driver.findElement(By.id("ap_email")).sendKeys("khareanuja@yahoo.com")
    driver.findElement(By.id("ap_password")).sendKeys("Arjun123")
    driver.findElement(By.id("signInSubmit")).click()
  }
  When("""^I mouseoverto go onto YourAccount and click on it$"""){ () =>
    val action1 = new Actions(driver)
    System.out.print("Mouseover element"+driver.findElement(By.id("nav-link-yourAccount")).getText)
    action1.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).perform()
    driver.findElement(By.className("nav-link nav-item")).click()
  }
  Then("""^It should go onto YourAccount page$"""){ () =>
    System.out.print("MyAccount Page" +driver.getTitle)
    System.out.print("*******************" +Assert.assertEquals(driver.getTitle,"Amazon Cloud Drive"))
    Assert.assertEquals(driver.getTitle,"Amazon Cloud Drive")
  }


}
