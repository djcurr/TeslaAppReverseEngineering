package u60;

/* loaded from: classes5.dex */
class c implements e {

    /* renamed from: a  reason: collision with root package name */
    protected final int[] f53351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int[] iArr) {
        this.f53351a = org.bouncycastle.util.a.k(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return org.bouncycastle.util.a.e(this.f53351a, ((c) obj).f53351a);
        }
        return false;
    }

    @Override // u60.e
    public int getDegree() {
        int[] iArr = this.f53351a;
        return iArr[iArr.length - 1];
    }

    @Override // u60.e
    public int[] getExponentsPresent() {
        return org.bouncycastle.util.a.k(this.f53351a);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.I(this.f53351a);
    }
}