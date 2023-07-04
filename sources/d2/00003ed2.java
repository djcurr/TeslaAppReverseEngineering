package com.lwansbrough.RCTCamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import android.util.Log;
import cc.g;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.MetadataException;
import com.facebook.react.bridge.ReadableMap;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import hc.k;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class MutableImage {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f17850a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f17851b;

    /* renamed from: c  reason: collision with root package name */
    private cc.e f17852c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17853d = false;

    /* loaded from: classes2.dex */
    public static class ImageMutationFailedException extends Exception {
        public ImageMutationFailedException(String str, Throwable th2) {
            super(str, th2);
        }

        public ImageMutationFailedException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {
        private static String a(double d11) {
            return d11 < 0.0d ? "S" : Gender.NONE;
        }

        private static String b(double d11) {
            return d11 < 0.0d ? "W" : "E";
        }

        private static String c(double d11) {
            double abs = Math.abs(d11);
            int i11 = (int) abs;
            double d12 = (abs * 60.0d) - (i11 * 60.0d);
            int i12 = (int) d12;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i11);
            stringBuffer.append("/1,");
            stringBuffer.append(i12);
            stringBuffer.append("/1,");
            stringBuffer.append((int) (((d12 * 60.0d) - (i12 * 60.0d)) * 1000.0d));
            stringBuffer.append("/1000,");
            return stringBuffer.toString();
        }

        public static void d(double d11, double d12, androidx.exifinterface.media.a aVar) {
            aVar.d0("GPSLatitude", c(d11));
            aVar.d0("GPSLatitudeRef", a(d11));
            aVar.d0("GPSLongitude", c(d12));
            aVar.d0("GPSLongitudeRef", b(d12));
        }
    }

    public MutableImage(byte[] bArr) {
        this.f17850a = bArr;
        this.f17851b = k(bArr);
    }

    private String a(String str) {
        return !str.contains("/") ? "" : Double.toString(1.0d / Double.parseDouble(str.split("/")[1]));
    }

    private cc.e g() {
        if (this.f17852c == null) {
            this.f17852c = kb.b.a(new BufferedInputStream(new ByteArrayInputStream(this.f17850a)), this.f17850a.length);
        }
        return this.f17852c;
    }

    private void h(androidx.exifinterface.media.a aVar) {
        aVar.d0("Orientation", String.valueOf(1));
    }

    private void i(int i11) {
        Matrix matrix = new Matrix();
        switch (i11) {
            case 1:
                return;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f17851b, 0, 0, e(), d(), matrix, false);
        if (createBitmap != null) {
            this.f17851b = createBitmap;
            this.f17853d = true;
            return;
        }
        throw new ImageMutationFailedException("failed to rotate");
    }

    private static Bitmap k(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            byteArrayInputStream.close();
            return decodeStream;
        } catch (IOException e11) {
            throw new IllegalStateException("Will not happen", e11);
        }
    }

    private static byte[] l(Bitmap bitmap, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
        try {
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                Log.e("RNCamera", "problem compressing jpeg", e11);
            }
        }
    }

    private void n(ReadableMap readableMap, androidx.exifinterface.media.a aVar) {
        if (readableMap.hasKey("metadata")) {
            ReadableMap map = readableMap.getMap("metadata");
            if (map.hasKey(Kind.LOCATION)) {
                ReadableMap map2 = map.getMap(Kind.LOCATION);
                if (map2.hasKey("coords")) {
                    try {
                        ReadableMap map3 = map2.getMap("coords");
                        a.d(map3.getDouble("latitude"), map3.getDouble("longitude"), aVar);
                    } catch (IOException e11) {
                        Log.e("RNCamera", "Couldn't write location data", e11);
                    }
                }
            }
        }
    }

    public void b(double d11) {
        int i11;
        int i12;
        int e11 = e();
        int d12 = d();
        double d13 = d12 * d11;
        double d14 = e11;
        if (d13 > d14) {
            i12 = (int) (d14 / d11);
            i11 = e11;
        } else {
            i11 = (int) d13;
            i12 = d12;
        }
        this.f17851b = Bitmap.createBitmap(this.f17851b, (e11 - i11) / 2, (d12 - i12) / 2, i11, i12);
    }

    public void c() {
        int j11;
        try {
            hc.d dVar = (hc.d) g().e(hc.d.class);
            if (dVar == null || !dVar.b(274) || (j11 = dVar.j(274)) == 1) {
                return;
            }
            i(j11);
            dVar.J(274, 1);
        } catch (ImageProcessingException | MetadataException | IOException e11) {
            throw new ImageMutationFailedException("failed to fix orientation", e11);
        }
    }

    public int d() {
        return this.f17851b.getHeight();
    }

    public int e() {
        return this.f17851b.getWidth();
    }

    public void f() {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(this.f17851b, 0, 0, e(), d(), matrix, false);
        if (createBitmap != null) {
            this.f17851b = createBitmap;
            return;
        }
        throw new ImageMutationFailedException("failed to mirror");
    }

    public String j(int i11) {
        return Base64.encodeToString(l(this.f17851b, i11), 2);
    }

    public void m(File file, ReadableMap readableMap, int i11) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(l(this.f17851b, i11));
        fileOutputStream.close();
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(file.getAbsolutePath());
            for (cc.b bVar : g().b()) {
                for (g gVar : bVar.x()) {
                    aVar.d0(gVar.b(), bVar.o(gVar.c()).toString());
                }
            }
            k kVar = (k) g().e(k.class);
            for (g gVar2 : kVar.x()) {
                int c11 = gVar2.c();
                String replaceAll = gVar2.b().replaceAll(" ", "");
                Object o11 = kVar.o(c11);
                if (replaceAll.equals("ExposureTime")) {
                    aVar.d0(replaceAll, a(o11.toString()));
                } else {
                    aVar.d0(replaceAll, o11.toString());
                }
            }
            n(readableMap, aVar);
            if (this.f17853d) {
                h(aVar);
            }
            aVar.Y();
        } catch (ImageProcessingException | IOException e11) {
            Log.e("RNCamera", "failed to save exif data", e11);
        }
    }
}