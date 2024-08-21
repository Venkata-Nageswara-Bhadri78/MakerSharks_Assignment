import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class JavaCode extends GenericServlet{
	private final String url = "jdbc:mysql://localhost:3306/Makersharks_Assessment";
	private final String username = "root";
	private final String password = "root";
	
	public void service(ServletRequest request, ServletResponse response){
		response.setContentType("text/html");
		try{
			String supplier_id = request.getParameter("supplier_id");
			String company_name= request.getParameter("company_name");
			String website = request.getParameter("website");
			String location = request.getParameter("location");
			String nature = request.getParameter("nature");
			String m_process = request.getParameter("manufacturing_processes");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String query = "select * from manufacturersTable where supplier_id = ? and (company_name = ? or website = ? or location = ? or nature = ? or manufacturing_process = ?);";
			                //select * from manufacturersTable where supplier_id = ? and (company_name = ? or website = ? or location = ? or nature = ? or manufacturing_process = ?);

			PreparedStatement state = conn.prepareStatement(query);
			
			state.setString(1, supplier_id);
			state.setString(2, company_name);
			state.setString(3, website);
			state.setString(4, location);
			state.setString(5, nature);
			state.setString(6, m_process);
			
			ResultSet set = state.executeQuery();
			PrintWriter out = response.getWriter();
			
			while(set.next()){
				out.println("<table font-size : 20px; style='padding: 10px; width: 50%; border-radius: 7px; box-shadow: 2px 2px 2px grey; margin: auto; border: solid 2px grey;'>"
        + "<tr><td style='padding: 10px;'>Supplier ID : " + set.getString(1) + "</td>"
        + "<td style='padding: 10px;'>Company Name: " + set.getString(2) + "</td></tr>"
        + "<tr><td style='padding: 10px;'>Location : " + set.getString(4) + "</td>"
        + "<td style='padding: 10px;'>Nature   : " + set.getString(5) + "</td></tr>"
        + "<tr><td style='padding: 10px;'>M_Process : " + set.getString(6) + "</td>"
        + "<td style='padding: 10px;'>Website Link : <a href='" + set.getString(3) + "'>Click Here</a></td></tr>"
        + "</table><br>");

			}
			
		}
		catch(Exception e){
			
		}
	}
}