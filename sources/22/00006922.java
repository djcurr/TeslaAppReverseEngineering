package expo.modules.core.errors;

import expo.modules.core.interfaces.CodedThrowable;

/* loaded from: classes5.dex */
public abstract class CodedException extends Exception implements CodedThrowable {
    public CodedException(String str) {
        super(str);
    }

    @Override // expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "ERR_UNSPECIFIED_ANDROID_EXCEPTION";
    }

    public CodedException(Throwable th2) {
        super(th2);
    }

    public CodedException(String str, Throwable th2) {
        super(str, th2);
    }
}