import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p2 extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();


    String indexString = request.getParameter("index");

    int index = Integer.parseInt(indexString);
    String[] name = {"priya", "kenneth", "tk", "","Rav"};

   
    String value =name[index];

  
   
    out.println("<html>");
    out.println("<body>");
    out.println("<h3>hello" + value + "</h3>");
    out.println("</body>");
    out.println("</html>");
  }
}