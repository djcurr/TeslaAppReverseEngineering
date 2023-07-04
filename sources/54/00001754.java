package com.facebook.imageutils;

import java.io.InputStream;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f11653a = e.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f11654a;

        /* renamed from: b  reason: collision with root package name */
        int f11655b;

        /* renamed from: c  reason: collision with root package name */
        int f11656c;

        private b() {
        }
    }

    e() {
    }

    public static int a(int i11) {
        if (i11 != 3) {
            if (i11 != 6) {
                return i11 != 8 ? 0 : 270;
            }
            return 90;
        }
        return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
    }

    private static int b(InputStream inputStream, int i11, boolean z11) {
        if (i11 >= 10 && d.a(inputStream, 2, z11) == 3 && d.a(inputStream, 4, z11) == 1) {
            return d.a(inputStream, 2, z11);
        }
        return 0;
    }

    private static int c(InputStream inputStream, int i11, boolean z11, int i12) {
        if (i11 < 14) {
            return 0;
        }
        int a11 = d.a(inputStream, 2, z11);
        int i13 = i11 - 2;
        while (true) {
            int i14 = a11 - 1;
            if (a11 <= 0 || i13 < 12) {
                break;
            }
            int i15 = i13 - 2;
            if (d.a(inputStream, 2, z11) == i12) {
                return i15;
            }
            inputStream.skip(10L);
            i13 = i15 - 10;
            a11 = i14;
        }
        return 0;
    }

    public static int d(InputStream inputStream, int i11) {
        b bVar = new b();
        int e11 = e(inputStream, i11, bVar);
        int i12 = bVar.f11656c - 8;
        if (e11 == 0 || i12 > e11) {
            return 0;
        }
        inputStream.skip(i12);
        return b(inputStream, c(inputStream, e11 - i12, bVar.f11654a, 274), bVar.f11654a);
    }

    private static int e(InputStream inputStream, int i11, b bVar) {
        if (i11 <= 8) {
            return 0;
        }
        int a11 = d.a(inputStream, 4, false);
        bVar.f11655b = a11;
        int i12 = i11 - 4;
        if (a11 != 1229531648 && a11 != 1296891946) {
            nd.a.f(f11653a, "Invalid TIFF header");
            return 0;
        }
        boolean z11 = a11 == 1229531648;
        bVar.f11654a = z11;
        int a12 = d.a(inputStream, 4, z11);
        bVar.f11656c = a12;
        int i13 = i12 - 4;
        if (a12 < 8 || a12 - 8 > i13) {
            nd.a.f(f11653a, "Invalid offset");
            return 0;
        }
        return i13;
    }
}