package gd;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static String a(d dVar) {
        try {
            if (dVar instanceof f) {
                return c(((f) dVar).d().get(0));
            }
            return c(dVar);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static List<String> b(d dVar) {
        ArrayList arrayList;
        try {
            if (dVar instanceof f) {
                List<d> d11 = ((f) dVar).d();
                arrayList = new ArrayList(d11.size());
                for (int i11 = 0; i11 < d11.size(); i11++) {
                    arrayList.add(c(d11.get(i11)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(dVar.c() ? dVar.a() : c(dVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static String c(d dVar) {
        return ud.b.a(dVar.a().getBytes("UTF-8"));
    }
}