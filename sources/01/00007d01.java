package k20;

/* loaded from: classes5.dex */
public final class g0 extends l1 {

    /* renamed from: b  reason: collision with root package name */
    private final j20.n f34269b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.a<d0> f34270c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i<d0> f34271d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.h f34272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f34273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.types.checker.h hVar, g0 g0Var) {
            super(0);
            this.f34272a = hVar;
            this.f34273b = g0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final d0 invoke() {
            return this.f34272a.g((d0) this.f34273b.f34270c.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(j20.n storageManager, h00.a<? extends d0> computation) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(computation, "computation");
        this.f34269b = storageManager;
        this.f34270c = computation;
        this.f34271d = storageManager.b(computation);
    }

    @Override // k20.l1
    protected d0 L0() {
        return this.f34271d.invoke();
    }

    @Override // k20.l1
    public boolean M0() {
        return this.f34271d.a0();
    }

    @Override // k20.d0
    /* renamed from: O0 */
    public g0 J0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new g0(this.f34269b, new a(kotlinTypeRefiner, this));
    }
}