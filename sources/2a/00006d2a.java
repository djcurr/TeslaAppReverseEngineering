package f3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(f3.f r38, a3.d r39, int r40, int r41, f3.c r42) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b.a(f3.f, a3.d, int, int, f3.c):void");
    }

    public static void b(f fVar, a3.d dVar, ArrayList<e> arrayList, int i11) {
        c[] cVarArr;
        int i12;
        int i13;
        if (i11 == 0) {
            i13 = fVar.G0;
            cVarArr = fVar.J0;
            i12 = 0;
        } else {
            int i14 = fVar.H0;
            cVarArr = fVar.I0;
            i12 = 2;
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            c cVar = cVarArr[i15];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f25671a)) {
                a(fVar, dVar, i11, i12, cVar);
            }
        }
    }
}