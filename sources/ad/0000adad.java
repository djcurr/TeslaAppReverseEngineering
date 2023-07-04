package q8;

import android.util.Log;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f48032a = false;

    public static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    public static String b(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i11 = 0;
        objArr2[0] = str;
        sb2.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= objArr.length) {
                    break;
                }
                sb2.append(a(objArr[i11], objArr[i12]));
                if (i12 < length - 1) {
                    sb2.append(",");
                }
                i11 = i12 + 1;
            }
            if (i11 == objArr.length - 1) {
                sb2.append(objArr[i11]);
            }
        }
        return sb2.toString();
    }

    public static void c(String str, Object... objArr) {
        if (f48032a) {
            Log.d("OpenId", b(str, objArr));
        }
    }
}