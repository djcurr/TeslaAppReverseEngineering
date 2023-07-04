package ye;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static String f59459a = "calendar";

    /* renamed from: b  reason: collision with root package name */
    public static String f59460b = "ca";

    /* renamed from: c  reason: collision with root package name */
    public static String f59461c = "numbers";

    /* renamed from: d  reason: collision with root package name */
    public static String f59462d = "nu";

    /* renamed from: e  reason: collision with root package name */
    public static String f59463e = "hours";

    /* renamed from: f  reason: collision with root package name */
    public static String f59464f = "hc";

    /* renamed from: g  reason: collision with root package name */
    public static String f59465g = "collation";

    /* renamed from: h  reason: collision with root package name */
    public static String f59466h = "co";

    /* renamed from: i  reason: collision with root package name */
    public static String f59467i = "colnumeric";

    /* renamed from: j  reason: collision with root package name */
    public static String f59468j = "kn";

    /* renamed from: k  reason: collision with root package name */
    public static String f59469k = "colcasefirst";

    /* renamed from: l  reason: collision with root package name */
    public static String f59470l = "kf";

    /* renamed from: m  reason: collision with root package name */
    private static HashMap<String, String> f59471m = new a();

    /* renamed from: n  reason: collision with root package name */
    private static HashMap<String, String> f59472n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final Map<String, String> f59473o = new c();

    /* renamed from: p  reason: collision with root package name */
    private static Map<String, String> f59474p = new d();

    /* renamed from: q  reason: collision with root package name */
    private static Map<String, String> f59475q = new e();

    /* renamed from: r  reason: collision with root package name */
    private static Map<String, String[]> f59476r = new f();

    /* loaded from: classes3.dex */
    class a extends HashMap<String, String> {
        a() {
            put(g.f59460b, g.f59459a);
            put(g.f59462d, g.f59461c);
            put(g.f59464f, g.f59463e);
            put(g.f59466h, g.f59465g);
            put(g.f59468j, g.f59467i);
            put(g.f59470l, g.f59469k);
        }
    }

    /* loaded from: classes3.dex */
    class b extends HashMap<String, String> {
        b() {
            put(g.f59459a, g.f59460b);
            put(g.f59461c, g.f59462d);
            put(g.f59463e, g.f59464f);
            put(g.f59465g, g.f59466h);
            put(g.f59467i, g.f59468j);
            put(g.f59469k, g.f59470l);
        }
    }

    /* loaded from: classes3.dex */
    class c extends HashMap<String, String> {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* loaded from: classes3.dex */
    class d extends HashMap<String, String> {
        d() {
            put("gregorian", "gregory");
        }
    }

    /* loaded from: classes3.dex */
    class e extends HashMap<String, String> {
        e() {
            put("traditional", "traditio");
        }
    }

    /* loaded from: classes3.dex */
    class f extends HashMap<String, String[]> {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f59471m.containsKey(str) ? f59471m.get(str) : str;
    }

    public static String b(String str) {
        return f59472n.containsKey(str) ? f59472n.get(str) : str;
    }

    public static boolean c(String str, String str2, ye.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) bVar.h();
            String[] strArr = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals("search")) {
                    return false;
                }
                strArr = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                strArr = NumberingSystem.getAvailableNames();
            }
            if (strArr.length == 0) {
                return true;
            }
            return Arrays.asList(strArr).contains(str2);
        } else if (f59476r.containsKey(str)) {
            return Arrays.asList(f59476r.get(str)).contains(str2);
        } else {
            return true;
        }
    }

    public static String d(String str) {
        return !f59474p.containsKey(str) ? str : f59474p.get(str);
    }

    public static String e(String str) {
        Map<String, String> map = f59473o;
        return !map.containsKey(str) ? str : map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && ye.d.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && ye.d.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && ye.d.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && ye.d.m(obj) && obj.equals("yes")) {
            return ye.d.r("true");
        }
        return ((str.equals("kn") || str.equals("kf")) && ye.d.m(obj) && obj.equals("no")) ? ye.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f59475q.containsKey(str) ? str : f59475q.get(str);
    }
}