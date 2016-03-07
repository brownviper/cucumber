package pkg

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
  * Created by user on 05/03/16.
  */

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("/home/user/IdeaProjects/sandbox/CucumberTest/src/test/resources/features"),
  glue = Array("pkg.stepdefs"),
  format = Array("pretty")
)
class RunSuite {

}
