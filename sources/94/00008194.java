package l0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;
import zz.g;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    private final AtomicReference<a> f36236a = new AtomicReference<>(null);

    /* renamed from: b */
    private final kotlinx.coroutines.sync.b f36237b = kotlinx.coroutines.sync.d.b(false, 1, null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final o0 f36238a;

        /* renamed from: b */
        private final a2 f36239b;

        public a(o0 priority, a2 job) {
            kotlin.jvm.internal.s.g(priority, "priority");
            kotlin.jvm.internal.s.g(job, "job");
            this.f36238a = priority;
            this.f36239b = job;
        }

        public final boolean a(a other) {
            kotlin.jvm.internal.s.g(other, "other");
            return this.f36238a.compareTo(other.f36238a) >= 0;
        }

        public final void b() {
            a2.a.a(this.f36239b, null, 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<R> extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super R>, Object> {

        /* renamed from: a */
        Object f36240a;

        /* renamed from: b */
        Object f36241b;

        /* renamed from: c */
        Object f36242c;

        /* renamed from: d */
        int f36243d;

        /* renamed from: e */
        private /* synthetic */ Object f36244e;

        /* renamed from: f */
        final /* synthetic */ o0 f36245f;

        /* renamed from: g */
        final /* synthetic */ p0 f36246g;

        /* renamed from: h */
        final /* synthetic */ h00.l<zz.d<? super R>, Object> f36247h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o0 o0Var, p0 p0Var, h00.l<? super zz.d<? super R>, ? extends Object> lVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f36245f = o0Var;
            this.f36246g = p0Var;
            this.f36247h = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f36245f, this.f36246g, this.f36247h, dVar);
            bVar.f36244e = obj;
            return bVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(v20.o0 o0Var, Object obj) {
            return invoke(o0Var, (zz.d) ((zz.d) obj));
        }

        public final Object invoke(v20.o0 o0Var, zz.d<? super R> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.b, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.sync.b bVar;
            h00.l<zz.d<? super R>, Object> lVar;
            a aVar;
            p0 p0Var;
            a aVar2;
            Throwable th2;
            p0 p0Var2;
            kotlinx.coroutines.sync.b bVar2;
            d11 = a00.d.d();
            ?? r12 = this.f36243d;
            try {
                try {
                    if (r12 == 0) {
                        vz.r.b(obj);
                        o0 o0Var = this.f36245f;
                        g.b bVar3 = ((v20.o0) this.f36244e).J().get(a2.f53887l1);
                        kotlin.jvm.internal.s.e(bVar3);
                        a aVar3 = new a(o0Var, (a2) bVar3);
                        this.f36246g.f(aVar3);
                        bVar = this.f36246g.f36237b;
                        h00.l<zz.d<? super R>, Object> lVar2 = this.f36247h;
                        p0 p0Var3 = this.f36246g;
                        this.f36244e = aVar3;
                        this.f36240a = bVar;
                        this.f36241b = lVar2;
                        this.f36242c = p0Var3;
                        this.f36243d = 1;
                        if (bVar.b(null, this) == d11) {
                            return d11;
                        }
                        lVar = lVar2;
                        aVar = aVar3;
                        p0Var = p0Var3;
                    } else if (r12 != 1) {
                        if (r12 == 2) {
                            p0Var2 = (p0) this.f36241b;
                            bVar2 = (kotlinx.coroutines.sync.b) this.f36240a;
                            aVar2 = (a) this.f36244e;
                            try {
                                vz.r.b(obj);
                                p0Var2.f36236a.compareAndSet(aVar2, null);
                                bVar2.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                p0Var2.f36236a.compareAndSet(aVar2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p0Var = (p0) this.f36242c;
                        lVar = (h00.l) this.f36241b;
                        aVar = (a) this.f36244e;
                        vz.r.b(obj);
                        bVar = (kotlinx.coroutines.sync.b) this.f36240a;
                    }
                    this.f36244e = aVar;
                    this.f36240a = bVar;
                    this.f36241b = p0Var;
                    this.f36242c = null;
                    this.f36243d = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == d11) {
                        return d11;
                    }
                    p0Var2 = p0Var;
                    bVar2 = bVar;
                    obj = invoke;
                    aVar2 = aVar;
                    p0Var2.f36236a.compareAndSet(aVar2, null);
                    bVar2.c(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th2 = th4;
                    p0Var2 = p0Var;
                    p0Var2.f36236a.compareAndSet(aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.c(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(p0 p0Var, o0 o0Var, h00.l lVar, zz.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            o0Var = o0.Default;
        }
        return p0Var.d(o0Var, lVar, dVar);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f36236a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f36236a.compareAndSet(aVar2, aVar));
        if (aVar2 == null) {
            return;
        }
        aVar2.b();
    }

    public final <R> Object d(o0 o0Var, h00.l<? super zz.d<? super R>, ? extends Object> lVar, zz.d<? super R> dVar) {
        return v20.p0.e(new b(o0Var, this, lVar, null), dVar);
    }
}