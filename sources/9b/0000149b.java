package com.android.volley.toolbox;

import com.android.volley.a;
import com.stripe.android.core.networking.NetworkConstantsKt;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<com.android.volley.e> a(List<com.android.volley.e> list, a.C0196a c0196a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (com.android.volley.e eVar : list) {
                treeSet.add(eVar.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.e> list2 = c0196a.f10257h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.e eVar2 : c0196a.f10257h) {
                    if (!treeSet.contains(eVar2.a())) {
                        arrayList.add(eVar2);
                    }
                }
            }
        } else if (!c0196a.f10256g.isEmpty()) {
            for (Map.Entry<String, String> entry : c0196a.f10256g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j11) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> c(a.C0196a c0196a) {
        if (c0196a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c0196a.f10251b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j11 = c0196a.f10253d;
        if (j11 > 0) {
            hashMap.put("If-Modified-Since", b(j11));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static a.C0196a e(com.android.volley.h hVar) {
        boolean z11;
        long j11;
        long j12;
        long j13;
        long j14;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = hVar.f10285c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long g11 = str != null ? g(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i11 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i12 = 0;
            j11 = 0;
            j12 = 0;
            while (i11 < split.length) {
                String trim = split[i11].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i12 = 1;
                }
                i11++;
            }
            i11 = i12;
            z11 = true;
        } else {
            z11 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = map.get("Expires");
        long g12 = str3 != null ? g(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long g13 = str4 != null ? g(str4) : 0L;
        String str5 = map.get("ETag");
        if (z11) {
            j14 = currentTimeMillis + (j11 * 1000);
            j13 = i11 != 0 ? j14 : (j12 * 1000) + j14;
        } else {
            j13 = 0;
            if (g11 <= 0 || g12 < g11) {
                j14 = 0;
            } else {
                j14 = currentTimeMillis + (g12 - g11);
                j13 = j14;
            }
        }
        a.C0196a c0196a = new a.C0196a();
        c0196a.f10250a = hVar.f10284b;
        c0196a.f10251b = str5;
        c0196a.f10255f = j14;
        c0196a.f10254e = j13;
        c0196a.f10252c = g11;
        c0196a.f10253d = g13;
        c0196a.f10256g = map;
        c0196a.f10257h = hVar.f10286d;
        return c0196a;
    }

    public static String f(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get(NetworkConstantsKt.HEADER_CONTENT_TYPE)) != null) {
            String[] split = str2.split(";", 0);
            for (int i11 = 1; i11 < split.length; i11++) {
                String[] split2 = split[i11].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long g(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e11) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                com.android.volley.n.d(e11, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.n.e("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<com.android.volley.e> h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> i(List<com.android.volley.e> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.e eVar : list) {
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }
}