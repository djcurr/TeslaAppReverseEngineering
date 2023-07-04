package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xf.a;

@a
/* loaded from: classes3.dex */
public class ReactSoftExceptionLogger {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* loaded from: classes3.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th2);
    }

    @a
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.contains(reactSoftExceptionListener)) {
            return;
        }
        list.add(reactSoftExceptionListener);
    }

    @a
    public static void clearListeners() {
        sListeners.clear();
    }

    @a
    private static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    @a
    public static void logSoftException(String str, Throwable th2) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.size() > 0) {
            for (ReactSoftExceptionListener reactSoftExceptionListener : list) {
                reactSoftExceptionListener.logSoftException(str, th2);
            }
            return;
        }
        nd.a.k(str, "Unhandled SoftException", th2);
    }

    @a
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}