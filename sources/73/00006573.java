package d8;

import a8.b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import b8.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.core.networking.FileUploadRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v7.j;
import y7.o;
import y7.q;

/* loaded from: classes.dex */
public class i extends d8.b {
    private final StringBuilder B;
    private final RectF C;
    private final Matrix D;
    private final Paint E;
    private final Paint F;
    private final Map<a8.d, List<x7.d>> G;
    private final androidx.collection.d<String> H;
    private final o I;
    private final com.airbnb.lottie.a J;
    private final v7.d K;
    private y7.a<Integer, Integer> L;
    private y7.a<Integer, Integer> M;
    private y7.a<Integer, Integer> N;
    private y7.a<Integer, Integer> O;
    private y7.a<Float, Float> P;
    private y7.a<Float, Float> Q;
    private y7.a<Float, Float> R;
    private y7.a<Float, Float> S;
    private y7.a<Float, Float> T;
    private y7.a<Typeface, Typeface> U;

    /* loaded from: classes.dex */
    class a extends Paint {
        a(i iVar, int i11) {
            super(i11);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    class b extends Paint {
        b(i iVar, int i11) {
            super(i11);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23830a;

        static {
            int[] iArr = new int[b.a.values().length];
            f23830a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23830a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23830a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
        b8.b bVar;
        b8.b bVar2;
        b8.a aVar2;
        b8.a aVar3;
        this.B = new StringBuilder(2);
        this.C = new RectF();
        this.D = new Matrix();
        this.E = new a(this, 1);
        this.F = new b(this, 1);
        this.G = new HashMap();
        this.H = new androidx.collection.d<>();
        this.J = aVar;
        this.K = eVar.b();
        o l11 = eVar.s().l();
        this.I = l11;
        l11.a(this);
        h(l11);
        k t11 = eVar.t();
        if (t11 != null && (aVar3 = t11.f7545a) != null) {
            y7.a<Integer, Integer> l12 = aVar3.l();
            this.L = l12;
            l12.a(this);
            h(this.L);
        }
        if (t11 != null && (aVar2 = t11.f7546b) != null) {
            y7.a<Integer, Integer> l13 = aVar2.l();
            this.N = l13;
            l13.a(this);
            h(this.N);
        }
        if (t11 != null && (bVar2 = t11.f7547c) != null) {
            y7.a<Float, Float> l14 = bVar2.l();
            this.P = l14;
            l14.a(this);
            h(this.P);
        }
        if (t11 == null || (bVar = t11.f7548d) == null) {
            return;
        }
        y7.a<Float, Float> l15 = bVar.l();
        this.R = l15;
        l15.a(this);
        h(this.R);
    }

    private void N(b.a aVar, Canvas canvas, float f11) {
        int i11 = c.f23830a[aVar.ordinal()];
        if (i11 == 2) {
            canvas.translate(-f11, BitmapDescriptorFactory.HUE_RED);
        } else if (i11 != 3) {
        } else {
            canvas.translate((-f11) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private String O(String str, int i11) {
        int codePointAt = str.codePointAt(i11);
        int charCount = Character.charCount(codePointAt) + i11;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!b0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j11 = codePointAt;
        if (this.H.d(j11)) {
            return this.H.f(j11);
        }
        this.B.setLength(0);
        while (i11 < charCount) {
            int codePointAt3 = str.codePointAt(i11);
            this.B.appendCodePoint(codePointAt3);
            i11 += Character.charCount(codePointAt3);
        }
        String sb2 = this.B.toString();
        this.H.j(j11, sb2);
        return sb2;
    }

    private void P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    private void Q(a8.d dVar, Matrix matrix, float f11, a8.b bVar, Canvas canvas) {
        List<x7.d> X = X(dVar);
        for (int i11 = 0; i11 < X.size(); i11++) {
            Path path = X.get(i11).getPath();
            path.computeBounds(this.C, false);
            this.D.set(matrix);
            this.D.preTranslate(BitmapDescriptorFactory.HUE_RED, (-bVar.f328g) * h8.h.e());
            this.D.preScale(f11, f11);
            path.transform(this.D);
            if (bVar.f332k) {
                T(path, this.E, canvas);
                T(path, this.F, canvas);
            } else {
                T(path, this.F, canvas);
                T(path, this.E, canvas);
            }
        }
    }

    private void R(String str, a8.b bVar, Canvas canvas) {
        if (bVar.f332k) {
            P(str, this.E, canvas);
            P(str, this.F, canvas);
            return;
        }
        P(str, this.F, canvas);
        P(str, this.E, canvas);
    }

    private void S(String str, a8.b bVar, Canvas canvas, float f11) {
        int i11 = 0;
        while (i11 < str.length()) {
            String O = O(str, i11);
            i11 += O.length();
            R(O, bVar, canvas);
            canvas.translate(this.E.measureText(O) + f11, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void U(String str, a8.b bVar, Matrix matrix, a8.c cVar, Canvas canvas, float f11, float f12) {
        float floatValue;
        for (int i11 = 0; i11 < str.length(); i11++) {
            a8.d g11 = this.K.c().g(a8.d.c(str.charAt(i11), cVar.a(), cVar.c()));
            if (g11 != null) {
                Q(g11, matrix, f12, bVar, canvas);
                float b11 = ((float) g11.b()) * f12 * h8.h.e() * f11;
                float f13 = bVar.f326e / 10.0f;
                y7.a<Float, Float> aVar = this.S;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    y7.a<Float, Float> aVar2 = this.R;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(b11 + (f13 * f11), BitmapDescriptorFactory.HUE_RED);
                }
                f13 += floatValue;
                canvas.translate(b11 + (f13 * f11), BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private void V(a8.b bVar, Matrix matrix, a8.c cVar, Canvas canvas) {
        float f11;
        y7.a<Float, Float> aVar = this.T;
        if (aVar != null) {
            f11 = aVar.h().floatValue();
        } else {
            f11 = bVar.f324c;
        }
        float f12 = f11 / 100.0f;
        float g11 = h8.h.g(matrix);
        String str = bVar.f322a;
        float e11 = bVar.f327f * h8.h.e();
        List<String> Z = Z(str);
        int size = Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = Z.get(i11);
            float Y = Y(str2, cVar, f12, g11);
            canvas.save();
            N(bVar.f325d, canvas, Y);
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (i11 * e11) - (((size - 1) * e11) / 2.0f));
            U(str2, bVar, matrix, cVar, canvas, g11, f12);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[LOOP:0: B:17:0x0082->B:18:0x0084, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void W(a8.b r8, a8.c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.a0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f322a
            com.airbnb.lottie.a r1 = r7.J
            r1.G()
            android.graphics.Paint r1 = r7.E
            r1.setTypeface(r9)
            y7.a<java.lang.Float, java.lang.Float> r9 = r7.T
            if (r9 == 0) goto L22
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L24
        L22:
            float r9 = r8.f324c
        L24:
            android.graphics.Paint r1 = r7.E
            float r2 = h8.h.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.F
            android.graphics.Paint r2 = r7.E
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.F
            android.graphics.Paint r2 = r7.E
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f327f
            float r2 = h8.h.e()
            float r1 = r1 * r2
            int r2 = r8.f326e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            y7.a<java.lang.Float, java.lang.Float> r3 = r7.S
            if (r3 == 0) goto L61
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L5f:
            float r2 = r2 + r3
            goto L70
        L61:
            y7.a<java.lang.Float, java.lang.Float> r3 = r7.R
            if (r3 == 0) goto L70
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L5f
        L70:
            float r3 = h8.h.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.Z(r0)
            int r0 = r9.size()
            r3 = 0
        L82:
            if (r3 >= r0) goto Lb8
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.F
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            a8.b$a r6 = r8.f325d
            r7.N(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.S(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L82
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.i.W(a8.b, a8.c, android.graphics.Canvas):void");
    }

    private List<x7.d> X(a8.d dVar) {
        if (this.G.containsKey(dVar)) {
            return this.G.get(dVar);
        }
        List<c8.o> a11 = dVar.a();
        int size = a11.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new x7.d(this.J, this, a11.get(i11)));
        }
        this.G.put(dVar, arrayList);
        return arrayList;
    }

    private float Y(String str, a8.c cVar, float f11, float f12) {
        float f13 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < str.length(); i11++) {
            a8.d g11 = this.K.c().g(a8.d.c(str.charAt(i11), cVar.a(), cVar.c()));
            if (g11 != null) {
                f13 = (float) (f13 + (g11.b() * f11 * h8.h.e() * f12));
            }
        }
        return f13;
    }

    private List<String> Z(String str) {
        return Arrays.asList(str.replaceAll(FileUploadRequest.LINE_BREAK, "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface a0(a8.c cVar) {
        Typeface h11;
        y7.a<Typeface, Typeface> aVar = this.U;
        if (aVar == null || (h11 = aVar.h()) == null) {
            Typeface H = this.J.H(cVar.a(), cVar.c());
            return H != null ? H : cVar.d();
        }
        return h11;
    }

    private boolean b0(int i11) {
        return Character.getType(i11) == 16 || Character.getType(i11) == 27 || Character.getType(i11) == 6 || Character.getType(i11) == 28 || Character.getType(i11) == 19;
    }

    @Override // d8.b, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == j.f54280a) {
            y7.a<Integer, Integer> aVar = this.M;
            if (aVar != null) {
                F(aVar);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            q qVar = new q(cVar);
            this.M = qVar;
            qVar.a(this);
            h(this.M);
        } else if (t11 == j.f54281b) {
            y7.a<Integer, Integer> aVar2 = this.O;
            if (aVar2 != null) {
                F(aVar2);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.O = qVar2;
            qVar2.a(this);
            h(this.O);
        } else if (t11 == j.f54298s) {
            y7.a<Float, Float> aVar3 = this.Q;
            if (aVar3 != null) {
                F(aVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.Q = qVar3;
            qVar3.a(this);
            h(this.Q);
        } else if (t11 == j.f54299t) {
            y7.a<Float, Float> aVar4 = this.S;
            if (aVar4 != null) {
                F(aVar4);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.S = qVar4;
            qVar4.a(this);
            h(this.S);
        } else if (t11 == j.F) {
            y7.a<Float, Float> aVar5 = this.T;
            if (aVar5 != null) {
                F(aVar5);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.T = qVar5;
            qVar5.a(this);
            h(this.T);
        } else if (t11 == j.M) {
            y7.a<Typeface, Typeface> aVar6 = this.U;
            if (aVar6 != null) {
                F(aVar6);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            q qVar6 = new q(cVar);
            this.U = qVar6;
            qVar6.a(this);
            h(this.U);
        }
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.K.b().width(), this.K.b().height());
    }

    @Override // d8.b
    void s(Canvas canvas, Matrix matrix, int i11) {
        canvas.save();
        if (!this.J.p0()) {
            canvas.concat(matrix);
        }
        a8.b h11 = this.I.h();
        a8.c cVar = this.K.g().get(h11.f323b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        y7.a<Integer, Integer> aVar = this.M;
        if (aVar != null) {
            this.E.setColor(aVar.h().intValue());
        } else {
            y7.a<Integer, Integer> aVar2 = this.L;
            if (aVar2 != null) {
                this.E.setColor(aVar2.h().intValue());
            } else {
                this.E.setColor(h11.f329h);
            }
        }
        y7.a<Integer, Integer> aVar3 = this.O;
        if (aVar3 != null) {
            this.F.setColor(aVar3.h().intValue());
        } else {
            y7.a<Integer, Integer> aVar4 = this.N;
            if (aVar4 != null) {
                this.F.setColor(aVar4.h().intValue());
            } else {
                this.F.setColor(h11.f330i);
            }
        }
        int intValue = ((this.f23798v.h() == null ? 100 : this.f23798v.h().h().intValue()) * 255) / 100;
        this.E.setAlpha(intValue);
        this.F.setAlpha(intValue);
        y7.a<Float, Float> aVar5 = this.Q;
        if (aVar5 != null) {
            this.F.setStrokeWidth(aVar5.h().floatValue());
        } else {
            y7.a<Float, Float> aVar6 = this.P;
            if (aVar6 != null) {
                this.F.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.F.setStrokeWidth(h11.f331j * h8.h.e() * h8.h.g(matrix));
            }
        }
        if (this.J.p0()) {
            V(h11, matrix, cVar, canvas);
        } else {
            W(h11, cVar, canvas);
        }
        canvas.restore();
    }
}