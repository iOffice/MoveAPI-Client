import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;


@WebService(targetNamespace = "http://api.iofficeconnect.com")
/**
 * A simple Move API client for testing a webservice. Simply outputs any received events to console
 */
public class MoveRequestNotification {

	/**
	 * @param argv pass in the fully qualified url to publish the webservice to
	 */
	public static void main(String[] argv) {
		Object implementor = new MoveRequestNotification();
		String address = "http://localhost:9000/MoveRequestNotification";
		if(argv.length > 0) {
			address = argv[0];
		}
		Endpoint.publish(address, implementor);
	}

	@WebMethod
	public void handleRequestNotification(
			@WebParam(name = "type") String type,
			@WebParam(name = "id") Integer id) {
		System.out.println(type + " - " + id);
	}
}