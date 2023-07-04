package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;
import v20.o0;
import v20.p0;
import zz.g;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<a> f38120a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.coroutines.sync.b f38121b = kotlinx.coroutines.sync.d.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final v f38122a;

        /* renamed from: b  reason: collision with root package name */
        private final a2 f38123b;

        public a(v priority, a2 job) {
            kotlin.jvm.internal.s.g(priority, "priority");
            kotlin.jvm.internal.s.g(job, "job");
            this.f38122a = priority;
            this.f38123b = job;
        }

        public final boolean a(a other) {
            kotlin.jvm.internal.s.g(other, "other");
            return this.f38122a.compareTo(other.f38122a) >= 0;
        }

        public final void b() {
            a2.a.a(this.f38123b, null, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 160}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b<R> extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super R>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38124a;

        /* renamed from: b  reason: collision with root package name */
        Object f38125b;

        /* renamed from: c  reason: collision with root package name */
        Object f38126c;

        /* renamed from: d  reason: collision with root package name */
        Object f38127d;

        /* renamed from: e  reason: collision with root package name */
        int f38128e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f38129f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f38130g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w f38131h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<T, zz.d<? super R>, Object> f38132i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ T f38133j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(v vVar, w wVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar, T t11, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f38130g = vVar;
            this.f38131h = wVar;
            this.f38132i = pVar;
            this.f38133j = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f38130g, this.f38131h, this.f38132i, this.f38133j, dVar);
            bVar.f38129f = obj;
            return bVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
            return invoke(o0Var, (zz.d) ((zz.d) obj));
        }

        public final Object invoke(o0 o0Var, zz.d<? super R> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.b, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.sync.b bVar;
            h00.p pVar;
            Object obj2;
            a aVar;
            w wVar;
            a aVar2;
            Throwable th2;
            w wVar2;
            kotlinx.coroutines.sync.b bVar2;
            d11 = a00.d.d();
            ?? r12 = this.f38128e;
            try {
                try {
                    if (r12 == 0) {
                        vz.r.b(obj);
                        v vVar = this.f38130g;
                        g.b bVar3 = ((o0) this.f38129f).J().get(a2.f53887l1);
                        kotlin.jvm.internal.s.e(bVar3);
                        a aVar3 = new a(vVar, (a2) bVar3);
                        this.f38131h.e(aVar3);
                        bVar = this.f38131h.f38121b;
                        pVar = this.f38132i;
                        Object obj3 = this.f38133j;
                        w wVar3 = this.f38131h;
                        this.f38129f = aVar3;
                        this.f38124a = bVar;
                        this.f38125b = pVar;
                        this.f38126c = obj3;
                        this.f38127d = wVar3;
                        this.f38128e = 1;
                        if (bVar.b(null, this) == d11) {
                            return d11;
                        }
                        obj2 = obj3;
                        aVar = aVar3;
                        wVar = wVar3;
                    } else if (r12 != 1) {
                        if (r12 == 2) {
                            wVar2 = (w) this.f38125b;
                            bVar2 = (kotlinx.coroutines.sync.b) this.f38124a;
                            aVar2 = (a) this.f38129f;
                            try {
                                vz.r.b(obj);
                                wVar2.f38120a.compareAndSet(aVar2, null);
                                bVar2.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                wVar2.f38120a.compareAndSet(aVar2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wVar = (w) this.f38127d;
                        obj2 = this.f38126c;
                        pVar = (h00.p) this.f38125b;
                        aVar = (a) this.f38129f;
                        vz.r.b(obj);
                        bVar = (kotlinx.coroutines.sync.b) this.f38124a;
                    }
                    this.f38129f = aVar;
                    this.f38124a = bVar;
                    this.f38125b = wVar;
                    this.f38126c = null;
                    this.f38127d = null;
                    this.f38128e = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == d11) {
                        return d11;
                    }
                    wVar2 = wVar;
                    bVar2 = bVar;
                    obj = invoke;
                    aVar2 = aVar;
                    wVar2.f38120a.compareAndSet(aVar2, null);
                    bVar2.c(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th2 = th4;
                    wVar2 = wVar;
                    wVar2.f38120a.compareAndSet(aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.c(null);
                throw th5;
            }
        }
    }

    public w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f38120a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f38120a.compareAndSet(aVar2, aVar));
        if (aVar2 == null) {
            return;
        }
        aVar2.b();
    }

    public final <T, R> Object d(T t11, v vVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar, zz.d<? super R> dVar) {
        return p0.e(new b(vVar, this, pVar, t11, null), dVar);
    }
}