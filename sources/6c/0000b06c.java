package rc;

import cc.h;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b extends h<d> {
    public b(d dVar) {
        super(dVar);
    }

    private String v() {
        String[] s11 = ((d) this.f9060a).s(4098);
        if (s11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : s11) {
            String a11 = c.a(4096, str);
            if (a11 != null) {
                str = a11;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    private String w() {
        Long m11 = ((d) this.f9060a).m(259);
        if (m11 == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf((int) (m11.longValue() / Math.pow(60.0d, 2.0d)));
        Integer valueOf2 = Integer.valueOf((int) ((m11.longValue() / Math.pow(60.0d, 1.0d)) - (valueOf.intValue() * 60)));
        return String.format("%1$02d:%2$02d:%3$02d", valueOf, valueOf2, Integer.valueOf((int) Math.ceil((m11.longValue() / Math.pow(60.0d, 0.0d)) - (valueOf2.intValue() * 60))));
    }

    private String x() {
        byte[] e11 = ((d) this.f9060a).e(4096);
        if (e11 == null) {
            return null;
        }
        return c.a(4096, new String(e11));
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 259) {
            if (i11 != 4096) {
                if (i11 != 4098) {
                    return super.f(i11);
                }
                return v();
            }
            return x();
        }
        return w();
    }
}