package l60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f37081a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f37082b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f37083c;

    public n(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f37081a = bigInteger;
        this.f37082b = bigInteger2;
        this.f37083c = bigInteger3;
    }

    public BigInteger a() {
        return this.f37083c;
    }

    public BigInteger b() {
        return this.f37081a;
    }

    public BigInteger c() {
        return this.f37082b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f37083c.equals(nVar.f37083c) && this.f37081a.equals(nVar.f37081a) && this.f37082b.equals(nVar.f37082b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37083c.hashCode() ^ this.f37081a.hashCode()) ^ this.f37082b.hashCode();
    }
}