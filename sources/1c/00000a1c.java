package ar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Base64;
import br.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import cr.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

/* loaded from: classes2.dex */
public class a {
    public static String a(String str, br.a aVar, ReactApplicationContext reactApplicationContext) {
        aVar.f7906f.toString();
        float f11 = aVar.f7903c;
        float f12 = aVar.f7902b;
        Boolean valueOf = Boolean.valueOf(aVar.f7907g == a.d.base64);
        String path = Uri.parse(str).getPath();
        Bitmap bitmap = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        float f13 = i12;
        float f14 = i11;
        float f15 = f13 / f14;
        float f16 = f12 / f11;
        if (f14 > f11 || f13 > f12) {
            if (f15 < f16) {
                i12 = (int) ((f11 / f14) * f13);
                i11 = (int) f11;
            } else {
                if (f15 > f16) {
                    f11 = (f12 / f13) * f14;
                }
                i11 = (int) f11;
                i12 = (int) f12;
            }
        }
        options.inSampleSize = b(options, i12, i11);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(path, options);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
        }
        float f17 = i12;
        float f18 = f17 / options.outWidth;
        float f19 = i11;
        float f21 = f19 / options.outHeight;
        float f22 = f17 / 2.0f;
        float f23 = f19 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f18, f21, f22, f23);
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(decodeFile, f22 - (decodeFile.getWidth() / 2), f23 - (decodeFile.getHeight() / 2), new Paint(2));
        decodeFile.recycle();
        try {
            int attributeInt = new ExifInterface(path).getAttributeInt("Orientation", 0);
            Matrix matrix2 = new Matrix();
            if (attributeInt == 6) {
                matrix2.postRotate(90.0f);
            } else if (attributeInt == 3) {
                matrix2.postRotate(180.0f);
            } else if (attributeInt == 8) {
                matrix2.postRotate(270.0f);
            }
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return e(c(bitmap, aVar.f7906f, aVar.f7904d), valueOf, aVar.f7906f.toString(), reactApplicationContext);
    }

    public static int b(BitmapFactory.Options options, int i11, int i12) {
        int round;
        int i13 = options.outHeight;
        int i14 = options.outWidth;
        if (i13 > i12 || i14 > i11) {
            round = Math.round(i13 / i12);
            int round2 = Math.round(i14 / i11);
            if (round >= round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        while ((i14 * i13) / (round * round) > i11 * i12 * 2) {
            round++;
        }
        return round;
    }

    public static ByteArrayOutputStream c(Bitmap bitmap, a.c cVar, float f11) {
        Bitmap.CompressFormat compressFormat;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (cVar == a.c.jpg) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        bitmap.compress(compressFormat, Math.round(f11 * 100.0f), byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    public static Bitmap d(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static String e(ByteArrayOutputStream byteArrayOutputStream, Boolean bool, String str, ReactApplicationContext reactApplicationContext) {
        if (bool.booleanValue()) {
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        }
        String d11 = b.d(str, reactApplicationContext);
        try {
            byteArrayOutputStream.writeTo(new FileOutputStream(d11));
            return g(d11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static br.b f(Bitmap bitmap, int i11, int i12) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width > height) {
            int round = Math.round(height / (width / i11));
            return new br.b(i11, round, round / height);
        }
        int round2 = Math.round(width / (height / i12));
        return new br.b(round2, i12, round2 / width);
    }

    public static String g(String str) {
        try {
            return new File(str).toURL().toString();
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
            return str;
        }
    }

    public static Bitmap h(String str) {
        return BitmapFactory.decodeFile(Uri.parse(str).getPath());
    }

    public static String i(String str, br.a aVar, ReactApplicationContext reactApplicationContext) {
        Bitmap h11;
        if (aVar.f7905e == a.b.base64) {
            h11 = d(str);
        } else {
            h11 = h(str);
        }
        return e(c(j(h11, aVar.f7902b, aVar.f7903c), aVar.f7906f, aVar.f7904d), Boolean.valueOf(aVar.f7907g == a.d.base64), aVar.f7906f.toString(), reactApplicationContext);
    }

    public static Bitmap j(Bitmap bitmap, int i11, int i12) {
        br.b f11 = f(bitmap, i11, i12);
        Bitmap createBitmap = Bitmap.createBitmap(f11.f7908a, f11.f7909b, bitmap.getConfig());
        Matrix matrix = new Matrix();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(2);
        float f12 = f11.f7910c;
        matrix.setScale(f12, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, matrix, paint);
        return createBitmap;
    }
}