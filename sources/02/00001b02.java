package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: classes3.dex */
public class JsonProcessingException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    protected ah.a f12957a;

    public ah.a a() {
        return this.f12957a;
    }

    protected String b() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        a();
        String b11 = b();
        if (b11 != null) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(message);
            if (b11 != null) {
                sb2.append(b11);
            }
            return sb2.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}