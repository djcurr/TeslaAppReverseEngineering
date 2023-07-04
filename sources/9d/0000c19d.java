package y20;

/* loaded from: classes5.dex */
public interface n<T> extends kotlinx.coroutines.flow.e<T> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.e a(n nVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    gVar = zz.h.f61280a;
                }
                if ((i12 & 2) != 0) {
                    i11 = -3;
                }
                if ((i12 & 4) != 0) {
                    aVar = kotlinx.coroutines.channels.a.SUSPEND;
                }
                return nVar.a(gVar, i11, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    kotlinx.coroutines.flow.e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar);
}