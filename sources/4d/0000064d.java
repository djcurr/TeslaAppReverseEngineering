package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f4534b;

    /* renamed from: a  reason: collision with root package name */
    private final l f4535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f4536a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f4537b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f4538c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f4539d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4536a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4537b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4538c = declaredField3;
                declaredField3.setAccessible(true);
                f4539d = true;
            } catch (ReflectiveOperationException e11) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e11.getMessage(), e11);
            }
        }

        public static l0 a(View view) {
            if (f4539d && view.isAttachedToWindow()) {
                try {
                    Object obj = f4536a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f4537b.get(obj);
                        Rect rect2 = (Rect) f4538c.get(obj);
                        if (rect != null && rect2 != null) {
                            l0 a11 = new b().b(m3.b.c(rect)).c(m3.b.c(rect2)).a();
                            a11.t(a11);
                            a11.d(view.getRootView());
                            return a11;
                        }
                    }
                } catch (IllegalAccessException e11) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e11.getMessage(), e11);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(l0 l0Var) {
            super(l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f4548a;

        /* renamed from: b  reason: collision with root package name */
        m3.b[] f4549b;

        f() {
            this(new l0((l0) null));
        }

        protected final void a() {
            m3.b[] bVarArr = this.f4549b;
            if (bVarArr != null) {
                m3.b bVar = bVarArr[m.b(1)];
                m3.b bVar2 = this.f4549b[m.b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f4548a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f4548a.f(1);
                }
                f(m3.b.a(bVar, bVar2));
                m3.b bVar3 = this.f4549b[m.b(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                m3.b bVar4 = this.f4549b[m.b(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                m3.b bVar5 = this.f4549b[m.b(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        l0 b() {
            a();
            return this.f4548a;
        }

        void c(m3.b bVar) {
        }

        void d(m3.b bVar) {
        }

        void e(m3.b bVar) {
        }

        void f(m3.b bVar) {
        }

        void g(m3.b bVar) {
        }

        f(l0 l0Var) {
            this.f4548a = l0Var;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // androidx.core.view.l0.l
        l0 a() {
            return l0.w(this.f4555c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f4555c, iVar.f4555c) && Objects.equals(this.f4559g, iVar.f4559g);
            }
            return false;
        }

        @Override // androidx.core.view.l0.l
        androidx.core.view.d f() {
            return androidx.core.view.d.e(this.f4555c.getDisplayCutout());
        }

        @Override // androidx.core.view.l0.l
        public int hashCode() {
            return this.f4555c.hashCode();
        }

        i(l0 l0Var, i iVar) {
            super(l0Var, iVar);
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final l0 f4564q = l0.w(WindowInsets.CONSUMED);

        k(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        public m3.b g(int i11) {
            return m3.b.d(this.f4555c.getInsets(n.a(i11)));
        }

        k(l0 l0Var, k kVar) {
            super(l0Var, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final l0 f4565b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final l0 f4566a;

        l(l0 l0Var) {
            this.f4566a = l0Var;
        }

        l0 a() {
            return this.f4566a;
        }

        l0 b() {
            return this.f4566a;
        }

        l0 c() {
            return this.f4566a;
        }

        void d(View view) {
        }

        void e(l0 l0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && v3.c.a(k(), lVar.k()) && v3.c.a(i(), lVar.i()) && v3.c.a(f(), lVar.f());
            }
            return false;
        }

        androidx.core.view.d f() {
            return null;
        }

        m3.b g(int i11) {
            return m3.b.f38363e;
        }

        m3.b h() {
            return k();
        }

        public int hashCode() {
            return v3.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        m3.b i() {
            return m3.b.f38363e;
        }

        m3.b j() {
            return k();
        }

        m3.b k() {
            return m3.b.f38363e;
        }

        m3.b l() {
            return k();
        }

        l0 m(int i11, int i12, int i13, int i14) {
            return f4565b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(m3.b[] bVarArr) {
        }

        void q(m3.b bVar) {
        }

        void r(l0 l0Var) {
        }

        public void s(m3.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 8) {
                            if (i11 != 16) {
                                if (i11 != 32) {
                                    if (i11 != 64) {
                                        if (i11 != 128) {
                                            if (i11 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i11);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i11) {
            int statusBars;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i11 & i13) != 0) {
                    if (i13 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i12 |= statusBars;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4534b = k.f4564q;
        } else {
            f4534b = l.f4565b;
        }
    }

    private l0(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f4535a = new k(this, windowInsets);
        } else if (i11 >= 29) {
            this.f4535a = new j(this, windowInsets);
        } else if (i11 >= 28) {
            this.f4535a = new i(this, windowInsets);
        } else if (i11 >= 21) {
            this.f4535a = new h(this, windowInsets);
        } else if (i11 >= 20) {
            this.f4535a = new g(this, windowInsets);
        } else {
            this.f4535a = new l(this);
        }
    }

    static m3.b o(m3.b bVar, int i11, int i12, int i13, int i14) {
        int max = Math.max(0, bVar.f38364a - i11);
        int max2 = Math.max(0, bVar.f38365b - i12);
        int max3 = Math.max(0, bVar.f38366c - i13);
        int max4 = Math.max(0, bVar.f38367d - i14);
        return (max == i11 && max2 == i12 && max3 == i13 && max4 == i14) ? bVar : m3.b.b(max, max2, max3, max4);
    }

    public static l0 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static l0 x(WindowInsets windowInsets, View view) {
        l0 l0Var = new l0((WindowInsets) v3.h.f(windowInsets));
        if (view != null && a0.Y(view)) {
            l0Var.t(a0.M(view));
            l0Var.d(view.getRootView());
        }
        return l0Var;
    }

    @Deprecated
    public l0 a() {
        return this.f4535a.a();
    }

    @Deprecated
    public l0 b() {
        return this.f4535a.b();
    }

    @Deprecated
    public l0 c() {
        return this.f4535a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f4535a.d(view);
    }

    public androidx.core.view.d e() {
        return this.f4535a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return v3.c.a(this.f4535a, ((l0) obj).f4535a);
        }
        return false;
    }

    public m3.b f(int i11) {
        return this.f4535a.g(i11);
    }

    @Deprecated
    public m3.b g() {
        return this.f4535a.h();
    }

    @Deprecated
    public m3.b h() {
        return this.f4535a.i();
    }

    public int hashCode() {
        l lVar = this.f4535a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public m3.b i() {
        return this.f4535a.j();
    }

    @Deprecated
    public int j() {
        return this.f4535a.k().f38367d;
    }

    @Deprecated
    public int k() {
        return this.f4535a.k().f38364a;
    }

    @Deprecated
    public int l() {
        return this.f4535a.k().f38366c;
    }

    @Deprecated
    public int m() {
        return this.f4535a.k().f38365b;
    }

    public l0 n(int i11, int i12, int i13, int i14) {
        return this.f4535a.m(i11, i12, i13, i14);
    }

    public boolean p() {
        return this.f4535a.n();
    }

    @Deprecated
    public l0 q(int i11, int i12, int i13, int i14) {
        return new b(this).c(m3.b.b(i11, i12, i13, i14)).a();
    }

    void r(m3.b[] bVarArr) {
        this.f4535a.p(bVarArr);
    }

    void s(m3.b bVar) {
        this.f4535a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(l0 l0Var) {
        this.f4535a.r(l0Var);
    }

    void u(m3.b bVar) {
        this.f4535a.s(bVar);
    }

    public WindowInsets v() {
        l lVar = this.f4535a;
        if (lVar instanceof g) {
            return ((g) lVar).f4555c;
        }
        return null;
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f4541e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f4542f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f4543g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f4544h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f4545c;

        /* renamed from: d  reason: collision with root package name */
        private m3.b f4546d;

        c() {
            this.f4545c = h();
        }

        private static WindowInsets h() {
            if (!f4542f) {
                try {
                    f4541e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e11);
                }
                f4542f = true;
            }
            Field field = f4541e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e12);
                }
            }
            if (!f4544h) {
                try {
                    f4543g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e13);
                }
                f4544h = true;
            }
            Constructor<WindowInsets> constructor = f4543g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e14) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e14);
                }
            }
            return null;
        }

        @Override // androidx.core.view.l0.f
        l0 b() {
            a();
            l0 w11 = l0.w(this.f4545c);
            w11.r(this.f4549b);
            w11.u(this.f4546d);
            return w11;
        }

        @Override // androidx.core.view.l0.f
        void d(m3.b bVar) {
            this.f4546d = bVar;
        }

        @Override // androidx.core.view.l0.f
        void f(m3.b bVar) {
            WindowInsets windowInsets = this.f4545c;
            if (windowInsets != null) {
                this.f4545c = windowInsets.replaceSystemWindowInsets(bVar.f38364a, bVar.f38365b, bVar.f38366c, bVar.f38367d);
            }
        }

        c(l0 l0Var) {
            super(l0Var);
            this.f4545c = l0Var.v();
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f4547c;

        d() {
            this.f4547c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.l0.f
        l0 b() {
            a();
            l0 w11 = l0.w(this.f4547c.build());
            w11.r(this.f4549b);
            return w11;
        }

        @Override // androidx.core.view.l0.f
        void c(m3.b bVar) {
            this.f4547c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void d(m3.b bVar) {
            this.f4547c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void e(m3.b bVar) {
            this.f4547c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void f(m3.b bVar) {
            this.f4547c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void g(m3.b bVar) {
            this.f4547c.setTappableElementInsets(bVar.e());
        }

        d(l0 l0Var) {
            super(l0Var);
            WindowInsets.Builder builder;
            WindowInsets v11 = l0Var.v();
            if (v11 != null) {
                builder = new WindowInsets.Builder(v11);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f4547c = builder;
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private m3.b f4560m;

        h(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
            this.f4560m = null;
        }

        @Override // androidx.core.view.l0.l
        l0 b() {
            return l0.w(this.f4555c.consumeStableInsets());
        }

        @Override // androidx.core.view.l0.l
        l0 c() {
            return l0.w(this.f4555c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.l0.l
        final m3.b i() {
            if (this.f4560m == null) {
                this.f4560m = m3.b.b(this.f4555c.getStableInsetLeft(), this.f4555c.getStableInsetTop(), this.f4555c.getStableInsetRight(), this.f4555c.getStableInsetBottom());
            }
            return this.f4560m;
        }

        @Override // androidx.core.view.l0.l
        boolean n() {
            return this.f4555c.isConsumed();
        }

        @Override // androidx.core.view.l0.l
        public void s(m3.b bVar) {
            this.f4560m = bVar;
        }

        h(l0 l0Var, h hVar) {
            super(l0Var, hVar);
            this.f4560m = null;
            this.f4560m = hVar.f4560m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f4550h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f4551i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f4552j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f4553k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f4554l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f4555c;

        /* renamed from: d  reason: collision with root package name */
        private m3.b[] f4556d;

        /* renamed from: e  reason: collision with root package name */
        private m3.b f4557e;

        /* renamed from: f  reason: collision with root package name */
        private l0 f4558f;

        /* renamed from: g  reason: collision with root package name */
        m3.b f4559g;

        g(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var);
            this.f4557e = null;
            this.f4555c = windowInsets;
        }

        private m3.b t(int i11, boolean z11) {
            m3.b bVar = m3.b.f38363e;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    bVar = m3.b.a(bVar, u(i12, z11));
                }
            }
            return bVar;
        }

        private m3.b v() {
            l0 l0Var = this.f4558f;
            if (l0Var != null) {
                return l0Var.h();
            }
            return m3.b.f38363e;
        }

        private m3.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f4550h) {
                    x();
                }
                Method method = f4551i;
                if (method != null && f4552j != null && f4553k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f4553k.get(f4554l.get(invoke));
                        if (rect != null) {
                            return m3.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e11) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void x() {
            try {
                f4551i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4552j = cls;
                f4553k = cls.getDeclaredField("mVisibleInsets");
                f4554l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f4553k.setAccessible(true);
                f4554l.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
            }
            f4550h = true;
        }

        @Override // androidx.core.view.l0.l
        void d(View view) {
            m3.b w11 = w(view);
            if (w11 == null) {
                w11 = m3.b.f38363e;
            }
            q(w11);
        }

        @Override // androidx.core.view.l0.l
        void e(l0 l0Var) {
            l0Var.t(this.f4558f);
            l0Var.s(this.f4559g);
        }

        @Override // androidx.core.view.l0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f4559g, ((g) obj).f4559g);
            }
            return false;
        }

        @Override // androidx.core.view.l0.l
        public m3.b g(int i11) {
            return t(i11, false);
        }

        @Override // androidx.core.view.l0.l
        final m3.b k() {
            if (this.f4557e == null) {
                this.f4557e = m3.b.b(this.f4555c.getSystemWindowInsetLeft(), this.f4555c.getSystemWindowInsetTop(), this.f4555c.getSystemWindowInsetRight(), this.f4555c.getSystemWindowInsetBottom());
            }
            return this.f4557e;
        }

        @Override // androidx.core.view.l0.l
        l0 m(int i11, int i12, int i13, int i14) {
            b bVar = new b(l0.w(this.f4555c));
            bVar.c(l0.o(k(), i11, i12, i13, i14));
            bVar.b(l0.o(i(), i11, i12, i13, i14));
            return bVar.a();
        }

        @Override // androidx.core.view.l0.l
        boolean o() {
            return this.f4555c.isRound();
        }

        @Override // androidx.core.view.l0.l
        public void p(m3.b[] bVarArr) {
            this.f4556d = bVarArr;
        }

        @Override // androidx.core.view.l0.l
        void q(m3.b bVar) {
            this.f4559g = bVar;
        }

        @Override // androidx.core.view.l0.l
        void r(l0 l0Var) {
            this.f4558f = l0Var;
        }

        protected m3.b u(int i11, boolean z11) {
            m3.b h11;
            int i12;
            androidx.core.view.d f11;
            if (i11 == 1) {
                if (z11) {
                    return m3.b.b(0, Math.max(v().f38365b, k().f38365b), 0, 0);
                }
                return m3.b.b(0, k().f38365b, 0, 0);
            }
            if (i11 == 2) {
                if (z11) {
                    m3.b v11 = v();
                    m3.b i13 = i();
                    return m3.b.b(Math.max(v11.f38364a, i13.f38364a), 0, Math.max(v11.f38366c, i13.f38366c), Math.max(v11.f38367d, i13.f38367d));
                }
                m3.b k11 = k();
                l0 l0Var = this.f4558f;
                h11 = l0Var != null ? l0Var.h() : null;
                int i14 = k11.f38367d;
                if (h11 != null) {
                    i14 = Math.min(i14, h11.f38367d);
                }
                return m3.b.b(k11.f38364a, 0, k11.f38366c, i14);
            } else if (i11 != 8) {
                if (i11 != 16) {
                    if (i11 != 32) {
                        if (i11 != 64) {
                            if (i11 != 128) {
                                return m3.b.f38363e;
                            }
                            l0 l0Var2 = this.f4558f;
                            if (l0Var2 != null) {
                                f11 = l0Var2.e();
                            } else {
                                f11 = f();
                            }
                            if (f11 != null) {
                                return m3.b.b(f11.b(), f11.d(), f11.c(), f11.a());
                            }
                            return m3.b.f38363e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                m3.b[] bVarArr = this.f4556d;
                h11 = bVarArr != null ? bVarArr[m.b(8)] : null;
                if (h11 != null) {
                    return h11;
                }
                m3.b k12 = k();
                m3.b v12 = v();
                int i15 = k12.f38367d;
                if (i15 > v12.f38367d) {
                    return m3.b.b(0, 0, 0, i15);
                }
                m3.b bVar = this.f4559g;
                if (bVar != null && !bVar.equals(m3.b.f38363e) && (i12 = this.f4559g.f38367d) > v12.f38367d) {
                    return m3.b.b(0, 0, 0, i12);
                }
                return m3.b.f38363e;
            }
        }

        g(l0 l0Var, g gVar) {
            this(l0Var, new WindowInsets(gVar.f4555c));
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private m3.b f4561n;

        /* renamed from: o  reason: collision with root package name */
        private m3.b f4562o;

        /* renamed from: p  reason: collision with root package name */
        private m3.b f4563p;

        j(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
            this.f4561n = null;
            this.f4562o = null;
            this.f4563p = null;
        }

        @Override // androidx.core.view.l0.l
        m3.b h() {
            if (this.f4562o == null) {
                this.f4562o = m3.b.d(this.f4555c.getMandatorySystemGestureInsets());
            }
            return this.f4562o;
        }

        @Override // androidx.core.view.l0.l
        m3.b j() {
            if (this.f4561n == null) {
                this.f4561n = m3.b.d(this.f4555c.getSystemGestureInsets());
            }
            return this.f4561n;
        }

        @Override // androidx.core.view.l0.l
        m3.b l() {
            if (this.f4563p == null) {
                this.f4563p = m3.b.d(this.f4555c.getTappableElementInsets());
            }
            return this.f4563p;
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        l0 m(int i11, int i12, int i13, int i14) {
            return l0.w(this.f4555c.inset(i11, i12, i13, i14));
        }

        @Override // androidx.core.view.l0.h, androidx.core.view.l0.l
        public void s(m3.b bVar) {
        }

        j(l0 l0Var, j jVar) {
            super(l0Var, jVar);
            this.f4561n = null;
            this.f4562o = null;
            this.f4563p = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f4540a;

        public b() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f4540a = new e();
            } else if (i11 >= 29) {
                this.f4540a = new d();
            } else if (i11 >= 20) {
                this.f4540a = new c();
            } else {
                this.f4540a = new f();
            }
        }

        public l0 a() {
            return this.f4540a.b();
        }

        @Deprecated
        public b b(m3.b bVar) {
            this.f4540a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(m3.b bVar) {
            this.f4540a.f(bVar);
            return this;
        }

        public b(l0 l0Var) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f4540a = new e(l0Var);
            } else if (i11 >= 29) {
                this.f4540a = new d(l0Var);
            } else if (i11 >= 20) {
                this.f4540a = new c(l0Var);
            } else {
                this.f4540a = new f(l0Var);
            }
        }
    }

    public l0(l0 l0Var) {
        if (l0Var != null) {
            l lVar = l0Var.f4535a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && (lVar instanceof k)) {
                this.f4535a = new k(this, (k) lVar);
            } else if (i11 >= 29 && (lVar instanceof j)) {
                this.f4535a = new j(this, (j) lVar);
            } else if (i11 >= 28 && (lVar instanceof i)) {
                this.f4535a = new i(this, (i) lVar);
            } else if (i11 >= 21 && (lVar instanceof h)) {
                this.f4535a = new h(this, (h) lVar);
            } else if (i11 >= 20 && (lVar instanceof g)) {
                this.f4535a = new g(this, (g) lVar);
            } else {
                this.f4535a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f4535a = new l(this);
    }
}