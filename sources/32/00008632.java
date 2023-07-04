package m3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import l3.e;
import s3.f;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, e.b> f38391a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements c<f.b> {
        a(j jVar) {
        }

        @Override // m3.j.c
        /* renamed from: c */
        public int b(f.b bVar) {
            return bVar.e();
        }

        @Override // m3.j.c
        /* renamed from: d */
        public boolean a(f.b bVar) {
            return bVar.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c<e.c> {
        b(j jVar) {
        }

        @Override // m3.j.c
        /* renamed from: c */
        public int b(e.c cVar) {
            return cVar.e();
        }

        @Override // m3.j.c
        /* renamed from: d */
        public boolean a(e.c cVar) {
            return cVar.f();
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(T t11);

        int b(T t11);
    }

    private void a(Typeface typeface, e.b bVar) {
        long j11 = j(typeface);
        if (j11 != 0) {
            this.f38391a.put(Long.valueOf(j11), bVar);
        }
    }

    private e.c f(e.b bVar, int i11) {
        return (e.c) g(bVar.a(), i11, new b(this));
    }

    private static <T> T g(T[] tArr, int i11, c<T> cVar) {
        int i12 = (i11 & 1) == 0 ? 400 : 700;
        boolean z11 = (i11 & 2) != 0;
        T t11 = null;
        int i13 = Integer.MAX_VALUE;
        for (T t12 : tArr) {
            int abs = (Math.abs(cVar.b(t12) - i12) * 2) + (cVar.a(t12) == z11 ? 0 : 1);
            if (t11 == null || i13 > abs) {
                t11 = t12;
                i13 = abs;
            }
        }
        return t11;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0L;
        } catch (NoSuchFieldException e12) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e12);
            return 0L;
        }
    }

    public Typeface b(Context context, e.b bVar, Resources resources, int i11) {
        e.c f11 = f(bVar, i11);
        if (f11 == null) {
            return null;
        }
        Typeface d11 = d.d(context, resources, f11.b(), f11.a(), i11);
        a(d11, bVar);
        return d11;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i11).d());
            try {
                Typeface d11 = d(context, inputStream);
                k.a(inputStream);
                return d11;
            } catch (IOException unused) {
                k.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                k.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e11 = k.e(context);
        if (e11 == null) {
            return null;
        }
        try {
            if (k.d(e11, inputStream)) {
                return Typeface.createFromFile(e11.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e11.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        File e11 = k.e(context);
        if (e11 == null) {
            return null;
        }
        try {
            if (k.c(e11, resources, i11)) {
                return Typeface.createFromFile(e11.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e11.delete();
        }
    }

    public f.b h(f.b[] bVarArr, int i11) {
        return (f.b) g(bVarArr, i11, new a(this));
    }

    public e.b i(Typeface typeface) {
        long j11 = j(typeface);
        if (j11 == 0) {
            return null;
        }
        return this.f38391a.get(Long.valueOf(j11));
    }
}