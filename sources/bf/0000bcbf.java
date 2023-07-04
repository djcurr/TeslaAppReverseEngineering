package wi;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class g implements b {
    @Override // wi.b
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ak.a.e(dVar.f13264c);
        ak.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.k()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract a b(d dVar, ByteBuffer byteBuffer);
}