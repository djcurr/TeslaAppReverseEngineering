package ch.qos.logback.classic.html;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.IThrowableRenderer;

/* loaded from: classes.dex */
public class DefaultThrowableRenderer implements IThrowableRenderer<ILoggingEvent> {
    static final String TRACE_PREFIX = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";

    public void printFirstLine(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb2.append("<br />");
            sb2.append(CoreConstants.CAUSED_BY);
        }
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(Transform.escapeTags(iThrowableProxy.getMessage()));
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    @Override // ch.qos.logback.core.html.IThrowableRenderer
    public void render(StringBuilder sb2, ILoggingEvent iLoggingEvent) {
        sb2.append("<tr><td class=\"Exception\" colspan=\"6\">");
        for (IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy(); throwableProxy != null; throwableProxy = throwableProxy.getCause()) {
            render(sb2, throwableProxy);
        }
        sb2.append("</td></tr>");
    }

    void render(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        printFirstLine(sb2, iThrowableProxy);
        int commonFrames = iThrowableProxy.getCommonFrames();
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        for (int i11 = 0; i11 < stackTraceElementProxyArray.length - commonFrames; i11++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i11];
            sb2.append(TRACE_PREFIX);
            sb2.append(Transform.escapeTags(stackTraceElementProxy.toString()));
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            sb2.append(TRACE_PREFIX);
            sb2.append("\t... ");
            sb2.append(commonFrames);
            sb2.append(" common frames omitted");
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
    }
}