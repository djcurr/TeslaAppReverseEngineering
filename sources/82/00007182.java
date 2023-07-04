package gw;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gw.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class u implements pr.i<g0.d.b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f28475b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final hw.b f28476a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<g0.d.b> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<g0.d.b> f28477a;

        /* renamed from: gw.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C0547a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, hw.b> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0547a f28478a = new C0547a();

            C0547a() {
                super(3, hw.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieFailedBinding;", 0);
            }

            public final hw.b d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return hw.b.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ hw.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* loaded from: classes6.dex */
        /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<hw.b, u> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f28479a = new b();

            b() {
                super(1, u.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieFailedBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final u invoke(hw.b p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new u(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f28477a = new pr.r(m0.b(g0.d.b.class), C0547a.f28478a, b.f28479a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(g0.d.b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f28477a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super g0.d.b> getType() {
            return this.f28477a.getType();
        }
    }

    public u(hw.b binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f28476a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g0.d.b rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.a().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final g0.d.b rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        this.f28476a.f29451b.setOnClickListener(new View.OnClickListener() { // from class: gw.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.d(g0.d.b.this, view);
            }
        });
        Context context = this.f28476a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "context");
        TypedValue a11 = b0.a(context, "personaInquiryFailImage");
        if (a11.type != 0) {
            this.f28476a.f29452c.setImageResource(a11.resourceId);
            this.f28476a.f29452c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
    }
}