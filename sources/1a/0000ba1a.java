package vj;

import ak.k0;
import ak.o;
import ak.v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.f;
import java.util.List;
import nj.b;
import nj.d;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: n  reason: collision with root package name */
    private final v f54496n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f54497o;

    /* renamed from: p  reason: collision with root package name */
    private final int f54498p;

    /* renamed from: q  reason: collision with root package name */
    private final int f54499q;

    /* renamed from: r  reason: collision with root package name */
    private final String f54500r;

    /* renamed from: s  reason: collision with root package name */
    private final float f54501s;

    /* renamed from: t  reason: collision with root package name */
    private final int f54502t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f54496n = new v();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f54498p = bArr[24];
            this.f54499q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f54500r = "Serif".equals(k0.F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i11 = bArr[25] * 20;
            this.f54502t = i11;
            boolean z11 = (bArr[0] & 32) != 0;
            this.f54497o = z11;
            if (z11) {
                this.f54501s = k0.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, BitmapDescriptorFactory.HUE_RED, 0.95f);
                return;
            } else {
                this.f54501s = 0.85f;
                return;
            }
        }
        this.f54498p = 0;
        this.f54499q = -1;
        this.f54500r = "sans-serif";
        this.f54497o = false;
        this.f54501s = 0.85f;
        this.f54502t = -1;
    }

    private void B(v vVar, SpannableStringBuilder spannableStringBuilder) {
        int i11;
        C(vVar.a() >= 12);
        int I = vVar.I();
        int I2 = vVar.I();
        vVar.P(2);
        int C = vVar.C();
        vVar.P(1);
        int m11 = vVar.m();
        if (I2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("Truncating styl end (");
            sb2.append(I2);
            sb2.append(") to cueText.length() (");
            sb2.append(length);
            sb2.append(").");
            o.h("Tx3gDecoder", sb2.toString());
            i11 = spannableStringBuilder.length();
        } else {
            i11 = I2;
        }
        if (I >= i11) {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("Ignoring styl with start (");
            sb3.append(I);
            sb3.append(") >= end (");
            sb3.append(i11);
            sb3.append(").");
            o.h("Tx3gDecoder", sb3.toString());
            return;
        }
        int i12 = i11;
        E(spannableStringBuilder, C, this.f54498p, I, i12, 0);
        D(spannableStringBuilder, m11, this.f54499q, I, i12, 0);
    }

    private static void C(boolean z11) {
        if (!z11) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            int i16 = i15 | 33;
            boolean z11 = (i11 & 1) != 0;
            boolean z12 = (i11 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i13, i14, i16);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i13, i14, i16);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, i16);
            }
            boolean z13 = (i11 & 4) != 0;
            if (z13) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, i16);
            }
            if (z13 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i13, i14, i16);
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i11, i12, 16711713);
        }
    }

    private static String G(v vVar) {
        char g11;
        C(vVar.a() >= 2);
        int I = vVar.I();
        if (I == 0) {
            return "";
        }
        if (vVar.a() >= 2 && ((g11 = vVar.g()) == 65279 || g11 == 65534)) {
            return vVar.A(I, f.f15922e);
        }
        return vVar.A(I, f.f15920c);
    }

    @Override // nj.d
    protected nj.f A(byte[] bArr, int i11, boolean z11) {
        this.f54496n.M(bArr, i11);
        String G = G(this.f54496n);
        if (G.isEmpty()) {
            return b.f54503b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        E(spannableStringBuilder, this.f54498p, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f54499q, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f54500r, 0, spannableStringBuilder.length());
        float f11 = this.f54501s;
        while (this.f54496n.a() >= 8) {
            int e11 = this.f54496n.e();
            int m11 = this.f54496n.m();
            int m12 = this.f54496n.m();
            if (m12 == 1937013100) {
                C(this.f54496n.a() >= 2);
                int I = this.f54496n.I();
                for (int i12 = 0; i12 < I; i12++) {
                    B(this.f54496n, spannableStringBuilder);
                }
            } else if (m12 == 1952608120 && this.f54497o) {
                C(this.f54496n.a() >= 2);
                f11 = k0.q(this.f54496n.I() / this.f54502t, BitmapDescriptorFactory.HUE_RED, 0.95f);
            }
            this.f54496n.O(e11 + m11);
        }
        return new b(new b.C0811b().m(spannableStringBuilder).h(f11, 0).i(0).a());
    }
}