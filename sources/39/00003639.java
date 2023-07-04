package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class l {

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f15464a;

        a(View view) {
            this.f15464a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f15464a.getContext().getSystemService("input_method")).showSoftInput(this.f15464a, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f15465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f15466b;

        b(d dVar, e eVar) {
            this.f15465a = dVar;
            this.f15466b = eVar;
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            return this.f15465a.a(view, l0Var, new e(this.f15466b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            a0.t0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        l0 a(View view, l0 l0Var, e eVar);
    }

    public static void a(View view, d dVar) {
        a0.J0(view, new b(dVar, new e(a0.K(view), view.getPaddingTop(), a0.J(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f11 += a0.z((View) parent);
        }
        return f11;
    }

    public static boolean d(View view) {
        return a0.F(view) == 1;
    }

    public static PorterDuff.Mode e(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void f(View view) {
        if (a0.Y(view)) {
            a0.t0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void g(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f15467a;

        /* renamed from: b  reason: collision with root package name */
        public int f15468b;

        /* renamed from: c  reason: collision with root package name */
        public int f15469c;

        /* renamed from: d  reason: collision with root package name */
        public int f15470d;

        public e(int i11, int i12, int i13, int i14) {
            this.f15467a = i11;
            this.f15468b = i12;
            this.f15469c = i13;
            this.f15470d = i14;
        }

        public e(e eVar) {
            this.f15467a = eVar.f15467a;
            this.f15468b = eVar.f15468b;
            this.f15469c = eVar.f15469c;
            this.f15470d = eVar.f15470d;
        }
    }
}