package nr;

import nr.s;

/* loaded from: classes2.dex */
public final class t {

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    /* loaded from: classes2.dex */
    public static final class a<O, P, R, S> extends k<P, S, O, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f41841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k<P, S, O, R> f41842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.c f41843c;

        /* renamed from: nr.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        /* synthetic */ class C0816a extends kotlin.jvm.internal.p implements h00.p<P, i, S> {
            C0816a(k<? super P, S, ? extends O, ? extends R> kVar) {
                super(2, kVar, k.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [StateT, java.lang.Object] */
            @Override // h00.p
            /* renamed from: d */
            public final StateT invoke(P p11, i iVar) {
                return ((k) this.receiver).d(p11, iVar);
            }
        }

        /* loaded from: classes2.dex */
        /* synthetic */ class b extends kotlin.jvm.internal.p implements h00.q<P, P, S, S> {
            b(k<? super P, S, ? extends O, ? extends R> kVar) {
                super(3, kVar, k.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [StateT, java.lang.Object] */
            @Override // h00.q
            public final StateT invoke(P p11, P p12, S s11) {
                return ((k) this.receiver).e(p11, p12, s11);
            }
        }

        /* loaded from: classes2.dex */
        static final class c extends kotlin.jvm.internal.u implements h00.q<P, S, s.b<P, S, O>, R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k<P, S, O, R>.a f41844a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k<P, S, O, R> f41845b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f41846c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(k<? super P, S, ? extends O, ? extends R>.a aVar, k<? super P, S, ? extends O, ? extends R> kVar, a aVar2) {
                super(3);
                this.f41844a = aVar;
                this.f41845b = kVar;
                this.f41846c = aVar2;
            }

            @Override // h00.q
            /* renamed from: a */
            public final R invoke(P p11, S s11, s.b<P, S, O> bVar) {
                k<P, S, O, R>.a dVar = bVar == null ? (k<P, S, O, R>.a) null : new nr.d(this.f41844a, bVar);
                if (dVar == null) {
                    dVar = this.f41844a;
                }
                return this.f41845b.f(p11, s11, v.a(dVar, this.f41846c));
            }
        }

        /* loaded from: classes2.dex */
        /* synthetic */ class d extends kotlin.jvm.internal.p implements h00.l<S, i> {
            d(k<? super P, S, ? extends O, ? extends R> kVar) {
                super(1, kVar, k.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0);
            }

            @Override // h00.l
            /* renamed from: d */
            public final i invoke(S s11) {
                return ((k) this.receiver).g(s11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(s sVar, k<? super P, S, ? extends O, ? extends R> kVar, s.c cVar) {
            this.f41841a = sVar;
            this.f41842b = kVar;
            this.f41843c = cVar;
        }

        @Override // nr.k
        public S d(P p11, i iVar) {
            return (S) this.f41841a.e(p11, iVar, new C0816a(this.f41842b), this.f41843c);
        }

        @Override // nr.k
        public S e(P p11, P p12, S s11) {
            return (S) this.f41841a.c(p11, p12, s11, new b(this.f41842b), this.f41843c);
        }

        @Override // nr.k
        public R f(P p11, S s11, k<? super P, S, ? extends O, ? extends R>.a context) {
            kotlin.jvm.internal.s.g(context, "context");
            return (R) this.f41841a.b(p11, s11, context, new c(context, this.f41842b, this), this.f41843c);
        }

        @Override // nr.k
        public i g(S s11) {
            return this.f41841a.d(s11, new d(this.f41842b), this.f41843c);
        }

        public String toString() {
            return "InterceptedWorkflow(" + this.f41842b + ", " + this + "@intercept)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <P, S, O, R> k<P, S, O, R> a(s sVar, k<? super P, S, ? extends O, ? extends R> workflow, s.c workflowSession) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        kotlin.jvm.internal.s.g(workflow, "workflow");
        kotlin.jvm.internal.s.g(workflowSession, "workflowSession");
        return sVar == e.f41794a ? workflow : new a(sVar, workflow, workflowSession);
    }
}