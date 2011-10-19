import static org.junit.Assert.*;

import org.junit.Test;


public class AutoresTest {

	@Test
	public void deveFormatarNomeESobrenomeDoAutor() {
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
			
	}
	
	@Test
	public void deveFormatarOutroNomeESobrenomeDoAutor() {
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
			
	}



	@Test
	public void deveFormatarMaisUmNomeESobrenomeDoAutor() {
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
			
	}
	
	@Test
	public void deveFormatarMaisUmNomeESobrenomeDoAutorQualquer() {
		String nomeFormatado = Autores.formata("Marcelo de Almeida da Silva Ganso de Pato Sauro");
		assertEquals("SAURO, Marcelo de Almeida da Silva Ganso de Pato", nomeFormatado);
	
	}
}