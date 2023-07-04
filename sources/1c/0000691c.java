package expo.modules.core;

import expo.modules.core.interfaces.CodedThrowable;

/* loaded from: classes5.dex */
public interface Promise {
    public static final String UNKNOWN_ERROR = "E_UNKNOWN_ERROR";

    void reject(String str, String str2, Throwable th2);

    default void reject(Throwable th2) {
        if (th2 instanceof CodedThrowable) {
            CodedThrowable codedThrowable = (CodedThrowable) th2;
            reject(codedThrowable.getCode(), codedThrowable.getMessage(), th2);
            return;
        }
        reject(UNKNOWN_ERROR, th2);
    }

    void resolve(Object obj);

    default void reject(String str, String str2) {
        reject(str, str2, null);
    }

    default void reject(String str, Throwable th2) {
        reject(str, th2.getMessage(), th2);
    }
}