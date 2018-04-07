package consolcalc;

import java.util.logging.Logger;
//import java.util.logging.LoggerFactory;

/**
 * Mock IO
 *
 * @author parsentev
 * @since 14.06.2016
 */
public class MockIO implements IO {
    private static final Logger log = Logger.getLogger(MockIO.class.toString());
    private int index = 0;
    private final String[] anwsers;
    private final StringBuilder out = new StringBuilder();

    public MockIO(String[] anwsers) {
        this.anwsers = anwsers;
    }

    @Override
    public String read() {
        return this.anwsers[index++];
    }

    @Override
    public void println(Object value) {
        this.out.append(value).append("\n");
    }

    public String getOut() {
        return this.out.toString();
    }
}