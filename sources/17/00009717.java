package org.jsoup;

import java.io.IOException;

/* loaded from: classes5.dex */
public class HttpStatusException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private int f43246a;

    /* renamed from: b  reason: collision with root package name */
    private String f43247b;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Status=" + this.f43246a + ", URL=" + this.f43247b;
    }
}