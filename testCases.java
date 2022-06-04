package BedrijvenB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCases {

	@Test
	void test() {
		Persoon Jef_Besos = new Persoon(); 
		Bedrijf Alphabet = new Bedrijf(Jef_Besos);
		Bedrijf Google = new Bedrijf(Alphabet); 
		
		Persoon Larry_Page = new Persoon(); 
		Google.bedrijfsOvername(Larry_Page);
	}
	
	
	

}
