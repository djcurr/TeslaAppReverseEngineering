package org.bouncycastle.asn1;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class u1 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    protected final InputStream f43106a;

    /* renamed from: b  reason: collision with root package name */
    private int f43107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(InputStream inputStream, int i11) {
        this.f43106a = inputStream;
        this.f43107b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f43107b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(boolean z11) {
        InputStream inputStream = this.f43106a;
        if (inputStream instanceof r1) {
            ((r1) inputStream).l(z11);
        }
    }
}