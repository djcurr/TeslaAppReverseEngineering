package org.spongycastle.util.test;

import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class SimpleTestResult implements TestResult {
    private static final String SEPARATOR = Strings.lineSeparator();
    private Throwable exception;
    private String message;
    private boolean success;

    public SimpleTestResult(boolean z11, String str) {
        this.success = z11;
        this.message = str;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" failing ");
        stringBuffer.append(str2);
        String str5 = SEPARATOR;
        stringBuffer.append(str5);
        stringBuffer.append("    expected: ");
        stringBuffer.append(str3);
        stringBuffer.append(str5);
        stringBuffer.append("    got     : ");
        stringBuffer.append(str4);
        return stringBuffer.toString();
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.spongycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.spongycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.spongycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }

    public static TestResult failed(Test test, String str, Throwable th2) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th2);
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = SEPARATOR;
        sb2.append(str2);
        sb2.append("Expected: ");
        sb2.append(obj);
        sb2.append(str2);
        sb2.append("Found   : ");
        sb2.append(obj2);
        return failed(test, sb2.toString());
    }

    public SimpleTestResult(boolean z11, String str, Throwable th2) {
        this.success = z11;
        this.message = str;
        this.exception = th2;
    }
}