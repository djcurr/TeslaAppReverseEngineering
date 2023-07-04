package gv;

import android.content.Context;
import java.util.List;
import yu.z;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f28161a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f28162b = a.f28139a.n("PhoneKeyUtils");

    private m() {
    }

    public static final boolean a(com.teslamotors.plugins.ble.d dVar, nv.j jVar) {
        if ((dVar == null ? null : dVar.v()) == lv.e.CONNECTED) {
            if (jVar != null && jVar.f41919l) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(Context context, List<String> list, String str) {
        if (str == null) {
            f28162b.i("email is null, shouldRunInForeground returning false");
            return false;
        } else if (list == null) {
            f28162b.i("vins null, shouldRunInForeground returning false");
            return false;
        } else if (list.isEmpty()) {
            f28162b.i("vins empty, shouldRunInForeground returning false");
            return false;
        } else {
            z p11 = z.p(context);
            for (String str2 : list) {
                kotlin.jvm.internal.s.e(context);
                if (c(context, str2, str) && p11.u(str2, str).size() > 0) {
                    return true;
                }
            }
            f28162b.i("no vin supports phone key, shouldRunInForeground returning false");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r7 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r7, r0)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L12
            int r2 = r9.length()
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = r0
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L31
            com.tesla.logging.g r7 = gv.m.f28162b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "vehicle doesn't support phone key: invalid email `"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r9 = "`"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.i(r8)
            return r0
        L31:
            if (r8 == 0) goto Lba
            int r2 = r8.length()
            r3 = 4
            if (r2 <= r3) goto Lba
            r2 = 3
            java.lang.String r2 = r8.substring(r2, r3)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.s.f(r2, r3)
            r4 = 9
            char r4 = r8.charAt(r4)
            int r4 = r4 + 1944
            r5 = 2020(0x7e4, float:2.83E-42)
            java.lang.String r6 = "3"
            if (r4 > r5) goto L87
            boolean r5 = kotlin.text.m.u(r2, r6, r1)
            if (r5 != 0) goto L87
            java.lang.String r5 = "Y"
            boolean r5 = kotlin.text.m.u(r2, r5, r1)
            if (r5 == 0) goto L61
            goto L87
        L61:
            yu.z r7 = yu.z.p(r7)
            java.util.Set r7 = r7.u(r8, r9)
            int r7 = r7.size()
            if (r7 <= 0) goto L70
            return r1
        L70:
            com.tesla.logging.g r7 = gv.m.f28162b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "vehicle doesn't support phone key: no peripheral persisted for vin "
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.i(r8)
            return r0
        L87:
            r7 = 2021(0x7e5, float:2.832E-42)
            if (r4 != r7) goto Lb9
            java.lang.String r7 = "s"
            boolean r7 = kotlin.text.m.u(r2, r7, r1)
            if (r7 != 0) goto L9b
            java.lang.String r7 = "x"
            boolean r7 = kotlin.text.m.u(r2, r7, r1)
            if (r7 == 0) goto Lb9
        L9b:
            r7 = 7
            r9 = 8
            java.lang.String r7 = r8.substring(r7, r9)
            kotlin.jvm.internal.s.f(r7, r3)
            java.lang.String r8 = "1"
            java.lang.String r9 = "2"
            java.lang.String r0 = "4"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r6, r0}
            java.util.Set r8 = wz.v0.i(r8)
            boolean r7 = r8.contains(r7)
            r7 = r7 ^ r1
            return r7
        Lb9:
            return r1
        Lba:
            com.tesla.logging.g r7 = gv.m.f28162b
            java.lang.String r8 = "vehicle doesn't support phone key: invalid VIN!"
            r7.i(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gv.m.c(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}