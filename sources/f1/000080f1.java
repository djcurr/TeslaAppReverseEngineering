package ku;

/* loaded from: classes6.dex */
public interface f {

    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ void a(f fVar, int i11, long j11, String str, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
            }
            if ((i12 & 2) != 0) {
                j11 = 0;
            }
            if ((i12 & 4) != 0) {
                str = null;
            }
            fVar.a(i11, j11, str);
        }
    }

    void a(int i11, long j11, String str);
}