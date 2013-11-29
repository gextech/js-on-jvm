/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 11/28/13
 * Time: 3:23 PM
 * To change this template use File | Settings | File Templates.
 */
import org.mozilla.javascript.*;
class JsRunnerRhinoEngine implements  JsRunner  {

  String invokeFunction(ArrayList<String> scripts, String functionName, Object... args){

    String script = scripts.join("")
    String resultStr = null;

    Context cx = Context.enter();
    try {
      Scriptable scope = cx.initStandardObjects();


      // Now evaluate the string we've collected. We'll ignore the result.
      cx.evaluateString(scope, script, "<cmd>", 1, null);


      // Call function "f('my arg')" and print its result.
      Object fObj = scope.get(functionName, scope);
      if (!(fObj instanceof Function)) {
        System.out.println( functionName + "is undefined or not a function.");
      } else {
        Function f = (Function)fObj;
        Object result = f.call(cx, scope, scope, args);

        resultStr =  Context.toString(result);
      }
    } finally {
      Context.exit();
    }

    return resultStr;
  }
}
