package co.edu.uptc.sw2.taller3;


import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author David Ramírez
 */
@WebFilter(filterName = "FiltroAutenticacion", urlPatterns = {"/index.html", " /ProcesarLogIn" })
public class FiltroAutenticacion {
    
   
    public void init(FilterConfig filterConfig) throws ServletException{
    }
    
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException{
    
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (req.getSession().getAttribute("name") == null){
        resp.sendRedirect("./login.html");
        } else{
        chain.doFilter(request, response);
        } 
    }
    
    public void destroy(){}
    
}
