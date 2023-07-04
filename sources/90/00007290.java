package h30;

import ch.qos.logback.core.CoreConstants;
import h30.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import wz.p0;
import wz.s0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final l.a<Map<String, Integer>> f28856a = new l.a<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, p.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // h00.a
        /* renamed from: d */
        public final Map<String, Integer> invoke() {
            return p.a((e30.f) this.receiver);
        }
    }

    public static final Map<String, Integer> a(e30.f fVar) {
        Map<String, Integer> i11;
        String[] names;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        int d11 = fVar.d();
        Map<String, Integer> map = null;
        for (int i12 = 0; i12 < d11; i12++) {
            List<Annotation> f11 = fVar.f(i12);
            ArrayList arrayList = new ArrayList();
            for (Object obj : f11) {
                if (obj instanceof kotlinx.serialization.json.p) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.p pVar = (kotlinx.serialization.json.p) wz.u.E0(arrayList);
            if (pVar != null && (names = pVar.names()) != null) {
                for (String str : names) {
                    if (map == null) {
                        map = k.a(fVar.d());
                    }
                    kotlin.jvm.internal.s.e(map);
                    b(map, fVar, str, i12);
                }
            }
        }
        if (map == null) {
            i11 = s0.i();
            return i11;
        }
        return map;
    }

    private static final void b(Map<String, Integer> map, e30.f fVar, String str, int i11) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i11));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for property " + fVar.e(i11) + " is already one of the names for property " + fVar.e(((Number) p0.j(map, str)).intValue()) + " in " + fVar);
    }

    public static final l.a<Map<String, Integer>> c() {
        return f28856a;
    }

    public static final int d(e30.f fVar, kotlinx.serialization.json.a json, String name) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(name, "name");
        int c11 = fVar.c(name);
        if (c11 == -3 && json.e().j()) {
            Integer num = (Integer) ((Map) kotlinx.serialization.json.t.a(json).b(fVar, f28856a, new a(fVar))).get(name);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        return c11;
    }

    public static final int e(e30.f fVar, kotlinx.serialization.json.a json, String name, String suffix) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(suffix, "suffix");
        int d11 = d(fVar, json, name);
        if (d11 != -3) {
            return d11;
        }
        throw new SerializationException(fVar.h() + " does not contain element with name '" + name + CoreConstants.SINGLE_QUOTE_CHAR + suffix);
    }

    public static /* synthetic */ int f(e30.f fVar, kotlinx.serialization.json.a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return e(fVar, aVar, str, str2);
    }
}