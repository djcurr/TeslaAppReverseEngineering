package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    List<String> ignoredStackTraceLines = null;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void addIgnoreStackTraceLine(String str) {
        if (this.ignoredStackTraceLines == null) {
            this.ignoredStackTraceLines = new ArrayList();
        }
        this.ignoredStackTraceLines.add(str);
    }

    private boolean isIgnoredStackTraceLine(String str) {
        List<String> list = this.ignoredStackTraceLines;
        if (list != null) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void printIgnoredCount(StringBuilder sb2, int i11) {
        sb2.append(" [");
        sb2.append(i11);
        sb2.append(" skipped]");
    }

    private void printStackLine(StringBuilder sb2, int i11, StackTraceElementProxy stackTraceElementProxy) {
        sb2.append(stackTraceElementProxy);
        extraData(sb2, stackTraceElementProxy);
        if (i11 > 0) {
            printIgnoredCount(sb2, i11);
        }
    }

    private void recursiveAppend(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb2, str, i11, iThrowableProxy);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb2, i11, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb2, CoreConstants.SUPPRESSED, i11 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb2, CoreConstants.CAUSED_BY, i11, iThrowableProxy.getCause());
    }

    private void subjoinExceptionMessage(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(iThrowableProxy.getMessage());
    }

    private void subjoinFirstLine(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb2, i11 - 1);
        if (str != null) {
            sb2.append(str);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.evaluatorList != null) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= this.evaluatorList.size()) {
                    z11 = true;
                    break;
                }
                try {
                } catch (EvaluationException e11) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e11);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e11);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (this.evaluatorList.get(i11).evaluate(iLoggingEvent)) {
                    break;
                }
                i11++;
            }
            if (!z11) {
                return "";
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    protected void extraData(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            r6 = this;
            java.lang.String r0 = r6.getFirstOption()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r0 != 0) goto Ld
        La:
            r6.lengthOption = r1
            goto L48
        Ld:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "full"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1c
            goto La
        L1c:
            java.lang.String r3 = "short"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L27
            r6.lengthOption = r2
            goto L48
        L27:
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2e
            r6.lengthOption = r3     // Catch: java.lang.NumberFormatException -> L2e
            goto L48
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not parse ["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "] as an integer"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.addError(r0)
            goto La
        L48:
            java.util.List r0 = r6.getOptionList()
            if (r0 == 0) goto L7e
            int r1 = r0.size()
            if (r1 <= r2) goto L7e
            int r1 = r0.size()
        L58:
            if (r2 >= r1) goto L7e
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            ch.qos.logback.core.Context r4 = r6.getContext()
            java.lang.String r5 = "EVALUATOR_MAP"
            java.lang.Object r4 = r4.getObject(r5)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r3)
            ch.qos.logback.core.boolex.EventEvaluator r4 = (ch.qos.logback.core.boolex.EventEvaluator) r4
            if (r4 == 0) goto L78
            r6.addEvaluator(r4)
            goto L7b
        L78:
            r6.addIgnoreStackTraceLine(r3)
        L7b:
            int r2 = r2 + 1
            goto L58
        L7e:
            super.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.classic.pattern.ThrowableProxyConverter.start():void");
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.evaluatorList = null;
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void subjoinSTEPArray(StringBuilder sb2, int i11, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int i12 = this.lengthOption;
        boolean z11 = i12 > stackTraceElementProxyArray.length;
        if (z11) {
            i12 = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z11) {
            i12 -= commonFrames;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i14];
            if (isIgnoredStackTraceLine(stackTraceElementProxy.toString())) {
                i13++;
                if (i12 < stackTraceElementProxyArray.length) {
                    i12++;
                }
            } else {
                ThrowableProxyUtil.indent(sb2, i11);
                printStackLine(sb2, i13, stackTraceElementProxy);
                sb2.append(CoreConstants.LINE_SEPARATOR);
                i13 = 0;
            }
        }
        if (i13 > 0) {
            printIgnoredCount(sb2, i13);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z11) {
            return;
        }
        ThrowableProxyUtil.indent(sb2, i11);
        sb2.append("... ");
        sb2.append(iThrowableProxy.getCommonFrames());
        sb2.append(" common frames omitted");
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    protected String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb2 = new StringBuilder(2048);
        recursiveAppend(sb2, null, 1, iThrowableProxy);
        return sb2.toString();
    }
}