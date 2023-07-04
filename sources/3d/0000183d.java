package com.facebook.react.bridge;

/* loaded from: classes3.dex */
public class SoftAssertions {
    public static void assertCondition(boolean z11, String str) {
        if (z11) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }

    public static <T> T assertNotNull(T t11) {
        if (t11 == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t11;
    }

    public static void assertUnreachable(String str) {
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }
}