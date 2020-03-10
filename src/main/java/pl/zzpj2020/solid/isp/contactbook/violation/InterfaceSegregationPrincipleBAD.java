package pl.zzpj2020.solid.isp.contactbook.violation;

class InterfaceSegregationPrincipleBAD {
	
	Email emailer;
	Call dialler;
	
	public InterfaceSegregationPrincipleBAD() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrincipleBAD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleBAD();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");		
		emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
