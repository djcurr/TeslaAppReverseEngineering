package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

@g(tags = {0})
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    int f42878a;

    /* renamed from: b  reason: collision with root package name */
    int f42879b;

    /* renamed from: c  reason: collision with root package name */
    int f42880c;

    public int a() {
        return this.f42879b + 1 + this.f42880c;
    }

    public int b() {
        return this.f42880c;
    }

    public int c() {
        return this.f42879b;
    }

    public final void d(int i11, ByteBuffer byteBuffer) {
        this.f42878a = i11;
        int l11 = hb.d.l(byteBuffer);
        this.f42879b = l11 & 127;
        int i12 = 1;
        while ((l11 >>> 7) == 1) {
            l11 = hb.d.l(byteBuffer);
            i12++;
            this.f42879b = (this.f42879b << 7) | (l11 & 127);
        }
        this.f42880c = i12;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f42879b);
        e(slice);
        byteBuffer.position(byteBuffer.position() + this.f42879b);
    }

    public abstract void e(ByteBuffer byteBuffer);

    public String toString() {
        return "BaseDescriptor{tag=" + this.f42878a + ", sizeOfInstance=" + this.f42879b + CoreConstants.CURLY_RIGHT;
    }
}