package t10;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import wz.e0;
import wz.w;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f51540a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f51541b;

    static {
        List l11;
        String l02;
        List l12;
        List<String> l13;
        List<String> l14;
        List<String> l15;
        new b();
        int i11 = 0;
        l11 = w.l('k', 'o', 't', 'l', 'i', 'n');
        l02 = e0.l0(l11, "", null, null, 0, null, null, 62, null);
        f51540a = l02;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l12 = w.l("Boolean", "Z", "Char", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Byte", "B", "Short", "S", "Int", "I", "Float", Gender.FEMALE, "Long", "J", "Double", "D");
        int b11 = b00.c.b(0, l12.size() - 1, 2);
        if (b11 >= 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 2;
                StringBuilder sb2 = new StringBuilder();
                String str = f51540a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) l12.get(i12));
                int i14 = i12 + 1;
                linkedHashMap.put(sb2.toString(), l12.get(i14));
                linkedHashMap.put(str + '/' + ((String) l12.get(i12)) + "Array", s.p("[", l12.get(i14)));
                if (i12 == b11) {
                    break;
                }
                i12 = i13;
            }
        }
        linkedHashMap.put(s.p(f51540a, "/Unit"), "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        l13 = w.l("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : l13) {
            a(linkedHashMap, str2, s.p("java/lang/", str2));
        }
        l14 = w.l("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : l14) {
            a(linkedHashMap, s.p("collections/", str3), s.p("java/util/", str3));
            a(linkedHashMap, s.p("collections/Mutable", str3), s.p("java/util/", str3));
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i15 = i11 + 1;
            String p11 = s.p("Function", Integer.valueOf(i11));
            StringBuilder sb3 = new StringBuilder();
            String str4 = f51540a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i11);
            a(linkedHashMap, p11, sb3.toString());
            a(linkedHashMap, s.p("reflect/KFunction", Integer.valueOf(i11)), s.p(str4, "/reflect/KFunction"));
            if (i15 > 22) {
                break;
            }
            i11 = i15;
        }
        l15 = w.l("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : l15) {
            a(linkedHashMap, s.p(str5, ".Companion"), f51540a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f51541b = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f51540a + '/' + str, Matrix.MATRIX_TYPE_RANDOM_LT + str2 + ';');
    }

    public static final String b(String classId) {
        String C;
        s.g(classId, "classId");
        String str = f51541b.get(classId);
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            C = v.C(classId, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
            sb2.append(C);
            sb2.append(';');
            return sb2.toString();
        }
        return str;
    }
}