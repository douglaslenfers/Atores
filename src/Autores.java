
public class Autores {

	public static String formata(String nomeAutor) {
		String[] palavras = nomeAutor.split(" ");
		
		String primeiraPalavra = palavras[0].substring(0,1).toUpperCase()+palavras[0].substring(1);
		
		String ultimaPalavra = palavras[palavras.length - 1].toUpperCase();
		
		if (palavras.length == 2 ) {
			return (ultimaPalavra + ", " + primeiraPalavra);
		}else {
			String outrasPalavra = "";
			
			int i;
			for (i=1;i<palavras.length -1;i++){
				outrasPalavra = outrasPalavra + " " + palavras[i];
			}
			
			return (ultimaPalavra + ", " + primeiraPalavra + outrasPalavra);
		}	
	}
}
