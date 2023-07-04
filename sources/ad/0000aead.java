package qv;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;
import pr.u;
import qv.m;

/* loaded from: classes6.dex */
public final class g implements pr.i<m.c.b> {

    /* renamed from: b */
    public static final a f48530b = new a(null);

    /* renamed from: a */
    private final LottieAnimationView f48531a;

    /* loaded from: classes6.dex */
    public static final class a implements u<m.c.b> {

        /* renamed from: a */
        private final /* synthetic */ u<m.c.b> f48532a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qv.g$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1039a extends kotlin.jvm.internal.p implements h00.l<View, g> {

            /* renamed from: a */
            public static final C1039a f48533a = new C1039a();

            C1039a() {
                super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final g invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new g(p02);
            }
        }

        private a() {
            i.a aVar = pr.i.f46871h1;
            this.f48532a = new pr.k(m0.b(m.c.b.class), s.f48676e, C1039a.f48533a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(m.c.b initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f48532a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super m.c.b> getType() {
            return this.f48532a.getType();
        }
    }

    public g(final View view) {
        kotlin.jvm.internal.s.g(view, "view");
        View findViewById = view.findViewById(r.f48652g);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.a…database_loading_spinner)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.f48531a = lottieAnimationView;
        lottieAnimationView.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: qv.e
            {
                g.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return g.b(g.this, view, bVar);
            }
        });
        lottieAnimationView.i(new a8.e("**"), v7.j.f54280a, new i8.e() { // from class: qv.f
            {
                g.this = this;
            }

            @Override // i8.e
            public final Object a(i8.b bVar) {
                return g.c(g.this, view, bVar);
            }
        });
        lottieAnimationView.setMinFrame(318);
    }

    public static /* synthetic */ Integer b(g gVar, View view, i8.b bVar) {
        return d(gVar, view, bVar);
    }

    public static /* synthetic */ Integer c(g gVar, View view, i8.b bVar) {
        return e(gVar, view, bVar);
    }

    public static final Integer d(g this$0, View view, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(view, "$view");
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(g(this$0, context, o.f48642b, null, false, 6, null));
    }

    public static final Integer e(g this$0, View view, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(view, "$view");
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(g(this$0, context, o.f48641a, null, false, 6, null));
    }

    private final int f(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int g(g gVar, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return gVar.f(context, i11, typedValue, z11);
    }

    @Override // pr.i
    /* renamed from: h */
    public void a(m.c.b rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
    }
}