package zv;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.i;
import zv.j0;

/* loaded from: classes6.dex */
public final class y implements pr.i<j0.c.d> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61241b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final aw.c f61242a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<j0.c.d> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<j0.c.d> f61243a;

        /* renamed from: zv.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1410a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, aw.c> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1410a f61244a = new C1410a();

            C1410a() {
                super(3, aw.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryFailBinding;", 0);
            }

            public final aw.c d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return aw.c.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ aw.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* loaded from: classes6.dex */
        /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<aw.c, y> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f61245a = new b();

            b() {
                super(1, y.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryFailBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final y invoke(aw.c p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new y(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f61243a = new pr.r(kotlin.jvm.internal.m0.b(j0.c.d.class), C1410a.f61244a, b.f61245a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.d initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f61243a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.d> getType() {
            return this.f61243a.getType();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61246a;

        static {
            int[] iArr = new int[NextStep.b.values().length];
            iArr[NextStep.b.DEFAULT.ordinal()] = 1;
            iArr[NextStep.b.NONE.ordinal()] = 2;
            f61246a = iArr;
        }
    }

    public y(aw.c binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f61242a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j0.c.d rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.c().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final j0.c.d rendering, pr.s viewEnvironment) {
        String a11;
        String b11;
        String c11;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        aw.c cVar = this.f61242a;
        int i11 = b.f61246a[rendering.d().ordinal()];
        if (i11 == 1) {
            cVar.f7073d.setVisibility(0);
        } else if (i11 == 2) {
            cVar.f7073d.setVisibility(8);
        }
        Context context = this.f61242a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "context");
        TypedValue a12 = f0.a(context, "personaInquiryFailImage");
        if (a12.type != 0) {
            cVar.f7073d.setImageResource(a12.resourceId);
            cVar.f7073d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        NextStep.Failed.CustomTranslations b12 = rendering.b();
        if (b12 != null && (c11 = b12.c()) != null) {
            cVar.f7074e.setText(c11);
        }
        NextStep.Failed.CustomTranslations b13 = rendering.b();
        if (b13 != null && (b11 = b13.b()) != null) {
            cVar.f7071b.setText(b11);
        }
        NextStep.Failed.CustomTranslations b14 = rendering.b();
        if (b14 != null && (a11 = b14.a()) != null) {
            cVar.f7072c.setText(a11);
        }
        cVar.f7072c.setOnClickListener(new View.OnClickListener() { // from class: zv.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.d(j0.c.d.this, view);
            }
        });
    }
}