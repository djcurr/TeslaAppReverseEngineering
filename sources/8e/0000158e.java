package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f10821a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f10822b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f10823c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f10824d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f10825e;

    /* loaded from: classes.dex */
    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j11, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f10824d = hashSet;
        f10825e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f10823c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f10825e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f10821a);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f10825e.unlock();
            throw th2;
        }
    }

    public static Bitmap b(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i12;
        int height2 = bitmap.getHeight() * i11;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (width2 > height2) {
            width = i12 / bitmap.getHeight();
            f11 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f11 + 0.5f), (int) (height + 0.5f));
        Bitmap c11 = eVar.c(i11, i12, k(bitmap));
        o(bitmap, c11);
        a(bitmap, c11, matrix);
        return c11;
    }

    public static Bitmap c(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() <= i11 && bitmap.getHeight() <= i12) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return f(eVar, bitmap, i11, i12);
    }

    public static Bitmap d(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        int min = Math.min(i11, i12);
        float f11 = min;
        float f12 = f11 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f11 / width, f11 / height);
        float f13 = width * max;
        float f14 = max * height;
        float f15 = (f11 - f13) / 2.0f;
        float f16 = (f11 - f14) / 2.0f;
        RectF rectF = new RectF(f15, f16, f13 + f15, f14 + f16);
        Bitmap g11 = g(eVar, bitmap);
        Bitmap c11 = eVar.c(min, min, h(bitmap));
        c11.setHasAlpha(true);
        Lock lock = f10825e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(c11);
            canvas.drawCircle(f12, f12, f12, f10822b);
            canvas.drawBitmap(g11, (Rect) null, rectF, f10823c);
            e(canvas);
            lock.unlock();
            if (!g11.equals(bitmap)) {
                eVar.b(g11);
            }
            return c11;
        } catch (Throwable th2) {
            f10825e.unlock();
            throw th2;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(ka.e eVar, Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i11 / bitmap.getWidth(), i12 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap c11 = eVar.c((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        o(bitmap, c11);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i11 + "x" + i12);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + c11.getWidth() + "x" + c11.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, c11, matrix);
        return c11;
    }

    private static Bitmap g(ka.e eVar, Bitmap bitmap) {
        Bitmap.Config h11 = h(bitmap);
        if (h11.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap c11 = eVar.c(bitmap.getWidth(), bitmap.getHeight(), h11);
        new Canvas(c11).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        return c11;
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f10825e;
    }

    public static int j(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void l(int i11, Matrix matrix) {
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean m(int i11) {
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(ka.e eVar, Bitmap bitmap, int i11) {
        if (m(i11)) {
            Matrix matrix = new Matrix();
            l(i11, matrix);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            Bitmap c11 = eVar.c(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
            matrix.postTranslate(-rectF.left, -rectF.top);
            c11.setHasAlpha(bitmap.hasAlpha());
            a(bitmap, c11, matrix);
            return c11;
        }
        return bitmap;
    }

    public static void o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}