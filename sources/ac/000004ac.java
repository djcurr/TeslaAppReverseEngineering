package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f3039a = "Wrapper";

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f3040b = new ViewGroup.LayoutParams(-2, -2);

    public static final c1.l a(h2.k container, c1.m parent) {
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(parent, "parent");
        return c1.p.a(new h2.n0(container), parent);
    }

    private static final c1.l b(AndroidComposeView androidComposeView, c1.m mVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
        if (d(androidComposeView)) {
            androidComposeView.setTag(o1.g.J, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        c1.l a11 = c1.p.a(new h2.n0(androidComposeView.getRoot()), mVar);
        View view = androidComposeView.getView();
        int i11 = o1.g.K;
        Object tag = view.getTag(i11);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a11);
            androidComposeView.getView().setTag(i11, wrappedComposition);
        }
        wrappedComposition.d(pVar);
        return wrappedComposition;
    }

    private static final void c() {
        if (x0.c()) {
            return;
        }
        try {
            int i11 = x0.f3139c;
            Field declaredField = x0.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
            Log.w(f3039a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    private static final boolean d(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (k2.f2999a.a(androidComposeView).isEmpty() ^ true);
    }

    public static final c1.l e(a aVar, c1.m parent, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(content, "content");
        u0.f3112a.a();
        AndroidComposeView androidComposeView = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = aVar.getContext();
            kotlin.jvm.internal.s.f(context, "context");
            androidComposeView = new AndroidComposeView(context);
            aVar.addView(androidComposeView.getView(), f3040b);
        }
        return b(androidComposeView, parent, content);
    }
}