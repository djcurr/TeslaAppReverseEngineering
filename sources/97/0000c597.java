package zv;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.i;
import zv.j0;

/* loaded from: classes6.dex */
public final class d0 implements pr.i<j0.c.e> {

    /* renamed from: c */
    public static final a f60851c = new a(null);

    /* renamed from: a */
    private final View f60852a;

    /* renamed from: b */
    private final LottieAnimationView f60853b;

    /* loaded from: classes6.dex */
    public static final class a implements pr.u<j0.c.e> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<j0.c.e> f60854a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zv.d0$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1399a extends kotlin.jvm.internal.p implements h00.l<View, d0> {

            /* renamed from: a */
            public static final C1399a f60855a = new C1399a();

            C1399a() {
                super(1, d0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final d0 invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new d0(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f60854a = new pr.k(kotlin.jvm.internal.m0.b(j0.c.e.class), n0.f61187f, C1399a.f60855a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(j0.c.e initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f60854a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super j0.c.e> getType() {
            return this.f60854a.getType();
        }
    }

    public d0(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        this.f60852a = view;
        View findViewById = view.findViewById(m0.f61157a);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.a…uiry_initializingspinner)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.f60853b = lottieAnimationView;
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        TypedValue a11 = f0.a(context, "personaInquiryLoadingLottieRaw");
        if (a11.type != 0) {
            lottieAnimationView.setAnimation(a11.resourceId);
            lottieAnimationView.v();
            return;
        }
        lottieAnimationView.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: zv.b0
            {
                d0.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return d0.b(d0.this, bVar);
            }
        });
        lottieAnimationView.i(new a8.e("**"), v7.j.f54280a, new i8.e() { // from class: zv.c0
            {
                d0.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return d0.c(d0.this, bVar);
            }
        });
        lottieAnimationView.setMinFrame(318);
    }

    public static /* synthetic */ Integer b(d0 d0Var, i8.b bVar) {
        return d(d0Var, bVar);
    }

    public static /* synthetic */ Integer c(d0 d0Var, i8.b bVar) {
        return e(d0Var, bVar);
    }

    public static final Integer d(d0 this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.h().getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(g(this$0, context, l0.f61156b, null, false, 6, null));
    }

    public static final Integer e(d0 this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.h().getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(g(this$0, context, l0.f61155a, null, false, 6, null));
    }

    private final int f(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int g(d0 d0Var, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return d0Var.f(context, i11, typedValue, z11);
    }

    public final View h() {
        return this.f60852a;
    }

    @Override // pr.i
    /* renamed from: i */
    public void a(j0.c.e rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
    }
}