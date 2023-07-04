package u50;

/* loaded from: classes5.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53248a;

    /* renamed from: b  reason: collision with root package name */
    private int f53249b;

    public n(byte[] bArr, int i11) {
        this.f53248a = org.bouncycastle.util.a.h(bArr);
        this.f53249b = i11;
    }

    public int a() {
        return this.f53249b;
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f53248a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f53249b != this.f53249b) {
                return false;
            }
            return org.bouncycastle.util.a.c(this.f53248a, nVar.f53248a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53249b ^ org.bouncycastle.util.a.F(this.f53248a);
    }
}