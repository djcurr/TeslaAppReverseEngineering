package com.facebook.imagepipeline.nativecode;

@md.d
/* loaded from: classes3.dex */
public class NativeJpegTranscoderFactory implements uf.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f11298a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11299b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11300c;

    @md.d
    public NativeJpegTranscoderFactory(int i11, boolean z11, boolean z12) {
        this.f11298a = i11;
        this.f11299b = z11;
        this.f11300c = z12;
    }

    @Override // uf.d
    @md.d
    public uf.c createImageTranscoder(af.c cVar, boolean z11) {
        if (cVar != af.b.f395a) {
            return null;
        }
        return new NativeJpegTranscoder(z11, this.f11298a, this.f11299b, this.f11300c);
    }
}