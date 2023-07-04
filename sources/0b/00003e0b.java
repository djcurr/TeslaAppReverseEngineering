package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.j;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f17442a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17443b;

    private b(int i11, byte[] bArr) {
        this.f17442a = i11;
        this.f17443b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length == jVar.h()) {
            j.b f11 = jVar.f(fVar);
            j.a[] a11 = f11.a();
            int i11 = 0;
            for (j.a aVar : a11) {
                i11 += aVar.a();
            }
            b[] bVarArr = new b[i11];
            int i12 = 0;
            for (j.a aVar2 : a11) {
                int i13 = 0;
                while (i13 < aVar2.a()) {
                    int b11 = aVar2.b();
                    bVarArr[i12] = new b(b11, new byte[f11.b() + b11]);
                    i13++;
                    i12++;
                }
            }
            int length = bVarArr[0].f17443b.length;
            int i14 = i11 - 1;
            while (i14 >= 0 && bVarArr[i14].f17443b.length != length) {
                i14--;
            }
            int i15 = i14 + 1;
            int b12 = length - f11.b();
            int i16 = 0;
            for (int i17 = 0; i17 < b12; i17++) {
                int i18 = 0;
                while (i18 < i12) {
                    bVarArr[i18].f17443b[i17] = bArr[i16];
                    i18++;
                    i16++;
                }
            }
            int i19 = i15;
            while (i19 < i12) {
                bVarArr[i19].f17443b[b12] = bArr[i16];
                i19++;
                i16++;
            }
            int length2 = bVarArr[0].f17443b.length;
            while (b12 < length2) {
                int i21 = 0;
                while (i21 < i12) {
                    bVarArr[i21].f17443b[i21 < i15 ? b12 : b12 + 1] = bArr[i16];
                    i21++;
                    i16++;
                }
                b12++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a() {
        return this.f17443b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f17442a;
    }
}