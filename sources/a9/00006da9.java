package f70;

import f70.j;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final m f25966a;

    /* renamed from: b  reason: collision with root package name */
    private final h f25967b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f25968c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f25969d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(m mVar) {
        Objects.requireNonNull(mVar, "params == null");
        this.f25966a = mVar;
        int c11 = mVar.c();
        this.f25967b = new h(mVar.b(), c11);
        this.f25968c = new byte[c11];
        this.f25969d = new byte[c11];
    }

    private byte[] a(byte[] bArr, int i11, int i12, j jVar) {
        int c11 = this.f25966a.c();
        Objects.requireNonNull(bArr, "startHash == null");
        if (bArr.length != c11) {
            throw new IllegalArgumentException("startHash needs to be " + c11 + "bytes");
        }
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        Objects.requireNonNull(jVar.d(), "otsHashAddress byte array == null");
        int i13 = i11 + i12;
        if (i13 <= this.f25966a.d() - 1) {
            if (i12 == 0) {
                return bArr;
            }
            byte[] a11 = a(bArr, i11, i12 - 1, jVar);
            j jVar2 = (j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).n(jVar.e()).o(i13 - 1).f(0).l();
            byte[] c12 = this.f25967b.c(this.f25969d, jVar2.d());
            byte[] c13 = this.f25967b.c(this.f25969d, ((j) new j.b().g(jVar2.b()).h(jVar2.c()).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1).l()).d());
            byte[] bArr2 = new byte[c11];
            for (int i14 = 0; i14 < c11; i14++) {
                bArr2[i14] = (byte) (a11[i14] ^ c13[i14]);
            }
            return this.f25967b.a(c12, bArr2);
        }
        throw new IllegalArgumentException("max chain length must not be greater than w");
    }

    private byte[] b(int i11) {
        if (i11 < 0 || i11 >= this.f25966a.a()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f25967b.c(this.f25968c, a0.q(i11, 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h c() {
        return this.f25967b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m d() {
        return this.f25966a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n e(j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        byte[][] bArr = new byte[this.f25966a.a()];
        for (int i11 = 0; i11 < this.f25966a.a(); i11++) {
            jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).n(i11).o(jVar.f()).f(jVar.a()).l();
            bArr[i11] = a(b(i11), 0, this.f25966a.d() - 1, jVar);
        }
        return new n(this.f25966a, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f25969d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] g(byte[] bArr, j jVar) {
        return this.f25967b.c(bArr, ((j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).l()).d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr, "secretKeySeed == null");
        if (bArr.length != this.f25966a.c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        Objects.requireNonNull(bArr2, "publicSeed == null");
        if (bArr2.length != this.f25966a.c()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f25968c = bArr;
        this.f25969d = bArr2;
    }
}