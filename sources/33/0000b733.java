package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class a0 extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private y f53187c;

    public a0(y yVar, SecureRandom secureRandom) {
        super(secureRandom, yVar.e().bitLength());
        this.f53187c = yVar;
    }

    public y c() {
        return this.f53187c;
    }
}