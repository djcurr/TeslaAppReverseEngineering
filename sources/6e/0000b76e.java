package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class t0 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f53291a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f53292b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53293c;

    public t0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f53291a = bigInteger;
        this.f53292b = bigInteger2;
        this.f53293c = bigInteger3;
    }

    public t0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, w0 w0Var) {
        this.f53293c = bigInteger3;
        this.f53291a = bigInteger;
        this.f53292b = bigInteger2;
    }

    public BigInteger a() {
        return this.f53293c;
    }

    public BigInteger b() {
        return this.f53291a;
    }

    public BigInteger c() {
        return this.f53292b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            return t0Var.b().equals(this.f53291a) && t0Var.c().equals(this.f53292b) && t0Var.a().equals(this.f53293c);
        }
        return false;
    }

    public int hashCode() {
        return (this.f53291a.hashCode() ^ this.f53292b.hashCode()) ^ this.f53293c.hashCode();
    }
}