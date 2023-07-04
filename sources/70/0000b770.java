package u50;

/* loaded from: classes5.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f53295a;

    /* renamed from: b  reason: collision with root package name */
    private int f53296b;

    public u(byte[] bArr, int i11) {
        this(bArr, i11, -1);
    }

    public u(byte[] bArr, int i11, int i12) {
        this.f53295a = org.bouncycastle.util.a.h(bArr);
        this.f53296b = i11;
    }

    public int a() {
        return this.f53296b;
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f53295a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (uVar.f53296b != this.f53296b) {
                return false;
            }
            return org.bouncycastle.util.a.c(this.f53295a, uVar.f53295a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53296b ^ org.bouncycastle.util.a.F(this.f53295a);
    }
}