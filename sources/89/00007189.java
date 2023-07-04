package gw;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gw.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import org.slf4j.Marker;
import pr.i;

/* loaded from: classes6.dex */
public final class y implements pr.i<g0.d.C0544d> {

    /* renamed from: b */
    public static final a f28483b = new a(null);

    /* renamed from: a */
    private final hw.d f28484a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<g0.d.C0544d> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<g0.d.C0544d> f28485a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gw.y$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C0548a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, hw.d> {

            /* renamed from: a */
            public static final C0548a f28486a = new C0548a();

            C0548a() {
                super(3, hw.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieInstructionsBinding;", 0);
            }

            public final hw.d d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return hw.d.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ hw.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<hw.d, y> {

            /* renamed from: a */
            public static final b f28487a = new b();

            b() {
                super(1, y.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieInstructionsBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final y invoke(hw.d p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new y(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f28485a = new pr.r(m0.b(g0.d.C0544d.class), C0548a.f28486a, b.f28487a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(g0.d.C0544d initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f28485a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super g0.d.C0544d> getType() {
            return this.f28485a.getType();
        }
    }

    public y(hw.d binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f28484a = binding;
    }

    public static /* synthetic */ Integer c(y yVar, i8.b bVar) {
        return g(yVar, bVar);
    }

    public static /* synthetic */ Integer d(y yVar, i8.b bVar) {
        return h(yVar, bVar);
    }

    public static final void f(g0.d.C0544d rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.a().invoke();
    }

    public static final Integer g(y this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28484a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28400c, null, false, 6, null));
    }

    public static final Integer h(y this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28484a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28398a, null, false, 6, null));
    }

    @Override // pr.i
    /* renamed from: e */
    public void a(final g0.d.C0544d rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        hw.d dVar = this.f28484a;
        dVar.f29459c.setOnClickListener(new View.OnClickListener() { // from class: gw.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.f(g0.d.C0544d.this, view);
            }
        });
        Context context = this.f28484a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "context");
        TypedValue a11 = b0.a(context, "personaInquirySelfieLottieRaw");
        if (a11.type != 0) {
            dVar.f29458b.setAnimation(a11.resourceId);
            dVar.f29458b.v();
            return;
        }
        dVar.f29458b.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: gw.w
            {
                y.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return y.c(y.this, bVar);
            }
        });
        dVar.f29458b.i(new a8.e("**", "Group 3", Marker.ANY_MARKER), v7.j.f54280a, new i8.e() { // from class: gw.x
            {
                y.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return y.d(y.this, bVar);
            }
        });
    }
}