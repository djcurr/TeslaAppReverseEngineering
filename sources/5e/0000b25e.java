package sf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gf.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jf.m;

/* loaded from: classes3.dex */
public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f50400a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    private static Method f50401b;

    private static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (m.a() && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (f50401b == null) {
                    int i11 = Bitmaps.f11292a;
                    f50401b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                f50401b.invoke(null, bitmap, bitmap2);
                return;
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
            } catch (NoSuchMethodException e13) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
            }
        }
        new Canvas(bitmap).drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    @Override // sf.b
    public gd.d a() {
        return null;
    }

    @Override // sf.b
    public qd.a<Bitmap> b(Bitmap bitmap, f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f50400a;
        }
        qd.a<Bitmap> d11 = fVar.d(width, height, config);
        try {
            f(d11.J(), bitmap);
            return d11.clone();
        } finally {
            qd.a.C(d11);
        }
    }

    public void e(Bitmap bitmap) {
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // sf.b
    public String getName() {
        return "Unknown postprocessor";
    }
}