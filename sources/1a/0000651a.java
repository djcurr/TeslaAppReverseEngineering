package d20;

import java.util.Collection;

/* loaded from: classes5.dex */
public interface k {

    /* loaded from: classes5.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(k kVar, d dVar, h00.l lVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    dVar = d.f23458o;
                }
                h00.l<u10.f, Boolean> lVar2 = lVar;
                if ((i11 & 2) != 0) {
                    lVar2 = h.f23478a.a();
                }
                return kVar.g(dVar, lVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    w00.e e(u10.f fVar, d10.b bVar);

    Collection<w00.i> g(d dVar, h00.l<? super u10.f, Boolean> lVar);
}