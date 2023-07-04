package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class g1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private SecureRandom f53213a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.i f53214b;

    public g1(org.bouncycastle.crypto.i iVar, SecureRandom secureRandom) {
        this.f53213a = org.bouncycastle.crypto.k.c(secureRandom);
        this.f53214b = iVar;
    }

    public org.bouncycastle.crypto.i a() {
        return this.f53214b;
    }

    public SecureRandom b() {
        return this.f53213a;
    }
}