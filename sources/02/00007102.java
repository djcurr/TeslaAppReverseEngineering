package gw;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gw.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class g implements pr.i<g0.d.c> {

    /* renamed from: b */
    public static final a f28261b = new a(null);

    /* renamed from: a */
    private final hw.c f28262a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<g0.d.c> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<g0.d.c> f28263a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gw.g$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C0538a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, hw.c> {

            /* renamed from: a */
            public static final C0538a f28264a = new C0538a();

            C0538a() {
                super(3, hw.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieGenericLoadingScreenBinding;", 0);
            }

            public final hw.c d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return hw.c.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ hw.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<hw.c, g> {

            /* renamed from: a */
            public static final b f28265a = new b();

            b() {
                super(1, g.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieGenericLoadingScreenBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final g invoke(hw.c p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new g(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f28263a = new pr.r(m0.b(g0.d.c.class), C0538a.f28264a, b.f28265a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(g0.d.c initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f28263a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super g0.d.c> getType() {
            return this.f28263a.getType();
        }
    }

    public g(hw.c binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f28262a = binding;
        Context context = binding.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        TypedValue a11 = b0.a(context, "personaInquiryLoadingLottieRaw");
        if (a11.type != 0) {
            binding.f29456b.setAnimation(a11.resourceId);
            binding.f29456b.v();
            return;
        }
        binding.f29456b.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: gw.f
            {
                g.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return g.c(g.this, bVar);
            }
        });
        binding.f29456b.i(new a8.e("**"), v7.j.f54280a, new i8.e() { // from class: gw.e
            {
                g.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return g.b(g.this, bVar);
            }
        });
        binding.f29456b.setMinFrame(318);
    }

    public static /* synthetic */ Integer b(g gVar, i8.b bVar) {
        return e(gVar, bVar);
    }

    public static /* synthetic */ Integer c(g gVar, i8.b bVar) {
        return d(gVar, bVar);
    }

    public static final Integer d(g this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28262a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28398a, null, false, 6, null));
    }

    public static final Integer e(g this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28262a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28399b, null, false, 6, null));
    }

    @Override // pr.i
    /* renamed from: f */
    public void a(g0.d.c rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
    }
}