package gw;

import android.os.Parcel;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import gw.c0;
import gw.n;
import gw.o;
import gw.s;
import iw.a;
import iw.d;
import iw.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pv.f;
import v20.o0;
import v20.y0;

/* loaded from: classes6.dex */
public final class g0 extends nr.k<b, gw.c0, c, d> {

    /* renamed from: a  reason: collision with root package name */
    private final pv.f f28266a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f28267b;

    /* renamed from: c  reason: collision with root package name */
    private final d.a f28268c;

    /* renamed from: d  reason: collision with root package name */
    private final a.b f28269d;

    /* renamed from: e  reason: collision with root package name */
    private final o.b f28270e;

    /* renamed from: f  reason: collision with root package name */
    private final gw.s f28271f;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class a0 extends kotlin.jvm.internal.u implements h00.l<f.a, nr.q<? super b, gw.c0, ? extends c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f28273b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28274a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.i(null, false, 3, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28275a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f28276a = new c();

            c() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(c0.h.f28239b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f28277a = new d();

            d() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.a.f28284a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(b bVar) {
            super(1);
            this.f28273b = bVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(f.a it2) {
            nr.q<b, gw.c0, c> d11;
            nr.q<b, gw.c0, c> d12;
            nr.q<b, gw.c0, c> d13;
            nr.q<b, gw.c0, c> d14;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, f.a.c.f46939a)) {
                d14 = nr.y.d(g0.this, null, a.f28274a, 1, null);
                return d14;
            } else if (kotlin.jvm.internal.s.c(it2, f.a.C1007a.f46937a)) {
                if (this.f28273b.b()) {
                    d13 = nr.y.d(g0.this, null, b.f28275a, 1, null);
                    return d13;
                }
                d12 = nr.y.d(g0.this, null, c.f28276a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, f.a.b.f46938a)) {
                d11 = nr.y.d(g0.this, null, d.f28277a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f28278a;

        /* renamed from: b  reason: collision with root package name */
        private final String f28279b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28280c;

        /* loaded from: classes6.dex */
        public static final class a extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String sessionToken, String verificationToken, boolean z11) {
                super(sessionToken, verificationToken, z11, null);
                kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
                kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            }
        }

        /* renamed from: gw.g0$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0539b extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0539b(String sessionToken, String verificationToken, boolean z11) {
                super(sessionToken, verificationToken, z11, null);
                kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
                kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            }
        }

        private b(String str, String str2, boolean z11) {
            this.f28278a = str;
            this.f28279b = str2;
            this.f28280c = z11;
        }

        public /* synthetic */ b(String str, String str2, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z11);
        }

        public final String a() {
            return this.f28278a;
        }

        public final boolean b() {
            return this.f28280c;
        }

        public final String c() {
            return this.f28279b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28282b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28283a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                gw.c0 c11 = action.c();
                c0.d dVar = c11 instanceof c0.d ? (c0.d) c11 : null;
                gw.c0 c12 = dVar != null ? dVar.c() : null;
                if (c12 != null) {
                    action.e(c12);
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28281a = aVar;
            this.f28282b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28281a.b();
            d11 = nr.y.d(this.f28282b, null, a.f28283a, 1, null);
            b11.d(d11);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28284a = new a();

            private a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28285a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: gw.g0$c$c  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0540c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0540c f28286a = new C0540c();

            private C0540c() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f28287a = new d();

            private d() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28289b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28290a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28288a = aVar;
            this.f28289b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28288a.b();
            d11 = nr.y.d(this.f28289b, null, a.f28290a, 1, null);
            b11.d(d11);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class d {

        /* loaded from: classes6.dex */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            private final Integer f28291a;

            /* renamed from: b  reason: collision with root package name */
            private final AbstractC0541a f28292b;

            /* renamed from: c  reason: collision with root package name */
            private final h00.a<vz.b0> f28293c;

            /* renamed from: gw.g0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static abstract class AbstractC0541a {

                /* renamed from: a  reason: collision with root package name */
                private final b f28294a;

                /* renamed from: gw.g0$d$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C0542a extends AbstractC0541a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0542a(b overlay) {
                        super(overlay, null);
                        kotlin.jvm.internal.s.g(overlay, "overlay");
                    }
                }

                /* renamed from: gw.g0$d$a$a$b */
                /* loaded from: classes6.dex */
                public static final class b extends AbstractC0541a {

                    /* renamed from: b  reason: collision with root package name */
                    private final int f28295b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(int i11, b overlay) {
                        super(overlay, null);
                        kotlin.jvm.internal.s.g(overlay, "overlay");
                        this.f28295b = i11;
                    }

                    public final int b() {
                        return this.f28295b;
                    }
                }

                /* renamed from: gw.g0$d$a$a$c */
                /* loaded from: classes6.dex */
                public static final class c extends AbstractC0541a {

                    /* renamed from: b  reason: collision with root package name */
                    private final h00.l<String, vz.b0> f28296b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public c(h00.l<? super String, vz.b0> processImage, b overlay) {
                        super(overlay, null);
                        kotlin.jvm.internal.s.g(processImage, "processImage");
                        kotlin.jvm.internal.s.g(overlay, "overlay");
                        this.f28296b = processImage;
                    }

                    public final h00.l<String, vz.b0> b() {
                        return this.f28296b;
                    }
                }

                /* renamed from: gw.g0$d$a$a$d  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C0543d extends AbstractC0541a {

                    /* renamed from: b  reason: collision with root package name */
                    private final h00.a<vz.b0> f28297b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0543d(h00.a<vz.b0> startCountdown, b overlay) {
                        super(overlay, null);
                        kotlin.jvm.internal.s.g(startCountdown, "startCountdown");
                        kotlin.jvm.internal.s.g(overlay, "overlay");
                        this.f28297b = startCountdown;
                    }

                    public final h00.a<vz.b0> b() {
                        return this.f28297b;
                    }
                }

                /* renamed from: gw.g0$d$a$a$e */
                /* loaded from: classes6.dex */
                public static final class e extends AbstractC0541a {

                    /* renamed from: b  reason: collision with root package name */
                    private final h00.a<vz.b0> f28298b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(h00.a<vz.b0> onComplete, b overlay) {
                        super(overlay, null);
                        kotlin.jvm.internal.s.g(onComplete, "onComplete");
                        kotlin.jvm.internal.s.g(overlay, "overlay");
                        this.f28298b = onComplete;
                    }

                    public final h00.a<vz.b0> b() {
                        return this.f28298b;
                    }
                }

                private AbstractC0541a(b bVar) {
                    this.f28294a = bVar;
                }

                public /* synthetic */ AbstractC0541a(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
                    this(bVar);
                }

                public final b a() {
                    return this.f28294a;
                }
            }

            /* loaded from: classes6.dex */
            public enum b {
                CLEAR,
                CENTER,
                LOOK_LEFT,
                LOOK_RIGHT,
                COMPLETE
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Integer num, AbstractC0541a mode, h00.a<vz.b0> cancel) {
                super(null);
                kotlin.jvm.internal.s.g(mode, "mode");
                kotlin.jvm.internal.s.g(cancel, "cancel");
                this.f28291a = num;
                this.f28292b = mode;
                this.f28293c = cancel;
            }

            public final h00.a<vz.b0> a() {
                return this.f28293c;
            }

            public final Integer b() {
                return this.f28291a;
            }

            public final AbstractC0541a c() {
                return this.f28292b;
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            private final h00.a<vz.b0> f28299a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h00.a<vz.b0> onClick) {
                super(null);
                kotlin.jvm.internal.s.g(onClick, "onClick");
                this.f28299a = onClick;
            }

            public final h00.a<vz.b0> a() {
                return this.f28299a;
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final c f28300a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: gw.g0$d$d  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0544d extends d {

            /* renamed from: a  reason: collision with root package name */
            private final h00.a<vz.b0> f28301a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0544d(h00.a<vz.b0> onClick) {
                super(null);
                kotlin.jvm.internal.s.g(onClick, "onClick");
                this.f28301a = onClick;
            }

            public final h00.a<vz.b0> a() {
                return this.f28301a;
            }
        }

        /* loaded from: classes6.dex */
        public static final class e extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final e f28302a = new e();

            private e() {
                super(null);
            }
        }

        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d0 extends kotlin.jvm.internal.u implements h00.l<d.b, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28304a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(c0.k.f28243b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28305a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f28287a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        d0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(d.b it2) {
            nr.q<b, gw.c0, c> d11;
            nr.q<b, gw.c0, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof d.b.C0605b) {
                d12 = nr.y.d(g0.this, null, a.f28304a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, d.b.a.f32800a)) {
                d11 = nr.y.d(g0.this, null, b.f28305a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<e.b, nr.q<? super b, gw.c0, ? extends c>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ gw.n f28307b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ gw.n f28308a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(gw.n nVar) {
                super(1);
                this.f28308a = nVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(action.c().b(this.f28308a));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28309a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f28287a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(gw.n nVar) {
            super(1);
            this.f28307b = nVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(e.b it2) {
            nr.q<b, gw.c0, c> d11;
            nr.q<b, gw.c0, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, e.b.C0606b.f32811a)) {
                d12 = nr.y.d(g0.this, null, new a(this.f28307b), 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, e.b.a.f32810a)) {
                d11 = nr.y.d(g0.this, null, b.f28309a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e0 extends kotlin.jvm.internal.u implements h00.l<a.c, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.c f28311a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.c cVar) {
                super(1);
                this.f28311a = cVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                if (!kotlin.jvm.internal.s.c(((a.c.b) this.f28311a).a(), "failed") && !kotlin.jvm.internal.s.c(((a.c.b) this.f28311a).a(), "requires_retry")) {
                    if (kotlin.jvm.internal.s.c(((a.c.b) this.f28311a).a(), "submitted")) {
                        return;
                    }
                    action.d(c.C0540c.f28286a);
                    return;
                }
                action.e(c0.f.f28237b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28312a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f28287a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        e0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(a.c it2) {
            nr.q<b, gw.c0, c> d11;
            nr.q<b, gw.c0, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof a.c.b) {
                d12 = nr.y.d(g0.this, null, new a(it2), 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, a.c.C0602a.f32783a)) {
                d11 = nr.y.d(g0.this, null, b.f28312a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<o.c, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.c f28314a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o.c cVar) {
                super(1);
                this.f28314a = cVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                o.c cVar = this.f28314a;
                if (cVar instanceof o.c.b) {
                    z02 = wz.e0.z0(action.c().a(), ((o.c.b) this.f28314a).a());
                    action.e(new c0.d(new c0.b(z02, false, 2, null)));
                } else if (cVar instanceof o.c.a) {
                    action.e(new c0.a(null, true, 1, null));
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(o.c output) {
            nr.q<b, gw.c0, c> d11;
            kotlin.jvm.internal.s.g(output, "output");
            d11 = nr.y.d(g0.this, null, new a(output), 1, null);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28316b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28317a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.C0540c.f28286a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28315a = aVar;
            this.f28316b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28315a.b();
            d11 = nr.y.d(this.f28316b, null, a.f28317a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28319b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f28320a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f28320a = str;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                z02 = wz.e0.z0(action.c().a(), new gw.n(this.f28320a, n.c.CENTER, n.a.MANUAL));
                action.e(new c0.d(new c0.b(z02, false, 2, null)));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(1);
            this.f28318a = aVar;
            this.f28319b = g0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String absolutePath) {
            nr.q<? super b, gw.c0, ? extends c> d11;
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28318a.b();
            d11 = nr.y.d(this.f28319b, null, new a(absolutePath), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.g0$g0  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0545g0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28322b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gw.g0$g0$a */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28323a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(c0.h.f28239b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0545g0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28321a = aVar;
            this.f28322b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28321a.b();
            d11 = nr.y.d(this.f28322b, null, a.f28323a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28325b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28326a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28324a = aVar;
            this.f28325b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28324a.b();
            d11 = nr.y.d(this.f28325b, null, a.f28326a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class h0 extends kotlin.jvm.internal.u implements h00.l<s.a, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s.a f28328a;

            /* renamed from: gw.g0$h0$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C0546a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f28329a;

                static {
                    int[] iArr = new int[s.a.values().length];
                    iArr[s.a.Found.ordinal()] = 1;
                    iArr[s.a.NotFound.ordinal()] = 2;
                    f28329a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s.a aVar) {
                super(1);
                this.f28328a = aVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                c0.i iVar = (c0.i) action.c();
                int i11 = C0546a.f28329a[this.f28328a.ordinal()];
                if (i11 == 1) {
                    action.e(c0.i.d(iVar, null, true, 1, null));
                } else if (i11 != 2) {
                } else {
                    action.e(c0.i.d(iVar, null, false, 1, null));
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        h0() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(s.a output) {
            nr.q<b, gw.c0, c> d11;
            kotlin.jvm.internal.s.g(output, "output");
            d11 = nr.y.d(g0.this, null, new a(output), 1, null);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieWorkflow$render$13", f = "SelfieWorkflow.kt", l = {218}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f28332c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28333a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.a(null, true, 1, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var, zz.d<? super i> dVar) {
            super(2, dVar);
            this.f28331b = aVar;
            this.f28332c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new i(this.f28331b, this.f28332c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((i) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            nr.q<? super b, gw.c0, ? extends c> d12;
            d11 = a00.d.d();
            int i11 = this.f28330a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f28330a = 1;
                if (y0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28331b.b();
            d12 = nr.y.d(this.f28332c, null, a.f28333a, 1, null);
            b11.d(d12);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class i0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28335b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28336a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.i(3, false, 2, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28334a = aVar;
            this.f28335b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28334a.b();
            d11 = nr.y.d(this.f28335b, null, a.f28336a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28338b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28339a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28337a = aVar;
            this.f28338b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28337a.b();
            d11 = nr.y.d(this.f28338b, null, a.f28339a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class j0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28341b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28342a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28340a = aVar;
            this.f28341b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28340a.b();
            d11 = nr.y.d(this.f28341b, null, a.f28342a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<o.c, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.c f28344a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o.c cVar) {
                super(1);
                this.f28344a = cVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                o.c cVar = this.f28344a;
                if (cVar instanceof o.c.b) {
                    z02 = wz.e0.z0(action.c().a(), ((o.c.b) this.f28344a).a());
                    action.e(new c0.d(new c0.c(z02, false, 2, null)));
                } else if (cVar instanceof o.c.a) {
                    action.e(new c0.b(action.c().a(), true));
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        k() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(o.c output) {
            nr.q<b, gw.c0, c> d11;
            kotlin.jvm.internal.s.g(output, "output");
            d11 = nr.y.d(g0.this, null, new a(output), 1, null);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieWorkflow$render$8", f = "SelfieWorkflow.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class k0 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f28347c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28348a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                gw.c0 eVar;
                kotlin.jvm.internal.s.g(action, "$this$action");
                gw.c0 c11 = action.c();
                c0.i iVar = c11 instanceof c0.i ? (c0.i) c11 : null;
                Integer f11 = iVar == null ? null : iVar.f();
                if (f11 != null) {
                    if (f11.intValue() > 1) {
                        action.e(new c0.i(Integer.valueOf(f11.intValue() - 1), false, 2, null));
                        return;
                    }
                    b b11 = action.b();
                    if (b11 instanceof b.C0539b) {
                        eVar = new c0.a(null, false, 3, null);
                    } else if (!(b11 instanceof b.a)) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        eVar = new c0.e(null, false, 3, null);
                    }
                    action.e(eVar);
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var, zz.d<? super k0> dVar) {
            super(2, dVar);
            this.f28346b = aVar;
            this.f28347c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new k0(this.f28346b, this.f28347c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((k0) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            nr.q<? super b, gw.c0, ? extends c> d12;
            d11 = a00.d.d();
            int i11 = this.f28345a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f28345a = 1;
                if (y0.b(600L, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28346b.b();
            d12 = nr.y.d(this.f28347c, null, a.f28348a, 1, null);
            b11.d(d12);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28350b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f28351a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f28351a = str;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                z02 = wz.e0.z0(action.c().a(), new gw.n(this.f28351a, n.c.LEFT, n.a.MANUAL));
                action.e(new c0.d(new c0.c(z02, false, 2, null)));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(1);
            this.f28349a = aVar;
            this.f28350b = g0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String absolutePath) {
            nr.q<? super b, gw.c0, ? extends c> d11;
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28349a.b();
            d11 = nr.y.d(this.f28350b, null, new a(absolutePath), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class l0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28353b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28354a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l0(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28352a = aVar;
            this.f28353b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28352a.b();
            d11 = nr.y.d(this.f28353b, null, a.f28354a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28356b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28357a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28355a = aVar;
            this.f28356b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28355a.b();
            d11 = nr.y.d(this.f28356b, null, a.f28357a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieWorkflow$render$18", f = "SelfieWorkflow.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f28360c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28361a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.b(action.c().a(), true));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var, zz.d<? super n> dVar) {
            super(2, dVar);
            this.f28359b = aVar;
            this.f28360c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new n(this.f28359b, this.f28360c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((n) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            nr.q<? super b, gw.c0, ? extends c> d12;
            d11 = a00.d.d();
            int i11 = this.f28358a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f28358a = 1;
                if (y0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28359b.b();
            d12 = nr.y.d(this.f28360c, null, a.f28361a, 1, null);
            b11.d(d12);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28363b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28364a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28362a = aVar;
            this.f28363b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28362a.b();
            d11 = nr.y.d(this.f28363b, null, a.f28364a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class p extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28366b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28367a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(c0.g.f28238b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28365a = aVar;
            this.f28366b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28365a.b();
            d11 = nr.y.d(this.f28366b, null, a.f28367a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class q extends kotlin.jvm.internal.u implements h00.l<o.c, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.c f28369a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o.c cVar) {
                super(1);
                this.f28369a = cVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                o.c cVar = this.f28369a;
                if (cVar instanceof o.c.b) {
                    z02 = wz.e0.z0(action.c().a(), ((o.c.b) this.f28369a).a());
                    action.e(new c0.d(new c0.j(z02)));
                } else if (cVar instanceof o.c.a) {
                    action.e(new c0.c(action.c().a(), true));
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        q() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(o.c output) {
            nr.q<b, gw.c0, c> d11;
            kotlin.jvm.internal.s.g(output, "output");
            d11 = nr.y.d(g0.this, null, new a(output), 1, null);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class r extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28371b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f28372a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f28372a = str;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                z02 = wz.e0.z0(action.c().a(), new gw.n(this.f28372a, n.c.RIGHT, n.a.MANUAL));
                action.e(new c0.d(new c0.j(z02)));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(1);
            this.f28370a = aVar;
            this.f28371b = g0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String absolutePath) {
            nr.q<? super b, gw.c0, ? extends c> d11;
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28370a.b();
            d11 = nr.y.d(this.f28371b, null, new a(absolutePath), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class s extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28374b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28375a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28373a = aVar;
            this.f28374b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28373a.b();
            d11 = nr.y.d(this.f28374b, null, a.f28375a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieWorkflow$render$23", f = "SelfieWorkflow.kt", l = {331}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28377b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f28378c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28379a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.c(action.c().a(), true));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var, zz.d<? super t> dVar) {
            super(2, dVar);
            this.f28377b = aVar;
            this.f28378c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new t(this.f28377b, this.f28378c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((t) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            nr.q<? super b, gw.c0, ? extends c> d12;
            d11 = a00.d.d();
            int i11 = this.f28376a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f28376a = 1;
                if (y0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28377b.b();
            d12 = nr.y.d(this.f28378c, null, a.f28379a, 1, null);
            b11.d(d12);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class u extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28381b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28382a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28380a = aVar;
            this.f28381b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28380a.b();
            d11 = nr.y.d(this.f28381b, null, a.f28382a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class v extends kotlin.jvm.internal.u implements h00.l<o.c, nr.q<? super b, gw.c0, ? extends c>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.c f28384a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o.c cVar) {
                super(1);
                this.f28384a = cVar;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                o.c cVar = this.f28384a;
                if (cVar instanceof o.c.b) {
                    z02 = wz.e0.z0(action.c().a(), ((o.c.b) this.f28384a).a());
                    action.e(new c0.d(new c0.j(z02)));
                } else if (cVar instanceof o.c.a) {
                    action.e(new c0.e(action.c().a(), true));
                }
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        v() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<b, gw.c0, c> invoke(o.c output) {
            nr.q<b, gw.c0, c> d11;
            kotlin.jvm.internal.s.g(output, "output");
            d11 = nr.y.d(g0.this, null, new a(output), 1, null);
            return d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class w extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28386b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f28387a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f28387a = str;
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                List z02;
                kotlin.jvm.internal.s.g(action, "$this$action");
                z02 = wz.e0.z0(action.c().a(), new gw.n(this.f28387a, n.c.CENTER, n.a.MANUAL));
                action.e(new c0.d(new c0.j(z02)));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(1);
            this.f28385a = aVar;
            this.f28386b = g0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String absolutePath) {
            nr.q<? super b, gw.c0, ? extends c> d11;
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28385a.b();
            d11 = nr.y.d(this.f28386b, null, new a(absolutePath), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class x extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28389b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28390a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28388a = aVar;
            this.f28389b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28388a.b();
            d11 = nr.y.d(this.f28389b, null, a.f28390a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieWorkflow$render$28", f = "SelfieWorkflow.kt", l = {389}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class y extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28392b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f28393c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28394a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new c0.e(action.c().a(), true));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var, zz.d<? super y> dVar) {
            super(2, dVar);
            this.f28392b = aVar;
            this.f28393c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new y(this.f28392b, this.f28393c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((y) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            nr.q<? super b, gw.c0, ? extends c> d12;
            d11 = a00.d.d();
            int i11 = this.f28391a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f28391a = 1;
                if (y0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28392b.b();
            d12 = nr.y.d(this.f28393c, null, a.f28394a, 1, null);
            b11.d(d12);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class z extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<b, gw.c0, c, d>.a f28395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f28396b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super b, gw.c0, ? extends c>.c, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28397a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super b, gw.c0, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.b.f28285a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(nr.q<? super b, gw.c0, ? extends c>.c cVar) {
                a(cVar);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(nr.k<? super b, gw.c0, ? extends c, ? extends d>.a aVar, g0 g0Var) {
            super(0);
            this.f28395a = aVar;
            this.f28396b = g0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super b, gw.c0, ? extends c> d11;
            nr.h<nr.q<? super b, gw.c0, ? extends c>> b11 = this.f28395a.b();
            d11 = nr.y.d(this.f28396b, null, a.f28397a, 1, null);
            b11.d(d11);
        }
    }

    static {
        new a(null);
    }

    public g0(pv.f cameraPermissionWorker, e.a updateVerificationWorker, d.a submitVerificationWorker, a.b checkVerificationWorker, o.b selfieAnalyzeWorker, gw.s selfieDetectWorker) {
        kotlin.jvm.internal.s.g(cameraPermissionWorker, "cameraPermissionWorker");
        kotlin.jvm.internal.s.g(updateVerificationWorker, "updateVerificationWorker");
        kotlin.jvm.internal.s.g(submitVerificationWorker, "submitVerificationWorker");
        kotlin.jvm.internal.s.g(checkVerificationWorker, "checkVerificationWorker");
        kotlin.jvm.internal.s.g(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        kotlin.jvm.internal.s.g(selfieDetectWorker, "selfieDetectWorker");
        this.f28266a = cameraPermissionWorker;
        this.f28267b = updateVerificationWorker;
        this.f28268c = submitVerificationWorker;
        this.f28269d = checkVerificationWorker;
        this.f28270e = selfieAnalyzeWorker;
        this.f28271f = selfieDetectWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // nr.k
    /* renamed from: h */
    public gw.c0 d(b props, nr.i iVar) {
        kotlin.jvm.internal.s.g(props, "props");
        gw.c0 c0Var = null;
        if (iVar != null) {
            okio.i b11 = iVar.b();
            if (!(b11.z() > 0)) {
                b11 = null;
            }
            if (b11 != null) {
                Parcel obtain = Parcel.obtain();
                kotlin.jvm.internal.s.f(obtain, "obtain()");
                byte[] E = b11.E();
                obtain.unmarshall(E, 0, E.length);
                obtain.setDataPosition(0);
                ?? readParcelable = obtain.readParcelable(nr.i.class.getClassLoader());
                kotlin.jvm.internal.s.e(readParcelable);
                kotlin.jvm.internal.s.f(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                c0Var = readParcelable;
            }
            c0Var = c0Var;
        }
        return c0Var == null ? props.b() ? c0.g.f28238b : c0.h.f28239b : c0Var;
    }

    @Override // nr.k
    /* renamed from: i */
    public d f(b props, gw.c0 state, nr.k<? super b, gw.c0, ? extends c, ? extends d>.a context) {
        d.a.b bVar;
        kotlin.jvm.internal.s.g(props, "props");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(context, "context");
        gw.n nVar = (gw.n) wz.u.d0(state.a());
        if (nVar != null) {
            nr.v.i(context, this.f28267b.a(props.a(), props.c(), nVar), m0.m(iw.e.class), nVar.toString(), new e(nVar));
        }
        if (kotlin.jvm.internal.s.c(state, c0.h.f28239b)) {
            return new d.C0544d(new p(context, this));
        }
        if (kotlin.jvm.internal.s.c(state, c0.g.f28238b)) {
            nr.v.i(context, this.f28266a, m0.m(pv.f.class), "", new a0(props));
            if (props.b()) {
                return d.c.f28300a;
            }
            return new d.C0544d(new C0545g0(context, this));
        } else if (state instanceof c0.i) {
            nr.v.i(context, this.f28271f, m0.m(gw.s.class), "", new h0());
            c0.i iVar = (c0.i) state;
            if (iVar.f() == null) {
                return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.C0543d(new i0(context, this), iVar.e() ? d.a.b.CENTER : d.a.b.CLEAR), new j0(context, this));
            }
            context.a(kotlin.jvm.internal.s.p("countdown_", iVar.f()), new k0(context, this, null));
            return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.b(iVar.f().intValue(), d.a.b.CENTER), new l0(context, this));
        } else if (state instanceof c0.a) {
            nr.v.i(context, this.f28270e.a(n.c.CENTER), m0.m(gw.o.class), "", new f());
            if (((c0.a) state).c()) {
                return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.c(new g(context, this), d.a.b.CENTER), new h(context, this));
            }
            context.a("manual_capture_center", new i(context, this, null));
            return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.C0542a(d.a.b.CENTER), new j(context, this));
        } else if (state instanceof c0.b) {
            nr.v.i(context, this.f28270e.a(n.c.LEFT), m0.m(gw.o.class), "", new k());
            if (((c0.b) state).c()) {
                return new d.a(Integer.valueOf(gw.l.f28433b), new d.a.AbstractC0541a.c(new l(context, this), d.a.b.LOOK_LEFT), new m(context, this));
            }
            context.a("manual_capture_left", new n(context, this, null));
            return new d.a(Integer.valueOf(gw.l.f28433b), new d.a.AbstractC0541a.C0542a(d.a.b.LOOK_LEFT), new o(context, this));
        } else if (state instanceof c0.c) {
            nr.v.i(context, this.f28270e.a(n.c.RIGHT), m0.m(gw.o.class), "", new q());
            if (((c0.c) state).c()) {
                return new d.a(Integer.valueOf(gw.l.f28434c), new d.a.AbstractC0541a.c(new r(context, this), d.a.b.LOOK_RIGHT), new s(context, this));
            }
            context.a("manual_capture_right", new t(context, this, null));
            return new d.a(Integer.valueOf(gw.l.f28434c), new d.a.AbstractC0541a.C0542a(d.a.b.LOOK_RIGHT), new u(context, this));
        } else if (state instanceof c0.e) {
            nr.v.i(context, this.f28270e.a(n.c.CENTER), m0.m(gw.o.class), "", new v());
            if (((c0.e) state).c()) {
                return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.c(new w(context, this), d.a.b.CENTER), new x(context, this));
            }
            context.a("manual_capture_right", new y(context, this, null));
            return new d.a(Integer.valueOf(gw.l.f28432a), new d.a.AbstractC0541a.C0542a(d.a.b.CENTER), new z(context, this));
        } else {
            boolean z11 = state instanceof c0.d;
            if (z11) {
                b0 b0Var = new b0(context, this);
                c0.d dVar = z11 ? (c0.d) state : null;
                gw.c0 c11 = dVar == null ? null : dVar.c();
                if (c11 instanceof c0.b) {
                    bVar = d.a.b.LOOK_LEFT;
                } else if (c11 instanceof c0.c) {
                    bVar = d.a.b.LOOK_RIGHT;
                } else {
                    bVar = c11 instanceof c0.j ? d.a.b.COMPLETE : d.a.b.CLEAR;
                }
                return new d.a(null, new d.a.AbstractC0541a.e(b0Var, bVar), new c0(context, this));
            } else if (state instanceof c0.j) {
                if (state.a().isEmpty()) {
                    nr.v.i(context, this.f28268c.a(props.a(), props.c()), m0.m(iw.d.class), "", new d0());
                }
                return d.e.f28302a;
            } else if (kotlin.jvm.internal.s.c(state, c0.k.f28243b)) {
                nr.v.i(context, this.f28269d.a(props.a(), props.c()), m0.m(iw.a.class), "", new e0());
                return d.e.f28302a;
            } else if (kotlin.jvm.internal.s.c(state, c0.f.f28237b)) {
                return new d.b(new f0(context, this));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // nr.k
    /* renamed from: j */
    public nr.i g(gw.c0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        return jw.a.a(state);
    }
}