package aula11.as9b.exercicio01;

import javax.swing.text.AbstractDocument.Content;

public interface XMLReader {
	public void setContentHandler(ContentHandler handler);

	public void parse(InputStream is);
}
