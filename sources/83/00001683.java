package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.f;
import expo.modules.contacts.EXColumns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public class h {
    public static HashMap<String, Object> a(List<String> list, Object obj, List<String> list2) {
        f.a f11;
        HashMap<String, Object> hashMap = new HashMap<>();
        String h11 = ye.d.h(ye.d.a(obj, "localeMatcher"));
        if (Build.VERSION.SDK_INT >= 24 && !h11.equals(EXColumns.LOOKUP_KEY)) {
            f11 = f.c((String[]) list.toArray(new String[list.size()]));
        } else {
            f11 = f.f((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object b11 = ye.d.b();
            Object obj2 = b11;
            if (!f11.f11217b.isEmpty()) {
                obj2 = b11;
                if (f11.f11217b.containsKey(str)) {
                    String str2 = f11.f11217b.get(str);
                    boolean isEmpty = str2.isEmpty();
                    String str3 = str2;
                    if (isEmpty) {
                        str3 = ye.d.r("true");
                    }
                    hashSet.add(str);
                    obj2 = str3;
                }
            }
            if (ye.d.g(obj).containsKey(str)) {
                Object a11 = ye.d.a(obj, str);
                if (ye.d.m(a11) && ye.d.h(a11).isEmpty()) {
                    a11 = ye.d.o(true);
                }
                if (!ye.d.n(a11) && !a11.equals(obj2)) {
                    hashSet.remove(str);
                    obj2 = a11;
                }
            }
            if (!ye.d.j(obj2)) {
                obj2 = ye.g.f(str, obj2);
            }
            if (ye.d.m(obj2) && !ye.g.c(str, ye.d.h(obj2), f11.f11216a)) {
                hashMap.put(str, ye.d.b());
            } else {
                hashMap.put(str, obj2);
            }
        }
        for (String str4 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String h12 = ye.d.h(ye.g.f(str4, ye.d.r(f11.f11217b.get(str4))));
            if (!ye.d.m(h12) || ye.g.c(str4, ye.d.h(h12), f11.f11216a)) {
                arrayList.add(h12);
                f11.f11216a.f(str4, arrayList);
            }
        }
        hashMap.put("locale", f11.f11216a);
        return hashMap;
    }
}