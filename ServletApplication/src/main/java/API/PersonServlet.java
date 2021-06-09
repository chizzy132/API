package API;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class PersonServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String firstName = requestUrl.substring("/people/".length());
		Person person = DataStore.getInstance().getPerson(firstName);
		
		if(person != null){
			String json = "{\n";
			json += "\"firstName\": " + JSONObject.quote(person.getFirstName()) + ",\n";
			json += "\"email\": " + JSONObject.quote(person.getEmail()) + ",\n";
			json += "\"phoneNumber\": " + person.getPhoneNumber() + "\n";
			json += "}";
			response.getOutputStream().println(json);
			PrintWriter pw=response.getWriter();
			pw.print("happy learning....:)");
		}
		else{
			//That person wasn't found, so return an empty JSON object. We could also return an error.
			response.getOutputStream().println("{}");
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
		
		DataStore.getInstance().putPerson(new Person(firstName, email, email, email, null, email, phoneNumber));
	}
	
}
