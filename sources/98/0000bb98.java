package w00;

import d20.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class m0<T extends d20.h> {

    /* renamed from: a  reason: collision with root package name */
    private final w00.c f55295a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, T> f55296b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.h f55297c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i f55298d;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f55294f = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(m0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a f55293e = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends d20.h> m0<T> a(w00.c classDescriptor, j20.n storageManager, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefinerForOwnerModule, h00.l<? super kotlin.reflect.jvm.internal.impl.types.checker.h, ? extends T> scopeFactory) {
            kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
            kotlin.jvm.internal.s.g(storageManager, "storageManager");
            kotlin.jvm.internal.s.g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            kotlin.jvm.internal.s.g(scopeFactory, "scopeFactory");
            return new m0<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0<T> f55299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.h f55300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0<T> m0Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            super(0);
            this.f55299a = m0Var;
            this.f55300b = hVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final T invoke() {
            return (T) ((m0) this.f55299a).f55296b.invoke(this.f55300b);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0<T> f55301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0<T> m0Var) {
            super(0);
            this.f55301a = m0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final T invoke() {
            return (T) ((m0) this.f55301a).f55296b.invoke(((m0) this.f55301a).f55297c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m0(w00.c cVar, j20.n nVar, h00.l<? super kotlin.reflect.jvm.internal.impl.types.checker.h, ? extends T> lVar, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        this.f55295a = cVar;
        this.f55296b = lVar;
        this.f55297c = hVar;
        this.f55298d = nVar.b(new c(this));
    }

    public /* synthetic */ m0(w00.c cVar, j20.n nVar, h00.l lVar, kotlin.reflect.jvm.internal.impl.types.checker.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, lVar, hVar);
    }

    private final T d() {
        return (T) j20.m.a(this.f55298d, this, f55294f[0]);
    }

    public final T c(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (kotlinTypeRefiner.c(a20.a.l(this.f55295a))) {
            k20.w0 i11 = this.f55295a.i();
            kotlin.jvm.internal.s.f(i11, "classDescriptor.typeConstructor");
            return !kotlinTypeRefiner.d(i11) ? d() : (T) kotlinTypeRefiner.b(this.f55295a, new b(this, kotlinTypeRefiner));
        }
        return d();
    }
}