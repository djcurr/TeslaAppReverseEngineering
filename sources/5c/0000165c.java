package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@xf.a
/* loaded from: classes3.dex */
public class Intl {
    private static List<String> a(List<String> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                if (!str.isEmpty()) {
                    String b11 = e.b(str);
                    if (!b11.isEmpty() && !arrayList.contains(b11)) {
                        arrayList.add(b11);
                    }
                } else {
                    throw new JSRangeErrorException("Incorrect locale information provided");
                }
            } else {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @xf.a
    public static List<String> getCanonicalLocales(List<String> list) {
        return a(list);
    }

    @xf.a
    public static String toLocaleLowerCase(List<String> list, String str) {
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toLowerCase((ULocale) f.c((String[]) list.toArray(strArr)).f11216a.h(), str);
        }
        return str.toLowerCase((Locale) f.f((String[]) list.toArray(strArr)).f11216a.h());
    }

    @xf.a
    public static String toLocaleUpperCase(List<String> list, String str) {
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toUpperCase((ULocale) f.c((String[]) list.toArray(strArr)).f11216a.h(), str);
        }
        return str.toUpperCase((Locale) f.f((String[]) list.toArray(strArr)).f11216a.h());
    }
}