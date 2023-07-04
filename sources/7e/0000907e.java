package op;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f42881a;

    /* renamed from: b  reason: collision with root package name */
    int f42882b;

    /* renamed from: c  reason: collision with root package name */
    int f42883c;

    public c(ByteBuffer byteBuffer) {
        this.f42881a = byteBuffer;
        this.f42882b = byteBuffer.position();
    }

    public int a(int i11) {
        int a11;
        int i12 = this.f42881a.get(this.f42882b + (this.f42883c / 8));
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.f42883c;
        int i14 = 8 - (i13 % 8);
        if (i11 <= i14) {
            a11 = ((i12 << (i13 % 8)) & 255) >> ((i13 % 8) + (i14 - i11));
            this.f42883c = i13 + i11;
        } else {
            int i15 = i11 - i14;
            a11 = (a(i14) << i15) + a(i15);
        }
        this.f42881a.position(this.f42882b + ((int) Math.ceil(this.f42883c / 8.0d)));
        return a11;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public int c() {
        return (this.f42881a.limit() * 8) - this.f42883c;
    }
}