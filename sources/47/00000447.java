package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f2821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.a1 f2822b;

        a(View view, c1.a1 a1Var) {
            this.f2821a = view;
            this.f2822b = a1Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f2821a.removeOnAttachStateChangeListener(this);
            this.f2822b.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1.a1 b(View view) {
        final c1.s0 s0Var;
        zz.g a11 = d0.f2872l.a();
        c1.m0 m0Var = (c1.m0) a11.get(c1.m0.f8617v);
        if (m0Var == null) {
            s0Var = null;
        } else {
            c1.s0 s0Var2 = new c1.s0(m0Var);
            s0Var2.b();
            s0Var = s0Var2;
        }
        zz.g plus = a11.plus(s0Var == null ? zz.h.f61280a : s0Var);
        final c1.a1 a1Var = new c1.a1(plus);
        final v20.o0 a12 = v20.p0.a(plus);
        androidx.lifecycle.v a13 = androidx.lifecycle.v0.a(view);
        if (a13 != null) {
            view.addOnAttachStateChangeListener(new a(view, a1Var));
            a13.getLifecycle().a(new androidx.lifecycle.s() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2

                /* loaded from: classes.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f2826a;

                    static {
                        int[] iArr = new int[p.b.values().length];
                        iArr[p.b.ON_CREATE.ordinal()] = 1;
                        iArr[p.b.ON_START.ordinal()] = 2;
                        iArr[p.b.ON_STOP.ordinal()] = 3;
                        iArr[p.b.ON_DESTROY.ordinal()] = 4;
                        iArr[p.b.ON_PAUSE.ordinal()] = 5;
                        iArr[p.b.ON_RESUME.ordinal()] = 6;
                        iArr[p.b.ON_ANY.ordinal()] = 7;
                        f2826a = iArr;
                    }
                }

                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {270}, m = "invokeSuspend")
                /* loaded from: classes.dex */
                static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f2827a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c1.a1 f2828b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ androidx.lifecycle.v f2829c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 f2830d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(c1.a1 a1Var, androidx.lifecycle.v vVar, WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2, zz.d<? super b> dVar) {
                        super(2, dVar);
                        this.f2828b = a1Var;
                        this.f2829c = vVar;
                        this.f2830d = windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new b(this.f2828b, this.f2829c, this.f2830d, dVar);
                    }

                    @Override // h00.p
                    public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f2827a;
                        try {
                            if (i11 == 0) {
                                vz.r.b(obj);
                                c1.a1 a1Var = this.f2828b;
                                this.f2827a = 1;
                                if (a1Var.Z(this) == d11) {
                                    return d11;
                                }
                            } else if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                vz.r.b(obj);
                            }
                            this.f2829c.getLifecycle().c(this.f2830d);
                            return vz.b0.f54756a;
                        } catch (Throwable th2) {
                            this.f2829c.getLifecycle().c(this.f2830d);
                            throw th2;
                        }
                    }
                }

                @Override // androidx.lifecycle.s
                public void g(androidx.lifecycle.v lifecycleOwner, p.b event) {
                    kotlin.jvm.internal.s.g(lifecycleOwner, "lifecycleOwner");
                    kotlin.jvm.internal.s.g(event, "event");
                    int i11 = a.f2826a[event.ordinal()];
                    if (i11 == 1) {
                        v20.k.d(v20.o0.this, null, kotlinx.coroutines.a.UNDISPATCHED, new b(a1Var, lifecycleOwner, this, null), 1, null);
                    } else if (i11 == 2) {
                        c1.s0 s0Var3 = s0Var;
                        if (s0Var3 == null) {
                            return;
                        }
                        s0Var3.c();
                    } else if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        a1Var.M();
                    } else {
                        c1.s0 s0Var4 = s0Var;
                        if (s0Var4 == null) {
                            return;
                        }
                        s0Var4.b();
                    }
                }
            });
            return a1Var;
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("ViewTreeLifecycleOwner not found from ", view).toString());
    }

    public static final c1.m c(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        c1.m d11 = d(view);
        if (d11 != null) {
            return d11;
        }
        for (ViewParent parent = view.getParent(); d11 == null && (parent instanceof View); parent = parent.getParent()) {
            d11 = d((View) parent);
        }
        return d11;
    }

    public static final c1.m d(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        Object tag = view.getTag(o1.g.G);
        if (tag instanceof c1.m) {
            return (c1.m) tag;
        }
        return null;
    }

    private static final View e(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final c1.a1 f(View view) {
        kotlin.jvm.internal.s.g(view, "<this>");
        if (view.isAttachedToWindow()) {
            View e11 = e(view);
            c1.m d11 = d(e11);
            if (d11 == null) {
                return i2.f2968a.a(e11);
            }
            if (d11 instanceof c1.a1) {
                return (c1.a1) d11;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void g(View view, c1.m mVar) {
        kotlin.jvm.internal.s.g(view, "<this>");
        view.setTag(o1.g.G, mVar);
    }
}