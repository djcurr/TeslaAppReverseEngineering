package t9;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f51800a;

    public static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(f51800a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.d(th2);
                str = "";
            }
            f51800a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f51800a;
    }

    public static synchronized String b(r9.a aVar, Context context, String str, String str2) {
        String str3;
        synchronized (i.class) {
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                str3 = TextUtils.isEmpty(string) ? null : i9.e.a(a(context), string, str);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                    c9.a.h(aVar, "cp", "TriDesEncryptError", String.format("%s,%s", str, string));
                }
            } catch (Exception e11) {
                e.d(e11);
            }
        }
        return str3;
    }

    public static synchronized void c(r9.a aVar, Context context, String str, String str2) {
        synchronized (i.class) {
            try {
                String c11 = i9.e.c(a(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(c11)) {
                    c9.a.h(aVar, "cp", "TriDesDecryptError", String.format("%s,%s", str, str2));
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, c11).apply();
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
    }
}