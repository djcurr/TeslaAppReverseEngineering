package nx;

import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public interface c extends Closeable {
    void B0(i iVar);

    void E1(boolean z11, boolean z12, int i11, int i12, List<d> list);

    void connectionPreface();

    void data(boolean z11, int i11, okio.f fVar, int i12);

    void flush();

    void k(int i11, a aVar);

    int maxDataLength();

    void n1(int i11, a aVar, byte[] bArr);

    void ping(boolean z11, int i11, int i12);

    void v0(i iVar);

    void windowUpdate(int i11, long j11);
}