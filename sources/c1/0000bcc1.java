package wj;

import ak.k0;
import ak.v;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import nj.b;

/* loaded from: classes3.dex */
public final class b extends nj.d {

    /* renamed from: n  reason: collision with root package name */
    private final v f55918n;

    public b() {
        super("Mp4WebvttDecoder");
        this.f55918n = new v();
    }

    private static nj.b B(v vVar, int i11) {
        CharSequence charSequence = null;
        b.C0811b c0811b = null;
        while (i11 > 0) {
            if (i11 >= 8) {
                int m11 = vVar.m();
                int m12 = vVar.m();
                int i12 = m11 - 8;
                String F = k0.F(vVar.d(), vVar.e(), i12);
                vVar.P(i12);
                i11 = (i11 - 8) - i12;
                if (m12 == 1937011815) {
                    c0811b = f.o(F);
                } else if (m12 == 1885436268) {
                    charSequence = f.q(null, F.trim(), Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c0811b != null) {
            return c0811b.m(charSequence).a();
        }
        return f.l(charSequence);
    }

    @Override // nj.d
    protected nj.f A(byte[] bArr, int i11, boolean z11) {
        this.f55918n.M(bArr, i11);
        ArrayList arrayList = new ArrayList();
        while (this.f55918n.a() > 0) {
            if (this.f55918n.a() >= 8) {
                int m11 = this.f55918n.m();
                if (this.f55918n.m() == 1987343459) {
                    arrayList.add(B(this.f55918n, m11 - 8));
                } else {
                    this.f55918n.P(m11 - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new c(arrayList);
    }
}