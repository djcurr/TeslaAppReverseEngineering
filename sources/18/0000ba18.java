package vi;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class e {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, bk.b bVar) {
        if (bVar != null) {
            d(mediaFormat, "color-transfer", bVar.f7720c);
            d(mediaFormat, "color-standard", bVar.f7718a);
            d(mediaFormat, "color-range", bVar.f7719b);
            a(mediaFormat, "hdr-static-info", bVar.f7721d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f11) {
        if (f11 != -1.0f) {
            mediaFormat.setFloat(str, f11);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i11) {
        if (i11 != -1) {
            mediaFormat.setInteger(str, i11);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i11);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap(list.get(i11)));
        }
    }
}