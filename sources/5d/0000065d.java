package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f4567a;

    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f4568a;

        /* renamed from: b  reason: collision with root package name */
        private final View f4569b;

        a(Window window, View view) {
            this.f4568a = window;
            this.f4569b = view;
        }

        private void b(int i11) {
            if (i11 == 1) {
                c(4);
            } else if (i11 == 2) {
                c(2);
            } else if (i11 != 8) {
            } else {
                ((InputMethodManager) this.f4568a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f4568a.getDecorView().getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.m0.e
        void a(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    b(i12);
                }
            }
        }

        protected void c(int i11) {
            View decorView = this.f4568a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final WindowInsetsController f4570a;

        d(Window window, m0 m0Var) {
            this(window.getInsetsController(), m0Var);
        }

        @Override // androidx.core.view.m0.e
        void a(int i11) {
            this.f4570a.hide(i11);
        }

        d(WindowInsetsController windowInsetsController, m0 m0Var) {
            new androidx.collection.g();
            this.f4570a = windowInsetsController;
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        void a(int i11) {
        }
    }

    private m0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4567a = new d(windowInsetsController, this);
        } else {
            this.f4567a = new e();
        }
    }

    public static m0 b(WindowInsetsController windowInsetsController) {
        return new m0(windowInsetsController);
    }

    public void a(int i11) {
        this.f4567a.a(i11);
    }

    public m0(Window window, View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f4567a = new d(window, this);
        } else if (i11 >= 26) {
            this.f4567a = new c(window, view);
        } else if (i11 >= 23) {
            this.f4567a = new b(window, view);
        } else if (i11 >= 20) {
            this.f4567a = new a(window, view);
        } else {
            this.f4567a = new e();
        }
    }
}