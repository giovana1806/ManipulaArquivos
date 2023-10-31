package modificadores;

import java.io.IOException;

public class ObjetoArquivoo {

	public static void main(String args[]) throws IOException {
		String path = "c:\\tmp\\file.doc";
		

		Arquivo.escritor(path);
		Arquivo.leitor(path);
	}

}