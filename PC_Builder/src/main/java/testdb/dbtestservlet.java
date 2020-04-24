package testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dbtestservlet
 */
public class dbtestservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/?user=root";
		String driver = "com.jdbc.mysql.driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database..."+jdbcUrl);
			Class.forName(driver);
			
			Connection myconn = DriverManager.getConnection(jdbcUrl);
			
			
			out.println("Success");
			
			myconn.close();
			
		}catch(Exception exc) {
			
			exc.printStackTrace();
			throw new ServletException(exc);
			
		}
		
		
		
		
	}

}
