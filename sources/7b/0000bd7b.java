package wv;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk.inquiry.governmentid.b;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class x implements pr.i<b.d.C0424d> {

    /* renamed from: b */
    public static final a f56381b = new a(null);

    /* renamed from: a */
    private final xv.a f56382a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<b.d.C0424d> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<b.d.C0424d> f56383a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wv.x$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1280a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, xv.a> {

            /* renamed from: a */
            public static final C1280a f56384a = new C1280a();

            C1280a() {
                super(3, xv.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/governmentid/databinding/GovernmentIdReviewBinding;", 0);
            }

            public final xv.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return xv.a.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ xv.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<xv.a, x> {

            /* renamed from: a */
            public static final b f56385a = new b();

            b() {
                super(1, x.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/governmentid/databinding/GovernmentIdReviewBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final x invoke(xv.a p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new x(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f56383a = new pr.r(m0.b(b.d.C0424d.class), C1280a.f56384a, b.f56385a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(b.d.C0424d initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f56383a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super b.d.C0424d> getType() {
            return this.f56383a.getType();
        }
    }

    public x(xv.a binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f56382a = binding;
        binding.getRoot().post(new Runnable() { // from class: wv.w
            {
                x.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.d(x.this);
            }
        });
        binding.getRoot().post(new Runnable() { // from class: wv.v
            {
                x.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.c(x.this);
            }
        });
    }

    public static /* synthetic */ void b(b.d.C0424d c0424d, View view) {
        k(c0424d, view);
    }

    public static /* synthetic */ void c(x xVar) {
        h(xVar);
    }

    public static /* synthetic */ void d(x xVar) {
        g(xVar);
    }

    public static /* synthetic */ void e(b.d.C0424d c0424d, View view) {
        l(c0424d, view);
    }

    public static /* synthetic */ void f(b.d.C0424d c0424d, View view) {
        j(c0424d, view);
    }

    public static final void g(x this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        ObjectAnimator duration = ObjectAnimator.ofFloat(this$0.f56382a.f57735d, "alpha", 0.9f, BitmapDescriptorFactory.HUE_RED).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        this$0.f56382a.getRoot().setHapticFeedbackEnabled(true);
        this$0.f56382a.getRoot().performHapticFeedback(1, 2);
    }

    public static final void h(x this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        pv.b bVar = pv.b.f46931a;
        Context context = this$0.f56382a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        bVar.a(context);
    }

    public static final void j(b.d.C0424d rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.b().invoke();
    }

    public static final void k(b.d.C0424d rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.a().invoke();
    }

    public static final void l(b.d.C0424d rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.e().invoke();
    }

    @Override // pr.i
    /* renamed from: i */
    public void a(final b.d.C0424d rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        xv.a aVar = this.f56382a;
        com.squareup.picasso.t.g().j(new File(rendering.c())).h(2000, 2000).g().a().e(aVar.f57739h);
        aVar.f57737f.setText(this.f56382a.getRoot().getContext().getString(rendering.f()));
        aVar.f57736e.setText(this.f56382a.getRoot().getContext().getString(rendering.d()));
        aVar.f57734c.setOnClickListener(new View.OnClickListener() { // from class: wv.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.f(b.d.C0424d.this, view);
            }
        });
        aVar.f57733b.setOnClickListener(new View.OnClickListener() { // from class: wv.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.b(b.d.C0424d.this, view);
            }
        });
        aVar.f57738g.setOnClickListener(new View.OnClickListener() { // from class: wv.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.e(b.d.C0424d.this, view);
            }
        });
    }
}