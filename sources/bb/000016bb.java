package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import md.k;

@md.d
/* loaded from: classes3.dex */
public class NativeJpegTranscoder implements uf.c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11295a;

    /* renamed from: b  reason: collision with root package name */
    private int f11296b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11297c;

    public NativeJpegTranscoder(boolean z11, int i11, boolean z12, boolean z13) {
        this.f11295a = z11;
        this.f11296b = i11;
        this.f11297c = z12;
        if (z13) {
            d.a();
        }
    }

    public static void d(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) {
        d.a();
        boolean z11 = false;
        k.b(Boolean.valueOf(i12 >= 1));
        k.b(Boolean.valueOf(i12 <= 16));
        k.b(Boolean.valueOf(i13 >= 0));
        k.b(Boolean.valueOf(i13 <= 100));
        k.b(Boolean.valueOf(uf.e.j(i11)));
        if (i12 != 8 || i11 != 0) {
            z11 = true;
        }
        k.c(z11, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i11, i12, i13);
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) {
        d.a();
        boolean z11 = false;
        k.b(Boolean.valueOf(i12 >= 1));
        k.b(Boolean.valueOf(i12 <= 16));
        k.b(Boolean.valueOf(i13 >= 0));
        k.b(Boolean.valueOf(i13 <= 100));
        k.b(Boolean.valueOf(uf.e.i(i11)));
        if (i12 != 8 || i11 != 1) {
            z11 = true;
        }
        k.c(z11, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i11, i12, i13);
    }

    @md.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13);

    @md.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13);

    @Override // uf.c
    public boolean a(af.c cVar) {
        return cVar == af.b.f395a;
    }

    @Override // uf.c
    public uf.b b(nf.e eVar, OutputStream outputStream, p001if.e eVar2, p001if.d dVar, af.c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (eVar2 == null) {
            eVar2 = p001if.e.a();
        }
        int b11 = uf.a.b(eVar2, dVar, eVar, this.f11296b);
        try {
            int f11 = uf.e.f(eVar2, dVar, eVar, this.f11295a);
            int a11 = uf.e.a(b11);
            if (this.f11297c) {
                f11 = a11;
            }
            InputStream R = eVar.R();
            if (uf.e.f53423a.contains(Integer.valueOf(eVar.D()))) {
                e((InputStream) k.h(R, "Cannot transcode from null input stream!"), outputStream, uf.e.d(eVar2, eVar), f11, num.intValue());
            } else {
                d((InputStream) k.h(R, "Cannot transcode from null input stream!"), outputStream, uf.e.e(eVar2, eVar), f11, num.intValue());
            }
            md.b.b(R);
            return new uf.b(b11 != 1 ? 0 : 1);
        } catch (Throwable th2) {
            md.b.b(null);
            throw th2;
        }
    }

    @Override // uf.c
    public boolean c(nf.e eVar, p001if.e eVar2, p001if.d dVar) {
        if (eVar2 == null) {
            eVar2 = p001if.e.a();
        }
        return uf.e.f(eVar2, dVar, eVar, this.f11295a) < 8;
    }

    @Override // uf.c
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }
}