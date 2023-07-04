package i80;

import android.graphics.Bitmap;
import com.google.android.gms.vision.Frame;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class b {
    public static a a(Bitmap bitmap) {
        Frame.Builder builder = new Frame.Builder();
        builder.setBitmap(bitmap);
        return new a(builder.build(), new f80.a(bitmap.getWidth(), bitmap.getHeight()));
    }

    public static a b(byte[] bArr, int i11, int i12, int i13) {
        Frame.Builder builder = new Frame.Builder();
        builder.setImageData(ByteBuffer.wrap(bArr), i11, i12, 17);
        if (i13 == 90) {
            builder.setRotation(1);
        } else if (i13 == 180) {
            builder.setRotation(2);
        } else if (i13 != 270) {
            builder.setRotation(0);
        } else {
            builder.setRotation(3);
        }
        return new a(builder.build(), new f80.a(i11, i12, i13));
    }
}