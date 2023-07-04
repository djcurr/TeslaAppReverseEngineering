package wv;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk.inquiry.governmentid.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class c0 implements pr.i<b.d.e> {

    /* renamed from: d */
    public static final b f56222d = new b(null);

    /* renamed from: a */
    private final LottieAnimationView f56223a;

    /* renamed from: b */
    private final TextView f56224b;

    /* renamed from: c */
    private final TextView f56225c;

    /* loaded from: classes6.dex */
    public static final class a implements Animator.AnimatorListener {
        a() {
            c0.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            c0.this.f56223a.setMinFrame(318);
            c0.this.f56223a.u();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements pr.u<b.d.e> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<b.d.e> f56227a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<View, c0> {

            /* renamed from: a */
            public static final a f56228a = new a();

            a() {
                super(1, c0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final c0 invoke(View p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new c0(p02);
            }
        }

        private b() {
            i.a aVar = pr.i.f46871h1;
            this.f56227a = new pr.k(m0.b(b.d.e.class), i0.f56318f, a.f56228a);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(b.d.e initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f56227a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super b.d.e> getType() {
            return this.f56227a.getType();
        }
    }

    public c0(final View view) {
        kotlin.jvm.internal.s.g(view, "view");
        View findViewById = view.findViewById(h0.f56281b);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.a…iew_governmentid_pending)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.f56223a = lottieAnimationView;
        View findViewById2 = view.findViewById(h0.f56305z);
        kotlin.jvm.internal.s.f(findViewById2, "view.findViewById(R.id.t…vernmentid_pending_title)");
        TextView textView = (TextView) findViewById2;
        this.f56224b = textView;
        View findViewById3 = view.findViewById(h0.f56304y);
        kotlin.jvm.internal.s.f(findViewById3, "view.findViewById(R.id.t…overnmentid_pending_body)");
        TextView textView2 = (TextView) findViewById3;
        this.f56225c = textView2;
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        TypedValue a11 = y.a(context, "personaInquiryLoadingLottieRaw");
        if (a11.type != 0) {
            lottieAnimationView.setAnimation(a11.resourceId);
            lottieAnimationView.v();
        } else {
            lottieAnimationView.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: wv.a0
                {
                    c0.this = this;
                }

                @Override // i8.e
                public final Object a(i8.b bVar) {
                    return c0.b(c0.this, view, bVar);
                }
            });
            lottieAnimationView.i(new a8.e("**"), v7.j.f54280a, new i8.e() { // from class: wv.b0
                {
                    c0.this = this;
                }

                @Override // i8.e
                public final Object a(i8.b bVar) {
                    return c0.c(c0.this, view, bVar);
                }
            });
            lottieAnimationView.g(new a());
        }
        if (TextUtils.isEmpty(textView.getText().toString())) {
            textView.setVisibility(8);
        }
        if (TextUtils.isEmpty(textView2.getText().toString())) {
            textView2.setVisibility(8);
        }
    }

    public static /* synthetic */ Integer b(c0 c0Var, View view, i8.b bVar) {
        return d(c0Var, view, bVar);
    }

    public static /* synthetic */ Integer c(c0 c0Var, View view, i8.b bVar) {
        return e(c0Var, view, bVar);
    }

    public static final Integer d(c0 this$0, View view, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(view, "$view");
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(h(this$0, context, f0.f56246a, null, false, 6, null));
    }

    public static final Integer e(c0 this$0, View view, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(view, "$view");
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        return Integer.valueOf(h(this$0, context, f0.f56247b, null, false, 6, null));
    }

    private final int g(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int h(c0 c0Var, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return c0Var.g(context, i11, typedValue, z11);
    }

    @Override // pr.i
    /* renamed from: i */
    public void a(b.d.e rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
    }
}