package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class j extends f {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53229c;

    public j(BigInteger bigInteger, i iVar) {
        super(true, iVar);
        this.f53229c = bigInteger;
    }

    public BigInteger c() {
        return this.f53229c;
    }

    @Override // u50.f
    public boolean equals(Object obj) {
        return (obj instanceof j) && ((j) obj).c().equals(this.f53229c) && super.equals(obj);
    }

    @Override // u50.f
    public int hashCode() {
        return this.f53229c.hashCode() ^ super.hashCode();
    }
}