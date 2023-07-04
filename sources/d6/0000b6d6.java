package u10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes5.dex */
public final class e {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52996a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.BEGINNING.ordinal()] = 1;
            iArr[i.AFTER_DOT.ordinal()] = 2;
            iArr[i.MIDDLE.ordinal()] = 3;
            f52996a = iArr;
        }
    }

    public static final <V> V a(c cVar, Map<c, ? extends V> values) {
        Object next;
        s.g(cVar, "<this>");
        s.g(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<c, ? extends V>> it2 = values.entrySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<c, ? extends V> next2 = it2.next();
            c key = next2.getKey();
            if (!s.c(cVar, key) && !b(cVar, key)) {
                z11 = false;
            }
            if (z11) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next3 = it3.next();
                    int length2 = g((c) ((Map.Entry) next3).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next3;
                        length = length2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (V) entry.getValue();
    }

    public static final boolean b(c cVar, c packageName) {
        s.g(cVar, "<this>");
        s.g(packageName, "packageName");
        return s.c(f(cVar), packageName);
    }

    private static final boolean c(String str, String str2) {
        boolean H;
        H = v.H(str, str2, false, 2, null);
        return H && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c packageName) {
        s.g(cVar, "<this>");
        s.g(packageName, "packageName");
        if (s.c(cVar, packageName) || packageName.d()) {
            return true;
        }
        String b11 = cVar.b();
        s.f(b11, "this.asString()");
        String b12 = packageName.b();
        s.f(b12, "packageName.asString()");
        return c(b11, b12);
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        i iVar = i.BEGINNING;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            i11++;
            int i12 = a.f52996a[iVar.ordinal()];
            if (i12 == 1 || i12 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                iVar = i.MIDDLE;
            } else if (i12 != 3) {
                continue;
            } else if (charAt == '.') {
                iVar = i.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return iVar != i.AFTER_DOT;
    }

    public static final c f(c cVar) {
        s.g(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        s.g(cVar, "<this>");
        s.g(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (s.c(cVar, prefix)) {
            c ROOT = c.f52986c;
            s.f(ROOT, "ROOT");
            return ROOT;
        }
        String b11 = cVar.b();
        s.f(b11, "asString()");
        String substring = b11.substring(prefix.b().length() + 1);
        s.f(substring, "(this as java.lang.String).substring(startIndex)");
        return new c(substring);
    }
}