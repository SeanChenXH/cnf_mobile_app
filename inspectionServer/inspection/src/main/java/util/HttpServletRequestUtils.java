package util;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtils {

  public static String getRequestBody(HttpServletRequest request) throws IOException {
    StringBuilder sb = new StringBuilder();
    String s = null;
    while ((s = request.getReader().readLine()) != null) {
      sb.append(s);
    }
    return sb.toString();
  }
}
