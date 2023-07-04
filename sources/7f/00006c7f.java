package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i DATE_BASIC;
    public static final i DATE_EXTENDED;
    public static final i DATE_TIME_BASIC;
    public static final i DATE_TIME_EXTENDED;
    public static final i HCARD_DATE_TIME;
    public static final i UTC_DATE_TIME_BASIC;
    public static final i UTC_DATE_TIME_EXTENDED;
    protected final String formatStr;

    /* loaded from: classes5.dex */
    enum a extends i {

        /* renamed from: ezvcard.util.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0495a extends SimpleDateFormat {
            C0495a(a aVar, String str) {
                super(str);
            }

            @Override // java.text.SimpleDateFormat, java.text.DateFormat
            public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                StringBuffer format = super.format(date, stringBuffer, fieldPosition);
                format.insert(format.length() - 2, CoreConstants.COLON_CHAR);
                return format;
            }
        }

        a(String str, int i11, String str2) {
            super(str, i11, str2, null);
        }

        @Override // ezvcard.util.i
        public DateFormat getDateFormat(TimeZone timeZone) {
            C0495a c0495a = new C0495a(this, this.formatStr);
            if (timeZone != null) {
                c0495a.setTimeZone(timeZone);
            }
            return c0495a;
        }
    }

    /* loaded from: classes5.dex */
    private static class d {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f25470c = Pattern.compile("^(\\d{4})-?(\\d{2})-?(\\d{2})(T(\\d{2}):?(\\d{2}):?(\\d{2})(\\.\\d+)?(Z|([-+])((\\d{2})|((\\d{2}):?(\\d{2}))))?)?$");

        /* renamed from: a  reason: collision with root package name */
        private final Matcher f25471a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25472b;

        public d(String str) {
            Matcher matcher = f25470c.matcher(str);
            this.f25471a = matcher;
            this.f25472b = matcher.find();
        }

        private int j(int i11) {
            return Integer.parseInt(this.f25471a.group(i11));
        }

        public int a() {
            return j(3);
        }

        public boolean b() {
            return this.f25471a.group(9) != null;
        }

        public boolean c() {
            return this.f25471a.group(5) != null;
        }

        public int d() {
            return j(5);
        }

        public boolean e() {
            return this.f25472b;
        }

        public int f() {
            if (this.f25471a.group(8) == null) {
                return 0;
            }
            return (int) Math.round(Double.parseDouble(this.f25471a.group(8)) * 1000.0d);
        }

        public int g() {
            return j(6);
        }

        public int h() {
            return j(2);
        }

        public int i() {
            int j11;
            int i11 = 0;
            if (this.f25471a.group(9).equals("Z")) {
                return 0;
            }
            int i12 = this.f25471a.group(10).equals(Marker.ANY_NON_NULL_MARKER) ? 1 : -1;
            if (this.f25471a.group(12) != null) {
                j11 = j(12);
            } else {
                j11 = j(14);
                i11 = j(15);
            }
            return ((j11 * 60 * 60 * 1000) + (i11 * 60 * 1000)) * i12;
        }

        public int k() {
            return j(7);
        }

        public int l() {
            return j(1);
        }
    }

    static {
        i iVar = new i("DATE_BASIC", 0, "yyyyMMdd");
        DATE_BASIC = iVar;
        i iVar2 = new i("DATE_EXTENDED", 1, "yyyy-MM-dd");
        DATE_EXTENDED = iVar2;
        i iVar3 = new i("DATE_TIME_BASIC", 2, "yyyyMMdd'T'HHmmssZ");
        DATE_TIME_BASIC = iVar3;
        a aVar = new a("DATE_TIME_EXTENDED", 3, "yyyy-MM-dd'T'HH:mm:ssZ");
        DATE_TIME_EXTENDED = aVar;
        i iVar4 = new i("UTC_DATE_TIME_BASIC", 4, "yyyyMMdd'T'HHmmss'Z'") { // from class: ezvcard.util.i.b
            @Override // ezvcard.util.i
            public DateFormat getDateFormat(TimeZone timeZone) {
                return super.getDateFormat(DesugarTimeZone.getTimeZone("UTC"));
            }
        };
        UTC_DATE_TIME_BASIC = iVar4;
        i iVar5 = new i("UTC_DATE_TIME_EXTENDED", 5, "yyyy-MM-dd'T'HH:mm:ss'Z'") { // from class: ezvcard.util.i.c
            @Override // ezvcard.util.i
            public DateFormat getDateFormat(TimeZone timeZone) {
                return super.getDateFormat(DesugarTimeZone.getTimeZone("UTC"));
            }
        };
        UTC_DATE_TIME_EXTENDED = iVar5;
        i iVar6 = new i("HCARD_DATE_TIME", 6, "yyyy-MM-dd'T'HH:mm:ssZ");
        HCARD_DATE_TIME = iVar6;
        $VALUES = new i[]{iVar, iVar2, iVar3, aVar, iVar4, iVar5, iVar6};
    }

    /* synthetic */ i(String str, int i11, String str2, a aVar) {
        this(str, i11, str2);
    }

    public static boolean dateHasTime(String str) {
        return str.contains("T");
    }

    public static boolean dateHasTimezone(String str) {
        return str.endsWith("Z") || str.matches(".*?[-+]\\d\\d:?\\d\\d");
    }

    public static Date parse(String str) {
        d dVar = new d(str);
        if (dVar.e()) {
            Calendar calendar = Calendar.getInstance(dVar.b() ? DesugarTimeZone.getTimeZone("UTC") : TimeZone.getDefault());
            calendar.clear();
            calendar.set(1, dVar.l());
            calendar.set(2, dVar.h() - 1);
            calendar.set(5, dVar.a());
            if (dVar.c()) {
                calendar.set(11, dVar.d());
                calendar.set(12, dVar.g());
                calendar.set(13, dVar.k());
                calendar.set(14, dVar.f());
                if (dVar.b()) {
                    calendar.set(15, dVar.i());
                }
            }
            return calendar.getTime();
        }
        throw ezvcard.a.INSTANCE.getIllegalArgumentException(41, str);
    }

    public static TimeZone parseTimeZoneId(String str) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(str);
        if ("GMT".equals(timeZone.getID())) {
            return null;
        }
        return timeZone;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public String format(Date date) {
        return format(date, null);
    }

    public DateFormat getDateFormat() {
        return getDateFormat(null);
    }

    private i(String str, int i11, String str2) {
        this.formatStr = str2;
    }

    public String format(Date date, TimeZone timeZone) {
        return getDateFormat(timeZone).format(date);
    }

    public DateFormat getDateFormat(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.formatStr);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }
}