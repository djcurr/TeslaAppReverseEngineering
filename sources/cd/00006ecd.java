package freemarker.ext.beans;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f26917a = c();

    /* renamed from: b  reason: collision with root package name */
    static /* synthetic */ Class f26918b;

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", Boolean.TYPE);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        hashMap.put("int", Integer.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("float", Float.TYPE);
        hashMap.put("double", Double.TYPE);
        return hashMap;
    }

    private static final Set c() {
        Properties properties = new Properties();
        Class cls = f26918b;
        if (cls == null) {
            cls = a("freemarker.ext.beans.BeansWrapper");
            f26918b = cls;
        }
        InputStream resourceAsStream = cls.getResourceAsStream("unsafeMethods.txt");
        if (resourceAsStream != null) {
            String str = null;
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
                HashSet hashSet = new HashSet((properties.size() * 4) / 3, 1.0f);
                Map b11 = b();
                for (String str2 : properties.keySet()) {
                    try {
                        try {
                            try {
                                hashSet.add(e(str2, b11));
                            } catch (NoSuchMethodException e11) {
                                if (p.f26955p) {
                                    throw e11;
                                }
                            }
                        } catch (ClassNotFoundException e12) {
                            if (p.f26955p) {
                                throw e12;
                            }
                        }
                        str = str2;
                    } catch (Exception e13) {
                        e = e13;
                        str = str2;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Could not load unsafe method ");
                        stringBuffer.append(str);
                        stringBuffer.append(" ");
                        stringBuffer.append(e.getClass().getName());
                        stringBuffer.append(" ");
                        stringBuffer.append(e.getMessage());
                        throw new RuntimeException(stringBuffer.toString());
                    }
                }
                return hashSet;
            } catch (Exception e14) {
                e = e14;
            }
        } else {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Method method) {
        return f26917a.contains(method);
    }

    private static Method e(String str, Map map) {
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(46, indexOf);
        Class b11 = jx.a.b(str.substring(0, lastIndexOf));
        String substring = str.substring(lastIndexOf + 1, indexOf);
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(indexOf + 1, str.length() - 1), ",");
        int countTokens = stringTokenizer.countTokens();
        Class<?>[] clsArr = new Class[countTokens];
        for (int i11 = 0; i11 < countTokens; i11++) {
            String nextToken = stringTokenizer.nextToken();
            clsArr[i11] = (Class) map.get(nextToken);
            if (clsArr[i11] == null) {
                clsArr[i11] = jx.a.b(nextToken);
            }
        }
        return b11.getMethod(substring, clsArr);
    }
}