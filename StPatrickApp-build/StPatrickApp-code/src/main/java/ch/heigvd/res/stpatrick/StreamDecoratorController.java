package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;

/**
 * Created by Gaussian on 20.03.2017.
 */
public class StreamDecoratorController implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        return new ARemoverWriter(outputWriter);
    }
}
