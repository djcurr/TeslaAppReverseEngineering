package z5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.l;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: a  reason: collision with root package name */
    private final d6.a<?> f60263a;

    /* renamed from: b  reason: collision with root package name */
    private final t5.d f60264b;

    /* renamed from: c  reason: collision with root package name */
    private final r5.c f60265c;

    /* renamed from: d  reason: collision with root package name */
    private final g6.k f60266d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", l = {277, 301}, m = "error")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f60267a;

        /* renamed from: b  reason: collision with root package name */
        int f60268b;

        /* renamed from: d  reason: collision with root package name */
        Object f60270d;

        /* renamed from: e  reason: collision with root package name */
        Object f60271e;

        /* renamed from: f  reason: collision with root package name */
        Object f60272f;

        /* renamed from: g  reason: collision with root package name */
        Object f60273g;

        /* renamed from: h  reason: collision with root package name */
        Object f60274h;

        /* renamed from: i  reason: collision with root package name */
        Object f60275i;

        /* renamed from: j  reason: collision with root package name */
        Object f60276j;

        /* renamed from: k  reason: collision with root package name */
        Object f60277k;

        /* renamed from: l  reason: collision with root package name */
        Object f60278l;

        a(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60267a = obj;
            this.f60268b |= Integer.MIN_VALUE;
            return n.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", l = {237, l.f.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "success")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f60279a;

        /* renamed from: b  reason: collision with root package name */
        int f60280b;

        /* renamed from: d  reason: collision with root package name */
        Object f60282d;

        /* renamed from: e  reason: collision with root package name */
        Object f60283e;

        /* renamed from: f  reason: collision with root package name */
        Object f60284f;

        /* renamed from: g  reason: collision with root package name */
        Object f60285g;

        /* renamed from: h  reason: collision with root package name */
        Object f60286h;

        /* renamed from: i  reason: collision with root package name */
        Object f60287i;

        /* renamed from: j  reason: collision with root package name */
        Object f60288j;

        /* renamed from: k  reason: collision with root package name */
        Object f60289k;

        /* renamed from: l  reason: collision with root package name */
        Object f60290l;

        /* renamed from: m  reason: collision with root package name */
        Object f60291m;

        b(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60279a = obj;
            this.f60280b |= Integer.MIN_VALUE;
            return n.this.f(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d6.a<?> target, t5.d referenceCounter, r5.c eventListener, g6.k kVar) {
        super(null);
        kotlin.jvm.internal.s.g(target, "target");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.s.g(eventListener, "eventListener");
        this.f60263a = target;
        this.f60264b = referenceCounter;
        this.f60265c = eventListener;
        this.f60266d = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void k(Bitmap bitmap) {
        Bitmap d11 = g6.e.g(d().getView()).d(this, bitmap);
        if (d11 != null) {
            this.f60264b.b(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Bitmap bitmap) {
        if (bitmap != null) {
            this.f60264b.c(bitmap);
        }
    }

    @Override // z5.t
    public void a() {
        if (!(this.f60264b instanceof t5.e)) {
            m(null);
            d().e();
            k(null);
            return;
        }
        d().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // z5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(b6.e r14, zz.d<? super vz.b0> r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.n.b(b6.e, zz.d):java.lang.Object");
    }

    @Override // z5.t
    public void e(Drawable drawable, Bitmap bitmap) {
        if (!(this.f60264b instanceof t5.e)) {
            m(bitmap);
            d().b(drawable);
            k(bitmap);
            return;
        }
        d().b(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    @Override // z5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(b6.k r17, zz.d<? super vz.b0> r18) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.n.f(b6.k, zz.d):java.lang.Object");
    }

    @Override // z5.t
    /* renamed from: l */
    public d6.a<?> d() {
        return this.f60263a;
    }
}