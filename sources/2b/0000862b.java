package m3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import l3.e;
import l3.h;
import s3.f;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final j f38372a;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.e<String, Typeface> f38373b;

    /* loaded from: classes.dex */
    public static class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        private h.d f38374a;

        public a(h.d dVar) {
            this.f38374a = dVar;
        }

        @Override // s3.f.c
        public void a(int i11) {
            h.d dVar = this.f38374a;
            if (dVar != null) {
                dVar.d(i11);
            }
        }

        @Override // s3.f.c
        public void b(Typeface typeface) {
            h.d dVar = this.f38374a;
            if (dVar != null) {
                dVar.e(typeface);
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f38372a = new i();
        } else if (i11 >= 28) {
            f38372a = new h();
        } else if (i11 >= 26) {
            f38372a = new g();
        } else if (i11 >= 24 && f.m()) {
            f38372a = new f();
        } else if (i11 >= 21) {
            f38372a = new e();
        } else {
            f38372a = new j();
        }
        f38373b = new androidx.collection.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i11) {
        Typeface g11;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g11 = g(context, typeface, i11)) == null) ? Typeface.create(typeface, i11) : g11;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        return f38372a.c(context, cancellationSignal, bVarArr, i11);
    }

    public static Typeface c(Context context, e.a aVar, Resources resources, int i11, int i12, h.d dVar, Handler handler, boolean z11) {
        Typeface b11;
        if (aVar instanceof e.d) {
            e.d dVar2 = (e.d) aVar;
            Typeface h11 = h(dVar2.c());
            if (h11 != null) {
                if (dVar != null) {
                    dVar.b(h11, handler);
                }
                return h11;
            }
            boolean z12 = !z11 ? dVar != null : dVar2.a() != 0;
            int d11 = z11 ? dVar2.d() : -1;
            b11 = s3.f.a(context, dVar2.b(), i12, z12, d11, h.d.c(handler), new a(dVar));
        } else {
            b11 = f38372a.b(context, (e.b) aVar, resources, i12);
            if (dVar != null) {
                if (b11 != null) {
                    dVar.b(b11, handler);
                } else {
                    dVar.a(-3, handler);
                }
            }
        }
        if (b11 != null) {
            f38373b.put(e(resources, i11, i12), b11);
        }
        return b11;
    }

    public static Typeface d(Context context, Resources resources, int i11, String str, int i12) {
        Typeface e11 = f38372a.e(context, resources, i11, str, i12);
        if (e11 != null) {
            f38373b.put(e(resources, i11, i12), e11);
        }
        return e11;
    }

    private static String e(Resources resources, int i11, int i12) {
        return resources.getResourcePackageName(i11) + "-" + i11 + "-" + i12;
    }

    public static Typeface f(Resources resources, int i11, int i12) {
        return f38373b.get(e(resources, i11, i12));
    }

    private static Typeface g(Context context, Typeface typeface, int i11) {
        j jVar = f38372a;
        e.b i12 = jVar.i(typeface);
        if (i12 == null) {
            return null;
        }
        return jVar.b(context, i12, context.getResources(), i11);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}