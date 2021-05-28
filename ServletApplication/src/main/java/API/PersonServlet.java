package API;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class PersonServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String Firstname = requestUrl.substring("/people/".length());
		
		Person person = DataStore.getInstance().getPerson(Firstname);
		
		if(person != null){
			String json = "{\n";
			json += "\"Firstname\": " + JSONObject.quote(person.getFirstname()) + ",\n";
			json += "\"email\": " + JSONObject.quote(person.getEmail()) + ",\n";
			json += "\"phonenumber\": " + person.getPhonenumber() + "\n";
			json += "}";
			response.getOutputStream().println(json);
		}
		else{
			//That person wasn't found, so return an empty JSON object. We could also return an error.
			response.getOutputStream().println("{}");
		}
	}
	
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String Firstname = request.getParameter("Firstname");
		String email = request.getParameter("email");
		int phonenumber = Integer.parseInt(request.getParameter("phonenumber"));
		
		DataStore.getInstance().putPerson(new Person(Firstname, email, email, email, null, email, phonenumber));
	}
}
