package n50;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.c f40564a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.s f40565b;

    public q(org.bouncycastle.crypto.c cVar, org.bouncycastle.crypto.s sVar) {
        this.f40564a = cVar;
        this.f40565b = sVar;
    }

    public org.bouncycastle.crypto.q a() {
        return new org.bouncycastle.crypto.q(this.f40564a.generateKeyPair(), this.f40565b);
    }
}