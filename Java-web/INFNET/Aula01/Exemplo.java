import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Exemplo extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.getWritter().print("<html><body><h1>Foda-se</h1></html></body>");
	
	}

}
