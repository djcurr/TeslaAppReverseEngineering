package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class PartialDate {

    /* renamed from: c  reason: collision with root package name */
    private static final c[] f25425c = {new c("(\\d{4})", 0), new c("(\\d{4})-(\\d{2})", 0, 1), new c("(\\d{4})-?(\\d{2})-?(\\d{2})", 0, 1, 2), new c("--(\\d{2})-?(\\d{2})", 1, 2), new c("--(\\d{2})", 1), new c("---(\\d{2})", 2)};

    /* renamed from: d  reason: collision with root package name */
    private static final c[] f25426d = {new c("(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, null, 6, 7), new c("(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, null, 6, 7), new c("(\\d{2}):?(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, 5, null, 6, 7), new c("-(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, 5, null, 6, 7), new c("-(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, null, 6, 7), new c("--(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 5, null, 6, 7)};

    /* renamed from: a  reason: collision with root package name */
    private final Integer[] f25427a;

    /* renamed from: b  reason: collision with root package name */
    private final UtcOffset f25428b;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Integer[] f25429a = new Integer[6];

        /* renamed from: b  reason: collision with root package name */
        private UtcOffset f25430b;

        public PartialDate c() {
            Integer[] numArr = this.f25429a;
            if (numArr[0] != null && numArr[1] == null && numArr[2] != null) {
                throw ezvcard.a.INSTANCE.getIllegalArgumentException(38, new Object[0]);
            }
            if (numArr[3] != null && numArr[4] == null && numArr[5] != null) {
                throw ezvcard.a.INSTANCE.getIllegalArgumentException(39, new Object[0]);
            }
            return new PartialDate(this.f25429a, this.f25430b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f25431a;

        /* renamed from: b  reason: collision with root package name */
        private Integer[] f25432b;

        public c(String str, Integer... numArr) {
            this.f25431a = Pattern.compile('^' + str + CoreConstants.DOLLAR);
            this.f25432b = numArr;
        }

        public boolean a(b bVar, String str) {
            String group;
            Matcher matcher = this.f25431a.matcher(str);
            if (matcher.find()) {
                Integer num = null;
                Integer num2 = null;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    Integer[] numArr = this.f25432b;
                    if (i11 >= numArr.length) {
                        break;
                    }
                    Integer num3 = numArr[i11];
                    if (num3 != null && (group = matcher.group(i11 + 1)) != null) {
                        boolean startsWith = group.startsWith(Marker.ANY_NON_NULL_MARKER);
                        if (startsWith) {
                            group = group.substring(1);
                        }
                        int parseInt = Integer.parseInt(group);
                        if (num3.intValue() == 6) {
                            num = Integer.valueOf(parseInt);
                            z11 = startsWith;
                        } else if (num3.intValue() != 7) {
                            bVar.f25429a[num3.intValue()] = Integer.valueOf(parseInt);
                        } else {
                            num2 = Integer.valueOf(parseInt);
                        }
                    }
                    i11++;
                }
                if (num != null) {
                    if (num2 == null) {
                        num2 = 0;
                    }
                    bVar.f25430b = new UtcOffset(z11, num.intValue(), num2.intValue());
                }
                return true;
            }
            return false;
        }
    }

    private boolean g() {
        return a() != null;
    }

    private boolean h() {
        return b() != null;
    }

    private boolean i() {
        return c() != null;
    }

    private boolean j() {
        return d() != null;
    }

    private boolean k() {
        return e() != null;
    }

    private boolean m() {
        return this.f25428b != null;
    }

    private boolean n() {
        return f() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r(r4, r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r(r1, r0) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ezvcard.util.PartialDate o(java.lang.String r6) {
        /*
            r0 = 84
            int r0 = r6.indexOf(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 >= 0) goto Ld
            r4 = r6
            goto L1e
        Ld:
            java.lang.String r4 = r6.substring(r2, r0)
            int r5 = r6.length()
            int r5 = r5 - r3
            if (r0 >= r5) goto L1e
            int r0 = r0 + r3
            java.lang.String r0 = r6.substring(r0)
            r1 = r0
        L1e:
            ezvcard.util.PartialDate$b r0 = new ezvcard.util.PartialDate$b
            r0.<init>()
            if (r1 != 0) goto L36
            boolean r1 = p(r4, r0)
            if (r1 != 0) goto L34
            boolean r1 = r(r4, r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = r2
            goto L4e
        L34:
            r1 = r3
            goto L4e
        L36:
            int r5 = r4.length()
            if (r5 != 0) goto L41
            boolean r1 = r(r1, r0)
            goto L4e
        L41:
            boolean r4 = p(r4, r0)
            if (r4 == 0) goto L32
            boolean r1 = r(r1, r0)
            if (r1 == 0) goto L32
            goto L34
        L4e:
            if (r1 == 0) goto L55
            ezvcard.util.PartialDate r6 = r0.c()
            return r6
        L55:
            ezvcard.a r0 = ezvcard.a.INSTANCE
            r1 = 36
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            java.lang.IllegalArgumentException r6 = r0.getIllegalArgumentException(r1, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ezvcard.util.PartialDate.o(java.lang.String):ezvcard.util.PartialDate");
    }

    private static boolean p(String str, b bVar) {
        return q(str, bVar, f25425c);
    }

    private static boolean q(String str, b bVar, c[] cVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.a(bVar, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean r(String str, b bVar) {
        return q(str, bVar, f25426d);
    }

    public Integer a() {
        return this.f25427a[2];
    }

    public Integer b() {
        return this.f25427a[3];
    }

    public Integer c() {
        return this.f25427a[4];
    }

    public Integer d() {
        return this.f25427a[1];
    }

    public Integer e() {
        return this.f25427a[5];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PartialDate.class == obj.getClass()) {
            PartialDate partialDate = (PartialDate) obj;
            if (Arrays.equals(this.f25427a, partialDate.f25427a)) {
                UtcOffset utcOffset = this.f25428b;
                if (utcOffset == null) {
                    if (partialDate.f25428b != null) {
                        return false;
                    }
                } else if (!utcOffset.equals(partialDate.f25428b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public Integer f() {
        return this.f25427a[0];
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.f25427a) + 31) * 31;
        UtcOffset utcOffset = this.f25428b;
        return hashCode + (utcOffset == null ? 0 : utcOffset.hashCode());
    }

    public boolean l() {
        return h() || i() || k();
    }

    public String s(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String num = n() ? f().toString() : null;
        String format = j() ? decimalFormat.format(d()) : null;
        String format2 = g() ? decimalFormat.format(a()) : null;
        String str = z11 ? "-" : "";
        if (n() && !j() && !g()) {
            sb2.append(num);
        } else if (!n() && j() && !g()) {
            sb2.append("--");
            sb2.append(format);
        } else if (!n() && !j() && g()) {
            sb2.append("---");
            sb2.append(format2);
        } else if (n() && j() && !g()) {
            sb2.append(num);
            sb2.append("-");
            sb2.append(format);
        } else if (!n() && j() && g()) {
            sb2.append("--");
            sb2.append(format);
            sb2.append(str);
            sb2.append(format2);
        } else if (n() && !j() && g()) {
            throw new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(38, new Object[0]));
        } else {
            if (n() && j() && g()) {
                sb2.append(num);
                sb2.append(str);
                sb2.append(format);
                sb2.append(str);
                sb2.append(format2);
            }
        }
        if (l()) {
            sb2.append('T');
            String format3 = h() ? decimalFormat.format(b()) : null;
            String format4 = i() ? decimalFormat.format(c()) : null;
            String format5 = k() ? decimalFormat.format(e()) : null;
            String str2 = z11 ? ":" : "";
            if (h() && !i() && !k()) {
                sb2.append(format3);
            } else if (!h() && i() && !k()) {
                sb2.append("-");
                sb2.append(format4);
            } else if (!h() && !i() && k()) {
                sb2.append("--");
                sb2.append(format5);
            } else if (h() && i() && !k()) {
                sb2.append(format3);
                sb2.append(str2);
                sb2.append(format4);
            } else if (!h() && i() && k()) {
                sb2.append("-");
                sb2.append(format4);
                sb2.append(str2);
                sb2.append(format5);
            } else if (h() && !i() && k()) {
                throw new IllegalStateException(ezvcard.a.INSTANCE.getExceptionMessage(39, new Object[0]));
            } else {
                if (h() && i() && k()) {
                    sb2.append(format3);
                    sb2.append(str2);
                    sb2.append(format4);
                    sb2.append(str2);
                    sb2.append(format5);
                }
            }
            if (m()) {
                sb2.append(this.f25428b.h(z11));
            }
        }
        return sb2.toString();
    }

    public String toString() {
        return s(true);
    }

    private PartialDate(Integer[] numArr, UtcOffset utcOffset) {
        this.f25427a = numArr;
        this.f25428b = utcOffset;
    }
}