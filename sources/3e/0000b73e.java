package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class e extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private i f53201c;

    public e(SecureRandom secureRandom, i iVar) {
        super(secureRandom, d(iVar));
        this.f53201c = iVar;
    }

    static int d(i iVar) {
        return iVar.d() != 0 ? iVar.d() : iVar.f().bitLength();
    }

    public i c() {
        return this.f53201c;
    }
}