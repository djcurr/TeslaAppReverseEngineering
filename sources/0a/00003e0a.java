package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f17438a;

    /* renamed from: b  reason: collision with root package name */
    private j f17439b;

    /* renamed from: c  reason: collision with root package name */
    private g f17440c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17441d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(uo.b bVar) {
        int g11 = bVar.g();
        if (g11 >= 21 && (g11 & 3) == 1) {
            this.f17438a = bVar;
            return;
        }
        throw FormatException.a();
    }

    private int a(int i11, int i12, int i13) {
        return this.f17441d ? this.f17438a.d(i12, i11) : this.f17438a.d(i11, i12) ? (i13 << 1) | 1 : i13 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int i11 = 0;
        while (i11 < this.f17438a.j()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f17438a.g(); i13++) {
                if (this.f17438a.d(i11, i13) != this.f17438a.d(i13, i11)) {
                    this.f17438a.c(i13, i11);
                    this.f17438a.c(i11, i13);
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] c() {
        g d11 = d();
        j e11 = e();
        c cVar = c.values()[d11.c()];
        int g11 = this.f17438a.g();
        cVar.unmaskBitMatrix(this.f17438a, g11);
        uo.b a11 = e11.a();
        byte[] bArr = new byte[e11.h()];
        int i11 = g11 - 1;
        boolean z11 = true;
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 > 0) {
            if (i12 == 6) {
                i12--;
            }
            for (int i16 = 0; i16 < g11; i16++) {
                int i17 = z11 ? i11 - i16 : i16;
                for (int i18 = 0; i18 < 2; i18++) {
                    int i19 = i12 - i18;
                    if (!a11.d(i19, i17)) {
                        i14++;
                        i15 <<= 1;
                        if (this.f17438a.d(i19, i17)) {
                            i15 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i13] = (byte) i15;
                            i13++;
                            i14 = 0;
                            i15 = 0;
                        }
                    }
                }
            }
            z11 = !z11;
            i12 -= 2;
        }
        if (i13 == e11.h()) {
            return bArr;
        }
        throw FormatException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g d() {
        g gVar = this.f17440c;
        if (gVar != null) {
            return gVar;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 6; i13++) {
            i12 = a(i13, 8, i12);
        }
        int a11 = a(8, 7, a(8, 8, a(7, 8, i12)));
        for (int i14 = 5; i14 >= 0; i14--) {
            a11 = a(8, i14, a11);
        }
        int g11 = this.f17438a.g();
        int i15 = g11 - 7;
        for (int i16 = g11 - 1; i16 >= i15; i16--) {
            i11 = a(8, i16, i11);
        }
        for (int i17 = g11 - 8; i17 < g11; i17++) {
            i11 = a(i17, 8, i11);
        }
        g a12 = g.a(a11, i11);
        this.f17440c = a12;
        if (a12 != null) {
            return a12;
        }
        throw FormatException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        j jVar = this.f17439b;
        if (jVar != null) {
            return jVar;
        }
        int g11 = this.f17438a.g();
        int i11 = (g11 - 17) / 4;
        if (i11 <= 6) {
            return j.i(i11);
        }
        int i12 = g11 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = g11 - 9; i16 >= i12; i16--) {
                i14 = a(i16, i15, i14);
            }
        }
        j c11 = j.c(i14);
        if (c11 != null && c11.e() == g11) {
            this.f17439b = c11;
            return c11;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = g11 - 9; i18 >= i12; i18--) {
                i13 = a(i17, i18, i13);
            }
        }
        j c12 = j.c(i13);
        if (c12 != null && c12.e() == g11) {
            this.f17439b = c12;
            return c12;
        }
        throw FormatException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f17440c == null) {
            return;
        }
        c.values()[this.f17440c.c()].unmaskBitMatrix(this.f17438a, this.f17438a.g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z11) {
        this.f17439b = null;
        this.f17440c = null;
        this.f17441d = z11;
    }
}