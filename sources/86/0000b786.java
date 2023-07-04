package u60;

import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    protected final a f53352a;

    /* renamed from: b  reason: collision with root package name */
    protected final e f53353b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, e eVar) {
        this.f53352a = aVar;
        this.f53353b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f53352a.equals(dVar.f53352a) && this.f53353b.equals(dVar.f53353b);
        }
        return false;
    }

    @Override // u60.a
    public BigInteger getCharacteristic() {
        return this.f53352a.getCharacteristic();
    }

    @Override // u60.a
    public int getDimension() {
        return this.f53352a.getDimension() * this.f53353b.getDegree();
    }

    @Override // u60.f
    public e getMinimalPolynomial() {
        return this.f53353b;
    }

    public int hashCode() {
        return this.f53352a.hashCode() ^ r70.f.c(this.f53353b.hashCode(), 16);
    }
}