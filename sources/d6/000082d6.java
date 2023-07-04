package l70;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.q0;
import w40.p;
import w60.e;
import w60.f;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    private short[][] f37094a;

    /* renamed from: b  reason: collision with root package name */
    private short[] f37095b;

    /* renamed from: c  reason: collision with root package name */
    private short[][] f37096c;

    /* renamed from: d  reason: collision with root package name */
    private short[] f37097d;

    /* renamed from: e  reason: collision with root package name */
    private b70.a[] f37098e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f37099f;

    public a(p70.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, b70.a[] aVarArr) {
        this.f37094a = sArr;
        this.f37095b = sArr2;
        this.f37096c = sArr3;
        this.f37097d = sArr4;
        this.f37099f = iArr;
        this.f37098e = aVarArr;
    }

    public short[] a() {
        return this.f37095b;
    }

    public short[] b() {
        return this.f37097d;
    }

    public short[][] c() {
        return this.f37094a;
    }

    public short[][] d() {
        return this.f37096c;
    }

    public b70.a[] e() {
        return this.f37098e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean z11 = ((((c70.a.j(this.f37094a, aVar.c())) && c70.a.j(this.f37096c, aVar.d())) && c70.a.i(this.f37095b, aVar.a())) && c70.a.i(this.f37097d, aVar.b())) && Arrays.equals(this.f37099f, aVar.f());
        if (this.f37098e.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f37098e.length - 1; length >= 0; length--) {
            z11 &= this.f37098e[length].equals(aVar.e()[length]);
        }
        return z11;
    }

    public int[] f() {
        return this.f37099f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new p(new e50.b(e.f55678a, q0.f43085a), new f(this.f37094a, this.f37095b, this.f37096c, this.f37097d, this.f37099f, this.f37098e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f37098e.length * 37) + org.bouncycastle.util.a.M(this.f37094a)) * 37) + org.bouncycastle.util.a.L(this.f37095b)) * 37) + org.bouncycastle.util.a.M(this.f37096c)) * 37) + org.bouncycastle.util.a.L(this.f37097d)) * 37) + org.bouncycastle.util.a.I(this.f37099f);
        for (int length2 = this.f37098e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f37098e[length2].hashCode();
        }
        return length;
    }
}