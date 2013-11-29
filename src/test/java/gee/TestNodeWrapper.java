package gee;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestNodeWrapper {

  @Test
  public void testRunJS() throws Exception {
   NodeWrapper nodej = new NodeWrapper();
   nodej.runJs(System.getProperty("user.dir") + "/js/", "nodeTest1.js");
 }
}
