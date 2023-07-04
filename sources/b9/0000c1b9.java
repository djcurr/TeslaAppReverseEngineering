package y30;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public class c {
    public static String a(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }
}