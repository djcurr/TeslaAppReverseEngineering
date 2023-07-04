package k20;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private int f34262a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34263b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayDeque<m20.j> f34264c;

    /* renamed from: d  reason: collision with root package name */
    private Set<m20.j> f34265d;

    /* loaded from: classes5.dex */
    public enum a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* loaded from: classes5.dex */
    public static abstract class b {

        /* loaded from: classes5.dex */
        public static abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* renamed from: k20.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0636b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0636b f34266a = new C0636b();

            private C0636b() {
                super(null);
            }

            @Override // k20.g.b
            public m20.j a(g context, m20.i type) {
                kotlin.jvm.internal.s.g(context, "context");
                kotlin.jvm.internal.s.g(type, "type");
                return context.j().U(type);
            }
        }

        /* loaded from: classes5.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f34267a = new c();

            private c() {
                super(null);
            }

            @Override // k20.g.b
            public /* bridge */ /* synthetic */ m20.j a(g gVar, m20.i iVar) {
                return (m20.j) b(gVar, iVar);
            }

            public Void b(g context, m20.i type) {
                kotlin.jvm.internal.s.g(context, "context");
                kotlin.jvm.internal.s.g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* loaded from: classes5.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f34268a = new d();

            private d() {
                super(null);
            }

            @Override // k20.g.b
            public m20.j a(g context, m20.i type) {
                kotlin.jvm.internal.s.g(context, "context");
                kotlin.jvm.internal.s.g(type, "type");
                return context.j().Q(type);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract m20.j a(g gVar, m20.i iVar);
    }

    public static /* synthetic */ Boolean d(g gVar, m20.i iVar, m20.i iVar2, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return gVar.c(iVar, iVar2, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    public Boolean c(m20.i subType, m20.i superType, boolean z11) {
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<m20.j> arrayDeque = this.f34264c;
        kotlin.jvm.internal.s.e(arrayDeque);
        arrayDeque.clear();
        Set<m20.j> set = this.f34265d;
        kotlin.jvm.internal.s.e(set);
        set.clear();
        this.f34263b = false;
    }

    public boolean f(m20.i subType, m20.i superType) {
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        return true;
    }

    public a g(m20.j subType, m20.d superType) {
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        return a.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<m20.j> h() {
        return this.f34264c;
    }

    public final Set<m20.j> i() {
        return this.f34265d;
    }

    public abstract m20.o j();

    public final void k() {
        this.f34263b = true;
        if (this.f34264c == null) {
            this.f34264c = new ArrayDeque<>(4);
        }
        if (this.f34265d == null) {
            this.f34265d = s20.f.f50187c.a();
        }
    }

    public abstract boolean l(m20.i iVar);

    public final boolean m(m20.i type) {
        kotlin.jvm.internal.s.g(type, "type");
        return l(type);
    }

    public abstract boolean n();

    public abstract boolean o();

    public abstract m20.i p(m20.i iVar);

    public abstract m20.i q(m20.i iVar);

    public abstract b r(m20.j jVar);
}