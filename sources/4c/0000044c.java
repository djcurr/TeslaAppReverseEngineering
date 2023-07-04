package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.p;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition implements c1.l, androidx.lifecycle.s {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f2831a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.l f2832b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2833c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.lifecycle.p f2834d;

    /* renamed from: e  reason: collision with root package name */
    private h00.p<? super c1.i, ? super Integer, vz.b0> f2835e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<AndroidComposeView.b, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f2837b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WrappedComposition f2838a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f2839b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0049a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f2840a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ WrappedComposition f2841b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0049a(WrappedComposition wrappedComposition, zz.d<? super C0049a> dVar) {
                    super(2, dVar);
                    this.f2841b = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new C0049a(this.f2841b, dVar);
                }

                @Override // h00.p
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((C0049a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f2840a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        AndroidComposeView t11 = this.f2841b.t();
                        this.f2840a = 1;
                        if (t11.T(this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return vz.b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = {154}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f2842a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ WrappedComposition f2843b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(WrappedComposition wrappedComposition, zz.d<? super b> dVar) {
                    super(2, dVar);
                    this.f2843b = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new b(this.f2843b, dVar);
                }

                @Override // h00.p
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f2842a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        AndroidComposeView t11 = this.f2843b.t();
                        this.f2842a = 1;
                        if (t11.E(this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return vz.b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$c */
            /* loaded from: classes.dex */
            public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ WrappedComposition f2844a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f2845b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(WrappedComposition wrappedComposition, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
                    super(2);
                    this.f2844a = wrappedComposition;
                    this.f2845b = pVar;
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                    invoke(iVar, num.intValue());
                    return vz.b0.f54756a;
                }

                public final void invoke(c1.i iVar, int i11) {
                    if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                        iVar.G();
                    } else {
                        z.a(this.f2844a.t(), this.f2845b, iVar, 8);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0048a(WrappedComposition wrappedComposition, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
                super(2);
                this.f2838a = wrappedComposition;
                this.f2839b = pVar;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                AndroidComposeView t11 = this.f2838a.t();
                int i12 = o1.g.J;
                Object tag = t11.getTag(i12);
                Set<n1.a> set = kotlin.jvm.internal.r0.q(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.f2838a.t().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view == null ? null : view.getTag(i12);
                    set = kotlin.jvm.internal.r0.q(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(iVar.z());
                    iVar.u();
                }
                c1.b0.d(this.f2838a.t(), new C0049a(this.f2838a, null), iVar, 8);
                c1.b0.d(this.f2838a.t(), new b(this.f2838a, null), iVar, 8);
                c1.r.a(new c1.x0[]{n1.c.a().c(set)}, j1.c.b(iVar, -819888609, true, new c(this.f2838a, this.f2839b)), iVar, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
            super(1);
            this.f2837b = pVar;
        }

        public final void a(AndroidComposeView.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (WrappedComposition.this.f2833c) {
                return;
            }
            androidx.lifecycle.p lifecycle = it2.a().getLifecycle();
            kotlin.jvm.internal.s.f(lifecycle, "it.lifecycleOwner.lifecycle");
            WrappedComposition.this.f2835e = this.f2837b;
            if (WrappedComposition.this.f2834d == null) {
                WrappedComposition.this.f2834d = lifecycle;
                lifecycle.a(WrappedComposition.this);
            } else if (lifecycle.b().isAtLeast(p.c.CREATED)) {
                WrappedComposition.this.s().d(j1.c.c(-985537467, true, new C0048a(WrappedComposition.this, this.f2837b)));
            }
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(AndroidComposeView.b bVar) {
            a(bVar);
            return vz.b0.f54756a;
        }
    }

    public WrappedComposition(AndroidComposeView owner, c1.l original) {
        kotlin.jvm.internal.s.g(owner, "owner");
        kotlin.jvm.internal.s.g(original, "original");
        this.f2831a = owner;
        this.f2832b = original;
        this.f2835e = k0.f2990a.a();
    }

    @Override // c1.l
    public void d(h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        this.f2831a.setOnViewTreeOwnersAvailable(new a(content));
    }

    @Override // c1.l
    public void dispose() {
        if (!this.f2833c) {
            this.f2833c = true;
            this.f2831a.getView().setTag(o1.g.K, null);
            androidx.lifecycle.p pVar = this.f2834d;
            if (pVar != null) {
                pVar.c(this);
            }
        }
        this.f2832b.dispose();
    }

    @Override // androidx.lifecycle.s
    public void g(androidx.lifecycle.v source, p.b event) {
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(event, "event");
        if (event == p.b.ON_DESTROY) {
            dispose();
        } else if (event != p.b.ON_CREATE || this.f2833c) {
        } else {
            d(this.f2835e);
        }
    }

    @Override // c1.l
    public boolean isDisposed() {
        return this.f2832b.isDisposed();
    }

    @Override // c1.l
    public boolean k() {
        return this.f2832b.k();
    }

    public final c1.l s() {
        return this.f2832b;
    }

    public final AndroidComposeView t() {
        return this.f2831a;
    }
}