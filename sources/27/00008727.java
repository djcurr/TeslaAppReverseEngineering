package mr;

import ch.qos.logback.core.CoreConstants;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.s0;
import wz.w;
import wz.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends o implements h00.l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38916a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final String invoke(String p12) {
            s.g(p12, "p1");
            return d.i(p12);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "sanitize";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.d(d.class, "wire-runtime");
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
        }
    }

    public static final <T> List<T> a(List<? extends T> redactElements, ProtoAdapter<T> adapter) {
        int t11;
        s.g(redactElements, "$this$redactElements");
        s.g(adapter, "adapter");
        t11 = x.t(redactElements, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (T t12 : redactElements) {
            arrayList.add(adapter.redact(t12));
        }
        return arrayList;
    }

    public static final String b(String oneOfName) {
        s.g(oneOfName, "oneOfName");
        String str = oneOfName + "_keys";
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String upperCase = str.toUpperCase();
        s.f(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static final int c(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 == null ? 0 : 1);
    }

    public static final int d(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static final int e(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        s.g(rest, "rest");
        int i11 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i11++;
        }
        if (obj3 != null) {
            i11++;
        }
        if (obj4 != null) {
            i11++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i11++;
            }
        }
        return i11;
    }

    public static final <T> List<T> f(String name, List<? extends T> list) {
        List<? extends T> i11;
        s.g(name, "name");
        s.g(list, "list");
        boolean z11 = list instanceof h;
        Collection collection = list;
        if (z11) {
            collection = (List<T>) ((h) list).e();
        }
        i11 = w.i();
        if (collection == i11 || (collection instanceof c)) {
            return (List<T>) collection;
        }
        c cVar = new c((List) collection);
        if (!cVar.contains(null)) {
            return cVar;
        }
        throw new IllegalArgumentException((name + ".contains(null)").toString());
    }

    public static final <K, V> Map<K, V> g(String name, Map<K, ? extends V> map) {
        Map<K, V> i11;
        s.g(name, "name");
        s.g(map, "map");
        if (map.isEmpty()) {
            i11 = s0.i();
            return i11;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> keySet = linkedHashMap.keySet();
        Objects.requireNonNull(keySet, "null cannot be cast to non-null type kotlin.collections.Collection<K?>");
        if (!keySet.contains(null)) {
            Collection<V> values = linkedHashMap.values();
            Objects.requireNonNull(values, "null cannot be cast to non-null type kotlin.collections.Collection<V?>");
            if (!values.contains(null)) {
                Map<K, V> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                s.f(unmodifiableMap, "Collections.unmodifiableMap(this)");
                return unmodifiableMap;
            }
            throw new IllegalArgumentException((name + ".containsValue(null)").toString());
        }
        throw new IllegalArgumentException((name + ".containsKey(null)").toString());
    }

    public static final String h(String value) {
        boolean L;
        s.g(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i11 = 0; i11 < value.length(); i11++) {
            char charAt = value.charAt(i11);
            L = kotlin.text.w.L(",[]{}\\", charAt, false, 2, null);
            if (L) {
                sb2.append(CoreConstants.ESCAPE_CHAR);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String i(List<String> values) {
        String l02;
        s.g(values, "values");
        l02 = e0.l0(values, null, "[", "]", 0, null, a.f38916a, 25, null);
        return l02;
    }
}