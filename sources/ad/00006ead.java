package freemarker.core;

import freemarker.template.TemplateException;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes5.dex */
public class StopException extends TemplateException {
    @Override // freemarker.template.TemplateException, java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        synchronized (printWriter) {
            String message = getMessage();
            printWriter.print("Encountered stop instruction");
            if (message != null && !message.equals("")) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("\nCause given: ");
                stringBuffer.append(message);
                printWriter.println(stringBuffer.toString());
            } else {
                printWriter.println();
            }
            super.printStackTrace(printWriter);
        }
    }

    @Override // freemarker.template.TemplateException, java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            String message = getMessage();
            printStream.print("Encountered stop instruction");
            if (message != null && !message.equals("")) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("\nCause given: ");
                stringBuffer.append(message);
                printStream.println(stringBuffer.toString());
            } else {
                printStream.println();
            }
            super.printStackTrace(printStream);
        }
    }
}