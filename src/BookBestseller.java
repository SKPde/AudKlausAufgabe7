import java.util.Scanner;

public class BookBestseller {

	public static void main(String[] args) {
		String eingabe = "";
		Scanner in = new Scanner(System.in);
		BookList list = new BookList();
		System.out.println("Bücher mit Verkaufszahlen eingeben:"); 
		do {
			Book b = new Book();
			System.out.print("Autor und Titel: ");
			//b.text = in.nextLine();
			b.text = in.nextLine();
			System.out.println("");
			System.out.print("Insgesamt verkaufte Bücher: ");
			b.verkauf = in.nextInt(); 
			list.enter (b);
			System.out.println("");
			System.out.print("Noch ein Buch? (j/n): ");
			eingabe = in.nextLine();
			
		} while ('j' == in.nextLine().charAt(0));
	
		System.out.println("Die komplette Bücher-Liste: ");
		list.print();
	
	}

}
