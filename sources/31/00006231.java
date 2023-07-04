package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes6.dex */
public class e extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private a f22273a;

    /* renamed from: b  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f22274b;

    /* renamed from: c  reason: collision with root package name */
    private c f22275c;

    /* loaded from: classes6.dex */
    public interface a {
        void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar);
    }

    public e(Context context) {
        super(context);
    }

    private void c() {
        com.th3rdwave.safeareacontext.a c11 = f.c(this);
        c a11 = f.a((ViewGroup) getRootView(), this);
        if (c11 == null || a11 == null) {
            return;
        }
        com.th3rdwave.safeareacontext.a aVar = this.f22274b;
        if (aVar == null || this.f22275c == null || !aVar.a(c11) || !this.f22275c.a(a11)) {
            ((a) wf.a.c(this.f22273a)).a(this, c11, a11);
            this.f22274b = c11;
            this.f22275c = a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        c();
        return true;
    }

    public void setOnInsetsChangeListener(a aVar) {
        this.f22273a = aVar;
    }
}