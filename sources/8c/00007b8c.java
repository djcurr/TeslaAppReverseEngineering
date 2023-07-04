package je;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class q {

    /* loaded from: classes3.dex */
    public static abstract class a implements c {
        @Override // je.q.c
        public Matrix a(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12) {
            b(matrix, rect, i11, i12, f11, f12, rect.width() / i11, rect.height() / i12);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14);
    }

    /* loaded from: classes3.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f33449a = l.f33463g;

        /* renamed from: b  reason: collision with root package name */
        public static final c f33450b;

        /* renamed from: c  reason: collision with root package name */
        public static final c f33451c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f33452d;

        /* renamed from: e  reason: collision with root package name */
        public static final c f33453e;

        /* renamed from: f  reason: collision with root package name */
        public static final c f33454f;

        static {
            c cVar = k.f33462g;
            c cVar2 = m.f33464g;
            c cVar3 = j.f33461g;
            f33450b = h.f33459g;
            c cVar4 = i.f33460g;
            f33451c = d.f33455g;
            f33452d = f.f33457g;
            f33453e = e.f33456g;
            f33454f = n.f33465g;
            c cVar5 = g.f33458g;
        }

        Matrix a(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12);
    }

    /* loaded from: classes3.dex */
    private static class d extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33455g = new d();

        private d() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i11) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i12) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* loaded from: classes3.dex */
    private static class e extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33456g = new e();

        private e() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float height;
            float f15;
            if (f14 > f13) {
                f15 = rect.left + ((rect.width() - (i11 * f14)) * 0.5f);
                height = rect.top;
                f13 = f14;
            } else {
                height = ((rect.height() - (i12 * f13)) * 0.5f) + rect.top;
                f15 = rect.left;
            }
            matrix.setScale(f13, f13);
            matrix.postTranslate((int) (f15 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* loaded from: classes3.dex */
    private static class f extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33457g = new f();

        private f() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float min = Math.min(Math.min(f13, f14), 1.0f);
            float width = rect.left + ((rect.width() - (i11 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i12 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* loaded from: classes3.dex */
    private static class g extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33458g = new g();

        private g() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float min = Math.min(f13, f14);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i12 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* loaded from: classes3.dex */
    private static class h extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33459g = new h();

        private h() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float min = Math.min(f13, f14);
            float width = rect.left + ((rect.width() - (i11 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i12 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* loaded from: classes3.dex */
    private static class i extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33460g = new i();

        private i() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float min = Math.min(f13, f14);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i11 * min)) + 0.5f), (int) (rect.top + (rect.height() - (i12 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* loaded from: classes3.dex */
    private static class j extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33461g = new j();

        private j() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float min = Math.min(f13, f14);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* loaded from: classes3.dex */
    private static class k extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33462g = new k();

        private k() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float height = rect.top + ((rect.height() - (i12 * f13)) * 0.5f);
            matrix.setScale(f13, f13);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* loaded from: classes3.dex */
    private static class l extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33463g = new l();

        private l() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            matrix.setScale(f13, f14);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* loaded from: classes3.dex */
    private static class m extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33464g = new m();

        private m() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            matrix.setScale(f14, f14);
            matrix.postTranslate((int) (rect.left + ((rect.width() - (i11 * f14)) * 0.5f) + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* loaded from: classes3.dex */
    private static class n extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final c f33465g = new n();

        private n() {
        }

        @Override // je.q.a
        public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
            float f15;
            float max;
            if (f14 > f13) {
                float f16 = i11 * f14;
                f15 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f11 * f16), (float) BitmapDescriptorFactory.HUE_RED), rect.width() - f16);
                max = rect.top;
                f13 = f14;
            } else {
                f15 = rect.left;
                float f17 = i12 * f13;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f12 * f17), (float) BitmapDescriptorFactory.HUE_RED), rect.height() - f17) + rect.top;
            }
            matrix.setScale(f13, f13);
            matrix.postTranslate((int) (f15 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* loaded from: classes3.dex */
    public interface o {
        Object getState();
    }

    public static p a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof p) {
            return (p) drawable;
        }
        if (drawable instanceof je.c) {
            return a(((je.c) drawable).r());
        }
        if (drawable instanceof je.a) {
            je.a aVar = (je.a) drawable;
            int e11 = aVar.e();
            for (int i11 = 0; i11 < e11; i11++) {
                p a11 = a(aVar.b(i11));
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static class b implements c, o {

        /* renamed from: g  reason: collision with root package name */
        private final c f33439g;

        /* renamed from: h  reason: collision with root package name */
        private final c f33440h;

        /* renamed from: i  reason: collision with root package name */
        private final Rect f33441i;

        /* renamed from: j  reason: collision with root package name */
        private final Rect f33442j;

        /* renamed from: k  reason: collision with root package name */
        private final PointF f33443k;

        /* renamed from: l  reason: collision with root package name */
        private final PointF f33444l;

        /* renamed from: m  reason: collision with root package name */
        private final float[] f33445m;

        /* renamed from: n  reason: collision with root package name */
        private final float[] f33446n;

        /* renamed from: o  reason: collision with root package name */
        private final float[] f33447o;

        /* renamed from: p  reason: collision with root package name */
        private float f33448p;

        public b(c cVar, c cVar2, Rect rect, Rect rect2, PointF pointF, PointF pointF2) {
            this.f33445m = new float[9];
            this.f33446n = new float[9];
            this.f33447o = new float[9];
            this.f33439g = cVar;
            this.f33440h = cVar2;
            this.f33441i = rect;
            this.f33442j = rect2;
            this.f33443k = pointF;
            this.f33444l = pointF2;
        }

        @Override // je.q.c
        public Matrix a(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12) {
            Rect rect2 = this.f33441i;
            Rect rect3 = rect2 != null ? rect2 : rect;
            Rect rect4 = this.f33442j;
            Rect rect5 = rect4 != null ? rect4 : rect;
            c cVar = this.f33439g;
            PointF pointF = this.f33443k;
            cVar.a(matrix, rect3, i11, i12, pointF == null ? f11 : pointF.x, pointF == null ? f12 : pointF.y);
            matrix.getValues(this.f33445m);
            c cVar2 = this.f33440h;
            PointF pointF2 = this.f33444l;
            cVar2.a(matrix, rect5, i11, i12, pointF2 == null ? f11 : pointF2.x, pointF2 == null ? f12 : pointF2.y);
            matrix.getValues(this.f33446n);
            for (int i13 = 0; i13 < 9; i13++) {
                float[] fArr = this.f33447o;
                float f13 = this.f33445m[i13];
                float f14 = this.f33448p;
                fArr[i13] = (f13 * (1.0f - f14)) + (this.f33446n[i13] * f14);
            }
            matrix.setValues(this.f33447o);
            return matrix;
        }

        public void b(float f11) {
            this.f33448p = f11;
        }

        @Override // je.q.o
        public Object getState() {
            return Float.valueOf(this.f33448p);
        }

        public String toString() {
            return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", String.valueOf(this.f33439g), String.valueOf(this.f33443k), String.valueOf(this.f33440h), String.valueOf(this.f33444l));
        }

        public b(c cVar, c cVar2, Rect rect, Rect rect2) {
            this(cVar, cVar2, rect, rect2, null, null);
        }
    }
}