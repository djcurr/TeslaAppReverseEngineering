package or;

import h00.p;
import h00.q;
import h00.r;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.u;
import nr.s;
import v20.o0;
import vz.b0;

/* loaded from: classes2.dex */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    private final List<s> f42925a;

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* loaded from: classes2.dex */
    static final class a<P, S> extends u implements p<P, nr.i, S> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f42926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<P, nr.i, S> f42927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f42928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(s sVar, p<? super P, ? super nr.i, ? extends S> pVar, s.c cVar) {
            super(2);
            this.f42926a = sVar;
            this.f42927b = pVar;
            this.f42928c = cVar;
        }

        @Override // h00.p
        /* renamed from: a */
        public final S invoke(P p11, nr.i iVar) {
            return (S) this.f42926a.e(p11, iVar, this.f42927b, this.f42928c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* renamed from: or.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0859b<P, S> extends u implements q<P, P, S, S> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f42929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<P, P, S, S> f42930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f42931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0859b(s sVar, q<? super P, ? super P, ? super S, ? extends S> qVar, s.c cVar) {
            super(3);
            this.f42929a = sVar;
            this.f42930b = qVar;
            this.f42931c = cVar;
        }

        @Override // h00.q
        public final S invoke(P p11, P p12, S s11) {
            return (S) this.f42929a.c(p11, p12, s11, this.f42930b, this.f42931c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    /* loaded from: classes2.dex */
    static final class c<O, P, R, S> extends u implements q<P, S, s.b<P, S, O>, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f42932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.a<P, S, O> f42933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f42934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f42935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<P, S, s.b<P, S, O>, R> f42936e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends u implements q<P, S, s.b<P, S, O>, R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f42937a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ s.b<P, S, O> f42938b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q<P, S, s.b<P, S, O>, R> f42939c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, s.b<P, S, O> bVar2, q<? super P, ? super S, ? super s.b<P, S, O>, ? extends R> qVar) {
                super(3);
                this.f42937a = bVar;
                this.f42938b = bVar2;
                this.f42939c = qVar;
            }

            @Override // h00.q
            /* renamed from: a */
            public final R invoke(P p11, S s11, s.b<P, S, O> bVar) {
                return this.f42939c.invoke(p11, s11, this.f42937a.g(this.f42938b, bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(s sVar, nr.a<? extends P, S, ? super O> aVar, s.c cVar, b bVar, q<? super P, ? super S, ? super s.b<P, S, O>, ? extends R> qVar) {
            super(3);
            this.f42932a = sVar;
            this.f42933b = aVar;
            this.f42934c = cVar;
            this.f42935d = bVar;
            this.f42936e = qVar;
        }

        @Override // h00.q
        /* renamed from: a */
        public final R invoke(P p11, S s11, s.b<P, S, O> bVar) {
            return (R) this.f42932a.b(p11, s11, this.f42933b, new a(this.f42935d, bVar, this.f42936e), this.f42934c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* loaded from: classes2.dex */
    static final class d<S> extends u implements h00.l<S, nr.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f42940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<S, nr.i> f42941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f42942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(s sVar, h00.l<? super S, nr.i> lVar, s.c cVar) {
            super(1);
            this.f42940a = sVar;
            this.f42941b = lVar;
            this.f42942c = cVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.i invoke(S s11) {
            return this.f42940a.d(s11, this.f42941b, this.f42942c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S, O] */
    /* loaded from: classes2.dex */
    public static final class e<O, P, S> implements s.b<P, S, O> {

        /* renamed from: a  reason: collision with root package name */
        private final s.b<P, S, O> f42943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.b<P, S, O> f42944b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.b<P, S, O> f42945c;

        /* loaded from: classes2.dex */
        static final class a extends u implements h00.l<nr.q<? super P, S, ? extends O>, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s.b<P, S, O> f42946a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<nr.q<? super P, S, ? extends O>, b0> f42947b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(s.b<P, S, O> bVar, h00.l<? super nr.q<? super P, S, ? extends O>, b0> lVar) {
                super(1);
                this.f42946a = bVar;
                this.f42947b = lVar;
            }

            public final void a(nr.q<? super P, S, ? extends O> interceptedAction) {
                kotlin.jvm.internal.s.g(interceptedAction, "interceptedAction");
                this.f42946a.a(interceptedAction, this.f42947b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(Object obj) {
                a((nr.q) obj);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [CO, CP, CR] */
        /* renamed from: or.b$e$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0860b<CO, CP, CR> extends u implements r<nr.p<? super CP, ? extends CO, ? extends CR>, CP, String, h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>>, CR> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s.b<P, S, O> f42948a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r<nr.p<? super CP, ? extends CO, ? extends CR>, CP, String, h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>>, CR> f42949b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0860b(s.b<P, S, O> bVar, r<? super nr.p<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>>, ? extends CR> rVar) {
                super(4);
                this.f42948a = bVar;
                this.f42949b = rVar;
            }

            @Override // h00.r
            /* renamed from: a */
            public final CR invoke(nr.p<? super CP, ? extends CO, ? extends CR> c11, CP cp2, String k11, h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>> h11) {
                kotlin.jvm.internal.s.g(c11, "c");
                kotlin.jvm.internal.s.g(k11, "k");
                kotlin.jvm.internal.s.g(h11, "h");
                return (CR) this.f42948a.c(c11, cp2, k11, h11, this.f42949b);
            }
        }

        /* loaded from: classes2.dex */
        static final class c extends u implements p<String, h00.l<? super zz.d<? super b0>, ? extends Object>, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s.b<P, S, O> f42950a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p<String, h00.l<? super zz.d<? super b0>, ? extends Object>, b0> f42951b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(s.b<P, S, O> bVar, p<? super String, ? super h00.l<? super zz.d<? super b0>, ? extends Object>, b0> pVar) {
                super(2);
                this.f42950a = bVar;
                this.f42951b = pVar;
            }

            public final void a(String iKey, h00.l<? super zz.d<? super b0>, ? extends Object> iSideEffect) {
                kotlin.jvm.internal.s.g(iKey, "iKey");
                kotlin.jvm.internal.s.g(iSideEffect, "iSideEffect");
                this.f42950a.b(iKey, iSideEffect, this.f42951b);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ b0 invoke(String str, h00.l<? super zz.d<? super b0>, ? extends Object> lVar) {
                a(str, lVar);
                return b0.f54756a;
            }
        }

        e(s.b<P, S, O> bVar, s.b<P, S, O> bVar2) {
            this.f42944b = bVar;
            this.f42945c = bVar2;
            kotlin.jvm.internal.s.e(bVar);
            this.f42943a = bVar;
        }

        @Override // nr.s.b
        public void a(nr.q<? super P, S, ? extends O> action, h00.l<? super nr.q<? super P, S, ? extends O>, b0> proceed) {
            kotlin.jvm.internal.s.g(action, "action");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            this.f42943a.a(action, new a(this.f42945c, proceed));
        }

        @Override // nr.s.b
        public void b(String key, h00.l<? super zz.d<? super b0>, ? extends Object> sideEffect, p<? super String, ? super h00.l<? super zz.d<? super b0>, ? extends Object>, b0> proceed) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(sideEffect, "sideEffect");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            this.f42943a.b(key, sideEffect, new c(this.f42945c, proceed));
        }

        @Override // nr.s.b
        public <CP, CO, CR> CR c(nr.p<? super CP, ? extends CO, ? extends CR> child, CP cp2, String key, h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>> handler, r<? super nr.p<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super h00.l<? super CO, ? extends nr.q<? super P, S, ? extends O>>, ? extends CR> proceed) {
            kotlin.jvm.internal.s.g(child, "child");
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(handler, "handler");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            return (CR) this.f42943a.c(child, cp2, key, handler, new C0860b(this.f42945c, proceed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends s> interceptors) {
        kotlin.jvm.internal.s.g(interceptors, "interceptors");
        this.f42925a = interceptors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <P, S, O> s.b<P, S, O> g(s.b<P, S, O> bVar, s.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        return bVar == null ? bVar2 : bVar2 == null ? bVar : new e(bVar, bVar2);
    }

    @Override // nr.s
    public void a(o0 workflowScope, s.c session) {
        kotlin.jvm.internal.s.g(workflowScope, "workflowScope");
        kotlin.jvm.internal.s.g(session, "session");
        for (s sVar : this.f42925a) {
            sVar.a(workflowScope, session);
        }
    }

    @Override // nr.s
    public <P, S, O, R> R b(P p11, S s11, nr.a<? extends P, S, ? super O> context, q<? super P, ? super S, ? super s.b<P, S, O>, ? extends R> proceed, s.c session) {
        q<? super P, ? super S, ? super s.b<P, S, O>, ? extends R> qVar;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(proceed, "proceed");
        kotlin.jvm.internal.s.g(session, "session");
        List<s> list = this.f42925a;
        if (!list.isEmpty()) {
            ListIterator<s> listIterator = list.listIterator(list.size());
            while (true) {
                qVar = proceed;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                proceed = new c<>(listIterator.previous(), context, session, this, qVar);
            }
            proceed = qVar;
        }
        return proceed.invoke(p11, s11, null);
    }

    @Override // nr.s
    public <P, S> S c(P p11, P p12, S s11, q<? super P, ? super P, ? super S, ? extends S> proceed, s.c session) {
        kotlin.jvm.internal.s.g(proceed, "proceed");
        kotlin.jvm.internal.s.g(session, "session");
        List<s> list = this.f42925a;
        if (!list.isEmpty()) {
            ListIterator<s> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new C0859b(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(p11, p12, s11);
    }

    @Override // nr.s
    public <S> nr.i d(S s11, h00.l<? super S, nr.i> proceed, s.c session) {
        kotlin.jvm.internal.s.g(proceed, "proceed");
        kotlin.jvm.internal.s.g(session, "session");
        List<s> list = this.f42925a;
        if (!list.isEmpty()) {
            ListIterator<s> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(s11);
    }

    @Override // nr.s
    public <P, S> S e(P p11, nr.i iVar, p<? super P, ? super nr.i, ? extends S> proceed, s.c session) {
        kotlin.jvm.internal.s.g(proceed, "proceed");
        kotlin.jvm.internal.s.g(session, "session");
        List<s> list = this.f42925a;
        if (!list.isEmpty()) {
            ListIterator<s> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(p11, iVar);
    }
}