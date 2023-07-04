package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter {
    protected void recursiveAppendRootCauseFirst(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            recursiveAppendRootCauseFirst(sb2, str, i11, iThrowableProxy.getCause());
            str = null;
        }
        ThrowableProxyUtil.indent(sb2, i11 - 1);
        if (str != null) {
            sb2.append(str);
        }
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(sb2, iThrowableProxy);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb2, i11, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppendRootCauseFirst(sb2, CoreConstants.SUPPRESSED, i11 + 1, iThrowableProxy2);
            }
        }
    }

    @Override // ch.qos.logback.classic.pattern.ThrowableProxyConverter
    protected String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb2 = new StringBuilder(2048);
        recursiveAppendRootCauseFirst(sb2, null, 1, iThrowableProxy);
        return sb2.toString();
    }
}