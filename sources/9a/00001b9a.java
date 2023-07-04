package com.google.android.exoplayer2.extractor.flv;

import ak.v;
import ci.i;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import ei.a;
import java.util.Collections;
import ji.x;

/* loaded from: classes3.dex */
final class a extends TagPayloadReader {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f13380e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f13381b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13382c;

    /* renamed from: d  reason: collision with root package name */
    private int f13383d;

    public a(x xVar) {
        super(xVar);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(v vVar) {
        if (!this.f13381b) {
            int C = vVar.C();
            int i11 = (C >> 4) & 15;
            this.f13383d = i11;
            if (i11 == 2) {
                this.f13379a.d(new i.b().e0("audio/mpeg").H(1).f0(f13380e[(C >> 2) & 3]).E());
                this.f13382c = true;
            } else if (i11 == 7 || i11 == 8) {
                this.f13379a.d(new i.b().e0(i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.f13382c = true;
            } else if (i11 != 10) {
                int i12 = this.f13383d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i12);
                throw new TagPayloadReader.UnsupportedFormatException(sb2.toString());
            }
            this.f13381b = true;
        } else {
            vVar.P(1);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(v vVar, long j11) {
        if (this.f13383d == 2) {
            int a11 = vVar.a();
            this.f13379a.e(vVar, a11);
            this.f13379a.f(j11, 1, a11, 0, null);
            return true;
        }
        int C = vVar.C();
        if (C == 0 && !this.f13382c) {
            int a12 = vVar.a();
            byte[] bArr = new byte[a12];
            vVar.j(bArr, 0, a12);
            a.b g11 = ei.a.g(bArr);
            this.f13379a.d(new i.b().e0("audio/mp4a-latm").I(g11.f25111c).H(g11.f25110b).f0(g11.f25109a).T(Collections.singletonList(bArr)).E());
            this.f13382c = true;
            return false;
        } else if (this.f13383d != 10 || C == 1) {
            int a13 = vVar.a();
            this.f13379a.e(vVar, a13);
            this.f13379a.f(j11, 1, a13, 0, null);
            return true;
        } else {
            return false;
        }
    }
}