package op;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f42884a;

    /* renamed from: b  reason: collision with root package name */
    int f42885b;

    /* renamed from: c  reason: collision with root package name */
    int f42886c = 0;

    public d(ByteBuffer byteBuffer) {
        this.f42884a = byteBuffer;
        this.f42885b = byteBuffer.position();
    }

    public void a(int i11, int i12) {
        int i13 = this.f42886c;
        int i14 = 8 - (i13 % 8);
        if (i12 <= i14) {
            int i15 = this.f42884a.get(this.f42885b + (i13 / 8));
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i11 << (i14 - i12));
            ByteBuffer byteBuffer = this.f42884a;
            int i17 = this.f42885b + (this.f42886c / 8);
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f42886c += i12;
        } else {
            int i18 = i12 - i14;
            a(i11 >> i18, i14);
            a(i11 & ((1 << i18) - 1), i18);
        }
        ByteBuffer byteBuffer2 = this.f42884a;
        int i19 = this.f42885b;
        int i21 = this.f42886c;
        byteBuffer2.position(i19 + (i21 / 8) + (i21 % 8 <= 0 ? 0 : 1));
    }
}