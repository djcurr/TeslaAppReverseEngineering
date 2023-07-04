package mx;

import io.grpc.h0;
import io.grpc.internal.l2;
import io.grpc.r0;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
class q {
    static {
        Logger.getLogger(q.class.getName());
    }

    private q() {
    }

    public static r0 a(List<nx.d> list) {
        return h0.c(b(list));
    }

    private static byte[][] b(List<nx.d> list) {
        byte[][] bArr = new byte[list.size() * 2];
        int i11 = 0;
        for (nx.d dVar : list) {
            int i12 = i11 + 1;
            bArr[i11] = dVar.f41936a.E();
            i11 = i12 + 1;
            bArr[i12] = dVar.f41937b.E();
        }
        return l2.e(bArr);
    }

    public static r0 c(List<nx.d> list) {
        return h0.c(b(list));
    }
}