package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniseServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentityId()),
            		gamer.getFirstName().toUpperCase(),
            		gamer.getLastName().toUpperCase(), 
            		gamer.getBithdate());
        }catch (NumberFormatException | RemoteException exception){
            exception.printStackTrace();
        }
        return result;
	}
	
	

}
