package r1;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(g gVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            gVar.b(z11);
        }
    }

    boolean a(int i11);

    void b(boolean z11);
}