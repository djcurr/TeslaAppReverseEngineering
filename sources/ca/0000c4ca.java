package zd;

import android.content.Context;
import ch.qos.logback.core.util.FileSize;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Integer f60409a;

    private static int a(Context context) {
        ArrayList arrayList = new ArrayList();
        c(arrayList, f());
        c(arrayList, e());
        c(arrayList, g(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    private static int b(Context context) {
        long g11 = a.g(context);
        if (g11 == -1) {
            return a(context);
        }
        if (g11 <= 805306368) {
            return a.f() <= 1 ? 2009 : 2010;
        } else if (g11 <= FileSize.GB_COEFFICIENT) {
            return a.b() < 1300000 ? 2011 : 2012;
        } else if (g11 <= 1610612736) {
            return a.b() < 1800000 ? 2012 : 2013;
        } else if (g11 <= 2147483648L) {
            return 2013;
        } else {
            if (g11 <= 3221225472L) {
                return 2014;
            }
            return g11 <= 5368709120L ? 2015 : 2016;
        }
    }

    private static void c(ArrayList<Integer> arrayList, int i11) {
        if (i11 != -1) {
            arrayList.add(Integer.valueOf(i11));
        }
    }

    public static int d(Context context) {
        if (f60409a == null) {
            synchronized (b.class) {
                if (f60409a == null) {
                    f60409a = Integer.valueOf(b(context));
                }
            }
        }
        return f60409a.intValue();
    }

    private static int e() {
        long b11 = a.b();
        if (b11 == -1) {
            return -1;
        }
        if (b11 <= 528000) {
            return 2008;
        }
        if (b11 <= 620000) {
            return 2009;
        }
        if (b11 <= 1020000) {
            return 2010;
        }
        if (b11 <= 1220000) {
            return 2011;
        }
        if (b11 <= 1520000) {
            return 2012;
        }
        return b11 <= 2020000 ? 2013 : 2014;
    }

    private static int f() {
        int f11 = a.f();
        if (f11 < 1) {
            return -1;
        }
        if (f11 == 1) {
            return 2008;
        }
        return f11 <= 3 ? 2011 : 2012;
    }

    private static int g(Context context) {
        long g11 = a.g(context);
        if (g11 <= 0) {
            return -1;
        }
        if (g11 <= 201326592) {
            return 2008;
        }
        if (g11 <= 304087040) {
            return 2009;
        }
        if (g11 <= 536870912) {
            return 2010;
        }
        if (g11 <= FileSize.GB_COEFFICIENT) {
            return 2011;
        }
        if (g11 <= 1610612736) {
            return 2012;
        }
        return g11 <= 2147483648L ? 2013 : 2014;
    }
}