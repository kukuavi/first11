package testRunner;


@CucumberOptions(features="src\\test\\java\\features",
glue="stepDefination",monochrome=true,plugin= {"html:target/cucu.html"})



public class runner {

}
