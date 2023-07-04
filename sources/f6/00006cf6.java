package f2;

/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ s1.h a(o oVar, o oVar2, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z11 = true;
                }
                return oVar.h0(oVar2, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
    }

    long U(o oVar, long j11);

    o Y();

    long e();

    boolean h();

    s1.h h0(o oVar, boolean z11);

    long o(long j11);

    long q0(long j11);

    long v(long j11);
}