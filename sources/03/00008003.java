package kotlinx.coroutines.internal;

import java.util.Objects;
import v20.z2;
import zz.g;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f35469a = new f0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final h00.p<Object, g.b, Object> f35470b = a.f35473a;

    /* renamed from: c  reason: collision with root package name */
    private static final h00.p<z2<?>, g.b, z2<?>> f35471c = b.f35474a;

    /* renamed from: d  reason: collision with root package name */
    private static final h00.p<m0, g.b, m0> f35472d = c.f35475a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<Object, g.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35473a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (bVar instanceof z2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<z2<?>, g.b, z2<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35474a = new b();

        b() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final z2<?> invoke(z2<?> z2Var, g.b bVar) {
            if (z2Var != null) {
                return z2Var;
            }
            if (bVar instanceof z2) {
                return (z2) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.p<m0, g.b, m0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35475a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final m0 invoke(m0 m0Var, g.b bVar) {
            if (bVar instanceof z2) {
                z2<?> z2Var = (z2) bVar;
                m0Var.a(z2Var, z2Var.p0(m0Var.f35486a));
            }
            return m0Var;
        }
    }

    public static final void a(zz.g gVar, Object obj) {
        if (obj == f35469a) {
            return;
        }
        if (obj instanceof m0) {
            ((m0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f35471c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((z2) fold).t0(gVar, obj);
    }

    public static final Object b(zz.g gVar) {
        Object fold = gVar.fold(0, f35470b);
        kotlin.jvm.internal.s.e(fold);
        return fold;
    }

    public static final Object c(zz.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f35469a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new m0(gVar, ((Number) obj).intValue()), f35472d);
        }
        return ((z2) obj).p0(gVar);
    }
}