package y10;

import java.util.ArrayList;
import java.util.List;
import k20.d0;
import k20.k0;
import wz.e0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f58969a = new h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<w00.x, d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f58970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var) {
            super(1);
            this.f58970a = d0Var;
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(w00.x it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return this.f58970a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<w00.x, d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t00.i f58971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t00.i iVar) {
            super(1);
            this.f58971a = iVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 mo12invoke(w00.x module) {
            kotlin.jvm.internal.s.g(module, "module");
            k0 O = module.l().O(this.f58971a);
            kotlin.jvm.internal.s.f(O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return O;
        }
    }

    private h() {
    }

    private final y10.b b(List<?> list, t00.i iVar) {
        List<Object> O0;
        O0 = e0.O0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : O0) {
            g<?> c11 = c(obj);
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        return new y10.b(arrayList, new b(iVar));
    }

    public final y10.b a(List<? extends g<?>> value, d0 type) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(type, "type");
        return new y10.b(value, new a(type));
    }

    public final g<?> c(Object obj) {
        List<Boolean> u02;
        List<Double> o02;
        List<Float> p02;
        List<Character> n02;
        List<Long> r02;
        List<Integer> q02;
        List<Short> t02;
        List<Byte> m02;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof byte[]) {
            m02 = wz.p.m0((byte[]) obj);
            return b(m02, t00.i.BYTE);
        } else if (obj instanceof short[]) {
            t02 = wz.p.t0((short[]) obj);
            return b(t02, t00.i.SHORT);
        } else if (obj instanceof int[]) {
            q02 = wz.p.q0((int[]) obj);
            return b(q02, t00.i.INT);
        } else if (obj instanceof long[]) {
            r02 = wz.p.r0((long[]) obj);
            return b(r02, t00.i.LONG);
        } else if (obj instanceof char[]) {
            n02 = wz.p.n0((char[]) obj);
            return b(n02, t00.i.CHAR);
        } else if (obj instanceof float[]) {
            p02 = wz.p.p0((float[]) obj);
            return b(p02, t00.i.FLOAT);
        } else if (obj instanceof double[]) {
            o02 = wz.p.o0((double[]) obj);
            return b(o02, t00.i.DOUBLE);
        } else if (obj instanceof boolean[]) {
            u02 = wz.p.u0((boolean[]) obj);
            return b(u02, t00.i.BOOLEAN);
        } else if (obj == null) {
            return new s();
        } else {
            return null;
        }
    }
}