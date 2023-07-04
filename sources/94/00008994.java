package n30;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.i18n.e;
import net.time4j.tz.d;
import net.time4j.tz.s;

/* loaded from: classes5.dex */
public class b implements s {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Locale, Map<String, Map<d, String>>> f40444a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f40445b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Set<String>> f40446c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f40447d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        f40445b = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        g(hashMap, "data/zone1970.tab");
        f40446c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        a(hashMap2, "CL", "America/Santiago");
        a(hashMap2, "CN", "Asia/Shanghai");
        a(hashMap2, "DE", "Europe/Berlin");
        a(hashMap2, "EC", "America/Guayaquil");
        a(hashMap2, "ES", "Europe/Madrid");
        a(hashMap2, "MH", "Pacific/Majuro");
        a(hashMap2, "MY", "Asia/Kuala_Lumpur");
        a(hashMap2, "NZ", "Pacific/Auckland");
        a(hashMap2, "PT", "Europe/Lisbon");
        a(hashMap2, "UA", "Europe/Kiev");
        a(hashMap2, "UZ", "Asia/Tashkent");
        f40447d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    private static void c(Map<String, Set<String>> map, String str, String str2) {
        Set<String> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(str2);
    }

    private static e f(Locale locale) {
        return e.h("olson/zones/tzname", locale);
    }

    static void g(Map<String, Set<String>> map, String str) {
        InputStream e11 = net.time4j.base.d.c().e(net.time4j.base.d.c().f("olson", b.class, str), true);
        if (e11 == null) {
            e11 = b.class.getClassLoader().getResourceAsStream(str);
        }
        try {
            if (e11 != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e11, "UTF-8"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (!readLine.startsWith("#") && !readLine.isEmpty()) {
                                String[] split = readLine.split(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
                                if (split.length >= 3) {
                                    for (String str2 : split[0].split(",")) {
                                        c(map, str2, split[2]);
                                    }
                                }
                            }
                        } else {
                            try {
                                e11.close();
                                return;
                            } catch (IOException e12) {
                                e12.printStackTrace(System.err);
                                return;
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e13) {
                    throw new AssertionError(e13);
                } catch (IOException e14) {
                    throw new IllegalStateException(e14);
                }
            } else {
                System.err.println("Warning: File \"" + str + "\" not found.");
            }
        } catch (Throwable th2) {
            try {
                e11.close();
            } catch (IOException e15) {
                e15.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.tz.s
    public Set<String> b(Locale locale, boolean z11) {
        String country = locale.getCountry();
        if (z11) {
            if (country.equals("US")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add("America/New_York");
                linkedHashSet.add("America/Chicago");
                linkedHashSet.add("America/Denver");
                linkedHashSet.add("America/Los_Angeles");
                linkedHashSet.add("America/Anchorage");
                linkedHashSet.add("Pacific/Honolulu");
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = f40447d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set<String> set = f40446c.get(country);
        return set == null ? Collections.emptySet() : set;
    }

    @Override // net.time4j.tz.s
    public String d(boolean z11, Locale locale) {
        return f(locale).f(z11 ? "utc-literal" : "offset-pattern");
    }

    @Override // net.time4j.tz.s
    public String e(String str, d dVar, Locale locale) {
        if (f40445b.contains(str)) {
            return "";
        }
        Map<String, Map<d, String>> map = f40444a.get(locale);
        if (map == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap hashMap = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(d.class);
                enumMap.put((EnumMap) d.LONG_STANDARD_TIME, (d) strArr[1]);
                enumMap.put((EnumMap) d.SHORT_STANDARD_TIME, (d) strArr[2]);
                enumMap.put((EnumMap) d.LONG_DAYLIGHT_TIME, (d) strArr[3]);
                enumMap.put((EnumMap) d.SHORT_DAYLIGHT_TIME, (d) strArr[4]);
                hashMap.put(strArr[0], enumMap);
            }
            map = f40444a.putIfAbsent(locale, hashMap);
            if (map == null) {
                map = hashMap;
            }
        }
        Map<d, String> map2 = map.get(str);
        return map2 != null ? map2.get(dVar) : "";
    }
}