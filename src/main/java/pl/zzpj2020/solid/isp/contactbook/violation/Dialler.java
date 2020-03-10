package pl.zzpj2020.solid.isp.contactbook.violation;

class Dialler implements Call{
	
    public void makeCall(Contact dialable) {
    	
    	String telephone = dialable.getTelephone();
    	
    	// call using telephone
    }
}