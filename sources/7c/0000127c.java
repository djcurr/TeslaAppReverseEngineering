package com.adobe.xmp;

/* loaded from: classes.dex */
public class XMPException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private int f9535a;

    public XMPException(String str, int i11) {
        super(str);
        this.f9535a = i11;
    }

    public XMPException(String str, int i11, Throwable th2) {
        super(str, th2);
        this.f9535a = i11;
    }

    public int a() {
        return this.f9535a;
    }
}