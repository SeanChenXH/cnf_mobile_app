package filter;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ResponseMsg;

@WebFilter("*")
public class LoginFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    Filter.super.init(filterConfig);
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    String method = request.getMethod();

    if (!request.getRequestURI().contains("/login") && !request.getRequestURI()
        .contains("/munilogin")) {
      HttpSession session = request.getSession();
      if (session.getAttribute("userId") == null) {
        PrintWriter writer = response.getWriter();
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        writer.print(new Gson().toJson(new ResponseMsg("login fail, userid is invalid")));
        writer.flush();
      } else if (session.getAttribute("muni_municode") == null) {
        PrintWriter writer = response.getWriter();
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        writer.print(new Gson().toJson(new ResponseMsg("login fail, muniid is invalid")));
        writer.flush();
      } else {
        filterChain.doFilter(servletRequest, servletResponse);
      }
      return;
    }

    if (!method.equalsIgnoreCase("POST")) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      response.getWriter().print(new Gson().toJson(new ResponseMsg("login fail, method is invalid")));
      return;
    }
    System.out.println("success");
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {
    Filter.super.destroy();
  }
}
