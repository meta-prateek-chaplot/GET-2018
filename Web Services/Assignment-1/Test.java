package temperature;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

/**
 * a client class to test the web service convertTemp
 * @author Prateek Chaplot
 *
 */
public class Test {
	
	public static void main(String[] args) throws RemoteException, ServiceException{
		//to obtain the service instance of required class
		ConvertTempServiceLocator srvLoc = new ConvertTempServiceLocator();
		System.out.println(srvLoc.getConvertTemp().convertToCelsius(4f));
	}
}