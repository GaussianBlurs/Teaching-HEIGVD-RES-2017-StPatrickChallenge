package ch.heigvd.res.stpatrick;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Gaussian on 20.03.2017.
 */
public class ARemoverWriter extends FilterWriter {

    public ARemoverWriter(Writer out) { super(out); }

    @Override
    public void write(String str, int off, int len) throws IOException {
        write(str.toCharArray(), off, len);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for(int i=off; i<off+len; i++)
            write(cbuf[i]);
    }

    @Override
    public void write(int c) throws IOException {
        if(c != 'a' && c != 'A')
            super.write(c);
    }
}
