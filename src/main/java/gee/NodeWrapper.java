package gee; /**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 11/28/13
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */

import net.java.avatar.js.Loader;
import net.java.avatar.js.Server;
import net.java.avatar.js.log.Logging;

import java.io.File;
public class NodeWrapper {
  private static final String LOG_OUTPUT_DIR = "avatar-js.log.output.dir";
  private static boolean assertions = false;
  public  void runJs(String workingDir, String script) throws Exception {

    new Server(Server.newEngine(),
        new Loader.Core(),
        System.getProperty(LOG_OUTPUT_DIR) == null ?
    new Logging(assertions) :
    new Logging(new File(System.getProperty(LOG_OUTPUT_DIR)), assertions),
    workingDir).run(script);
}

  public static void main(String...args) {

    try {
      NodeWrapper nodej = new NodeWrapper() ;
      nodej.runJs(System.getProperty("user.dir") + "/js/", "nodeTest1.js");
    } catch (Exception e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
  }
}
