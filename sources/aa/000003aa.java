package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.g0;
import androidx.camera.core.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ImageUtil {

    /* loaded from: classes.dex */
    public static final class CodecFailedException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private a f2409a;

        /* loaded from: classes.dex */
        public enum a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(String str, a aVar) {
            super(str);
            this.f2409a = aVar;
        }

        public a a() {
            return this.f2409a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i11;
        if (!f(rational)) {
            n0.m("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f11 = width;
        float f12 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i12 = 0;
        if (rational.floatValue() > f11 / f12) {
            int round = Math.round((f11 / numerator) * denominator);
            i11 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f12 / denominator) * numerator);
            int i13 = (width - round2) / 2;
            width = round2;
            i11 = 0;
            i12 = i13;
        }
        return new Rect(i12, i11, width + i12, height + i11);
    }

    public static byte[] b(byte[] bArr, Rect rect) {
        if (rect == null) {
            return bArr;
        }
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.a.ENCODE_FAILED);
            }
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.a.DECODE_FAILED);
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.a.DECODE_FAILED);
        } catch (IllegalArgumentException e11) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e11, CodecFailedException.a.DECODE_FAILED);
        }
    }

    public static Rational c(int i11, Rational rational) {
        if (i11 != 90 && i11 != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        return e(rational);
    }

    public static byte[] d(g0 g0Var) {
        if (g0Var.getFormat() == 256) {
            return i(g0Var);
        }
        if (g0Var.getFormat() == 35) {
            return n(g0Var);
        }
        n0.m("ImageUtil", "Unrecognized image format: " + g0Var.getFormat());
        return null;
    }

    private static Rational e(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean f(Rational rational) {
        return (rational == null || rational.floatValue() <= BitmapDescriptorFactory.HUE_RED || rational.isNaN()) ? false : true;
    }

    public static boolean g(Size size, Rational rational) {
        return rational != null && rational.floatValue() > BitmapDescriptorFactory.HUE_RED && h(size, rational) && !rational.isNaN();
    }

    private static boolean h(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    private static byte[] i(g0 g0Var) {
        ByteBuffer b11 = g0Var.x0()[0].b();
        byte[] bArr = new byte[b11.capacity()];
        b11.rewind();
        b11.get(bArr);
        return l(g0Var) ? b(bArr, g0Var.M0()) : bArr;
    }

    public static float j(float f11, float f12, float f13, float f14) {
        return Math.min(Math.min(f11, f12), Math.min(f13, f14));
    }

    private static byte[] k(byte[] bArr, int i11, int i12, Rect rect) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        if (rect == null) {
            rect = new Rect(0, 0, i11, i12);
        }
        if (yuvImage.compressToJpeg(rect, 100, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.a.ENCODE_FAILED);
    }

    private static boolean l(g0 g0Var) {
        return !new Size(g0Var.M0().width(), g0Var.M0().height()).equals(new Size(g0Var.getWidth(), g0Var.getHeight()));
    }

    public static float[] m(Size size) {
        return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight(), BitmapDescriptorFactory.HUE_RED, size.getHeight()};
    }

    private static byte[] n(g0 g0Var) {
        return k(o(g0Var), g0Var.getWidth(), g0Var.getHeight(), l(g0Var) ? g0Var.M0() : null);
    }

    public static byte[] o(g0 g0Var) {
        g0.a aVar = g0Var.x0()[0];
        g0.a aVar2 = g0Var.x0()[1];
        g0.a aVar3 = g0Var.x0()[2];
        ByteBuffer b11 = aVar.b();
        ByteBuffer b12 = aVar2.b();
        ByteBuffer b13 = aVar3.b();
        b11.rewind();
        b12.rewind();
        b13.rewind();
        int remaining = b11.remaining();
        byte[] bArr = new byte[((g0Var.getWidth() * g0Var.getHeight()) / 2) + remaining];
        int i11 = 0;
        for (int i12 = 0; i12 < g0Var.getHeight(); i12++) {
            b11.get(bArr, i11, g0Var.getWidth());
            i11 += g0Var.getWidth();
            b11.position(Math.min(remaining, (b11.position() - g0Var.getWidth()) + aVar.c()));
        }
        int height = g0Var.getHeight() / 2;
        int width = g0Var.getWidth() / 2;
        int c11 = aVar3.c();
        int c12 = aVar2.c();
        int d11 = aVar3.d();
        int d12 = aVar2.d();
        byte[] bArr2 = new byte[c11];
        byte[] bArr3 = new byte[c12];
        for (int i13 = 0; i13 < height; i13++) {
            b13.get(bArr2, 0, Math.min(c11, b13.remaining()));
            b12.get(bArr3, 0, Math.min(c12, b12.remaining()));
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < width; i16++) {
                int i17 = i11 + 1;
                bArr[i11] = bArr2[i14];
                i11 = i17 + 1;
                bArr[i17] = bArr3[i15];
                i14 += d11;
                i15 += d12;
            }
        }
        return bArr;
    }
}