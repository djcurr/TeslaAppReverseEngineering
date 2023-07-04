package com.adyen.threeds2.exception;

/* loaded from: classes.dex */
public final class SDKRuntimeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final String f9629a;

    public SDKRuntimeException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.f9629a = str2;
    }

    public String getErrorCode() {
        return this.f9629a;
    }
}