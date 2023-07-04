package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.GestureHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class j implements xr.g {

    /* renamed from: a */
    private final SparseArray<GestureHandler<?>> f21190a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f21191b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<GestureHandler<?>>> f21192c = new SparseArray<>();

    public static /* synthetic */ void b(GestureHandler gestureHandler) {
        f(gestureHandler);
    }

    public static /* synthetic */ boolean d(j jVar, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return jVar.c(i11, i12, z11);
    }

    private final synchronized void e(final GestureHandler<?> gestureHandler) {
        Integer num = this.f21191b.get(gestureHandler.N());
        if (num != null) {
            this.f21191b.remove(gestureHandler.N());
            ArrayList<GestureHandler<?>> arrayList = this.f21192c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(gestureHandler);
                if (arrayList.size() == 0) {
                    this.f21192c.remove(num.intValue());
                }
            }
        }
        if (gestureHandler.R() != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.b(GestureHandler.this);
                }
            });
        }
    }

    public static final void f(GestureHandler handler) {
        s.g(handler, "$handler");
        handler.o();
    }

    private final synchronized void l(int i11, GestureHandler<?> gestureHandler) {
        if (this.f21191b.get(gestureHandler.N()) == null) {
            this.f21191b.put(gestureHandler.N(), Integer.valueOf(i11));
            ArrayList<GestureHandler<?>> arrayList = this.f21192c.get(i11);
            if (arrayList == null) {
                ArrayList<GestureHandler<?>> arrayList2 = new ArrayList<>(1);
                arrayList2.add(gestureHandler);
                this.f21192c.put(i11, arrayList2);
            } else {
                arrayList.add(gestureHandler);
            }
        } else {
            throw new IllegalStateException(("Handler " + gestureHandler + " already attached").toString());
        }
    }

    @Override // xr.g
    public synchronized ArrayList<GestureHandler<?>> a(View view) {
        s.g(view, "view");
        return j(view.getId());
    }

    public final synchronized boolean c(int i11, int i12, boolean z11) {
        boolean z12;
        GestureHandler<?> handler = this.f21190a.get(i11);
        if (handler == null) {
            z12 = false;
        } else {
            s.f(handler, "handler");
            e(handler);
            handler.y0(z11);
            l(i12, handler);
            z12 = true;
        }
        return z12;
    }

    public final synchronized void g() {
        this.f21190a.clear();
        this.f21191b.clear();
        this.f21192c.clear();
    }

    public final synchronized void h(int i11) {
        GestureHandler<?> gestureHandler = this.f21190a.get(i11);
        if (gestureHandler != null) {
            e(gestureHandler);
            this.f21190a.remove(i11);
        }
    }

    public final synchronized GestureHandler<?> i(int i11) {
        return this.f21190a.get(i11);
    }

    public final synchronized ArrayList<GestureHandler<?>> j(int i11) {
        return this.f21192c.get(i11);
    }

    public final synchronized void k(GestureHandler<?> handler) {
        s.g(handler, "handler");
        this.f21190a.put(handler.N(), handler);
    }
}