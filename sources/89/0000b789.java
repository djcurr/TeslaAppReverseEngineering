package u60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
class g implements a {

    /* renamed from: a  reason: collision with root package name */
    protected final BigInteger f53354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(BigInteger bigInteger) {
        this.f53354a = bigInteger;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f53354a.equals(((g) obj).f53354a);
        }
        return false;
    }

    @Override // u60.a
    public BigInteger getCharacteristic() {
        return this.f53354a;
    }

    @Override // u60.a
    public int getDimension() {
        return 1;
    }

    public int hashCode() {
        return this.f53354a.hashCode();
    }
}