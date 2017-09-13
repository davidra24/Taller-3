package co.edu.uptc.sw2.taller3;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author David Ramírez
 */
@WebServlet(name= "ProcesarLogIn", urlPatterns = {"/ProcesarLogIn"})
public class ProcesarLogIn extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet de Login</title>");
            out.println("</head>");
            out.println("<body>");
   
            String user = req.getParameter("user");
            String password = req.getParameter("password"); 
            
            out.println((user.compareTo(password)==0?"Bienvenido usuario "+user:"Usuario o contraseña incorrecto"));
            out.println("</body>");
            out.println("</html>");
            }
        }
    
    
}
