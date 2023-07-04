package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface v1 {

    /* loaded from: classes.dex */
    public static final class a implements v1 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3123a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.ui.platform.v1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0053a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3124a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f3125b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0053a(androidx.compose.ui.platform.a aVar, b bVar) {
                super(0);
                this.f3124a = aVar;
                this.f3125b = bVar;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f3124a.removeOnAttachStateChangeListener(this.f3125b);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3126a;

            b(androidx.compose.ui.platform.a aVar) {
                this.f3126a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                kotlin.jvm.internal.s.g(v11, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.f3126a.disposeComposition();
            }
        }

        private a() {
        }

        @Override // androidx.compose.ui.platform.v1
        public h00.a<vz.b0> a(androidx.compose.ui.platform.a view) {
            kotlin.jvm.internal.s.g(view, "view");
            b bVar = new b(view);
            view.addOnAttachStateChangeListener(bVar);
            return new C0053a(view, bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements v1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3127a = new b();

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3128a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f3129b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, c cVar) {
                super(0);
                this.f3128a = aVar;
                this.f3129b = cVar;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f3128a.removeOnAttachStateChangeListener(this.f3129b);
            }
        }

        /* renamed from: androidx.compose.ui.platform.v1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0054b extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.l0<h00.a<vz.b0>> f3130a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0054b(kotlin.jvm.internal.l0<h00.a<vz.b0>> l0Var) {
                super(0);
                this.f3130a = l0Var;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f3130a.f34916a.invoke();
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f3131a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.l0<h00.a<vz.b0>> f3132b;

            c(androidx.compose.ui.platform.a aVar, kotlin.jvm.internal.l0<h00.a<vz.b0>> l0Var) {
                this.f3131a = aVar;
                this.f3132b = l0Var;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [T, h00.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                androidx.lifecycle.v a11 = androidx.lifecycle.v0.a(this.f3131a);
                androidx.compose.ui.platform.a aVar = this.f3131a;
                if (a11 != null) {
                    kotlin.jvm.internal.l0<h00.a<vz.b0>> l0Var = this.f3132b;
                    androidx.lifecycle.p lifecycle = a11.getLifecycle();
                    kotlin.jvm.internal.s.f(lifecycle, "lco.lifecycle");
                    l0Var.f34916a = x1.b(aVar, lifecycle);
                    this.f3131a.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.v1$b$a] */
        @Override // androidx.compose.ui.platform.v1
        public h00.a<vz.b0> a(androidx.compose.ui.platform.a view) {
            kotlin.jvm.internal.s.g(view, "view");
            if (view.isAttachedToWindow()) {
                androidx.lifecycle.v a11 = androidx.lifecycle.v0.a(view);
                if (a11 != null) {
                    androidx.lifecycle.p lifecycle = a11.getLifecycle();
                    kotlin.jvm.internal.s.f(lifecycle, "lco.lifecycle");
                    return x1.b(view, lifecycle);
                }
                throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
            }
            kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
            c cVar = new c(view, l0Var);
            view.addOnAttachStateChangeListener(cVar);
            l0Var.f34916a = new a(view, cVar);
            return new C0054b(l0Var);
        }
    }

    h00.a<vz.b0> a(androidx.compose.ui.platform.a aVar);
}