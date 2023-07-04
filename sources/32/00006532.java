package d40;

import a40.a;
import d40.c;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e */
    static Hashtable f23576e;

    /* renamed from: f */
    private static Object[] f23577f;

    /* renamed from: a */
    Class f23578a;

    /* renamed from: b */
    ClassLoader f23579b;

    /* renamed from: c */
    String f23580c;

    /* renamed from: d */
    int f23581d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f23576e = hashtable;
        hashtable.put("void", Void.TYPE);
        f23576e.put("boolean", Boolean.TYPE);
        f23576e.put("byte", Byte.TYPE);
        f23576e.put("char", Character.TYPE);
        f23576e.put("short", Short.TYPE);
        f23576e.put("int", Integer.TYPE);
        f23576e.put("long", Long.TYPE);
        f23576e.put("float", Float.TYPE);
        f23576e.put("double", Double.TYPE);
        f23577f = new Object[0];
    }

    public b(String str, Class cls) {
        this.f23580c = str;
        this.f23578a = cls;
        this.f23579b = cls.getClassLoader();
    }

    public static Class a(String str, ClassLoader classLoader) {
        if (str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        Class cls = (Class) f23576e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static a40.a b(a.InterfaceC0010a interfaceC0010a, Object obj, Object obj2) {
        return new c(interfaceC0010a, obj, obj2, f23577f);
    }

    public static a40.a c(a.InterfaceC0010a interfaceC0010a, Object obj, Object obj2, Object obj3) {
        return new c(interfaceC0010a, obj, obj2, new Object[]{obj3});
    }

    public b40.a d(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        int parseInt = Integer.parseInt(str, 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i11 = 0; i11 < countTokens; i11++) {
            clsArr[i11] = a(stringTokenizer.nextToken(), this.f23579b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i12 = 0; i12 < countTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i13 = 0; i13 < countTokens3; i13++) {
            clsArr2[i13] = a(stringTokenizer3.nextToken(), this.f23579b);
        }
        return new e(parseInt, str2, cls, clsArr, strArr, clsArr2, a(str6, this.f23579b));
    }

    public b40.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return d(str, str2, a(str3, this.f23579b), str4, str5, str6, str7);
    }

    public a.InterfaceC0010a f(String str, a40.b bVar, int i11) {
        int i12 = this.f23581d;
        this.f23581d = i12 + 1;
        return new c.a(i12, str, bVar, g(i11, -1));
    }

    public b40.b g(int i11, int i12) {
        return new g(this.f23578a, this.f23580c, i11);
    }
}