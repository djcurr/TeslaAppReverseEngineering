package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class w extends w0 {

    /* renamed from: b  reason: collision with root package name */
    private static final TimeInterpolator f6230b = new DecelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    private static final TimeInterpolator f6231c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    private static final g f6232d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final g f6233e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final g f6234f = new c();

    /* renamed from: g  reason: collision with root package name */
    private static final g f6235g = new d();

    /* renamed from: h  reason: collision with root package name */
    private static final g f6236h = new e();

    /* renamed from: i  reason: collision with root package name */
    private static final g f6237i = new f();

    /* renamed from: a  reason: collision with root package name */
    private g f6238a = f6237i;

    /* loaded from: classes.dex */
    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float b(ViewGroup viewGroup, View view) {
            if (androidx.core.view.a0.F(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float b(ViewGroup viewGroup, View view) {
            if (androidx.core.view.a0.F(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public w(int i11) {
        a(i11);
    }

    private void captureValues(e0 e0Var) {
        int[] iArr = new int[2];
        e0Var.f6130b.getLocationOnScreen(iArr);
        e0Var.f6129a.put("android:slide:screenPosition", iArr);
    }

    public void a(int i11) {
        if (i11 == 3) {
            this.f6238a = f6232d;
        } else if (i11 == 5) {
            this.f6238a = f6235g;
        } else if (i11 == 48) {
            this.f6238a = f6234f;
        } else if (i11 == 80) {
            this.f6238a = f6237i;
        } else if (i11 == 8388611) {
            this.f6238a = f6233e;
        } else if (i11 == 8388613) {
            this.f6238a = f6236h;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        v vVar = new v();
        vVar.setSide(i11);
        setPropagation(vVar);
    }

    @Override // androidx.transition.w0, androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        super.captureEndValues(e0Var);
        captureValues(e0Var);
    }

    @Override // androidx.transition.w0, androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        super.captureStartValues(e0Var);
        captureValues(e0Var);
    }

    @Override // androidx.transition.w0
    public Animator onAppear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        if (e0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) e0Var2.f6129a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return g0.a(view, e0Var2, iArr[0], iArr[1], this.f6238a.b(viewGroup, view), this.f6238a.a(viewGroup, view), translationX, translationY, f6230b, this);
    }

    @Override // androidx.transition.w0
    public Animator onDisappear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        if (e0Var == null) {
            return null;
        }
        int[] iArr = (int[]) e0Var.f6129a.get("android:slide:screenPosition");
        return g0.a(view, e0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6238a.b(viewGroup, view), this.f6238a.a(viewGroup, view), f6231c, this);
    }
}