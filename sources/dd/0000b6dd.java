package u2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import n2.a0;
import n2.z;
import o2.p;
import t1.a1;
import t1.n;
import t1.q0;
import vz.m;
import wz.w;

/* loaded from: classes.dex */
public final class b implements n2.h {

    /* renamed from: a  reason: collision with root package name */
    private final d f53003a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53004b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f53005c;

    /* renamed from: d  reason: collision with root package name */
    private final float f53006d;

    /* renamed from: e  reason: collision with root package name */
    private final p f53007e;

    /* renamed from: f  reason: collision with root package name */
    private final List<s1.h> f53008f;

    /* renamed from: g  reason: collision with root package name */
    private final vz.k f53009g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53010a;

        static {
            int[] iArr = new int[w2.c.values().length];
            iArr[w2.c.Ltr.ordinal()] = 1;
            iArr[w2.c.Rtl.ordinal()] = 2;
            f53010a = iArr;
        }
    }

    /* renamed from: u2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C1193b extends u implements h00.a<p2.a> {
        C1193b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p2.a invoke() {
            return new p2.a(b.this.z(), b.this.f53007e.u());
        }
    }

    public b(d paragraphIntrinsics, int i11, boolean z11, float f11) {
        int d11;
        List<s1.h> list;
        s1.h hVar;
        float o11;
        float c11;
        int b11;
        float n11;
        float f12;
        float c12;
        vz.k b12;
        s.g(paragraphIntrinsics, "paragraphIntrinsics");
        this.f53003a = paragraphIntrinsics;
        this.f53004b = i11;
        this.f53005c = z11;
        this.f53006d = f11;
        if ((i11 >= 1 ? (byte) 1 : (byte) 0) != 0) {
            if ((B() >= BitmapDescriptorFactory.HUE_RED ? (byte) 1 : (byte) 0) != 0) {
                a0 e11 = paragraphIntrinsics.e();
                d11 = f.d(e11.q());
                w2.d q11 = e11.q();
                this.f53007e = new p(paragraphIntrinsics.c(), B(), A(), d11, z11 ? TextUtils.TruncateAt.END : null, paragraphIntrinsics.f(), 1.0f, BitmapDescriptorFactory.HUE_RED, false, i11, 0, 0, q11 == null ? false : w2.d.j(q11.m(), w2.d.f55400b.c()) ? 1 : 0, null, null, paragraphIntrinsics.d(), 28032, null);
                CharSequence c13 = paragraphIntrinsics.c();
                if (c13 instanceof Spanned) {
                    Object[] spans = ((Spanned) c13).getSpans(0, c13.length(), q2.f.class);
                    s.f(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                    ArrayList arrayList = new ArrayList(spans.length);
                    int length = spans.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Object obj = spans[i12];
                        i12++;
                        q2.f fVar = (q2.f) obj;
                        Spanned spanned = (Spanned) c13;
                        int spanStart = spanned.getSpanStart(fVar);
                        int spanEnd = spanned.getSpanEnd(fVar);
                        int i13 = this.f53007e.i(spanStart);
                        boolean z12 = this.f53007e.f(i13) > 0 && spanEnd > this.f53007e.g(i13);
                        boolean z13 = spanEnd > this.f53007e.h(i13);
                        if (z12 || z13) {
                            hVar = null;
                        } else {
                            int i14 = a.f53010a[s(spanStart).ordinal()];
                            if (i14 == 1) {
                                o11 = o(spanStart, true);
                            } else if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                o11 = o(spanStart, true) - fVar.d();
                            }
                            float d12 = fVar.d() + o11;
                            p pVar = this.f53007e;
                            switch (fVar.c()) {
                                case 0:
                                    c11 = pVar.c(i13);
                                    b11 = fVar.b();
                                    n11 = c11 - b11;
                                    break;
                                case 1:
                                    n11 = pVar.n(i13);
                                    break;
                                case 2:
                                    c11 = pVar.d(i13);
                                    b11 = fVar.b();
                                    n11 = c11 - b11;
                                    break;
                                case 3:
                                    n11 = ((pVar.n(i13) + pVar.d(i13)) - fVar.b()) / 2;
                                    break;
                                case 4:
                                    f12 = fVar.a().ascent;
                                    c12 = pVar.c(i13);
                                    n11 = f12 + c12;
                                    break;
                                case 5:
                                    n11 = (fVar.a().descent + pVar.c(i13)) - fVar.b();
                                    break;
                                case 6:
                                    Paint.FontMetricsInt a11 = fVar.a();
                                    f12 = ((a11.ascent + a11.descent) - fVar.b()) / 2;
                                    c12 = pVar.c(i13);
                                    n11 = f12 + c12;
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                            hVar = new s1.h(o11, n11, d12, fVar.b() + n11);
                        }
                        arrayList.add(hVar);
                    }
                    list = arrayList;
                } else {
                    list = w.i();
                }
                this.f53008f = list;
                b12 = m.b(kotlin.b.NONE, new C1193b());
                this.f53009g = b12;
                return;
            }
            throw new IllegalArgumentException("width should not be negative".toString());
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    private final p2.a C() {
        return (p2.a) this.f53009g.getValue();
    }

    public final g A() {
        return this.f53003a.g();
    }

    public float B() {
        return this.f53006d;
    }

    @Override // n2.h
    public float a() {
        return this.f53003a.a();
    }

    @Override // n2.h
    public w2.c b(int i11) {
        return this.f53007e.q(this.f53007e.i(i11)) == 1 ? w2.c.Ltr : w2.c.Rtl;
    }

    @Override // n2.h
    public float c(int i11) {
        return this.f53007e.n(i11);
    }

    @Override // n2.h
    public s1.h d(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= y().length()) {
            z11 = true;
        }
        if (z11) {
            float r11 = this.f53007e.r(i11);
            int i12 = this.f53007e.i(i11);
            return new s1.h(r11, this.f53007e.n(i12), r11, this.f53007e.d(i12));
        }
        throw new AssertionError("offset(" + i11 + ") is out of bounds (0," + y().length());
    }

    @Override // n2.h
    public long e(int i11) {
        return z.b(C().b(i11), C().a(i11));
    }

    @Override // n2.h
    public float f() {
        return this.f53007e.c(0);
    }

    @Override // n2.h
    public int g(long j11) {
        return this.f53007e.p(this.f53007e.j((int) s1.f.m(j11)), s1.f.l(j11));
    }

    @Override // n2.h
    public float getHeight() {
        return this.f53007e.b();
    }

    @Override // n2.h
    public int h(int i11) {
        return this.f53007e.m(i11);
    }

    @Override // n2.h
    public int i(int i11, boolean z11) {
        if (z11) {
            return this.f53007e.o(i11);
        }
        return this.f53007e.h(i11);
    }

    @Override // n2.h
    public int j() {
        return this.f53007e.e();
    }

    @Override // n2.h
    public float k(int i11) {
        return this.f53007e.l(i11);
    }

    @Override // n2.h
    public boolean l() {
        return this.f53007e.a();
    }

    @Override // n2.h
    public int m(float f11) {
        return this.f53007e.j((int) f11);
    }

    @Override // n2.h
    public q0 n(int i11, int i12) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11 && i12 <= y().length()) {
            Path path = new Path();
            this.f53007e.t(i11, i12, path);
            return n.b(path);
        }
        throw new AssertionError("Start(" + i11 + ") or End(" + i12 + ") is out of Range(0.." + y().length() + "), or start > end!");
    }

    @Override // n2.h
    public float o(int i11, boolean z11) {
        if (z11) {
            return this.f53007e.r(i11);
        }
        return this.f53007e.s(i11);
    }

    @Override // n2.h
    public float p(int i11) {
        return this.f53007e.k(i11);
    }

    @Override // n2.h
    public float q() {
        if (this.f53004b < j()) {
            return this.f53007e.c(this.f53004b - 1);
        }
        return this.f53007e.c(j() - 1);
    }

    @Override // n2.h
    public int r(int i11) {
        return this.f53007e.i(i11);
    }

    @Override // n2.h
    public w2.c s(int i11) {
        if (this.f53007e.v(i11)) {
            return w2.c.Rtl;
        }
        return w2.c.Ltr;
    }

    @Override // n2.h
    public float t(int i11) {
        return this.f53007e.d(i11);
    }

    @Override // n2.h
    public s1.h u(int i11) {
        float r11 = this.f53007e.r(i11);
        float r12 = this.f53007e.r(i11 + 1);
        int i12 = this.f53007e.i(i11);
        return new s1.h(r11, this.f53007e.n(i12), r12, this.f53007e.d(i12));
    }

    @Override // n2.h
    public List<s1.h> v() {
        return this.f53008f;
    }

    @Override // n2.h
    public void w(t1.u canvas, long j11, a1 a1Var, w2.e eVar) {
        s.g(canvas, "canvas");
        A().a(j11);
        A().b(a1Var);
        A().c(eVar);
        Canvas c11 = t1.c.c(canvas);
        if (l()) {
            c11.save();
            c11.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, B(), getHeight());
        }
        this.f53007e.w(c11);
        if (l()) {
            c11.restore();
        }
    }

    public final CharSequence y() {
        return this.f53003a.c();
    }

    public final Locale z() {
        Locale textLocale = this.f53003a.g().getTextLocale();
        s.f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }
}