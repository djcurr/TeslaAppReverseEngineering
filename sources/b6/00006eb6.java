package freemarker.core;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class c extends Configurable {
    private static final DecimalFormat A;

    /* renamed from: y */
    private static final ThreadLocal f26874y = new ThreadLocal();

    /* renamed from: z */
    private static final hx.b f26875z = hx.b.i("freemarker.runtime");

    /* renamed from: x */
    private final ArrayList f26876x;

    static {
        hx.b.i("freemarker.runtime.attempt");
        new HashMap();
        DecimalFormat decimalFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        A = decimalFormat;
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        new b();
    }

    static void b(k kVar, StringBuffer stringBuffer) {
        stringBuffer.append(f.i(kVar.e(), 40));
        stringBuffer.append("  [");
        e d11 = d(kVar);
        if (d11 != null) {
            stringBuffer.append(f.e(d11, kVar.f26887c, kVar.f26886b));
        } else {
            stringBuffer.append(f.f(kVar.c(), kVar.f26887c, kVar.f26886b));
        }
        stringBuffer.append("]");
    }

    public static c c() {
        return (c) f26874y.get();
    }

    private static e d(k kVar) {
        while (kVar != null) {
            if (kVar instanceof e) {
                return (e) kVar;
            }
            kVar = kVar.g();
        }
        return null;
    }

    static String f(k kVar) {
        StringBuffer stringBuffer = new StringBuffer();
        b(kVar, stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x001e A[Catch: IOException -> 0x007a, TryCatch #0 {IOException -> 0x007a, blocks: (B:62:0x000d, B:71:0x001e, B:73:0x0022, B:78:0x002f, B:80:0x003b, B:82:0x0042, B:84:0x0047, B:81:0x003f, B:83:0x0045, B:86:0x004c, B:89:0x0063, B:90:0x0067, B:91:0x006b, B:93:0x0072, B:94:0x0076), top: B:99:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004c A[Catch: IOException -> 0x007a, TryCatch #0 {IOException -> 0x007a, blocks: (B:62:0x000d, B:71:0x001e, B:73:0x0022, B:78:0x002f, B:80:0x003b, B:82:0x0042, B:84:0x0047, B:81:0x003f, B:83:0x0045, B:86:0x004c, B:89:0x0063, B:90:0x0067, B:91:0x006b, B:93:0x0072, B:94:0x0076), top: B:99:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(freemarker.core.k[] r9, boolean r10, java.io.Writer r11) {
        /*
            boolean r0 = r11 instanceof java.io.PrintWriter
            if (r0 == 0) goto L6
            r0 = r11
            goto L7
        L6:
            r0 = 0
        L7:
            java.io.PrintWriter r0 = (java.io.PrintWriter) r0
            r1 = 10
            if (r9 == 0) goto L6b
            int r2 = r9.length     // Catch: java.io.IOException -> L7a
            if (r10 == 0) goto L16
            if (r2 > r1) goto L13
            goto L16
        L13:
            r3 = 9
            goto L17
        L16:
            r3 = r2
        L17:
            r10 = 0
            r4 = r10
            r5 = r4
            r6 = r5
        L1b:
            r7 = 1
            if (r4 >= r2) goto L4a
            r8 = r9[r4]     // Catch: java.io.IOException -> L7a
            if (r4 <= r7) goto L26
            int r7 = r4 + (-1)
            r7 = r9[r7]     // Catch: java.io.IOException -> L7a
        L26:
            if (r6 >= r3) goto L45
            if (r4 != 0) goto L2d
            java.lang.String r7 = "\t- Failed at: "
            goto L2f
        L2d:
            java.lang.String r7 = "\t- Reached through: "
        L2f:
            r11.write(r7)     // Catch: java.io.IOException -> L7a
            java.lang.String r7 = f(r8)     // Catch: java.io.IOException -> L7a
            r11.write(r7)     // Catch: java.io.IOException -> L7a
            if (r0 == 0) goto L3f
            r0.println()     // Catch: java.io.IOException -> L7a
            goto L42
        L3f:
            r11.write(r1)     // Catch: java.io.IOException -> L7a
        L42:
            int r6 = r6 + 1
            goto L47
        L45:
            int r5 = r5 + 1
        L47:
            int r4 = r4 + 1
            goto L1b
        L4a:
            if (r5 <= 0) goto L5f
            java.lang.String r9 = "\t... (Had "
            r11.write(r9)     // Catch: java.io.IOException -> L7a
            int r5 = r5 + r10
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch: java.io.IOException -> L7a
            r11.write(r9)     // Catch: java.io.IOException -> L7a
            java.lang.String r9 = " more, hidden for tersenes)"
            r11.write(r9)     // Catch: java.io.IOException -> L7a
            r10 = r7
        L5f:
            if (r10 == 0) goto L82
            if (r0 == 0) goto L67
            r0.println()     // Catch: java.io.IOException -> L7a
            goto L82
        L67:
            r11.write(r1)     // Catch: java.io.IOException -> L7a
            goto L82
        L6b:
            java.lang.String r9 = "(The stack was empty)"
            r11.write(r9)     // Catch: java.io.IOException -> L7a
            if (r0 == 0) goto L76
            r0.println()     // Catch: java.io.IOException -> L7a
            goto L82
        L76:
            r11.write(r1)     // Catch: java.io.IOException -> L7a
            goto L82
        L7a:
            r9 = move-exception
            hx.b r10 = freemarker.core.c.f26875z
            java.lang.String r11 = "Failed to print FTL stack trace"
            r10.f(r11, r9)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: freemarker.core.c.g(freemarker.core.k[], boolean, java.io.Writer):void");
    }

    public static void h(c cVar) {
        f26874y.set(cVar);
    }

    public k[] e() {
        int size = this.f26876x.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = (k) this.f26876x.get(i12);
            if (i12 == size || kVar.h()) {
                i11++;
            }
        }
        if (i11 == 0) {
            return null;
        }
        k[] kVarArr = new k[i11];
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < size; i14++) {
            k kVar2 = (k) this.f26876x.get(i14);
            if (i14 == size || kVar2.h()) {
                kVarArr[i13] = kVar2;
                i13--;
            }
        }
        return kVarArr;
    }
}