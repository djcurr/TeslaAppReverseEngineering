package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import f8.w;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.r;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, com.airbnb.lottie.b<v7.d>> f54258a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f54259b = {80, 75, 3, 4};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v7.g<v7.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f54260a;

        a(String str) {
            this.f54260a = str;
        }

        @Override // v7.g
        /* renamed from: b */
        public void a(v7.d dVar) {
            e.f54258a.remove(this.f54260a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements v7.g<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f54261a;

        b(String str) {
            this.f54261a = str;
        }

        @Override // v7.g
        /* renamed from: b */
        public void a(Throwable th2) {
            e.f54258a.remove(this.f54261a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f54262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54264c;

        c(Context context, String str, String str2) {
            this.f54262a = context;
            this.f54263b = str;
            this.f54264c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            k<v7.d> c11 = v7.c.d(this.f54262a).c(this.f54263b, this.f54264c);
            if (this.f54264c != null && c11.b() != null) {
                a8.g.b().c(this.f54264c, c11.b());
            }
            return c11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f54265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54267c;

        d(Context context, String str, String str2) {
            this.f54265a = context;
            this.f54266b = str;
            this.f54267c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            return e.g(this.f54265a, this.f54266b, this.f54267c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC1222e implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f54268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f54269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54271d;

        CallableC1222e(WeakReference weakReference, Context context, int i11, String str) {
            this.f54268a = weakReference;
            this.f54269b = context;
            this.f54270c = i11;
            this.f54271d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            Context context = (Context) this.f54268a.get();
            if (context == null) {
                context = this.f54269b;
            }
            return e.p(context, this.f54270c, this.f54271d);
        }
    }

    /* loaded from: classes.dex */
    class f implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f54272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54273b;

        f(InputStream inputStream, String str) {
            this.f54272a = inputStream;
            this.f54273b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            return e.i(this.f54272a, this.f54273b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Callable<k<v7.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v7.d f54274a;

        g(v7.d dVar) {
            this.f54274a = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public k<v7.d> call() {
            return new k<>(this.f54274a);
        }
    }

    private static com.airbnb.lottie.b<v7.d> b(String str, Callable<k<v7.d>> callable) {
        v7.d a11 = str == null ? null : a8.g.b().a(str);
        if (a11 != null) {
            return new com.airbnb.lottie.b<>(new g(a11));
        }
        if (str != null) {
            Map<String, com.airbnb.lottie.b<v7.d>> map = f54258a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.airbnb.lottie.b<v7.d> bVar = new com.airbnb.lottie.b<>(callable);
        if (str != null) {
            bVar.f(new a(str));
            bVar.e(new b(str));
            f54258a.put(str, bVar);
        }
        return bVar;
    }

    private static v7.f c(v7.d dVar, String str) {
        for (v7.f fVar : dVar.j().values()) {
            if (fVar.b().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.b<v7.d> d(Context context, String str) {
        return e(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.b<v7.d> e(Context context, String str, String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    public static k<v7.d> f(Context context, String str) {
        return g(context, str, "asset_" + str);
    }

    public static k<v7.d> g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return i(context.getAssets().open(str), str2);
            }
            return s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e11) {
            return new k<>(e11);
        }
    }

    public static com.airbnb.lottie.b<v7.d> h(InputStream inputStream, String str) {
        return b(str, new f(inputStream, str));
    }

    public static k<v7.d> i(InputStream inputStream, String str) {
        return j(inputStream, str, true);
    }

    private static k<v7.d> j(InputStream inputStream, String str, boolean z11) {
        try {
            return k(g8.c.a0(r.d(r.k(inputStream))), str);
        } finally {
            if (z11) {
                h8.h.c(inputStream);
            }
        }
    }

    public static k<v7.d> k(g8.c cVar, String str) {
        return l(cVar, str, true);
    }

    private static k<v7.d> l(g8.c cVar, String str, boolean z11) {
        try {
            try {
                v7.d a11 = w.a(cVar);
                if (str != null) {
                    a8.g.b().c(str, a11);
                }
                k<v7.d> kVar = new k<>(a11);
                if (z11) {
                    h8.h.c(cVar);
                }
                return kVar;
            } catch (Exception e11) {
                k<v7.d> kVar2 = new k<>(e11);
                if (z11) {
                    h8.h.c(cVar);
                }
                return kVar2;
            }
        } catch (Throwable th2) {
            if (z11) {
                h8.h.c(cVar);
            }
            throw th2;
        }
    }

    public static com.airbnb.lottie.b<v7.d> m(Context context, int i11) {
        return n(context, i11, w(context, i11));
    }

    public static com.airbnb.lottie.b<v7.d> n(Context context, int i11, String str) {
        return b(str, new CallableC1222e(new WeakReference(context), context.getApplicationContext(), i11, str));
    }

    public static k<v7.d> o(Context context, int i11) {
        return p(context, i11, w(context, i11));
    }

    public static k<v7.d> p(Context context, int i11, String str) {
        try {
            okio.h d11 = r.d(r.k(context.getResources().openRawResource(i11)));
            if (v(d11).booleanValue()) {
                return s(new ZipInputStream(d11.I1()), str);
            }
            return i(d11.I1(), str);
        } catch (Resources.NotFoundException e11) {
            return new k<>(e11);
        }
    }

    public static com.airbnb.lottie.b<v7.d> q(Context context, String str) {
        return r(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.b<v7.d> r(Context context, String str, String str2) {
        return b(str2, new c(context, str, str2));
    }

    public static k<v7.d> s(ZipInputStream zipInputStream, String str) {
        try {
            return t(zipInputStream, str);
        } finally {
            h8.h.c(zipInputStream);
        }
    }

    private static k<v7.d> t(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            v7.d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = l(g8.c.a0(r.d(r.k(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new k<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                v7.f c11 = c(dVar, (String) entry.getKey());
                if (c11 != null) {
                    c11.f(h8.h.l((Bitmap) entry.getValue(), c11.e(), c11.c()));
                }
            }
            for (Map.Entry<String, v7.f> entry2 : dVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new k<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                a8.g.b().c(str, dVar);
            }
            return new k<>(dVar);
        } catch (IOException e11) {
            return new k<>(e11);
        }
    }

    private static boolean u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean v(okio.h hVar) {
        try {
            okio.h peek = hVar.peek();
            for (byte b11 : f54259b) {
                if (peek.readByte() != b11) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e11) {
            h8.d.b("Failed to check zip file header", e11);
            return Boolean.FALSE;
        }
    }

    private static String w(Context context, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(u(context) ? "_night_" : "_day_");
        sb2.append(i11);
        return sb2.toString();
    }
}