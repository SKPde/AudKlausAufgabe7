
public class BookList {

	Book kopf = null;
	
	public void enter(Book neu) {
		if(kopf == null) {
			kopf = neu;
			return;
		} else if(neu.verkauf > kopf.verkauf) {
			neu.next = kopf;
			kopf = neu;
			return;
		}
		
		Book temp = kopf;
		
		while(temp != null) {
			
			if(temp.next != null && temp.next.verkauf >= neu.verkauf) {
				temp = temp.next;
			} else {
				break;
			}
		}
		neu.next = temp.next;
		temp.next = neu;
		
		
	}
	
	public void print() {
		
		Book temp = kopf;
		
		while(temp != null) {
			
			System.out.println("Autor und Titel: " + temp.text + " (" + temp.verkauf + ")");
			
			temp = temp.next;
		}
		
	}
	
}
