package l70;

import java.security.PublicKey;
import org.bouncycastle.asn1.q0;
import w60.e;
import w60.g;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    private short[][] f37100a;

    /* renamed from: b  reason: collision with root package name */
    private short[][] f37101b;

    /* renamed from: c  reason: collision with root package name */
    private short[] f37102c;

    /* renamed from: d  reason: collision with root package name */
    private int f37103d;

    public b(int i11, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f37103d = i11;
        this.f37100a = sArr;
        this.f37101b = sArr2;
        this.f37102c = sArr3;
    }

    public b(p70.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }

    public short[][] a() {
        return this.f37100a;
    }

    public short[] b() {
        return org.bouncycastle.util.a.n(this.f37102c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f37101b.length];
        int i11 = 0;
        while (true) {
            short[][] sArr2 = this.f37101b;
            if (i11 == sArr2.length) {
                return sArr;
            }
            sArr[i11] = org.bouncycastle.util.a.n(sArr2[i11]);
            i11++;
        }
    }

    public int d() {
        return this.f37103d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37103d == bVar.d() && c70.a.j(this.f37100a, bVar.a()) && c70.a.j(this.f37101b, bVar.c()) && c70.a.i(this.f37102c, bVar.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return n70.a.a(new e50.b(e.f55678a, q0.f43085a), new g(this.f37103d, this.f37100a, this.f37101b, this.f37102c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f37103d * 37) + org.bouncycastle.util.a.M(this.f37100a)) * 37) + org.bouncycastle.util.a.M(this.f37101b)) * 37) + org.bouncycastle.util.a.L(this.f37102c);
    }
}