package org.bouncycastle.crypto.engines;

import i50.d0;
import java.math.BigInteger;
import java.security.SecureRandom;
import n60.f;
import n60.h;
import n60.i;
import n60.k;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.p;
import u50.b0;
import u50.e0;
import u50.g1;
import u50.y;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final p f43127a;

    /* renamed from: b  reason: collision with root package name */
    private final b f43128b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43129c;

    /* renamed from: d  reason: collision with root package name */
    private b0 f43130d;

    /* renamed from: e  reason: collision with root package name */
    private y f43131e;

    /* renamed from: f  reason: collision with root package name */
    private int f43132f;

    /* renamed from: g  reason: collision with root package name */
    private SecureRandom f43133g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.bouncycastle.crypto.engines.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C0861a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f43134a;

        static {
            int[] iArr = new int[b.values().length];
            f43134a = iArr;
            try {
                iArr[b.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        C1C2C3,
        C1C3C2
    }

    public a() {
        this(new d0());
    }

    public a(p pVar) {
        this(pVar, b.C1C2C3);
    }

    public a(p pVar, b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("mode cannot be NULL");
        }
        this.f43127a = pVar;
        this.f43128b = bVar;
    }

    private void a(p pVar, f fVar) {
        byte[] b11 = r70.a.b(this.f43132f, fVar.t());
        pVar.update(b11, 0, b11.length);
    }

    private byte[] c(byte[] bArr, int i11, int i12) {
        int i13;
        int i14 = (this.f43132f * 2) + 1;
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i11, bArr2, 0, i14);
        i j11 = this.f43131e.a().j(bArr2);
        if (j11.y(this.f43131e.c()).u()) {
            throw new InvalidCipherTextException("[h]C1 at infinity");
        }
        i A = j11.y(((u50.d0) this.f43130d).c()).A();
        int digestSize = this.f43127a.getDigestSize();
        int i15 = (i12 - i14) - digestSize;
        byte[] bArr3 = new byte[i15];
        b bVar = this.f43128b;
        b bVar2 = b.C1C3C2;
        if (bVar == bVar2) {
            System.arraycopy(bArr, i11 + i14 + digestSize, bArr3, 0, i15);
        } else {
            System.arraycopy(bArr, i11 + i14, bArr3, 0, i15);
        }
        g(this.f43127a, A, bArr3);
        int digestSize2 = this.f43127a.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        a(this.f43127a, A.f());
        this.f43127a.update(bArr3, 0, i15);
        a(this.f43127a, A.g());
        this.f43127a.doFinal(bArr4, 0);
        if (this.f43128b == bVar2) {
            i13 = 0;
            for (int i16 = 0; i16 != digestSize2; i16++) {
                i13 |= bArr4[i16] ^ bArr[(i11 + i14) + i16];
            }
        } else {
            i13 = 0;
            for (int i17 = 0; i17 != digestSize2; i17++) {
                i13 |= bArr4[i17] ^ bArr[((i11 + i14) + i15) + i17];
            }
        }
        org.bouncycastle.util.a.y(bArr2, (byte) 0);
        org.bouncycastle.util.a.y(bArr4, (byte) 0);
        if (i13 == 0) {
            return bArr3;
        }
        org.bouncycastle.util.a.y(bArr3, (byte) 0);
        throw new InvalidCipherTextException("invalid cipher text");
    }

    private byte[] d(byte[] bArr, int i11, int i12) {
        byte[] l11;
        i A;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        h b11 = b();
        do {
            BigInteger h11 = h();
            l11 = b11.a(this.f43131e.b(), h11).A().l(false);
            A = ((e0) this.f43130d).c().y(h11).A();
            g(this.f43127a, A, bArr2);
        } while (i(bArr2, bArr, i11));
        byte[] bArr3 = new byte[this.f43127a.getDigestSize()];
        a(this.f43127a, A.f());
        this.f43127a.update(bArr, i11, i12);
        a(this.f43127a, A.g());
        this.f43127a.doFinal(bArr3, 0);
        return C0861a.f43134a[this.f43128b.ordinal()] != 1 ? org.bouncycastle.util.a.q(l11, bArr2, bArr3) : org.bouncycastle.util.a.q(l11, bArr3, bArr2);
    }

    private void g(p pVar, i iVar, byte[] bArr) {
        r70.h hVar;
        int digestSize = pVar.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        r70.h hVar2 = null;
        if (pVar instanceof r70.h) {
            a(pVar, iVar.f());
            a(pVar, iVar.g());
            hVar2 = (r70.h) pVar;
            hVar = hVar2.copy();
        } else {
            hVar = null;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            if (hVar2 != null) {
                hVar2.a(hVar);
            } else {
                a(pVar, iVar.f());
                a(pVar, iVar.g());
            }
            i12++;
            r70.i.f(i12, bArr2, 0);
            pVar.update(bArr2, 0, 4);
            pVar.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i11);
            k(bArr, bArr2, i11, min);
            i11 += min;
        }
    }

    private BigInteger h() {
        int bitLength = this.f43131e.e().bitLength();
        while (true) {
            BigInteger e11 = r70.a.e(bitLength, this.f43133g);
            if (!e11.equals(r70.a.f49293a) && e11.compareTo(this.f43131e.e()) < 0) {
                return e11;
            }
        }
    }

    private boolean i(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 != bArr.length; i12++) {
            if (bArr[i12] != bArr2[i11 + i12]) {
                return false;
            }
        }
        return true;
    }

    private void k(byte[] bArr, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 != i12; i13++) {
            int i14 = i11 + i13;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i13]);
        }
    }

    protected h b() {
        return new k();
    }

    public int e(int i11) {
        return (this.f43132f * 2) + 1 + i11 + this.f43127a.getDigestSize();
    }

    public void f(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f43129c = z11;
        if (z11) {
            g1 g1Var = (g1) iVar;
            b0 b0Var = (b0) g1Var.a();
            this.f43130d = b0Var;
            this.f43131e = b0Var.b();
            if (((e0) this.f43130d).c().y(this.f43131e.c()).u()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.f43133g = g1Var.b();
        } else {
            b0 b0Var2 = (b0) iVar;
            this.f43130d = b0Var2;
            this.f43131e = b0Var2.b();
        }
        this.f43132f = (this.f43131e.a().t() + 7) / 8;
    }

    public byte[] j(byte[] bArr, int i11, int i12) {
        return this.f43129c ? d(bArr, i11, i12) : c(bArr, i11, i12);
    }
}