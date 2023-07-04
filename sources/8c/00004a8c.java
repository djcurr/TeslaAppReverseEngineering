package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class a<T> {

    /* renamed from: a */
    final t f20616a;

    /* renamed from: b */
    final w f20617b;

    /* renamed from: c */
    final WeakReference<T> f20618c;

    /* renamed from: d */
    final boolean f20619d;

    /* renamed from: e */
    final int f20620e;

    /* renamed from: f */
    final int f20621f;

    /* renamed from: g */
    final int f20622g;

    /* renamed from: h */
    final Drawable f20623h;

    /* renamed from: i */
    final String f20624i;

    /* renamed from: j */
    final Object f20625j;

    /* renamed from: k */
    boolean f20626k;

    /* renamed from: l */
    boolean f20627l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.a$a */
    /* loaded from: classes2.dex */
    public static class C0361a<M> extends WeakReference<M> {

        /* renamed from: a */
        final a f20628a;

        C0361a(a aVar, M m11, ReferenceQueue<? super M> referenceQueue) {
            super(m11, referenceQueue);
            this.f20628a = aVar;
        }
    }

    public a(t tVar, T t11, w wVar, int i11, int i12, int i13, Drawable drawable, String str, Object obj, boolean z11) {
        this.f20616a = tVar;
        this.f20617b = wVar;
        this.f20618c = t11 == null ? null : new C0361a(this, t11, tVar.f20747k);
        this.f20620e = i11;
        this.f20621f = i12;
        this.f20619d = z11;
        this.f20622g = i13;
        this.f20623h = drawable;
        this.f20624i = str;
        this.f20625j = obj == null ? this : obj;
    }

    public void a() {
        this.f20627l = true;
    }

    public abstract void b(Bitmap bitmap, t.e eVar);

    public abstract void c(Exception exc);

    public String d() {
        return this.f20624i;
    }

    public int e() {
        return this.f20620e;
    }

    public int f() {
        return this.f20621f;
    }

    public t g() {
        return this.f20616a;
    }

    public t.f h() {
        return this.f20617b.f20795t;
    }

    public w i() {
        return this.f20617b;
    }

    public Object j() {
        return this.f20625j;
    }

    public T k() {
        WeakReference<T> weakReference = this.f20618c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.f20627l;
    }

    public boolean m() {
        return this.f20626k;
    }
}