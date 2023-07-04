package qv;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import kotlin.text.w;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final a f48567a = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d d(a aVar, String str, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
            String z12;
            int i15 = (i14 & 4) != 0 ? 0 : i12;
            if ((i14 & 8) != 0) {
                z12 = v.z("9", i11);
                i13 = Integer.parseInt(z12);
            }
            return aVar.c(str, i11, i15, i13, (i14 & 16) != 0 ? false : z11);
        }

        public final String a(String text, List<e> parsers) {
            kotlin.jvm.internal.s.g(text, "text");
            kotlin.jvm.internal.s.g(parsers, "parsers");
            String str = "";
            for (e eVar : parsers) {
                d b11 = eVar.b(text);
                str = kotlin.jvm.internal.s.p(str, b11.c());
                if (!b11.e()) {
                    return str;
                }
                text = b11.d();
            }
            return str;
        }

        public final d b(String str, String divider) {
            boolean H;
            d dVar;
            kotlin.jvm.internal.s.g(str, "str");
            kotlin.jvm.internal.s.g(divider, "divider");
            if (str.length() == 0) {
                return new d("", str, false, 4, null);
            }
            if (Character.isDigit(str.charAt(0))) {
                dVar = new d(divider, str, false, 4, null);
            } else if (kotlin.jvm.internal.s.c(str, divider)) {
                return new d("", "", false, 4, null);
            } else {
                H = v.H(str, divider, false, 2, null);
                if (!H) {
                    return new d("", str, false, 4, null);
                }
                String substring = str.substring(divider.length());
                kotlin.jvm.internal.s.f(substring, "(this as java.lang.String).substring(startIndex)");
                dVar = new d(divider, substring, false, 4, null);
            }
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            if (kotlin.jvm.internal.s.c(r9, r8) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            if (r24 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
            if (r11 > r23) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
            if (r4 == r20.length()) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
            if (r12 == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
            r14 = kotlin.text.w.m0(r9, r21, '0');
            r15 = r20.substring(r9.length());
            kotlin.jvm.internal.s.f(r15, "(this as java.lang.String).substring(startIndex)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
            r10 = r20.substring(r9.length());
            kotlin.jvm.internal.s.f(r10, "(this as java.lang.String).substring(startIndex)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
            return new qv.l.d(r9, r10, false, 4, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
            return new qv.l.d(r14, r15, false, 4, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final qv.l.d c(java.lang.String r20, int r21, int r22, int r23, boolean r24) {
            /*
                r19 = this;
                r2 = r20
                r0 = r21
                r1 = r22
                r3 = r23
                java.lang.String r4 = "str"
                kotlin.jvm.internal.s.g(r2, r4)
                int r4 = r20.length()
                r5 = 0
                r6 = 1
                if (r4 <= 0) goto L17
                r4 = r6
                goto L18
            L17:
                r4 = r5
            L18:
                if (r4 == 0) goto La2
                int r4 = r20.length()
                int r4 = java.lang.Math.min(r0, r4)
                if (r6 > r4) goto La2
            L24:
                int r7 = r4 + (-1)
                java.lang.String r9 = r2.substring(r5, r4)
                java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.s.f(r9, r8)
                if (r1 <= 0) goto L3e
                java.lang.String r8 = "0"
                java.lang.String r8 = kotlin.text.m.z(r8, r0)
                boolean r8 = kotlin.jvm.internal.s.c(r9, r8)
                if (r8 == 0) goto L3e
                goto L9d
            L3e:
                r8 = 57
                java.lang.String r8 = kotlin.text.m.j0(r9, r0, r8)     // Catch: java.lang.NumberFormatException -> L9d
                int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L9d
                r10 = 48
                java.lang.String r11 = kotlin.text.m.j0(r9, r0, r10)     // Catch: java.lang.NumberFormatException -> L9d
                int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L9d
                int r12 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L9d
                if (r8 < r1) goto L9d
                if (r11 <= r3) goto L5e
                if (r24 == 0) goto L9d
                if (r12 > r3) goto L9d
            L5e:
                java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
                if (r24 == 0) goto L88
                if (r11 > r3) goto L6c
                int r11 = r20.length()     // Catch: java.lang.NumberFormatException -> L9d
                if (r4 == r11) goto L88
                if (r12 == 0) goto L88
            L6c:
                qv.l$d r4 = new qv.l$d     // Catch: java.lang.NumberFormatException -> L9d
                java.lang.String r14 = kotlin.text.m.m0(r9, r0, r10)     // Catch: java.lang.NumberFormatException -> L9d
                int r9 = r9.length()     // Catch: java.lang.NumberFormatException -> L9d
                java.lang.String r15 = r2.substring(r9)     // Catch: java.lang.NumberFormatException -> L9d
                kotlin.jvm.internal.s.f(r15, r8)     // Catch: java.lang.NumberFormatException -> L9d
                r16 = 0
                r17 = 4
                r18 = 0
                r13 = r4
                r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.NumberFormatException -> L9d
                goto L9c
            L88:
                qv.l$d r4 = new qv.l$d     // Catch: java.lang.NumberFormatException -> L9d
                int r10 = r9.length()     // Catch: java.lang.NumberFormatException -> L9d
                java.lang.String r10 = r2.substring(r10)     // Catch: java.lang.NumberFormatException -> L9d
                kotlin.jvm.internal.s.f(r10, r8)     // Catch: java.lang.NumberFormatException -> L9d
                r11 = 0
                r12 = 4
                r13 = 0
                r8 = r4
                r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.NumberFormatException -> L9d
            L9c:
                return r4
            L9d:
                if (r6 <= r7) goto La0
                goto La2
            La0:
                r4 = r7
                goto L24
            La2:
                qv.l$d r6 = new qv.l$d
                r3 = 0
                r4 = 4
                r5 = 0
                java.lang.String r1 = ""
                r0 = r6
                r2 = r20
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qv.l.a.c(java.lang.String, int, int, int, boolean):qv.l$d");
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48568a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        private static final SimpleDateFormat f48569b;

        /* renamed from: c  reason: collision with root package name */
        private static final SimpleDateFormat f48570c;

        /* loaded from: classes6.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qv.l$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1046a extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f48571a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f48572b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1046a(int i11, int i12) {
                    super(1);
                    this.f48571a = i11;
                    this.f48572b = i12;
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return a.d(l.f48567a, it2, 4, this.f48571a, this.f48572b, false, 16, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qv.l$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1047b extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1047b f48573a = new C1047b();

                C1047b() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.b(it2, "-");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class c extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final c f48574a = new c();

                c() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.c(it2, 2, 1, 12, true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class d extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f48575a = new d();

                d() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.b(it2, "-");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class e extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final e f48576a = new e();

                e() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.c(it2, 2, 1, 31, true);
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int h(Date date) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(date.getTime());
                return calendar.get(1);
            }

            public final Date a() {
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, calendar.get(1) - 100);
                Date time = calendar.getTime();
                kotlin.jvm.internal.s.f(time, "getInstance().apply {\n  …YEAR) - 100)\n      }.time");
                return time;
            }

            public final Calendar b(String date) {
                Date f11;
                CharSequence y02;
                kotlin.jvm.internal.s.g(date, "date");
                Calendar calendar = Calendar.getInstance();
                a aVar = b.f48568a;
                String d11 = aVar.d(date);
                try {
                    String format = b.f48569b.format(aVar.f());
                    kotlin.jvm.internal.s.f(format, "FORMATTER.format(latestDate())");
                    boolean z11 = false;
                    y02 = w.y0(format, 0, d11.length(), d11);
                    f11 = b.f48570c.parse(y02.toString());
                    if (f11 != null && f11.compareTo(aVar.a()) > 0 && f11.compareTo(aVar.f()) < 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        f11 = null;
                    }
                    if (f11 == null) {
                        f11 = aVar.f();
                    }
                } catch (ParseException unused) {
                    f11 = b.f48568a.f();
                }
                calendar.setTimeInMillis(f11.getTime());
                kotlin.jvm.internal.s.f(calendar, "getInstance().apply {\n  … }.time\n        }\n      }");
                return calendar;
            }

            public final String c(Date date) {
                kotlin.jvm.internal.s.g(date, "date");
                String format = b.f48569b.format(date);
                kotlin.jvm.internal.s.f(format, "FORMATTER.format(date)");
                return format;
            }

            public final String d(String date) {
                List<e> l11;
                kotlin.jvm.internal.s.g(date, "date");
                int h11 = h(a());
                int h12 = h(f());
                a aVar = l.f48567a;
                l11 = wz.w.l(new e(4, new C1046a(h11, h12)), new e(0, C1047b.f48573a), new e(2, c.f48574a), new e(0, d.f48575a), new e(2, e.f48576a));
                return aVar.a(date, l11);
            }

            public final boolean e(String date) {
                kotlin.jvm.internal.s.g(date, "date");
                try {
                    Date parse = b.f48569b.parse(date);
                    if (parse == null) {
                        return false;
                    }
                    a aVar = b.f48568a;
                    if (parse.compareTo(aVar.a()) > 0) {
                        return parse.compareTo(aVar.f()) < 0;
                    }
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }

            public final Date f() {
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, calendar.get(1) - 1);
                Date time = calendar.getTime();
                kotlin.jvm.internal.s.f(time, "getInstance().apply {\n  …r.YEAR) - 1)\n      }.time");
                return time;
            }

            public final Date g(String date) {
                kotlin.jvm.internal.s.g(date, "date");
                return b.f48569b.parse(date);
            }
        }

        static {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            simpleDateFormat.setLenient(false);
            f48569b = simpleDateFormat;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
            simpleDateFormat2.setLenient(true);
            f48570c = simpleDateFormat2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48577a = new a(null);

        /* loaded from: classes6.dex */
        public static final class a {

            /* renamed from: qv.l$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C1048a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f48578a;

                static {
                    int[] iArr = new int[b.values().length];
                    iArr[b.SSN_LAST_4.ordinal()] = 1;
                    iArr[b.SSN_FULL.ordinal()] = 2;
                    f48578a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class b extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f48579a = new b();

                b() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return a.d(l.f48567a, it2, 4, 1, 0, false, 24, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qv.l$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1049c extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1049c f48580a = new C1049c();

                C1049c() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return a.d(l.f48567a, it2, 3, 1, 0, false, 24, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class d extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f48581a = new d();

                d() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.b(it2, "-");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class e extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final e f48582a = new e();

                e() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return a.d(l.f48567a, it2, 2, 1, 0, false, 24, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class f extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final f f48583a = new f();

                f() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return l.f48567a.b(it2, "-");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class g extends u implements h00.l<String, d> {

                /* renamed from: a  reason: collision with root package name */
                public static final g f48584a = new g();

                g() {
                    super(1);
                }

                @Override // h00.l
                /* renamed from: a */
                public final d invoke(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                    return a.d(l.f48567a, it2, 4, 1, 0, false, 24, null);
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a(String input, b type) {
                String D;
                kotlin.jvm.internal.s.g(input, "input");
                kotlin.jvm.internal.s.g(type, "type");
                int i11 = C1048a.f48578a[type.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        D = v.D(input, "-", "", false, 4, null);
                        return D;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return input;
            }

            public final String b(String input, b type) {
                List<e> d11;
                List<e> l11;
                kotlin.jvm.internal.s.g(input, "input");
                kotlin.jvm.internal.s.g(type, "type");
                int i11 = C1048a.f48578a[type.ordinal()];
                if (i11 == 1) {
                    a aVar = l.f48567a;
                    d11 = wz.v.d(new e(4, b.f48579a));
                    return aVar.a(input, d11);
                } else if (i11 == 2) {
                    a aVar2 = l.f48567a;
                    l11 = wz.w.l(new e(3, C1049c.f48580a), new e(0, d.f48581a), new e(2, e.f48582a), new e(0, f.f48583a), new e(4, g.f48584a));
                    return aVar2.a(input, l11);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }

            public final boolean c(String number, b type) {
                kotlin.jvm.internal.s.g(number, "number");
                kotlin.jvm.internal.s.g(type, "type");
                return b(number, type).length() == type.getFormat().length();
            }
        }

        /* loaded from: classes6.dex */
        public enum b {
            SSN_FULL("XXX-XX-XXXX"),
            SSN_LAST_4("XXXX");
            
            private final String format;

            b(String str) {
                this.format = str;
            }

            public final String getFormat() {
                return this.format;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f48585a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48586b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f48587c;

        public d(String parsed, String remainder, boolean z11) {
            kotlin.jvm.internal.s.g(parsed, "parsed");
            kotlin.jvm.internal.s.g(remainder, "remainder");
            this.f48585a = parsed;
            this.f48586b = remainder;
            this.f48587c = z11;
        }

        public static /* synthetic */ d b(d dVar, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f48585a;
            }
            if ((i11 & 2) != 0) {
                str2 = dVar.f48586b;
            }
            if ((i11 & 4) != 0) {
                z11 = dVar.f48587c;
            }
            return dVar.a(str, str2, z11);
        }

        public final d a(String parsed, String remainder, boolean z11) {
            kotlin.jvm.internal.s.g(parsed, "parsed");
            kotlin.jvm.internal.s.g(remainder, "remainder");
            return new d(parsed, remainder, z11);
        }

        public final String c() {
            return this.f48585a;
        }

        public final String d() {
            return this.f48586b;
        }

        public final boolean e() {
            return this.f48587c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(this.f48585a, dVar.f48585a) && kotlin.jvm.internal.s.c(this.f48586b, dVar.f48586b) && this.f48587c == dVar.f48587c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f48585a.hashCode() * 31) + this.f48586b.hashCode()) * 31;
            boolean z11 = this.f48587c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "ParseResult(parsed=" + this.f48585a + ", remainder=" + this.f48586b + ", isSuccessful=" + this.f48587c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ d(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f48588a;

        /* renamed from: b  reason: collision with root package name */
        private final h00.l<String, d> f48589b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i11, h00.l<? super String, d> parser) {
            kotlin.jvm.internal.s.g(parser, "parser");
            this.f48588a = i11;
            this.f48589b = parser;
        }

        public final int a() {
            return this.f48588a;
        }

        public final d b(String str) {
            kotlin.jvm.internal.s.g(str, "str");
            d invoke = this.f48589b.invoke(str);
            return d.b(invoke, null, null, invoke.c().length() >= a(), 3, null);
        }
    }
}