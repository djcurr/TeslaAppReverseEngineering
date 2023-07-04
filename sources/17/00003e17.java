package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final wo.c f17446a = new wo.c(wo.a.f56144l);

    private void a(byte[] bArr, int i11) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        try {
            this.f17446a.a(iArr, bArr.length - i11);
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i13] = (byte) iArr[i13];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    private uo.e b(a aVar, Map<com.google.zxing.d, ?> map) {
        j e11 = aVar.e();
        f d11 = aVar.d().d();
        b[] b11 = b.b(aVar.c(), e11, d11);
        int i11 = 0;
        for (b bVar : b11) {
            i11 += bVar.c();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (b bVar2 : b11) {
            byte[] a11 = bVar2.a();
            int c11 = bVar2.c();
            a(a11, c11);
            int i13 = 0;
            while (i13 < c11) {
                bArr[i12] = a11[i13];
                i13++;
                i12++;
            }
        }
        return d.a(bArr, e11, d11, map);
    }

    public uo.e c(uo.b bVar, Map<com.google.zxing.d, ?> map) {
        ChecksumException e11;
        a aVar = new a(bVar);
        FormatException formatException = null;
        try {
            return b(aVar, map);
        } catch (ChecksumException e12) {
            e11 = e12;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                uo.e b11 = b(aVar, map);
                b11.m(new i(true));
                return b11;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e11;
            }
        } catch (FormatException e13) {
            e11 = null;
            formatException = e13;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            uo.e b112 = b(aVar, map);
            b112.m(new i(true));
            return b112;
        }
    }
}