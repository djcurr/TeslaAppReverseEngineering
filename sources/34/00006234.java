package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class g extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private j f22276a;

    /* renamed from: b  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f22277b;

    /* renamed from: c  reason: collision with root package name */
    private EnumSet<h> f22278c;

    /* renamed from: d  reason: collision with root package name */
    private View f22279d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f22280a;

        a(g gVar, AtomicBoolean atomicBoolean) {
            this.f22280a = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f22280a) {
                if (this.f22280a.compareAndSet(false, true)) {
                    this.f22280a.notify();
                }
            }
        }
    }

    public g(Context context) {
        super(context);
        this.f22276a = j.PADDING;
    }

    private View c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof e) {
                return (View) parent;
            }
        }
        return this;
    }

    private static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private boolean f() {
        com.th3rdwave.safeareacontext.a c11;
        com.th3rdwave.safeareacontext.a aVar;
        View view = this.f22279d;
        if (view == null || (c11 = f.c(view)) == null || ((aVar = this.f22277b) != null && aVar.a(c11))) {
            return false;
        }
        this.f22277b = c11;
        g();
        return true;
    }

    private void g() {
        if (this.f22277b != null) {
            EnumSet<h> enumSet = this.f22278c;
            if (enumSet == null) {
                enumSet = EnumSet.allOf(h.class);
            }
            i iVar = new i(this.f22277b, this.f22276a, enumSet);
            UIManagerModule uIManagerModule = (UIManagerModule) d(this).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), iVar);
                h();
            }
        }
    }

    private void h() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long nanoTime = System.nanoTime();
        d(this).runOnNativeModulesQueueThread(new a(this, atomicBoolean));
        synchronized (atomicBoolean) {
            long j11 = 0;
            while (!atomicBoolean.get() && j11 < 500000000) {
                try {
                    atomicBoolean.wait(500L);
                } catch (InterruptedException unused) {
                    atomicBoolean.set(true);
                }
                j11 += System.nanoTime() - nanoTime;
            }
            if (j11 >= 500000000) {
                Log.w("SafeAreaView", "Timed out waiting for layout.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View c11 = c();
        this.f22279d = c11;
        c11.getViewTreeObserver().addOnPreDrawListener(this);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.f22279d;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f22279d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean f11 = f();
        if (f11) {
            requestLayout();
        }
        return !f11;
    }

    public void setEdges(EnumSet<h> enumSet) {
        this.f22278c = enumSet;
        g();
    }

    public void setMode(j jVar) {
        this.f22276a = jVar;
        g();
    }
}