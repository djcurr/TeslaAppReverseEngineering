package org.jsoup;

import java.io.IOException;

/* loaded from: classes5.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private String f43248a;

    /* renamed from: b  reason: collision with root package name */
    private String f43249b;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f43248a + ", URL=" + this.f43249b;
    }
}