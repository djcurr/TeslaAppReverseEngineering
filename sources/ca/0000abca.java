package pv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.camera.core.g0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class t {
    private static final Bitmap a(ByteBuffer byteBuffer, k kVar) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, kVar.c(), kVar.a(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, kVar.c(), kVar.a()), 80, byteArrayOutputStream);
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            kotlin.jvm.internal.s.f(bmp, "bmp");
            return c(bmp, kVar.b());
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ko.a b(g0 g0Var) {
        kotlin.jvm.internal.s.g(g0Var, "<this>");
        try {
            Image u12 = g0Var.u1();
            if (u12 == null) {
                return null;
            }
            return ko.a.b(u12, g0Var.l1().c());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    private static final Bitmap c(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!kotlin.jvm.internal.s.c(createBitmap, bitmap)) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static final Bitmap d(ko.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        k kVar = new k(aVar.k(), aVar.g(), aVar.j());
        a aVar2 = a.f46928a;
        Image.Plane[] i11 = aVar.i();
        if (i11 == null) {
            return null;
        }
        return a(aVar2.c(i11, aVar.k(), aVar.g()), kVar);
    }
}