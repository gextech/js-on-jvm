/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 11/28/13
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.script.*;
class JsRunnerNashornEngine implements  JsRunner {


  String invokeFunction(ArrayList<String> scripts, String functionName, Object... args){

    String script = scripts.join("")

    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("nashorn");
    engine.eval(script);

    // create an Invocable object by casting the script engine object
    Invocable inv = (Invocable) engine;

    // invoke the function named "hello" with "Scripting!" as the argument
    def object = inv.invokeFunction(functionName, args);

    (String)object
  }

}
