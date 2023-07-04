package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class o extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private r f53257c;

    public o(SecureRandom secureRandom, r rVar) {
        super(secureRandom, rVar.b().bitLength() - 1);
        this.f53257c = rVar;
    }

    public r c() {
        return this.f53257c;
    }
}