import static org.junit.Assert.*;

import org.junit.Test;


public class AutoresTeste {

	@Test
	public void deveFormatarNomeESobrenomeDoAutor() {
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
		
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorDois() {
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
		
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorTres() {
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
		
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorQuatro() {
		String nomeFormatado = Autores.formata("celso de araujo dias");
		assertEquals("DIAS, Celso de araujo", nomeFormatado);
		
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutorCinco() {
		String nomeFormatado = Autores.formata("celso de araujo dias orlando");
		assertEquals("ORLANDO, Celso de araujo dias", nomeFormatado);
		
	}

}
