package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("*")
public class LoginFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    Filter.super.init(filterConfig);
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest)servletRequest;
    if (request.getSession().getAttribute("userId") == null) {
      //request.getRequestDispatcher("/api/login/fail").forward(servletRequest, servletResponse);
      // servletResponse.getWriter().write("fail");
      return;
    }
    filterChain.doFilter(servletRequest, servletResponse);

  }

  @Override
  public void destroy() {
    Filter.super.destroy();
  }
}
