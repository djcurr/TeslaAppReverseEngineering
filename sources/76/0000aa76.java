package p9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public a f46409a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f46410b;

    public b(String str, a aVar) {
        this.f46409a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] d11 = d(jSONObject.optString("name", ""));
        for (int i11 = 0; i11 < d11.length; i11++) {
            a a11 = a.a(d11[i11]);
            if (a11 != a.None) {
                b bVar = new b(d11[i11], a11);
                bVar.f46410b = e(d11[i11]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static void c(b bVar) {
        String[] f11 = bVar.f();
        if (f11.length == 3 && TextUtils.equals("tid", f11[0])) {
            s9.a a11 = s9.a.a(r9.b.e().c());
            if (TextUtils.isEmpty(f11[1]) || TextUtils.isEmpty(f11[2])) {
                return;
            }
            a11.b(f11[1], f11[2]);
        }
    }

    public static String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public static String[] e(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public a b() {
        return this.f46409a;
    }

    public String[] f() {
        return this.f46410b;
    }
}