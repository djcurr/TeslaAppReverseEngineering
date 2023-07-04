package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f20696a;

    /* renamed from: b  reason: collision with root package name */
    final WeakReference<ImageView> f20697b;

    /* renamed from: c  reason: collision with root package name */
    e f20698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(x xVar, ImageView imageView, e eVar) {
        this.f20696a = xVar;
        this.f20697b = new WeakReference<>(imageView);
        this.f20698c = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f20696a.b();
        this.f20698c = null;
        ImageView imageView = this.f20697b.get();
        if (imageView == null) {
            return;
        }
        this.f20697b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f20697b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width > 0 && height > 0) {
                imageView.removeOnAttachStateChangeListener(this);
                viewTreeObserver.removeOnPreDrawListener(this);
                this.f20697b.clear();
                this.f20696a.i().h(width, height).f(imageView, this.f20698c);
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}