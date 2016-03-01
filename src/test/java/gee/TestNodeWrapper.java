package gee;

import org.junit.Test;

public class TestNodeWrapper {

  @Test
  public void testRunJS() throws Throwable {
    NodeWrapper nodej = new NodeWrapper();
    nodej.runJs(System.getProperty("user.dir") + "/js/", "nodeTest1.js");
  }
}
