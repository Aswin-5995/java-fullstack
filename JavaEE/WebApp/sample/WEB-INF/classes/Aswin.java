

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Aswin extends HttpServlet {
  @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException{
                    response.setContentType("text/html");

                 PrintWriter print = response.getWriter();
                   print.println("<h1>Northing is impossible</h1>");
                     print.println("<h2>Never ever Giveup</h2>");
        }

}