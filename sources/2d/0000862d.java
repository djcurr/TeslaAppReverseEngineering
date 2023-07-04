package m3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l3.e;
import s3.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends j {

    /* renamed from: b */
    private static Class<?> f38375b = null;

    /* renamed from: c */
    private static Constructor<?> f38376c = null;

    /* renamed from: d */
    private static Method f38377d = null;

    /* renamed from: e */
    private static Method f38378e = null;

    /* renamed from: f */
    private static boolean f38379f = false;

    private static boolean k(Object obj, String str, int i11, boolean z11) {
        n();
        try {
            return ((Boolean) f38377d.invoke(obj, str, Integer.valueOf(i11), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(f38375b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f38378e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f38379f) {
            return;
        }
        f38379f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi21Impl", e11.getClass().getName(), e11);
            method = null;
            cls = null;
            method2 = null;
        }
        f38376c = constructor;
        f38375b = cls;
        f38377d = method2;
        f38378e = method;
    }

    private static Object o() {
        n();
        try {
            return f38376c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // m3.j
    public Typeface b(Context context, e.b bVar, Resources resources, int i11) {
        e.c[] a11;
        Object o11 = o();
        for (e.c cVar : bVar.a()) {
            File e11 = k.e(context);
            if (e11 == null) {
                return null;
            }
            try {
                if (!k.c(e11, resources, cVar.b())) {
                    return null;
                }
                if (!k(o11, e11.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
                e11.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e11.delete();
            }
        }
        return l(o11);
    }

    @Override // m3.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        if (bVarArr.length < 1) {
            return null;
        }
        f.b h11 = h(bVarArr, i11);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h11.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m11 = m(openFileDescriptor);
            if (m11 != null && m11.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m11);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d11 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d11;
        } catch (IOException unused) {
            return null;
        }
    }
}