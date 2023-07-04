package e10;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t00.k;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f24472a;

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<u10.c, u10.c> f24473b;

    static {
        m mVar = new m();
        f24472a = mVar;
        f24473b = new HashMap<>();
        mVar.c(k.a.L, mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(k.a.N, mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(k.a.O, mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        mVar.c(new u10.c("java.util.function.Function"), mVar.a("java.util.function.UnaryOperator"));
        mVar.c(new u10.c("java.util.function.BiFunction"), mVar.a("java.util.function.BinaryOperator"));
    }

    private m() {
    }

    private final List<u10.c> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new u10.c(str));
        }
        return arrayList;
    }

    private final void c(u10.c cVar, List<u10.c> list) {
        AbstractMap abstractMap = f24473b;
        for (Object obj : list) {
            u10.c cVar2 = (u10.c) obj;
            abstractMap.put(obj, cVar);
        }
    }

    public final u10.c b(u10.c classFqName) {
        kotlin.jvm.internal.s.g(classFqName, "classFqName");
        return f24473b.get(classFqName);
    }
}