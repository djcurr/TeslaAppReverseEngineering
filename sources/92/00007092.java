package gq;

import j$.util.DesugarTimeZone;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    public static TimeZone f28080d;

    /* renamed from: a  reason: collision with root package name */
    static TreeMap<String, Integer> f28077a = new TreeMap<>(new a());

    /* renamed from: b  reason: collision with root package name */
    static TreeMap<String, Integer> f28078b = new TreeMap<>(new a());

    /* renamed from: c  reason: collision with root package name */
    private static HashSet<String> f28079c = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    static TreeMap<String, TimeZone> f28081e = new TreeMap<>();

    /* loaded from: classes2.dex */
    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        String[] availableIDs;
        Locale[] availableLocales;
        f28079c.add("à");
        f28079c.add("at");
        f28079c.add("MEZ");
        f28079c.add("Uhr");
        f28079c.add("h");
        f28079c.add("pm");
        f28079c.add("PM");
        f28079c.add("am");
        f28079c.add("AM");
        f28079c.add("min");
        f28079c.add("um");
        f28079c.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            f28081e.put(str, DesugarTimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i11 = 0; i11 < months.length; i11++) {
                    if (months[i11].length() != 0) {
                        d(f28077a, months[i11], Integer.valueOf(i11));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i12 = 0; i12 < shortMonths.length; i12++) {
                    String str2 = shortMonths[i12];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        d(f28077a, shortMonths[i12], Integer.valueOf(i12));
                        d(f28077a, shortMonths[i12].replace(".", ""), Integer.valueOf(i12));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i13 = 0; i13 < weekdays.length; i13++) {
                    String str3 = weekdays[i13];
                    if (str3.length() != 0) {
                        d(f28078b, str3, Integer.valueOf(i13));
                        d(f28078b, str3.replace(".", ""), Integer.valueOf(i13));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i14 = 0; i14 < shortWeekdays.length; i14++) {
                    String str4 = shortWeekdays[i14];
                    if (str4.length() != 0) {
                        d(f28078b, str4, Integer.valueOf(i14));
                        d(f28078b, str4.replace(".", ""), Integer.valueOf(i14));
                    }
                }
            }
        }
    }

    private static Date a(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return b(stringTokenizer, calendar, str);
    }

    private static Date b(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        calendar.set(11, Integer.parseInt(k(stringTokenizer, str, calendar)));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k11 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k11 == null) {
            return calendar.getTime();
        }
        calendar.set(12, Integer.parseInt(k11));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k12 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k12 == null) {
            return calendar.getTime();
        }
        calendar.set(13, Integer.parseInt(k12));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k13 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k13 == null) {
            return calendar.getTime();
        }
        String k14 = k(stringTokenizer, k13, calendar);
        if (k14.length() == 4 && Character.isDigit(k14.charAt(0))) {
            calendar.set(1, h(k14));
        }
        return calendar.getTime();
    }

    public static Date c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
            if (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() == 4 && Character.isDigit(nextToken.charAt(0))) {
                    return g(stringTokenizer, nextToken);
                }
                if (f28078b.containsKey(nextToken)) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        return null;
                    }
                    nextToken = stringTokenizer.nextToken();
                }
                if (f28077a.containsKey(nextToken)) {
                    return f(stringTokenizer, nextToken);
                }
                if (Character.isDigit(nextToken.charAt(0))) {
                    return e(stringTokenizer, nextToken);
                }
                return null;
            }
            return null;
        }
        throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
    }

    private static void d(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    private static Date e(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i11 = i();
        i11.set(5, Integer.parseInt(str));
        if (stringTokenizer.hasMoreTokens()) {
            i11.set(2, j(stringTokenizer.nextToken()).intValue());
            if (stringTokenizer.hasMoreTokens()) {
                i11.set(1, h(stringTokenizer.nextToken()));
                return a(stringTokenizer, i11, null);
            }
            return null;
        }
        return null;
    }

    private static Date f(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i11 = i();
        Integer num = f28077a.get(str);
        if (num != null) {
            i11.set(2, num.intValue());
            if (stringTokenizer.hasMoreTokens()) {
                i11.set(5, Integer.parseInt(stringTokenizer.nextToken()));
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (Character.isLetter(nextToken.charAt(0))) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            return null;
                        }
                        nextToken = stringTokenizer.nextToken();
                    }
                    if (nextToken.length() == 4) {
                        i11.set(1, h(nextToken));
                    } else if (nextToken.length() == 2) {
                        return b(stringTokenizer, i11, nextToken);
                    }
                    return a(stringTokenizer, i11, null);
                }
                return null;
            }
            return null;
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static Date g(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i11 = i();
        i11.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return i11.getTime();
        }
        i11.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return i11.getTime();
        }
        String nextToken = stringTokenizer.nextToken();
        if (Character.isDigit(nextToken.charAt(0))) {
            if (nextToken.length() == 5 && nextToken.charAt(2) == 'T') {
                i11.set(5, Integer.parseInt(nextToken.substring(0, 2)));
                return a(stringTokenizer, i11, nextToken.substring(3));
            }
            i11.set(5, Integer.parseInt(nextToken));
            return a(stringTokenizer, i11, null);
        }
        return i11.getTime();
    }

    private static int h(String str) {
        int parseInt = Integer.parseInt(str);
        return parseInt < 100 ? parseInt > 30 ? parseInt + 2000 : parseInt + 1900 : parseInt;
    }

    private static GregorianCalendar i() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = f28080d;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    private static Integer j(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = f28077a.get(str);
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static String k(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = f28081e.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else if (!f28079c.contains(str)) {
                return str;
            } else {
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }
}