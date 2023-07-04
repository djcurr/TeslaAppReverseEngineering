package gq;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.shaded.asm.Accessor;
import java.lang.reflect.Field;
import java.util.HashMap;
import mq.b0;
import mq.r;
import mq.s;

/* loaded from: classes2.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(s sVar, b0 b0Var) {
        switch (b0Var.l()) {
            case 1:
                sVar.v(184, "java/lang/Boolean", CoreConstants.VALUE_OF, "(Z)Ljava/lang/Boolean;", false);
                return;
            case 2:
                sVar.v(184, "java/lang/Character", CoreConstants.VALUE_OF, "(C)Ljava/lang/Character;", false);
                return;
            case 3:
                sVar.v(184, "java/lang/Byte", CoreConstants.VALUE_OF, "(B)Ljava/lang/Byte;", false);
                return;
            case 4:
                sVar.v(184, "java/lang/Short", CoreConstants.VALUE_OF, "(S)Ljava/lang/Short;", false);
                return;
            case 5:
                sVar.v(184, "java/lang/Integer", CoreConstants.VALUE_OF, "(I)Ljava/lang/Integer;", false);
                return;
            case 6:
                sVar.v(184, "java/lang/Float", CoreConstants.VALUE_OF, "(F)Ljava/lang/Float;", false);
                return;
            case 7:
                sVar.v(184, "java/lang/Long", CoreConstants.VALUE_OF, "(J)Ljava/lang/Long;", false);
                return;
            case 8:
                sVar.v(184, "java/lang/Double", CoreConstants.VALUE_OF, "(D)Ljava/lang/Double;", false);
                return;
            default:
                return;
        }
    }

    public static Accessor[] b(Class<?> cls, j jVar) {
        Field[] declaredFields;
        HashMap hashMap = new HashMap();
        if (jVar == null) {
            jVar = c.f28062a;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!hashMap.containsKey(name)) {
                    b bVar = new b(cls, field, jVar);
                    if (bVar.g()) {
                        hashMap.put(name, bVar);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (b[]) hashMap.values().toArray(new b[hashMap.size()]);
    }

    public static String c(String str) {
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

    public static String d(String str) {
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

    public static String e(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
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

    public static r[] f(int i11) {
        r[] rVarArr = new r[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            rVarArr[i12] = new r();
        }
        return rVarArr;
    }
}