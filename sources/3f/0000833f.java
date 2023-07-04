package lo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@KeepForSdk
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a */
    private static final c f37250a = new c();

    private c() {
    }

    @KeepForSdk
    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @KeepForSdk
    public static c f() {
        return f37250a;
    }

    @KeepForSdk
    public static Bitmap i(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        byte[] l11 = l(j(byteBuffer, true).array(), i11, i12);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(l11, 0, l11.length);
        return k(decodeByteArray, i13, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @VisibleForTesting
    @KeepForSdk
    public static ByteBuffer j(ByteBuffer byteBuffer, boolean z11) {
        ByteBuffer allocateDirect;
        int i11;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i12 = limit / 6;
        if (z11) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i13 = 0;
        while (true) {
            i11 = i12 * 4;
            if (i13 >= i11) {
                break;
            }
            allocateDirect.put(i13, byteBuffer.get(i13));
            i13++;
        }
        for (int i14 = 0; i14 < i12 + i12; i14++) {
            allocateDirect.put(i11 + i14, byteBuffer.get(((i14 % 2) * i12) + i11 + (i14 / 2)));
        }
        return allocateDirect;
    }

    private static Bitmap k(Bitmap bitmap, int i11, int i12, int i13) {
        if (i11 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
    }

    private static byte[] l(byte[] bArr, int i11, int i12) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13);
        }
    }

    private static final void m(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i15 = i11 / (i12 / limit);
        int i16 = 0;
        for (int i17 = 0; i17 < limit; i17++) {
            int i18 = i16;
            for (int i19 = 0; i19 < i15; i19++) {
                bArr[i13] = buffer.get(i18);
                i13 += i14;
                i18 += plane.getPixelStride();
            }
            i16 += plane.getRowStride();
        }
    }

    @KeepForSdk
    public byte[] b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    @KeepForSdk
    public Bitmap c(Image image, int i11) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes != null && planes.length == 1) {
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            return k(decodeByteArray, i11, decodeByteArray.getWidth(), decodeByteArray.getHeight());
        }
        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
    }

    @KeepForSdk
    public ByteBuffer d(ko.a aVar, boolean z11) {
        ByteBuffer allocateDirect;
        int f11 = aVar.f();
        if (f11 != -1) {
            if (f11 == 17) {
                if (z11) {
                    return a((ByteBuffer) Preconditions.checkNotNull(aVar.d()));
                }
                return (ByteBuffer) Preconditions.checkNotNull(aVar.d());
            } else if (f11 != 35) {
                if (f11 == 842094169) {
                    return j((ByteBuffer) Preconditions.checkNotNull(aVar.d()), z11);
                }
                throw new MlKitException("Unsupported image format", 13);
            } else {
                return h((Image.Plane[]) Preconditions.checkNotNull(aVar.i()), aVar.k(), aVar.g());
            }
        }
        Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(aVar.c());
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i11;
        if (z11) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14++) {
            int i15 = 0;
            while (i15 < width) {
                int i16 = iArr[i12];
                int i17 = (i16 >> 16) & 255;
                int i18 = (i16 >> 8) & 255;
                int i19 = i16 & 255;
                int i21 = (((((i17 * (-38)) - (i18 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                int i22 = (((((i17 * 112) - (i18 * 94)) - (i19 * 18)) + 128) >> 8) + 128;
                int i23 = i13 + 1;
                allocateDirect.put(i13, (byte) Math.min(255, (((((i17 * 66) + (i18 * com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE)) + (i19 * 25)) + 128) >> 8) + 16));
                if (i14 % 2 == 0 && i12 % 2 == 0) {
                    int i24 = i11 + 1;
                    allocateDirect.put(i11, (byte) Math.min(255, i22));
                    i11 = i24 + 1;
                    allocateDirect.put(i24, (byte) Math.min(255, i21));
                }
                i12++;
                i15++;
                i13 = i23;
            }
        }
        return allocateDirect;
    }

    @KeepForSdk
    public Bitmap e(ko.a aVar) {
        int f11 = aVar.f();
        if (f11 != -1) {
            if (f11 != 17) {
                if (f11 != 35) {
                    if (f11 == 842094169) {
                        return i((ByteBuffer) Preconditions.checkNotNull(aVar.d()), aVar.k(), aVar.g(), aVar.j());
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return g(h((Image.Plane[]) Preconditions.checkNotNull(aVar.i()), aVar.k(), aVar.g()), aVar.k(), aVar.g(), aVar.j());
            }
            return g((ByteBuffer) Preconditions.checkNotNull(aVar.d()), aVar.k(), aVar.g(), aVar.j());
        }
        return k((Bitmap) Preconditions.checkNotNull(aVar.c()), aVar.j(), aVar.k(), aVar.g());
    }

    @KeepForSdk
    public Bitmap g(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        byte[] l11 = l(b(byteBuffer), i11, i12);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(l11, 0, l11.length);
        return k(decodeByteArray, i13, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @KeepForSdk
    public ByteBuffer h(Image.Plane[] planeArr, int i11, int i12) {
        int i13 = i11 * i12;
        int i14 = i13 / 4;
        byte[] bArr = new byte[i14 + i14 + i13];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i15 = (i13 + i13) / 4;
        boolean z11 = buffer2.remaining() == i15 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z11) {
            planeArr[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i13, 1);
            buffer3.get(bArr, i13 + 1, i15 - 1);
        } else {
            m(planeArr[0], i11, i12, bArr, 0, 1);
            m(planeArr[1], i11, i12, bArr, i13 + 1, 2);
            m(planeArr[2], i11, i12, bArr, i13, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}