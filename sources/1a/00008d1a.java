package nx;

import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public interface b extends Closeable {

    /* loaded from: classes5.dex */
    public interface a {
        void ackSettings();

        void data(boolean z11, int i11, okio.h hVar, int i12);

        void k(int i11, nx.a aVar);

        void l(boolean z11, boolean z12, int i11, int i12, List<d> list, e eVar);

        void m(int i11, nx.a aVar, okio.i iVar);

        void n(boolean z11, i iVar);

        void ping(boolean z11, int i11, int i12);

        void priority(int i11, int i12, int i13, boolean z11);

        void pushPromise(int i11, int i12, List<d> list);

        void windowUpdate(int i11, long j11);
    }

    boolean y0(a aVar);
}