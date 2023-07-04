package sj;

import ak.k0;
import ak.o;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f50425a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50426b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f50427c;

    /* renamed from: d  reason: collision with root package name */
    public final float f50428d;

    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f50429a;

        /* renamed from: b  reason: collision with root package name */
        public final int f50430b;

        /* renamed from: c  reason: collision with root package name */
        public final int f50431c;

        /* renamed from: d  reason: collision with root package name */
        public final int f50432d;

        /* renamed from: e  reason: collision with root package name */
        public final int f50433e;

        private a(int i11, int i12, int i13, int i14, int i15) {
            this.f50429a = i11;
            this.f50430b = i12;
            this.f50431c = i13;
            this.f50432d = i14;
            this.f50433e = i15;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c11;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < split.length; i15++) {
                String R0 = k0.R0(split[i15].trim());
                R0.hashCode();
                switch (R0.hashCode()) {
                    case -70925746:
                        if (R0.equals("primarycolour")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3373707:
                        if (R0.equals("name")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 366554320:
                        if (R0.equals("fontsize")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1767875043:
                        if (R0.equals("alignment")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        i13 = i15;
                        break;
                    case 1:
                        i11 = i15;
                        break;
                    case 2:
                        i14 = i15;
                        break;
                    case 3:
                        i12 = i15;
                        break;
                }
            }
            if (i11 != -1) {
                return new a(i11, i12, i13, i14, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f50434c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f50435d = Pattern.compile(k0.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f50436e = Pattern.compile(k0.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f50437f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f50438a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f50439b;

        private b(int i11, PointF pointF) {
            this.f50438a = i11;
            this.f50439b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f50437f.matcher(str);
            if (matcher.find()) {
                return c.d((String) ak.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f50434c.matcher(str);
            PointF pointF = null;
            int i11 = -1;
            while (matcher.find()) {
                String str2 = (String) ak.a.e(matcher.group(1));
                try {
                    PointF c11 = c(str2);
                    if (c11 != null) {
                        pointF = c11;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a11 = a(str2);
                    if (a11 != -1) {
                        i11 = a11;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i11, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f50435d.matcher(str);
            Matcher matcher2 = f50436e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    o.f("SsaStyle.Overrides", sb2.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) ak.a.e(group)).trim()), Float.parseFloat(((String) ak.a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f50434c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i11, Integer num, float f11) {
        this.f50425a = str;
        this.f50426b = i11;
        this.f50427c = num;
        this.f50428d = f11;
    }

    public static c b(String str, a aVar) {
        ak.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i11 = aVar.f50433e;
        if (length != i11) {
            o.h("SsaStyle", k0.D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            return new c(split[aVar.f50429a].trim(), d(split[aVar.f50430b].trim()), e(split[aVar.f50431c].trim()), f(split[aVar.f50432d].trim()));
        } catch (RuntimeException e11) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            o.i("SsaStyle", sb2.toString(), e11);
            return null;
        }
    }

    private static boolean c(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        o.h("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static Integer e(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            ak.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(fl.d.d(((parseLong >> 24) & 255) ^ 255), fl.d.d(parseLong & 255), fl.d.d((parseLong >> 8) & 255), fl.d.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            o.i("SsaStyle", sb2.toString(), e11);
            return null;
        }
    }

    private static float f(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("Failed to parse font size: '");
            sb2.append(str);
            sb2.append("'");
            o.i("SsaStyle", sb2.toString(), e11);
            return -3.4028235E38f;
        }
    }
}