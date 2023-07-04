package uf;

import jf.m;

/* loaded from: classes3.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f53424a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53425b;

    /* renamed from: c  reason: collision with root package name */
    private final d f53426c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f53427d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f53428e;

    public f(int i11, boolean z11, d dVar, Integer num, boolean z12) {
        this.f53424a = i11;
        this.f53425b = z11;
        this.f53426c = dVar;
        this.f53427d = num;
        this.f53428e = z12;
    }

    private c a(af.c cVar, boolean z11) {
        d dVar = this.f53426c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z11);
    }

    private c b(af.c cVar, boolean z11) {
        Integer num = this.f53427d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return d(cVar, z11);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return c(cVar, z11);
    }

    private c c(af.c cVar, boolean z11) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f53424a, this.f53425b, this.f53428e).createImageTranscoder(cVar, z11);
    }

    private c d(af.c cVar, boolean z11) {
        return new h(this.f53424a).createImageTranscoder(cVar, z11);
    }

    @Override // uf.d
    public c createImageTranscoder(af.c cVar, boolean z11) {
        c a11 = a(cVar, z11);
        if (a11 == null) {
            a11 = b(cVar, z11);
        }
        if (a11 == null && m.a()) {
            a11 = c(cVar, z11);
        }
        return a11 == null ? d(cVar, z11) : a11;
    }
}