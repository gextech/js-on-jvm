import spock.lang.*

class JsRunnerSpec extends Specification {


  def "testing nashorn"(){
    def js = new JsRunnerNashornEngine()
    when :
    def result =  js.invokeFunction(["function hello(name) { return ('Hello, ' + name) }"],"hello", "Scripting!" )
    then :
    result == "Hello, Scripting!"
  }


  def "testing rhino"(){
    def js = new JsRunnerRhinoEngine()
    when :
    def result =   js.invokeFunction(["function hello(name) { return ('Hello, ' + name) }"],"hello", "Scripting!" )
    then :
    result == "Hello, Scripting!"
  }

}