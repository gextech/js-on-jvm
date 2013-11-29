/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 11/29/13
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public interface JsRunner {
  String invokeFunction(ArrayList<String> scripts, String functionName, Object... args)
}