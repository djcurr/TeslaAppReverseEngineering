package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicInteger f20813m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final t f20814a;

    /* renamed from: b  reason: collision with root package name */
    private final w.b f20815b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20816c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20817d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20818e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f20819f;

    /* renamed from: g  reason: collision with root package name */
    private int f20820g;

    /* renamed from: h  reason: collision with root package name */
    private int f20821h;

    /* renamed from: i  reason: collision with root package name */
    private int f20822i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f20823j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f20824k;

    /* renamed from: l  reason: collision with root package name */
    private Object f20825l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(t tVar, Uri uri, int i11) {
        if (!tVar.f20751o) {
            this.f20814a = tVar;
            this.f20815b = new w.b(uri, i11, tVar.f20748l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private w c(long j11) {
        int andIncrement = f20813m.getAndIncrement();
        w a11 = this.f20815b.a();
        a11.f20776a = andIncrement;
        a11.f20777b = j11;
        boolean z11 = this.f20814a.f20750n;
        if (z11) {
            d0.t("Main", "created", a11.g(), a11.toString());
        }
        w n11 = this.f20814a.n(a11);
        if (n11 != a11) {
            n11.f20776a = andIncrement;
            n11.f20777b = j11;
            if (z11) {
                String d11 = n11.d();
                d0.t("Main", "changed", d11, "into " + n11);
            }
        }
        return n11;
    }

    private Drawable d() {
        int i11 = this.f20819f;
        if (i11 != 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 21) {
                return this.f20814a.f20741e.getDrawable(i11);
            }
            if (i12 >= 16) {
                return this.f20814a.f20741e.getResources().getDrawable(this.f20819f);
            }
            TypedValue typedValue = new TypedValue();
            this.f20814a.f20741e.getResources().getValue(this.f20819f, typedValue, true);
            return this.f20814a.f20741e.getResources().getDrawable(typedValue.resourceId);
        }
        return this.f20823j;
    }

    public x a() {
        this.f20815b.b(17);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x b() {
        this.f20825l = null;
        return this;
    }

    public void e(ImageView imageView) {
        f(imageView, null);
    }

    public void f(ImageView imageView, e eVar) {
        Bitmap k11;
        long nanoTime = System.nanoTime();
        d0.c();
        if (imageView != null) {
            if (!this.f20815b.c()) {
                this.f20814a.b(imageView);
                if (this.f20818e) {
                    u.d(imageView, d());
                    return;
                }
                return;
            }
            if (this.f20817d) {
                if (!this.f20815b.d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f20815b.f(width, height);
                    } else {
                        if (this.f20818e) {
                            u.d(imageView, d());
                        }
                        this.f20814a.d(imageView, new h(this, imageView, eVar));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w c11 = c(nanoTime);
            String f11 = d0.f(c11);
            if (p.shouldReadFromMemoryCache(this.f20821h) && (k11 = this.f20814a.k(f11)) != null) {
                this.f20814a.b(imageView);
                t tVar = this.f20814a;
                Context context = tVar.f20741e;
                t.e eVar2 = t.e.MEMORY;
                u.c(imageView, context, k11, eVar2, this.f20816c, tVar.f20749m);
                if (this.f20814a.f20750n) {
                    String g11 = c11.g();
                    d0.t("Main", "completed", g11, "from " + eVar2);
                }
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            if (this.f20818e) {
                u.d(imageView, d());
            }
            this.f20814a.f(new l(this.f20814a, imageView, c11, this.f20821h, this.f20822i, this.f20820g, this.f20824k, f11, this.f20825l, eVar, this.f20816c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public x g() {
        this.f20815b.e();
        return this;
    }

    public x h(int i11, int i12) {
        this.f20815b.f(i11, i12);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x i() {
        this.f20817d = false;
        return this;
    }
}