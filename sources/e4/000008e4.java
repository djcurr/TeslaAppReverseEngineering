package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f6063d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: e  reason: collision with root package name */
    private static final Property<Drawable, PointF> f6064e = new b(PointF.class, "boundsOrigin");

    /* renamed from: f  reason: collision with root package name */
    private static final Property<k, PointF> f6065f = new c(PointF.class, "topLeft");

    /* renamed from: g  reason: collision with root package name */
    private static final Property<k, PointF> f6066g = new C0107d(PointF.class, "bottomRight");

    /* renamed from: h  reason: collision with root package name */
    private static final Property<View, PointF> f6067h = new e(PointF.class, "bottomRight");

    /* renamed from: i  reason: collision with root package name */
    private static final Property<View, PointF> f6068i = new f(PointF.class, "topLeft");

    /* renamed from: j  reason: collision with root package name */
    private static final Property<View, PointF> f6069j = new g(PointF.class, "position");

    /* renamed from: k  reason: collision with root package name */
    private static t f6070k = new t();

    /* renamed from: a  reason: collision with root package name */
    private int[] f6071a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    private boolean f6072b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6073c = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f6074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f6075b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6076c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f6077d;

        a(d dVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f11) {
            this.f6074a = viewGroup;
            this.f6075b = bitmapDrawable;
            this.f6076c = view;
            this.f6077d = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.b(this.f6074a).b(this.f6075b);
            p0.h(this.f6076c, this.f6077d);
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f6078a;

        b(Class cls, String str) {
            super(cls, str);
            this.f6078a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6078a);
            Rect rect = this.f6078a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6078a);
            this.f6078a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6078a);
        }
    }

    /* loaded from: classes.dex */
    class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: androidx.transition.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0107d extends Property<k, PointF> {
        C0107d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            p0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            p0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            p0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f6079a;
        private k mViewBounds;

        h(d dVar, k kVar) {
            this.f6079a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f6082c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6083d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6084e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6085f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f6086g;

        i(d dVar, View view, Rect rect, int i11, int i12, int i13, int i14) {
            this.f6081b = view;
            this.f6082c = rect;
            this.f6083d = i11;
            this.f6084e = i12;
            this.f6085f = i13;
            this.f6086g = i14;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6080a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6080a) {
                return;
            }
            androidx.core.view.a0.C0(this.f6081b, this.f6082c);
            p0.g(this.f6081b, this.f6083d, this.f6084e, this.f6085f, this.f6086g);
        }
    }

    /* loaded from: classes.dex */
    class j extends z {

        /* renamed from: a  reason: collision with root package name */
        boolean f6087a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f6088b;

        j(d dVar, ViewGroup viewGroup) {
            this.f6088b = viewGroup;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionCancel(y yVar) {
            k0.d(this.f6088b, false);
            this.f6087a = true;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            if (!this.f6087a) {
                k0.d(this.f6088b, false);
            }
            yVar.removeListener(this);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionPause(y yVar) {
            k0.d(this.f6088b, false);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionResume(y yVar) {
            k0.d(this.f6088b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f6089a;

        /* renamed from: b  reason: collision with root package name */
        private int f6090b;

        /* renamed from: c  reason: collision with root package name */
        private int f6091c;

        /* renamed from: d  reason: collision with root package name */
        private int f6092d;

        /* renamed from: e  reason: collision with root package name */
        private View f6093e;

        /* renamed from: f  reason: collision with root package name */
        private int f6094f;

        /* renamed from: g  reason: collision with root package name */
        private int f6095g;

        k(View view) {
            this.f6093e = view;
        }

        private void b() {
            p0.g(this.f6093e, this.f6089a, this.f6090b, this.f6091c, this.f6092d);
            this.f6094f = 0;
            this.f6095g = 0;
        }

        void a(PointF pointF) {
            this.f6091c = Math.round(pointF.x);
            this.f6092d = Math.round(pointF.y);
            int i11 = this.f6095g + 1;
            this.f6095g = i11;
            if (this.f6094f == i11) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f6089a = Math.round(pointF.x);
            this.f6090b = Math.round(pointF.y);
            int i11 = this.f6094f + 1;
            this.f6094f = i11;
            if (i11 == this.f6095g) {
                b();
            }
        }
    }

    private boolean a(View view, View view2) {
        if (this.f6073c) {
            e0 matchedTransitionValues = getMatchedTransitionValues(view, true);
            if (matchedTransitionValues == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == matchedTransitionValues.f6130b) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void captureValues(e0 e0Var) {
        View view = e0Var.f6130b;
        if (!androidx.core.view.a0.a0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        e0Var.f6129a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        e0Var.f6129a.put("android:changeBounds:parent", e0Var.f6130b.getParent());
        if (this.f6073c) {
            e0Var.f6130b.getLocationInWindow(this.f6071a);
            e0Var.f6129a.put("android:changeBounds:windowX", Integer.valueOf(this.f6071a[0]));
            e0Var.f6129a.put("android:changeBounds:windowY", Integer.valueOf(this.f6071a[1]));
        }
        if (this.f6072b) {
            e0Var.f6129a.put("android:changeBounds:clip", androidx.core.view.a0.x(view));
        }
    }

    @Override // androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        captureValues(e0Var);
    }

    @Override // androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        captureValues(e0Var);
    }

    @Override // androidx.transition.y
    public Animator createAnimator(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        int i11;
        View view;
        int i12;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c11;
        if (e0Var == null || e0Var2 == null) {
            return null;
        }
        Map<String, Object> map = e0Var.f6129a;
        Map<String, Object> map2 = e0Var2.f6129a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = e0Var2.f6130b;
        if (a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) e0Var.f6129a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) e0Var2.f6129a.get("android:changeBounds:bounds");
            int i13 = rect2.left;
            int i14 = rect3.left;
            int i15 = rect2.top;
            int i16 = rect3.top;
            int i17 = rect2.right;
            int i18 = rect3.right;
            int i19 = rect2.bottom;
            int i21 = rect3.bottom;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            int i24 = i18 - i14;
            int i25 = i21 - i16;
            Rect rect4 = (Rect) e0Var.f6129a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) e0Var2.f6129a.get("android:changeBounds:clip");
            if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
                i11 = 0;
            } else {
                i11 = (i13 == i14 && i15 == i16) ? 0 : 1;
                if (i17 != i18 || i19 != i21) {
                    i11++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i11++;
            }
            if (i11 > 0) {
                if (!this.f6072b) {
                    view = view2;
                    p0.g(view, i13, i15, i17, i19);
                    if (i11 == 2) {
                        if (i22 == i24 && i23 == i25) {
                            c11 = o.a(view, f6069j, getPathMotion().a(i13, i15, i14, i16));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a11 = o.a(kVar, f6065f, getPathMotion().a(i13, i15, i14, i16));
                            ObjectAnimator a12 = o.a(kVar, f6066g, getPathMotion().a(i17, i19, i18, i21));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a11, a12);
                            animatorSet.addListener(new h(this, kVar));
                            c11 = animatorSet;
                        }
                    } else if (i13 == i14 && i15 == i16) {
                        c11 = o.a(view, f6067h, getPathMotion().a(i17, i19, i18, i21));
                    } else {
                        c11 = o.a(view, f6068i, getPathMotion().a(i13, i15, i14, i16));
                    }
                } else {
                    view = view2;
                    p0.g(view, i13, i15, Math.max(i22, i24) + i13, Math.max(i23, i25) + i15);
                    ObjectAnimator a13 = (i13 == i14 && i15 == i16) ? null : o.a(view, f6069j, getPathMotion().a(i13, i15, i14, i16));
                    if (rect4 == null) {
                        i12 = 0;
                        rect = new Rect(0, 0, i22, i23);
                    } else {
                        i12 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i12, i12, i24, i25) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        androidx.core.view.a0.C0(view, rect);
                        t tVar = f6070k;
                        Object[] objArr = new Object[2];
                        objArr[i12] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", tVar, objArr);
                        ofObject.addListener(new i(this, view, rect5, i14, i16, i18, i21));
                        objectAnimator = ofObject;
                    }
                    c11 = d0.c(a13, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    k0.d(viewGroup4, true);
                    addListener(new j(this, viewGroup4));
                }
                return c11;
            }
            return null;
        }
        int intValue = ((Integer) e0Var.f6129a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) e0Var.f6129a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) e0Var2.f6129a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) e0Var2.f6129a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f6071a);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c12 = p0.c(view2);
        p0.h(view2, BitmapDescriptorFactory.HUE_RED);
        p0.b(viewGroup).a(bitmapDrawable);
        p pathMotion = getPathMotion();
        int[] iArr = this.f6071a;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, r.a(f6064e, pathMotion.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c12));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.y
    public String[] getTransitionProperties() {
        return f6063d;
    }
}