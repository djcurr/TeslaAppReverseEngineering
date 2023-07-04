package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public class f {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ye.b<?> f11216a;

        /* renamed from: b  reason: collision with root package name */
        public HashMap<String, String> f11217b = new HashMap<>();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return "";
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static ULocale b(ye.b<?> bVar) {
        ULocale[] availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {(ULocale) bVar.c()};
        boolean[] zArr = new boolean[1];
        ULocale acceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    public static a c(String[] strArr) {
        a aVar = new a();
        for (String str : strArr) {
            ye.b b11 = ye.e.b(str);
            ULocale b12 = b(b11);
            if (b12 != null) {
                aVar.f11216a = ye.f.k(b12);
                aVar.f11217b = b11.a();
                return aVar;
            }
        }
        aVar.f11216a = ye.f.i();
        return aVar;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(ye.e.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        if (Build.VERSION.SDK_INT < 21) {
            return new String[]{"en"};
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) {
        a aVar = new a();
        for (String str : strArr) {
            ye.b b11 = ye.e.b(str);
            String a11 = a(strArr2, b11.e());
            if (!a11.isEmpty()) {
                aVar.f11216a = ye.e.b(a11);
                aVar.f11217b = b11.a();
                return aVar;
            }
        }
        aVar.f11216a = ye.e.a();
        return aVar;
    }

    public static String[] h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] e11 = e();
        for (String str : strArr) {
            String a11 = a(e11, ye.e.b(str).e());
            if (a11 != null && !a11.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}