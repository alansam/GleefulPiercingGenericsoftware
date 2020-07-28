
import net.podzone.as.*;

/*
 * ChadJ Driver
 *
 * @author Alan Sampson - alansamps@gmail.com
 * @version 0.1
 */
public class Main {

  /*
   * Main entry point.
   *
   *  @params args
   */
  public static void main(String[] args) {
    String[] chad = new ChadJ().getChad();

    for (String line : chad) {
      System.out.println(line);
    }

    return;
  }
}
