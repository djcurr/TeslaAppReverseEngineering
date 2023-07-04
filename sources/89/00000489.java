package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final i2 f2968a = new i2();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<h2> f2969b = new AtomicReference<>(h2.f2961a.a());

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.a2 f2970a;

        a(v20.a2 a2Var) {
            this.f2970a = a2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            kotlin.jvm.internal.s.g(v11, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            kotlin.jvm.internal.s.g(v11, "v");
            v11.removeOnAttachStateChangeListener(this);
            a2.a.a(this.f2970a, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f2971a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.a1 f2972b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2973c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1.a1 a1Var, View view, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f2972b = a1Var;
            this.f2973c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f2972b, this.f2973c, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            View view;
            d11 = a00.d.d();
            int i11 = this.f2971a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    c1.a1 a1Var = this.f2972b;
                    this.f2971a = 1;
                    if (a1Var.T(this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                if (WindowRecomposer_androidKt.d(view) == this.f2972b) {
                    WindowRecomposer_androidKt.g(this.f2973c, null);
                }
                return vz.b0.f54756a;
            } finally {
                if (WindowRecomposer_androidKt.d(this.f2973c) == this.f2972b) {
                    WindowRecomposer_androidKt.g(this.f2973c, null);
                }
            }
        }
    }

    private i2() {
    }

    public final c1.a1 a(View rootView) {
        v20.a2 d11;
        kotlin.jvm.internal.s.g(rootView, "rootView");
        c1.a1 a11 = f2969b.get().a(rootView);
        WindowRecomposer_androidKt.g(rootView, a11);
        v20.t1 t1Var = v20.t1.f54002a;
        Handler handler = rootView.getHandler();
        kotlin.jvm.internal.s.f(handler, "rootView.handler");
        d11 = v20.k.d(t1Var, w20.e.f(handler, "windowRecomposer cleanup").X0(), null, new b(a11, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new a(d11));
        return a11;
    }
}