package h8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import x7.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f28989a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Path> f28990b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<Path> f28991c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<float[]> f28992d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static final float f28993e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f  reason: collision with root package name */
    private static float f28994f = -1.0f;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* loaded from: classes.dex */
    class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes.dex */
    class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes.dex */
    class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f11, float f12, float f13) {
        v7.c.a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f28989a.get();
        Path path2 = f28990b.get();
        Path path3 = f28991c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f11 == 1.0f && f12 == BitmapDescriptorFactory.HUE_RED) {
            v7.c.b("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f12 - f11) - 1.0f) >= 0.01d) {
            float f14 = f11 * length;
            float f15 = f12 * length;
            float f16 = f13 * length;
            float min = Math.min(f14, f15) + f16;
            float max = Math.max(f14, f15) + f16;
            if (min >= length && max >= length) {
                min = g.g(min, length);
                max = g.g(max, length);
            }
            if (min < BitmapDescriptorFactory.HUE_RED) {
                min = g.g(min, length);
            }
            if (max < BitmapDescriptorFactory.HUE_RED) {
                max = g.g(max, length);
            }
            int i11 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i11 == 0) {
                path.reset();
                v7.c.b("applyTrimPathIfNeeded");
                return;
            }
            if (i11 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < BitmapDescriptorFactory.HUE_RED) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            v7.c.b("applyTrimPathIfNeeded");
        } else {
            v7.c.b("applyTrimPathIfNeeded");
        }
    }

    public static void b(Path path, s sVar) {
        if (sVar == null || sVar.j()) {
            return;
        }
        a(path, ((y7.d) sVar.h()).p() / 100.0f, ((y7.d) sVar.d()).p() / 100.0f, ((y7.d) sVar.f()).p() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != BitmapDescriptorFactory.HUE_RED || pointF4.length() != BitmapDescriptorFactory.HUE_RED)) {
            float f11 = pointF.x;
            float f12 = pointF2.x;
            float f13 = pointF2.y;
            path.cubicTo(pointF3.x + f11, pointF.y + pointF3.y, f12 + pointF4.x, f13 + pointF4.y, f12, f13);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static float e() {
        if (f28994f == -1.0f) {
            f28994f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f28994f;
    }

    public static float f(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f28992d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f11 = f28993e;
        fArr[2] = f11;
        fArr[3] = f11;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f28992d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f11, float f12, float f13, float f14) {
        int i11 = f11 != BitmapDescriptorFactory.HUE_RED ? (int) (527 * f11) : 17;
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
            i11 = (int) (i11 * 31 * f12);
        }
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            i11 = (int) (i11 * 31 * f13);
        }
        return f14 != BitmapDescriptorFactory.HUE_RED ? (int) (i11 * 31 * f14) : i11;
    }

    public static boolean j(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 < i14) {
            return false;
        }
        if (i11 > i14) {
            return true;
        }
        if (i12 < i15) {
            return false;
        }
        return i12 > i15 || i13 >= i16;
    }

    public static boolean k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static Bitmap l(Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void m(Canvas canvas, RectF rectF, Paint paint) {
        n(canvas, rectF, paint, 31);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint, int i11) {
        v7.c.a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i11);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        v7.c.b("Utils#saveLayer");
    }
}