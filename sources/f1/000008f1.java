package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class e extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f6099d = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: e  reason: collision with root package name */
    private static final Property<C0108e, float[]> f6100e = new a(float[].class, "nonTranslations");

    /* renamed from: f  reason: collision with root package name */
    private static final Property<C0108e, PointF> f6101f = new b(PointF.class, "translations");

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f6102g;

    /* renamed from: a  reason: collision with root package name */
    boolean f6103a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6104b = true;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f6105c = new Matrix();

    /* loaded from: classes.dex */
    class a extends Property<C0108e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(C0108e c0108e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0108e c0108e, float[] fArr) {
            c0108e.d(fArr);
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<C0108e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C0108e c0108e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0108e c0108e, PointF pointF) {
            c0108e.c(pointF);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6106a;

        /* renamed from: b  reason: collision with root package name */
        private Matrix f6107b = new Matrix();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6108c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f6109d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f6110e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f6111f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C0108e f6112g;

        c(boolean z11, Matrix matrix, View view, f fVar, C0108e c0108e) {
            this.f6108c = z11;
            this.f6109d = matrix;
            this.f6110e = view;
            this.f6111f = fVar;
            this.f6112g = c0108e;
        }

        private void a(Matrix matrix) {
            this.f6107b.set(matrix);
            this.f6110e.setTag(s.f6215i, this.f6107b);
            this.f6111f.a(this.f6110e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6106a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f6106a) {
                if (this.f6108c && e.this.f6103a) {
                    a(this.f6109d);
                } else {
                    this.f6110e.setTag(s.f6215i, null);
                    this.f6110e.setTag(s.f6209c, null);
                }
            }
            p0.f(this.f6110e, null);
            this.f6111f.a(this.f6110e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f6112g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            e.d(this.f6110e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends z {

        /* renamed from: a  reason: collision with root package name */
        private View f6114a;

        /* renamed from: b  reason: collision with root package name */
        private i f6115b;

        d(View view, i iVar) {
            this.f6114a = view;
            this.f6115b = iVar;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            yVar.removeListener(this);
            m.b(this.f6114a);
            this.f6114a.setTag(s.f6215i, null);
            this.f6114a.setTag(s.f6209c, null);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionPause(y yVar) {
            this.f6115b.setVisibility(4);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionResume(y yVar) {
            this.f6115b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0108e {

        /* renamed from: a  reason: collision with root package name */
        private final Matrix f6116a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        private final View f6117b;

        /* renamed from: c  reason: collision with root package name */
        private final float[] f6118c;

        /* renamed from: d  reason: collision with root package name */
        private float f6119d;

        /* renamed from: e  reason: collision with root package name */
        private float f6120e;

        C0108e(View view, float[] fArr) {
            this.f6117b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f6118c = fArr2;
            this.f6119d = fArr2[2];
            this.f6120e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f6118c;
            fArr[2] = this.f6119d;
            fArr[5] = this.f6120e;
            this.f6116a.setValues(fArr);
            p0.f(this.f6117b, this.f6116a);
        }

        Matrix a() {
            return this.f6116a;
        }

        void c(PointF pointF) {
            this.f6119d = pointF.x;
            this.f6120e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f6118c, 0, fArr.length);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final float f6121a;

        /* renamed from: b  reason: collision with root package name */
        final float f6122b;

        /* renamed from: c  reason: collision with root package name */
        final float f6123c;

        /* renamed from: d  reason: collision with root package name */
        final float f6124d;

        /* renamed from: e  reason: collision with root package name */
        final float f6125e;

        /* renamed from: f  reason: collision with root package name */
        final float f6126f;

        /* renamed from: g  reason: collision with root package name */
        final float f6127g;

        /* renamed from: h  reason: collision with root package name */
        final float f6128h;

        f(View view) {
            this.f6121a = view.getTranslationX();
            this.f6122b = view.getTranslationY();
            this.f6123c = androidx.core.view.a0.P(view);
            this.f6124d = view.getScaleX();
            this.f6125e = view.getScaleY();
            this.f6126f = view.getRotationX();
            this.f6127g = view.getRotationY();
            this.f6128h = view.getRotation();
        }

        public void a(View view) {
            e.g(view, this.f6121a, this.f6122b, this.f6123c, this.f6124d, this.f6125e, this.f6126f, this.f6127g, this.f6128h);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return fVar.f6121a == this.f6121a && fVar.f6122b == this.f6122b && fVar.f6123c == this.f6123c && fVar.f6124d == this.f6124d && fVar.f6125e == this.f6125e && fVar.f6126f == this.f6126f && fVar.f6127g == this.f6127g && fVar.f6128h == this.f6128h;
            }
            return false;
        }

        public int hashCode() {
            float f11 = this.f6121a;
            int floatToIntBits = (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0) * 31;
            float f12 = this.f6122b;
            int floatToIntBits2 = (floatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f6123c;
            int floatToIntBits3 = (floatToIntBits2 + (f13 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f6124d;
            int floatToIntBits4 = (floatToIntBits3 + (f14 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f6125e;
            int floatToIntBits5 = (floatToIntBits4 + (f15 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f6126f;
            int floatToIntBits6 = (floatToIntBits5 + (f16 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f6127g;
            int floatToIntBits7 = (floatToIntBits6 + (f17 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f17) : 0)) * 31;
            float f18 = this.f6128h;
            return floatToIntBits7 + (f18 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f18) : 0);
        }
    }

    static {
        f6102g = Build.VERSION.SDK_INT >= 21;
    }

    private void a(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        View view = e0Var2.f6130b;
        Matrix matrix = new Matrix((Matrix) e0Var2.f6129a.get("android:changeTransform:parentMatrix"));
        p0.k(viewGroup, matrix);
        i a11 = m.a(view, viewGroup, matrix);
        if (a11 == null) {
            return;
        }
        a11.a((ViewGroup) e0Var.f6129a.get("android:changeTransform:parent"), e0Var.f6130b);
        y yVar = this;
        while (true) {
            y yVar2 = yVar.mParent;
            if (yVar2 == null) {
                break;
            }
            yVar = yVar2;
        }
        yVar.addListener(new d(view, a11));
        if (f6102g) {
            View view2 = e0Var.f6130b;
            if (view2 != e0Var2.f6130b) {
                p0.h(view2, BitmapDescriptorFactory.HUE_RED);
            }
            p0.h(view, 1.0f);
        }
    }

    private ObjectAnimator b(e0 e0Var, e0 e0Var2, boolean z11) {
        Matrix matrix = (Matrix) e0Var.f6129a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) e0Var2.f6129a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = n.f6193a;
        }
        if (matrix2 == null) {
            matrix2 = n.f6193a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) e0Var2.f6129a.get("android:changeTransform:transforms");
        View view = e0Var2.f6130b;
        d(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C0108e c0108e = new C0108e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c0108e, PropertyValuesHolder.ofObject(f6100e, new g(new float[9]), fArr, fArr2), r.a(f6101f, getPathMotion().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z11, matrix3, view, fVar, c0108e);
        ofPropertyValuesHolder.addListener(cVar);
        androidx.transition.a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.f6130b) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.e0 r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f6130b
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.e.c(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    private void captureValues(e0 e0Var) {
        View view = e0Var.f6130b;
        if (view.getVisibility() == 8) {
            return;
        }
        e0Var.f6129a.put("android:changeTransform:parent", view.getParent());
        e0Var.f6129a.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        e0Var.f6129a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f6104b) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            p0.j(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            e0Var.f6129a.put("android:changeTransform:parentMatrix", matrix2);
            e0Var.f6129a.put("android:changeTransform:intermediateMatrix", view.getTag(s.f6215i));
            e0Var.f6129a.put("android:changeTransform:intermediateParentMatrix", view.getTag(s.f6209c));
        }
    }

    static void d(View view) {
        g(view, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private void e(e0 e0Var, e0 e0Var2) {
        Matrix matrix = (Matrix) e0Var2.f6129a.get("android:changeTransform:parentMatrix");
        e0Var2.f6130b.setTag(s.f6209c, matrix);
        Matrix matrix2 = this.f6105c;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) e0Var.f6129a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            e0Var.f6129a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) e0Var.f6129a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void g(View view, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        androidx.core.view.a0.O0(view, f13);
        view.setScaleX(f14);
        view.setScaleY(f15);
        view.setRotationX(f16);
        view.setRotationY(f17);
        view.setRotation(f18);
    }

    @Override // androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        captureValues(e0Var);
    }

    @Override // androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        captureValues(e0Var);
        if (f6102g) {
            return;
        }
        ((ViewGroup) e0Var.f6130b.getParent()).startViewTransition(e0Var.f6130b);
    }

    @Override // androidx.transition.y
    public Animator createAnimator(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        if (e0Var == null || e0Var2 == null || !e0Var.f6129a.containsKey("android:changeTransform:parent") || !e0Var2.f6129a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) e0Var.f6129a.get("android:changeTransform:parent");
        boolean z11 = this.f6104b && !c(viewGroup2, (ViewGroup) e0Var2.f6129a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) e0Var.f6129a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            e0Var.f6129a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) e0Var.f6129a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            e0Var.f6129a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z11) {
            e(e0Var, e0Var2);
        }
        ObjectAnimator b11 = b(e0Var, e0Var2, z11);
        if (z11 && b11 != null && this.f6103a) {
            a(viewGroup, e0Var, e0Var2);
        } else if (!f6102g) {
            viewGroup2.endViewTransition(e0Var.f6130b);
        }
        return b11;
    }

    public void f(boolean z11) {
        this.f6104b = z11;
    }

    @Override // androidx.transition.y
    public String[] getTransitionProperties() {
        return f6099d;
    }
}