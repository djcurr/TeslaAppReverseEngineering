package hq;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29394a = new a();

    /* loaded from: classes2.dex */
    public static class a implements gq.j {
        @Override // gq.j
        public boolean a(Field field, Method method) {
            iq.a aVar = (iq.a) method.getAnnotation(iq.a.class);
            return aVar == null || !aVar.value();
        }
    }

    public static String a(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i11 = 1; i11 < length; i11++) {
            cArr[i11 + 3] = str.charAt(i11);
        }
        return new String(cArr);
    }

    public static String b(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i11 = 1; i11 < length; i11++) {
            cArr[i11 + 2] = str.charAt(i11);
        }
        return new String(cArr);
    }
}