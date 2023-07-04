package m3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import l3.e;
import s3.f;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f38384g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f38385h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f38386i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f38387j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f38388k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f38389l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f38390m;

    public g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y11 = y();
            constructor = z(y11);
            method2 = v(y11);
            method3 = w(y11);
            method4 = A(y11);
            method5 = u(y11);
            method = x(y11);
            cls = y11;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e11.getClass().getName(), e11);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f38384g = cls;
        this.f38385h = constructor;
        this.f38386i = method2;
        this.f38387j = method3;
        this.f38388k = method4;
        this.f38389l = method5;
        this.f38390m = method;
    }

    private Object o() {
        try {
            return this.f38385h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.f38389l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f38386i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i11, int i12, int i13) {
        try {
            return ((Boolean) this.f38387j.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Integer.valueOf(i13))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f38388k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.f38386i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f38386i != null;
    }

    protected Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // m3.e, m3.j
    public Typeface b(Context context, e.b bVar, Resources resources, int i11) {
        e.c[] a11;
        if (!t()) {
            return super.b(context, bVar, resources, i11);
        }
        Object o11 = o();
        if (o11 == null) {
            return null;
        }
        for (e.c cVar : bVar.a()) {
            if (!q(context, o11, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o11);
                return null;
            }
        }
        if (s(o11)) {
            return l(o11);
        }
        return null;
    }

    @Override // m3.e, m3.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        Typeface l11;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            f.b h11 = h(bVarArr, i11);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h11.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h11.e()).setItalic(h11.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h12 = k.h(context, bVarArr, cancellationSignal);
        Object o11 = o();
        if (o11 == null) {
            return null;
        }
        boolean z11 = false;
        for (f.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h12.get(bVar.d());
            if (byteBuffer != null) {
                if (!r(o11, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    p(o11);
                    return null;
                }
                z11 = true;
            }
        }
        if (!z11) {
            p(o11);
            return null;
        } else if (s(o11) && (l11 = l(o11)) != null) {
            return Typeface.create(l11, i11);
        } else {
            return null;
        }
    }

    @Override // m3.j
    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        if (!t()) {
            return super.e(context, resources, i11, str, i12);
        }
        Object o11 = o();
        if (o11 == null) {
            return null;
        }
        if (!q(context, o11, str, 0, -1, -1, null)) {
            p(o11);
            return null;
        } else if (s(o11)) {
            return l(o11);
        } else {
            return null;
        }
    }

    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f38384g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f38390m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}