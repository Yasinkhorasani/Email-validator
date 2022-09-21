package test;

import java.util.ArrayList;
import java.util.Random;


public class EmailAdresseGeneratorTest {


	public static void main(String[] args) {
		String[] vornamen= {"Jim","Mathilda","Beate","Tine","Teo"};
		
		String[] nachnamen= {"Schäfer","Becker","Müller","Mohr","Kost"};
		
		String[] emailProvidern= {"yahoo","web","telecom","gmx","gmail"};
		
		String[] länderkürzeln= {"de","zm","cd","dm","zw"};
		
		 ArrayList<String> emails = new ArrayList<>();
		 
		 for (int i = 0; i < vornamen.length; i++){
			 for (int j = 0; j < nachnamen.length; j++) {
				 for (int k = 0; k < emailProvidern.length; k++) {
					 for (int o = 0; o < emailProvidern.length; o++) {
				String emailAdresse = 	(vornamen[i] + "." +nachnamen[j]+ "@" +emailProvidern[k] + "." +länderkürzeln[o]);	 
		        System.out.println(emailAdresse);
		        
		       emails.add(emailAdresse);
		    }
		 }
	 }
	}	
	
		int size = emails.size();
		System.out.println("\n Nummer: " +size);
//		int length = vornamen.length + nachnamen.length + emailProvidern.length + länderkürzeln.length ;
//		Random emailRandom = new Random();
//		int value = emailRandom.nextInt(length );
//		
//		System.out.println(value);
		
	}
	
}
