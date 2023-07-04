package androidx.lifecycle;

import androidx.lifecycle.p;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.e1;
import v20.l2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5060a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5061b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f5062c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p.c f5063d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h00.p<v20.o0, zz.d<? super vz.b0>, Object> f5064e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f5065a;

        /* renamed from: b  reason: collision with root package name */
        Object f5066b;

        /* renamed from: c  reason: collision with root package name */
        Object f5067c;

        /* renamed from: d  reason: collision with root package name */
        Object f5068d;

        /* renamed from: e  reason: collision with root package name */
        Object f5069e;

        /* renamed from: f  reason: collision with root package name */
        Object f5070f;

        /* renamed from: g  reason: collision with root package name */
        int f5071g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f5072h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p.c f5073i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v20.o0 f5074j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h00.p<v20.o0, zz.d<? super vz.b0>, Object> f5075k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p pVar, p.c cVar, v20.o0 o0Var, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar2, zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.f5072h = pVar;
            this.f5073i = cVar;
            this.f5074j = o0Var;
            this.f5075k = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass1(this.f5072h, this.f5073i, this.f5074j, this.f5075k, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(p pVar, p.c cVar, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar2, zz.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f5062c = pVar;
        this.f5063d = cVar;
        this.f5064e = pVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f5062c, this.f5063d, this.f5064e, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f5061b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // h00.p
    public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f5060a;
        if (i11 == 0) {
            vz.r.b(obj);
            v20.o0 o0Var = (v20.o0) this.f5061b;
            l2 R0 = e1.c().R0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5062c, this.f5063d, o0Var, this.f5064e, null);
            this.f5060a = 1;
            if (v20.i.g(R0, anonymousClass1, this) == d11) {
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