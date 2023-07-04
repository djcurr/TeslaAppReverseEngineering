package gp;

import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.i;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.ArrayList;
import java.util.Map;
import uo.e;

/* loaded from: classes2.dex */
public final class b implements i {
    private static j[] b(com.google.zxing.c cVar, Map<d, ?> map, boolean z11) {
        ArrayList arrayList = new ArrayList();
        jp.b c11 = jp.a.c(cVar, map, z11);
        for (l[] lVarArr : c11.b()) {
            e i11 = hp.j.i(c11.a(), lVarArr[4], lVarArr[5], lVarArr[6], lVarArr[7], e(lVarArr), c(lVarArr));
            j jVar = new j(i11.h(), i11.e(), lVarArr, com.google.zxing.a.PDF_417);
            jVar.h(k.ERROR_CORRECTION_LEVEL, i11.b());
            c cVar2 = (c) i11.d();
            if (cVar2 != null) {
                jVar.h(k.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(jVar);
        }
        return (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    private static int c(l[] lVarArr) {
        return Math.max(Math.max(d(lVarArr[0], lVarArr[4]), (d(lVarArr[6], lVarArr[2]) * 17) / 18), Math.max(d(lVarArr[1], lVarArr[5]), (d(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    private static int d(l lVar, l lVar2) {
        if (lVar == null || lVar2 == null) {
            return 0;
        }
        return (int) Math.abs(lVar.c() - lVar2.c());
    }

    private static int e(l[] lVarArr) {
        return Math.min(Math.min(f(lVarArr[0], lVarArr[4]), (f(lVarArr[6], lVarArr[2]) * 17) / 18), Math.min(f(lVarArr[1], lVarArr[5]), (f(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    private static int f(l lVar, l lVar2) {
        if (lVar == null || lVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(lVar.c() - lVar2.c());
    }

    @Override // com.google.zxing.i
    public j a(com.google.zxing.c cVar, Map<d, ?> map) {
        j[] b11 = b(cVar, map, false);
        if (b11 != null && b11.length != 0 && b11[0] != null) {
            return b11[0];
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.i
    public void reset() {
    }
}