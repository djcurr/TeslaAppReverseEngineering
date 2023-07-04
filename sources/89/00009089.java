package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

@g(tags = {6})
/* loaded from: classes2.dex */
public class n extends b {

    /* renamed from: d  reason: collision with root package name */
    int f42918d;

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        this.f42918d = hb.d.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n.class == obj.getClass() && this.f42918d == ((n) obj).f42918d;
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        hb.e.i(allocate, 6);
        hb.e.i(allocate, 1);
        hb.e.i(allocate, this.f42918d);
        return allocate;
    }

    public int g() {
        return 3;
    }

    public void h(int i11) {
        this.f42918d = i11;
    }

    public int hashCode() {
        return this.f42918d;
    }

    @Override // op.b
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f42918d + CoreConstants.CURLY_RIGHT;
    }
}