package e0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v3.h;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f24375a;

    static {
        try {
            Class cls = Integer.TYPE;
            f24375a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e11) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImageWriter a(Surface surface, int i11, int i12) {
        Throwable th2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) h.f(f24375a.invoke(null, surface, Integer.valueOf(i11), Integer.valueOf(i12)));
            } catch (IllegalAccessException | InvocationTargetException e11) {
                th2 = e11;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
    }
}