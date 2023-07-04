package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class g0 implements e40.b, e40.h {

    /* renamed from: a  reason: collision with root package name */
    private boolean f43043a;

    /* renamed from: b  reason: collision with root package name */
    private int f43044b;

    /* renamed from: c  reason: collision with root package name */
    private r f43045c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(boolean z11, int i11, r rVar) {
        this.f43043a = z11;
        this.f43044b = i11;
        this.f43045c = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return this.f43045c.c(this.f43043a, this.f43044b);
    }

    @Override // e40.b
    public n toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage());
        }
    }
}