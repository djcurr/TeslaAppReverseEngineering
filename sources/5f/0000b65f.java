package tz;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f52725a = DesugarTimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    public static String b(Date date, boolean z11) {
        return c(date, z11, f52725a);
    }

    public static String c(Date date, boolean z11, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z11 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb2, gregorianCalendar.get(1), 4);
        char c11 = CoreConstants.DASH_CHAR;
        sb2.append(CoreConstants.DASH_CHAR);
        e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(CoreConstants.DASH_CHAR);
        e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(CoreConstants.COLON_CHAR);
        e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(CoreConstants.COLON_CHAR);
        e(sb2, gregorianCalendar.get(13), 2);
        if (z11) {
            sb2.append(CoreConstants.DOT);
            e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            if (offset >= 0) {
                c11 = '+';
            }
            sb2.append(c11);
            e(sb2, abs, 2);
            sb2.append(CoreConstants.COLON_CHAR);
            e(sb2, abs2, 2);
        } else {
            sb2.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb2.toString();
    }

    private static int d(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt < '0' || charAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    private static void e(StringBuilder sb2, int i11, int i12) {
        String num = Integer.toString(i11);
        for (int length = i12 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x0183, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:60:0x0107, B:77:0x01b4, B:78:0x01bb, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:47:0x00c9, B:49:0x00cf, B:51:0x00d6, B:75:0x0183, B:55:0x00e0, B:56:0x00fb, B:57:0x00fc, B:61:0x0118, B:63:0x0125, B:66:0x012e, B:68:0x014d, B:71:0x015c, B:72:0x017e, B:74:0x0181, B:60:0x0107, B:77:0x01b4, B:78:0x01bb, B:40:0x00b0, B:41:0x00b3), top: B:94:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date f(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.a.f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int g(String str, int i11, int i12) {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int digit = Character.digit(str.charAt(i11), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -digit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int digit2 = Character.digit(str.charAt(i14), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - digit2;
            i14 = i15;
        }
        return -i13;
    }
}