package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

@g(tags = {20})
/* loaded from: classes2.dex */
public class m extends b {

    /* renamed from: d  reason: collision with root package name */
    int f42917d;

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        this.f42917d = hb.d.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass() && this.f42917d == ((m) obj).f42917d;
    }

    public int hashCode() {
        return this.f42917d;
    }

    @Override // op.b
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f42917d) + CoreConstants.CURLY_RIGHT;
    }
}