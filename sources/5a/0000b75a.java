package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n0 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f53250a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f53251b;

    /* renamed from: c  reason: collision with root package name */
    private int f53252c;

    public n0(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public n0(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f53250a = bigInteger2;
        this.f53251b = bigInteger;
        this.f53252c = i11;
    }

    public BigInteger a() {
        return this.f53250a;
    }

    public int b() {
        return this.f53252c;
    }

    public BigInteger c() {
        return this.f53251b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return n0Var.c().equals(this.f53251b) && n0Var.a().equals(this.f53250a) && n0Var.b() == this.f53252c;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() ^ a().hashCode()) + this.f53252c;
    }
}