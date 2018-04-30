import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteAutoridade {

	@Test
	void testInformal() {
		Autoridade a1 = new Autoridade ("Maria","Martins",new Informal());
		assertEquals("Maria",a1.getTratamento());
	}
	
	@Test
	void testRespeitosos() {
		Autoridade a1 = new Autoridade ("Maria","Martins",new Respeitoso("Feminino"));
		assertEquals("Sra.Martins",a1.getTratamento());
		Autoridade a2 = new Autoridade ("Felipe","Martins",new Respeitoso("Masculino"));
		assertEquals("Sr.Martins",a2.getTratamento());
	}
	
	@Test
	void testTítulo() {
		Autoridade a1 = new Autoridade ("Maria","Martins",new ComTítulo("Madame"));
		assertEquals("Madame Maria Martins",a1.getTratamento());
	}

}
