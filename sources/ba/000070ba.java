package gu;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t implements p {

    /* renamed from: c */
    public static final a f28135c = new a(null);

    /* renamed from: d */
    private static final com.tesla.logging.g f28136d = com.tesla.logging.g.f21878b.a("TeslaRoutableMessageBuilder");

    /* renamed from: a */
    private final p f28137a;

    /* renamed from: b */
    private final p f28138b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(p localRoutableMessageBuilder, p remoteRoutableMessageBuilder) {
            kotlin.jvm.internal.s.g(localRoutableMessageBuilder, "localRoutableMessageBuilder");
            kotlin.jvm.internal.s.g(remoteRoutableMessageBuilder, "remoteRoutableMessageBuilder");
            return new t(localRoutableMessageBuilder, remoteRoutableMessageBuilder, null);
        }
    }

    private t(p pVar, p pVar2) {
        this.f28137a = pVar;
        this.f28138b = pVar2;
    }

    public /* synthetic */ t(p pVar, p pVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, pVar2);
    }

    public static /* synthetic */ void b(yt.f fVar) {
        c(fVar);
    }

    public static final void c(yt.f fVar) {
        com.tesla.logging.g gVar = f28136d;
        String e11 = zu.j.e(fVar.encode(), 0, 1, null);
        gVar.a("built: " + fVar + " => `" + e11 + "`");
    }

    @Override // gu.p
    public hy.m<yt.f> a(k params) {
        hy.m<yt.f> a11;
        kotlin.jvm.internal.s.g(params, "params");
        if (params.c().V()) {
            a11 = this.f28138b.a(params);
        } else {
            a11 = this.f28137a.a(params);
        }
        hy.m<yt.f> g11 = a11.g(new ky.f() { // from class: gu.s
            @Override // ky.f
            public final void accept(Object obj) {
                t.b((yt.f) obj);
            }
        });
        kotlin.jvm.internal.s.f(g11, "if (params.request.isRem….encode().hex()}`\")\n    }");
        return g11;
    }
}