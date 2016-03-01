import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 11/29/13
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
class JsRunnerBrowserifySpec extends  Specification {



  def "testing nashorn from file"(){
    String fileContents = new File(System.getProperty("user.dir") + "/js/generated/main.js").text
    println(fileContents)

    def test = """;var fat = function(arg1){
                  Animal = require("animal");
                  animal = new Animal();
                  return animal.move(arg1);
                }"""

    def scripts = [fileContents, test]
    def js = new JsRunnerNashornEngine()
    when :
    def result =  js.invokeFunction(scripts,"fat", "Scripting!" )
    then :
    result == "Animals can move, Scripting!"
  }
}
