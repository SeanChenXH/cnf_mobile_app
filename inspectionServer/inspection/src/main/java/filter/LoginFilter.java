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
    HttpSession session = request.getSession();

    String userLoginURI = request.getContextPath() + "/api/user/login";
    String muniLoginURI = request.getContextPath() + "/api/muni/login";

    if (request.getRequestURI().equals(userLoginURI)) {
      if (method.equalsIgnoreCase("POST")) {
        filterChain.doFilter(servletRequest, servletResponse);
      } else {
        PrintWriter writer = response.getWriter();
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        writer.print(new Gson().toJson(new ResponseMsg("user login fail")));
        writer.flush();
      }
      return;
    }

    if (request.getRequestURI().contains(muniLoginURI)) {
      if (session.getAttribute("userId") == null) {
        PrintWriter writer = response.getWriter();
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        writer.print(new Gson().toJson(new ResponseMsg("user login fail")));
        writer.flush();
      } else if (method.equalsIgnoreCase("POST")) {
        filterChain.doFilter(servletRequest, servletResponse);
      } else if (method.equalsIgnoreCase("GET")) {
        filterChain.doFilter(servletRequest, servletResponse);
      } else {
        PrintWriter writer = response.getWriter();
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        writer.print(new Gson().toJson(new ResponseMsg("muni login fail")));
        writer.flush();
      }
      return;
    }

    if (session.getAttribute("userId") == null) {
      PrintWriter writer = response.getWriter();
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      writer.print(new Gson().toJson(new ResponseMsg("user login fail")));
      writer.flush();
      return;
    }

    if (session.getAttribute("muni_municode") == null) {
      PrintWriter writer = response.getWriter();
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      writer.print(new Gson().toJson(new ResponseMsg("muni login fail")));
      writer.flush();
      return;
    }

    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {
    Filter.super.destroy();
  }
}
