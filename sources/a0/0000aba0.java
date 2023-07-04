package pv;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f46928a = new a();

    private a() {
    }

    private final boolean a(Image.Plane[] planeArr, int i11, int i12) {
        int i13 = i11 * i12;
        boolean z11 = true;
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        z11 = (buffer2.remaining() == ((i13 * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0) ? false : false;
        buffer2.position(position);
        buffer.limit(limit);
        return z11;
    }

    private final void b(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i15 = i11 / (i12 / limit);
        if (limit > 0) {
            int i16 = 0;
            int i17 = 0;
            do {
                i16++;
                if (i15 > 0) {
                    int i18 = 0;
                    int i19 = i17;
                    do {
                        i18++;
                        bArr[i13] = buffer.get(i19);
                        i13 += i14;
                        i19 += plane.getPixelStride();
                    } while (i18 < i15);
                    i17 += plane.getRowStride();
                } else {
                    i17 += plane.getRowStride();
                }
            } while (i16 < limit);
        }
    }

    public final ByteBuffer c(Image.Plane[] yuv420888planes, int i11, int i12) {
        kotlin.jvm.internal.s.g(yuv420888planes, "yuv420888planes");
        int i13 = i11 * i12;
        byte[] bArr = new byte[((i13 / 4) * 2) + i13];
        if (a(yuv420888planes, i11, i12)) {
            yuv420888planes[0].getBuffer().rewind();
            yuv420888planes[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer = yuv420888planes[1].getBuffer();
            yuv420888planes[2].getBuffer().get(bArr, i13, 1);
            buffer.get(bArr, i13 + 1, ((i13 * 2) / 4) - 1);
        } else {
            b(yuv420888planes[0], i11, i12, bArr, 0, 1);
            b(yuv420888planes[1], i11, i12, bArr, i13 + 1, 2);
            b(yuv420888planes[2], i11, i12, bArr, i13, 2);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.s.f(wrap, "wrap(out)");
        return wrap;
    }
}