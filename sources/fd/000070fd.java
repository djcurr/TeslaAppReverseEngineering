package gw;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gw.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import pr.i;

/* loaded from: classes6.dex */
public final class f0 implements pr.i<g0.d.e> {

    /* renamed from: b */
    public static final b f28255b = new b(null);

    /* renamed from: a */
    private final hw.f f28256a;

    /* loaded from: classes6.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ hw.f f28257a;

        a(hw.f fVar) {
            this.f28257a = fVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f28257a.f29468b.setMinFrame(318);
            this.f28257a.f29468b.u();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements pr.u<g0.d.e> {

        /* renamed from: a */
        private final /* synthetic */ pr.u<g0.d.e> f28258a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.q<LayoutInflater, ViewGroup, Boolean, hw.f> {

            /* renamed from: a */
            public static final a f28259a = new a();

            a() {
                super(3, hw.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieSubmittingScreenBinding;", 0);
            }

            public final hw.f d(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return hw.f.c(p02, viewGroup, z11);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ hw.f invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gw.f0$b$b */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C0537b extends kotlin.jvm.internal.p implements h00.l<hw.f, f0> {

            /* renamed from: a */
            public static final C0537b f28260a = new C0537b();

            C0537b() {
                super(1, f0.class, "<init>", "<init>(Lcom/withpersona/sdk/inquiry/selfie/databinding/SelfieSubmittingScreenBinding;)V", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final f0 invoke(hw.f p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return new f0(p02);
            }
        }

        private b() {
            i.a aVar = pr.i.f46871h1;
            this.f28258a = new pr.r(m0.b(g0.d.e.class), a.f28259a, C0537b.f28260a);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // pr.u
        /* renamed from: b */
        public View a(g0.d.e initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
            return this.f28258a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        }

        @Override // pr.u
        public n00.d<? super g0.d.e> getType() {
            return this.f28258a.getType();
        }
    }

    public f0(hw.f binding) {
        kotlin.jvm.internal.s.g(binding, "binding");
        this.f28256a = binding;
        Context context = binding.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        TypedValue a11 = b0.a(context, "personaInquiryLoadingLottieRaw");
        if (a11.type != 0) {
            binding.f29468b.setAnimation(a11.resourceId);
            binding.f29468b.v();
        } else {
            binding.f29468b.i(new a8.e("**"), v7.j.f54281b, new i8.e() { // from class: gw.d0
                {
                    f0.this = this;
                }

                @Override // i8.e
                public final Object a(i8.b bVar) {
                    return f0.b(f0.this, bVar);
                }
            });
            binding.f29468b.i(new a8.e("**"), v7.j.f54280a, new i8.e() { // from class: gw.e0
                {
                    f0.this = this;
                }

                @Override // i8.e
                public final Object a(i8.b bVar) {
                    return f0.c(f0.this, bVar);
                }
            });
            binding.f29468b.g(new a(binding));
        }
        if (TextUtils.isEmpty(binding.f29470d.getText().toString())) {
            binding.f29470d.setVisibility(8);
        }
        if (TextUtils.isEmpty(binding.f29469c.getText().toString())) {
            binding.f29469c.setVisibility(8);
        }
    }

    public static /* synthetic */ Integer b(f0 f0Var, i8.b bVar) {
        return d(f0Var, bVar);
    }

    public static /* synthetic */ Integer c(f0 f0Var, i8.b bVar) {
        return e(f0Var, bVar);
    }

    public static final Integer d(f0 this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28256a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28398a, null, false, 6, null));
    }

    public static final Integer e(f0 this$0, i8.b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Context context = this$0.f28256a.getRoot().getContext();
        kotlin.jvm.internal.s.f(context, "binding.root.context");
        return Integer.valueOf(jw.c.b(context, h.f28399b, null, false, 6, null));
    }

    @Override // pr.i
    /* renamed from: f */
    public void a(g0.d.e rendering, pr.s viewEnvironment) {
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
    }
}