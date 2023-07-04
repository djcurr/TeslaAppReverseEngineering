package s2;

/* loaded from: classes.dex */
public final class h {
    public static final long a(long j11, long j12) {
        int j13;
        int l11 = n2.y.l(j11);
        int k11 = n2.y.k(j11);
        if (n2.y.p(j12, j11)) {
            if (n2.y.d(j12, j11)) {
                l11 = n2.y.l(j12);
                k11 = l11;
            } else {
                if (n2.y.d(j11, j12)) {
                    j13 = n2.y.j(j12);
                } else if (n2.y.e(j12, l11)) {
                    l11 = n2.y.l(j12);
                    j13 = n2.y.j(j12);
                } else {
                    k11 = n2.y.l(j12);
                }
                k11 -= j13;
            }
        } else if (k11 > n2.y.l(j12)) {
            l11 -= n2.y.j(j12);
            j13 = n2.y.j(j12);
            k11 -= j13;
        }
        return n2.z.b(l11, k11);
    }
}