package ch.qos.logback.core.pattern.util;

/* loaded from: classes.dex */
public class AsIsEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c11, int i11) {
        stringBuffer.append("\\");
        stringBuffer.append(c11);
    }
}