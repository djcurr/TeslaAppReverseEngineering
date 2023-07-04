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
public final class l implements pr.i<j0.c.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61149b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final aw.a f61150a;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<j0.c.a> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ pr.u<j0.c.a> f61151a;

        /* renamed from: zv.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        /* synthetic */ class C1406a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, aw.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1406a f61152a = new C1406a();

            C1406a() {
                super(3, aw.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryCompleteBinding;", 0);
            }

            public final aw.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return aw.a.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ aw.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* loaded from: classes6.dex */
        /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.l<aw.a, l> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f61153a = new b();

            b() {
                super(1, l.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/internal/databinding/InquiryCompleteBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final l invoke(aw.a p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new l(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f61151a = new pr.r(kotlin.jvm.internal.m0.b(j0.c.a.class), C1406a.f61152a, b.f61153a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f61151a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.a> getType() {
            return this.f61151a.getType();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61154a;

        static {
            int[] iArr = new int[NextStep.b.values().length];
            iArr[NextStep.b.DEFAULT.ordinal()] = 1;
            iArr[NextStep.b.NONE.ordinal()] = 2;
            f61154a = iArr;
        }
    }

    public l(aw.a binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f61150a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j0.c.a rendering, View view) {
        kotlin.jvm.internal.s.g(rendering, "$rendering");
        rendering.c().invoke();
    }

    @Override // pr.i
    /* renamed from: c */
    public void a(final j0.c.a rendering, pr.s viewEnvironment) {
        String a11;
        String b11;
        String c11;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        aw.a aVar = this.f61150a;
        int i11 = b.f61154a[rendering.d().ordinal()];
        if (i11 == 1) {
            aVar.f7057d.setVisibility(0);
        } else if (i11 == 2) {
            aVar.f7057d.setVisibility(8);
        }
        Context context = this.f61150a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "context");
        TypedValue a12 = f0.a(context, "personaInquiryCompleteImage");
        if (a12.type != 0) {
            aVar.f7057d.setImageResource(a12.resourceId);
            aVar.f7057d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        NextStep.Completed.CustomTranslations b12 = rendering.b();
        if (b12 != null && (c11 = b12.c()) != null) {
            aVar.f7058e.setText(c11);
        }
        NextStep.Completed.CustomTranslations b13 = rendering.b();
        if (b13 != null && (b11 = b13.b()) != null) {
            aVar.f7055b.setText(b11);
        }
        NextStep.Completed.CustomTranslations b14 = rendering.b();
        if (b14 != null && (a11 = b14.a()) != null) {
            aVar.f7056c.setText(a11);
        }
        aVar.f7056c.setOnClickListener(new View.OnClickListener() { // from class: zv.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.d(j0.c.a.this, view);
            }
        });
    }
}