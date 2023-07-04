package q50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class o implements q50.a {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f47676a;

    /* renamed from: b  reason: collision with root package name */
    private final r50.c f47677b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f47678c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f47679d;

    /* renamed from: e  reason: collision with root package name */
    private final c f47680e;

    /* renamed from: f  reason: collision with root package name */
    private final c f47681f;

    /* renamed from: g  reason: collision with root package name */
    private b f47682g;

    /* renamed from: h  reason: collision with root package name */
    private b f47683h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47684i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f47685j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f47686k;

    /* renamed from: l  reason: collision with root package name */
    private int f47687l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f47688m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends ByteArrayOutputStream {
        b() {
        }

        void a() {
            org.bouncycastle.util.a.y(g(), (byte) 0);
        }

        byte[] g() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f47689a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f47690b;

        /* renamed from: c  reason: collision with root package name */
        private int f47691c;

        /* renamed from: d  reason: collision with root package name */
        private long f47692d;

        private c() {
            this.f47689a = new byte[16];
            this.f47690b = new byte[1];
        }

        void a() {
            if (this.f47691c > 0) {
                org.bouncycastle.util.a.y(o.this.f47679d, (byte) 0);
                o.m(this.f47689a, 0, this.f47691c, o.this.f47679d);
                o oVar = o.this;
                oVar.n(oVar.f47679d);
            }
        }

        long b() {
            return this.f47692d;
        }

        void c() {
            this.f47691c = 0;
            this.f47692d = 0L;
        }

        void d(byte b11) {
            byte[] bArr = this.f47690b;
            bArr[0] = b11;
            e(bArr, 0, 1);
        }

        void e(byte[] bArr, int i11, int i12) {
            int i13;
            int i14 = this.f47691c;
            int i15 = 16 - i14;
            int i16 = 0;
            if (i14 <= 0 || i12 < i15) {
                i13 = i12;
            } else {
                System.arraycopy(bArr, i11, this.f47689a, i14, i15);
                o.m(this.f47689a, 0, 16, o.this.f47679d);
                o oVar = o.this;
                oVar.n(oVar.f47679d);
                i13 = i12 - i15;
                this.f47691c = 0;
                i16 = i15 + 0;
            }
            while (i13 >= 16) {
                o.m(bArr, i11 + i16, 16, o.this.f47679d);
                o oVar2 = o.this;
                oVar2.n(oVar2.f47679d);
                i16 += i15;
                i13 -= i15;
            }
            if (i13 > 0) {
                System.arraycopy(bArr, i11 + i16, this.f47689a, this.f47691c, i13);
                this.f47691c += i13;
            }
            this.f47692d += i12;
        }
    }

    public o(org.bouncycastle.crypto.e eVar) {
        this(eVar, new r50.e());
    }

    public o(org.bouncycastle.crypto.e eVar, r50.c cVar) {
        this.f47678c = new byte[16];
        this.f47679d = new byte[16];
        this.f47688m = new byte[16];
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("Cipher required with a block size of 16.");
        }
        this.f47676a = eVar;
        this.f47677b = cVar;
        this.f47680e = new c();
        this.f47681f = new c();
    }

    private static int d(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private byte[] e() {
        this.f47681f.a();
        byte[] i11 = i();
        byte[] bArr = new byte[16];
        for (int i12 = 0; i12 < 12; i12++) {
            i11[i12] = (byte) (i11[i12] ^ this.f47686k[i12]);
        }
        i11[15] = (byte) (i11[15] & (-129));
        this.f47676a.processBlock(i11, 0, bArr, 0);
        return bArr;
    }

    private void f(int i11) {
        int i12 = this.f47687l;
        if ((i12 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i12 & 2) != 0) {
            throw new IllegalStateException("AEAD data cannot be processed after ordinary data");
        }
        if (this.f47680e.b() - Long.MIN_VALUE > (2147483623 - i11) - Long.MIN_VALUE) {
            throw new IllegalStateException("AEAD byte count exceeded");
        }
    }

    private static void g(byte[] bArr, int i11, int i12, boolean z11) {
        int d11 = d(bArr);
        int i13 = i11 + i12;
        if ((i12 < 0 || i11 < 0 || i13 < 0) || i13 > d11) {
            if (!z11) {
                throw new DataLengthException("Input buffer too short.");
            }
        }
    }

    private void h(int i11) {
        int i12 = this.f47687l;
        if ((i12 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i12 & 2) == 0) {
            this.f47680e.a();
            this.f47687l |= 2;
        }
        long j11 = 2147483623;
        long size = this.f47682g.size();
        if (!this.f47684i) {
            j11 = 2147483639;
            size = this.f47683h.size();
        }
        if (size - Long.MIN_VALUE > (j11 - i11) - Long.MIN_VALUE) {
            throw new IllegalStateException("byte count exceeded");
        }
    }

    private byte[] i() {
        byte[] bArr = new byte[16];
        o();
        m(this.f47678c, 0, 16, bArr);
        return bArr;
    }

    private void j() {
        byte[] g11 = this.f47683h.g();
        int size = this.f47683h.size() - 16;
        if (size < 0) {
            throw new InvalidCipherTextException("Data too short");
        }
        byte[] w11 = org.bouncycastle.util.a.w(g11, size, size + 16);
        byte[] h11 = org.bouncycastle.util.a.h(w11);
        h11[15] = (byte) (h11[15] | Byte.MIN_VALUE);
        byte[] bArr = new byte[16];
        int i11 = 0;
        while (size > 0) {
            this.f47676a.processBlock(h11, 0, bArr, 0);
            int min = Math.min(16, size);
            u(bArr, g11, i11, min);
            this.f47682g.write(bArr, 0, min);
            this.f47681f.e(bArr, 0, min);
            size -= min;
            i11 += min;
            p(h11);
        }
        byte[] e11 = e();
        if (!org.bouncycastle.util.a.u(e11, w11)) {
            r();
            throw new InvalidCipherTextException("mac check failed");
        }
        byte[] bArr2 = this.f47688m;
        System.arraycopy(e11, 0, bArr2, 0, bArr2.length);
    }

    private void k(b1 b1Var) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int length = b1Var.a().length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(this.f47686k, 0, bArr, 4, 12);
        this.f47676a.init(true, b1Var);
        this.f47676a.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f47676a.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 8, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f47676a.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.f47676a.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 8, 8);
        if (length == 32) {
            bArr[0] = (byte) (bArr[0] + 1);
            this.f47676a.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 16, 8);
            bArr[0] = (byte) (bArr[0] + 1);
            this.f47676a.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 24, 8);
        }
        this.f47676a.init(true, new b1(bArr4));
        m(bArr3, 0, 16, bArr2);
        q(bArr2);
        this.f47677b.init(bArr2);
        this.f47687l |= 1;
    }

    private int l(byte[] bArr, byte[] bArr2, int i11) {
        byte[] g11 = this.f47682g.g();
        byte[] h11 = org.bouncycastle.util.a.h(bArr);
        h11[15] = (byte) (h11[15] | Byte.MIN_VALUE);
        byte[] bArr3 = new byte[16];
        int size = this.f47682g.size();
        int i12 = 0;
        while (size > 0) {
            this.f47676a.processBlock(h11, 0, bArr3, 0);
            int min = Math.min(16, size);
            u(bArr3, g11, i12, min);
            System.arraycopy(bArr3, 0, bArr2, i11 + i12, min);
            size -= min;
            i12 += min;
            p(h11);
        }
        return this.f47682g.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 0;
        int i14 = 15;
        while (i13 < i12) {
            bArr2[i14] = bArr[i11 + i13];
            i13++;
            i14--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(byte[] bArr) {
        t(this.f47678c, bArr);
        this.f47677b.multiplyH(this.f47678c);
    }

    private void o() {
        byte[] bArr = new byte[16];
        r70.i.s(this.f47681f.b() * 8, bArr, 0);
        r70.i.s(this.f47680e.b() * 8, bArr, 8);
        n(bArr);
    }

    private static void p(byte[] bArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            byte b11 = (byte) (bArr[i11] + 1);
            bArr[i11] = b11;
            if (b11 != 0) {
                return;
            }
        }
    }

    private static void q(byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            byte b11 = bArr[i12];
            bArr[i12] = (byte) (i11 | ((b11 >> 1) & 127));
            i11 = (b11 & 1) == 0 ? 0 : -128;
        }
        if (i11 != 0) {
            bArr[0] = (byte) (bArr[0] ^ (-31));
        }
    }

    private void s() {
        b bVar = this.f47682g;
        if (bVar != null) {
            bVar.a();
        }
        this.f47680e.c();
        this.f47681f.c();
        this.f47682g = new b();
        this.f47683h = this.f47684i ? null : new b();
        this.f47687l &= -3;
        org.bouncycastle.util.a.y(this.f47678c, (byte) 0);
        byte[] bArr = this.f47685j;
        if (bArr != null) {
            this.f47680e.e(bArr, 0, bArr.length);
        }
    }

    private static void t(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    private static void u(byte[] bArr, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13 + i11]);
        }
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        h(0);
        g(bArr, i11, getOutputSize(0), true);
        if (!this.f47684i) {
            j();
            int size = this.f47682g.size();
            System.arraycopy(this.f47682g.g(), 0, bArr, i11, size);
            s();
            return size;
        }
        byte[] e11 = e();
        int l11 = l(e11, bArr, i11) + 16;
        System.arraycopy(e11, 0, bArr, i11 + this.f47682g.size(), 16);
        byte[] bArr2 = this.f47688m;
        System.arraycopy(e11, 0, bArr2, 0, bArr2.length);
        s();
        return l11;
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47676a.getAlgorithmName() + "-GCM-SIV";
    }

    @Override // q50.b
    public byte[] getMac() {
        return org.bouncycastle.util.a.h(this.f47688m);
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        if (this.f47684i) {
            return i11 + this.f47682g.size() + 16;
        }
        int size = i11 + this.f47683h.size();
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47676a;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] a11;
        b1 b1Var;
        byte[] bArr;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            bArr = aVar.a();
            a11 = aVar.d();
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM-SIV");
        } else {
            f1 f1Var = (f1) iVar;
            a11 = f1Var.a();
            b1Var = (b1) f1Var.b();
            bArr = null;
        }
        if (a11 == null || a11.length != 12) {
            throw new IllegalArgumentException("Invalid nonce");
        }
        if (b1Var == null || !(b1Var.a().length == 16 || b1Var.a().length == 32)) {
            throw new IllegalArgumentException("Invalid key");
        }
        this.f47684i = z11;
        this.f47685j = bArr;
        this.f47686k = a11;
        k(b1Var);
        s();
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        f(i12);
        g(bArr, i11, i12, false);
        this.f47680e.e(bArr, i11, i12);
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        h(1);
        if (!this.f47684i) {
            this.f47683h.write(b11);
            return 0;
        }
        this.f47682g.write(b11);
        this.f47681f.d(b11);
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        h(i12);
        g(bArr, i11, i12, false);
        if (this.f47684i) {
            this.f47682g.write(bArr, i11, i12);
            this.f47681f.e(bArr, i11, i12);
        } else {
            this.f47683h.write(bArr, i11, i12);
        }
        return 0;
    }

    public void r() {
        s();
    }
}