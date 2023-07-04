package com.google.android.exoplayer2.extractor.flv;

import ak.t;
import ak.v;
import ci.i;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import ji.x;

/* loaded from: classes3.dex */
final class d extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    private final v f13403b;

    /* renamed from: c  reason: collision with root package name */
    private final v f13404c;

    /* renamed from: d  reason: collision with root package name */
    private int f13405d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13406e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13407f;

    /* renamed from: g  reason: collision with root package name */
    private int f13408g;

    public d(x xVar) {
        super(xVar);
        this.f13403b = new v(t.f519a);
        this.f13404c = new v(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(v vVar) {
        int C = vVar.C();
        int i11 = (C >> 4) & 15;
        int i12 = C & 15;
        if (i12 == 7) {
            this.f13408g = i11;
            return i11 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i12);
        throw new TagPayloadReader.UnsupportedFormatException(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(v vVar, long j11) {
        int C = vVar.C();
        long n11 = j11 + (vVar.n() * 1000);
        if (C == 0 && !this.f13406e) {
            v vVar2 = new v(new byte[vVar.a()]);
            vVar.j(vVar2.d(), 0, vVar.a());
            bk.a b11 = bk.a.b(vVar2);
            this.f13405d = b11.f7713b;
            this.f13379a.d(new i.b().e0("video/avc").I(b11.f7717f).j0(b11.f7714c).Q(b11.f7715d).a0(b11.f7716e).T(b11.f7712a).E());
            this.f13406e = true;
            return false;
        } else if (C == 1 && this.f13406e) {
            int i11 = this.f13408g == 1 ? 1 : 0;
            if (this.f13407f || i11 != 0) {
                byte[] d11 = this.f13404c.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i12 = 4 - this.f13405d;
                int i13 = 0;
                while (vVar.a() > 0) {
                    vVar.j(this.f13404c.d(), i12, this.f13405d);
                    this.f13404c.O(0);
                    int G = this.f13404c.G();
                    this.f13403b.O(0);
                    this.f13379a.e(this.f13403b, 4);
                    this.f13379a.e(vVar, G);
                    i13 = i13 + 4 + G;
                }
                this.f13379a.f(n11, i11, i13, 0, null);
                this.f13407f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}