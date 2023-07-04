package m3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import l3.e;
import s3.f;

/* loaded from: classes.dex */
class f extends j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f38380b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f38381c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f38382d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f38383e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi24Impl", e11.getClass().getName(), e11);
            cls = null;
            method = null;
            method2 = null;
        }
        f38381c = constructor;
        f38380b = cls;
        f38382d = method2;
        f38383e = method;
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        try {
            return ((Boolean) f38382d.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f38380b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f38383e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f38382d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object n() {
        try {
            return f38381c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // m3.j
    public Typeface b(Context context, e.b bVar, Resources resources, int i11) {
        e.c[] a11;
        Object n11 = n();
        if (n11 == null) {
            return null;
        }
        for (e.c cVar : bVar.a()) {
            ByteBuffer b11 = k.b(context, resources, cVar.b());
            if (b11 == null || !k(n11, b11, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return l(n11);
    }

    @Override // m3.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        Object n11 = n();
        if (n11 == null) {
            return null;
        }
        androidx.collection.g gVar = new androidx.collection.g();
        for (f.b bVar : bVarArr) {
            Uri d11 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d11);
            if (byteBuffer == null) {
                byteBuffer = k.f(context, cancellationSignal, d11);
                gVar.put(d11, byteBuffer);
            }
            if (byteBuffer == null || !k(n11, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface l11 = l(n11);
        if (l11 == null) {
            return null;
        }
        return Typeface.create(l11, i11);
    }
}