package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import c1.i;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final c1.w0<Configuration> f3147a = c1.r.b(c1.n1.h(), a.f3153a);

    /* renamed from: b  reason: collision with root package name */
    private static final c1.w0<Context> f3148b = c1.r.d(b.f3154a);

    /* renamed from: c  reason: collision with root package name */
    private static final c1.w0<k2.b> f3149c = c1.r.d(c.f3155a);

    /* renamed from: d  reason: collision with root package name */
    private static final c1.w0<androidx.lifecycle.v> f3150d = c1.r.d(d.f3156a);

    /* renamed from: e  reason: collision with root package name */
    private static final c1.w0<androidx.savedstate.c> f3151e = c1.r.d(e.f3157a);

    /* renamed from: f  reason: collision with root package name */
    private static final c1.w0<View> f3152f = c1.r.d(f.f3158a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Configuration> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3153a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Configuration invoke() {
            z.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3154a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Context invoke() {
            z.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<k2.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3155a = new c();

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final k2.b invoke() {
            z.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<androidx.lifecycle.v> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3156a = new d();

        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final androidx.lifecycle.v invoke() {
            z.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<androidx.savedstate.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f3157a = new e();

        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final androidx.savedstate.c invoke() {
            z.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.a<View> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f3158a = new f();

        f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final View invoke() {
            z.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<Configuration, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.o0<Configuration> f3159a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c1.o0<Configuration> o0Var) {
            super(1);
            this.f3159a = o0Var;
        }

        public final void a(Configuration it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            z.c(this.f3159a, it2);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Configuration configuration) {
            a(configuration);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f3160a;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f3161a;

            public a(p0 p0Var) {
                this.f3161a = p0Var;
            }

            @Override // c1.y
            public void dispose() {
                this.f3161a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p0 p0Var) {
            super(1);
            this.f3160a = p0Var;
        }

        @Override // h00.l
        public final c1.y invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f3160a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f3162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f3163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f3164c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, g0 g0Var, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f3162a = androidComposeView;
            this.f3163b = g0Var;
            this.f3164c = pVar;
            this.f3165d = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                l0.a(this.f3162a, this.f3163b, this.f3164c, iVar, ((this.f3165d << 3) & 896) | 72);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f3166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f3167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f3166a = androidComposeView;
            this.f3167b = pVar;
            this.f3168c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            z.a(this.f3166a, this.f3167b, iVar, this.f3168c | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f3169a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f3170b;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f3171a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f3172b;

            public a(Context context, l lVar) {
                this.f3171a = context;
                this.f3172b = lVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f3171a.getApplicationContext().unregisterComponentCallbacks(this.f3172b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f3169a = context;
            this.f3170b = lVar;
        }

        @Override // h00.l
        public final c1.y invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            this.f3169a.getApplicationContext().registerComponentCallbacks(this.f3170b);
            return new a(this.f3169a, this.f3170b);
        }
    }

    /* loaded from: classes.dex */
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<Configuration> f3173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k2.b f3174b;

        l(kotlin.jvm.internal.l0<Configuration> l0Var, k2.b bVar) {
            this.f3173a = l0Var;
            this.f3174b = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            kotlin.jvm.internal.s.g(configuration, "configuration");
            Configuration configuration2 = this.f3173a.f34916a;
            this.f3174b.c(configuration2 == null ? -1 : configuration2.updateFrom(configuration));
            this.f3173a.f34916a = configuration;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f3174b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i11) {
            this.f3174b.a();
        }
    }

    public static final void a(AndroidComposeView owner, h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(owner, "owner");
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(-340663129);
        Context context = owner.getContext();
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar = c1.i.f8486a;
        if (y11 == aVar.a()) {
            y11 = c1.n1.f(context.getResources().getConfiguration(), c1.n1.h());
            h11.p(y11);
        }
        h11.N();
        c1.o0 o0Var = (c1.o0) y11;
        h11.x(-3686930);
        boolean O = h11.O(o0Var);
        Object y12 = h11.y();
        if (O || y12 == aVar.a()) {
            y12 = new g(o0Var);
            h11.p(y12);
        }
        h11.N();
        owner.setConfigurationChangeObserver((h00.l) y12);
        h11.x(-3687241);
        Object y13 = h11.y();
        if (y13 == aVar.a()) {
            kotlin.jvm.internal.s.f(context, "context");
            y13 = new g0(context);
            h11.p(y13);
        }
        h11.N();
        g0 g0Var = (g0) y13;
        AndroidComposeView.b viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners != null) {
            h11.x(-3687241);
            Object y14 = h11.y();
            if (y14 == aVar.a()) {
                y14 = r0.b(owner, viewTreeOwners.b());
                h11.p(y14);
            }
            h11.N();
            p0 p0Var = (p0) y14;
            c1.b0.a(vz.b0.f54756a, new h(p0Var), h11, 0);
            kotlin.jvm.internal.s.f(context, "context");
            k2.b m11 = m(context, b(o0Var), h11, 72);
            c1.w0<Configuration> w0Var = f3147a;
            Configuration configuration = b(o0Var);
            kotlin.jvm.internal.s.f(configuration, "configuration");
            c1.r.a(new c1.x0[]{w0Var.c(configuration), f3148b.c(context), f3150d.c(viewTreeOwners.a()), f3151e.c(viewTreeOwners.b()), l1.h.b().c(p0Var), f3152f.c(owner.getView()), f3149c.c(m11)}, j1.c.b(h11, -819890514, true, new i(owner, g0Var, content, i11)), h11, 56);
            c1.e1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new j(owner, content, i11));
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration b(c1.o0<Configuration> o0Var) {
        return o0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c1.o0<Configuration> o0Var, Configuration configuration) {
        o0Var.setValue(configuration);
    }

    public static final c1.w0<Configuration> f() {
        return f3147a;
    }

    public static final c1.w0<Context> g() {
        return f3148b;
    }

    public static final c1.w0<k2.b> h() {
        return f3149c;
    }

    public static final c1.w0<androidx.lifecycle.v> i() {
        return f3150d;
    }

    public static final c1.w0<androidx.savedstate.c> j() {
        return f3151e;
    }

    public static final c1.w0<View> k() {
        return f3152f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final k2.b m(Context context, Configuration configuration, c1.i iVar, int i11) {
        T t11;
        iVar.x(2099958348);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        i.a aVar = c1.i.f8486a;
        if (y11 == aVar.a()) {
            y11 = new k2.b();
            iVar.p(y11);
        }
        iVar.N();
        k2.b bVar = (k2.b) y11;
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        iVar.x(-3687241);
        Object y12 = iVar.y();
        if (y12 == aVar.a()) {
            iVar.p(configuration);
            t11 = configuration;
        } else {
            t11 = y12;
        }
        iVar.N();
        l0Var.f34916a = t11;
        iVar.x(-3687241);
        Object y13 = iVar.y();
        if (y13 == aVar.a()) {
            y13 = new l(l0Var, bVar);
            iVar.p(y13);
        }
        iVar.N();
        c1.b0.a(bVar, new k(context, (l) y13), iVar, 8);
        iVar.N();
        return bVar;
    }
}