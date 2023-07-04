package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class o extends b {

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f42919d;

    static {
        Logger.getLogger(o.class.getName());
    }

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        this.f42919d = (ByteBuffer) byteBuffer.slice().limit(c());
    }

    @Override // op.b
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f42878a + ", sizeOfInstance=" + this.f42879b + ", data=" + this.f42919d + CoreConstants.CURLY_RIGHT;
    }
}