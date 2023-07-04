package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class r implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f53280a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f53281b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53282c;

    /* renamed from: d  reason: collision with root package name */
    private u f53283d;

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f53280a = bigInteger3;
        this.f53282c = bigInteger;
        this.f53281b = bigInteger2;
    }

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, u uVar) {
        this.f53280a = bigInteger3;
        this.f53282c = bigInteger;
        this.f53281b = bigInteger2;
        this.f53283d = uVar;
    }

    public BigInteger a() {
        return this.f53280a;
    }

    public BigInteger b() {
        return this.f53282c;
    }

    public BigInteger c() {
        return this.f53281b;
    }

    public u d() {
        return this.f53283d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            return rVar.b().equals(this.f53282c) && rVar.c().equals(this.f53281b) && rVar.a().equals(this.f53280a);
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}