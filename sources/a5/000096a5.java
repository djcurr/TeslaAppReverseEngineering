package org.bouncycastle.util;

/* loaded from: classes5.dex */
public class StreamParsingException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    Throwable f43208a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43208a;
    }
}