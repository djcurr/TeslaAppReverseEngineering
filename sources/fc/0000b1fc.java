package s3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s3.f;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    static final androidx.collection.e<String, Typeface> f50206a = new androidx.collection.e<>(16);

    /* renamed from: b */
    private static final ExecutorService f50207b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f50208c = new Object();

    /* renamed from: d */
    static final androidx.collection.g<String, ArrayList<v3.a<C1112e>>> f50209d = new androidx.collection.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<C1112e> {

        /* renamed from: a */
        final /* synthetic */ String f50210a;

        /* renamed from: b */
        final /* synthetic */ Context f50211b;

        /* renamed from: c */
        final /* synthetic */ s3.d f50212c;

        /* renamed from: d */
        final /* synthetic */ int f50213d;

        a(String str, Context context, s3.d dVar, int i11) {
            this.f50210a = str;
            this.f50211b = context;
            this.f50212c = dVar;
            this.f50213d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1112e call() {
            return e.c(this.f50210a, this.f50211b, this.f50212c, this.f50213d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements v3.a<C1112e> {

        /* renamed from: a */
        final /* synthetic */ s3.a f50214a;

        b(s3.a aVar) {
            this.f50214a = aVar;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(C1112e c1112e) {
            if (c1112e == null) {
                c1112e = new C1112e(-3);
            }
            this.f50214a.b(c1112e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<C1112e> {

        /* renamed from: a */
        final /* synthetic */ String f50215a;

        /* renamed from: b */
        final /* synthetic */ Context f50216b;

        /* renamed from: c */
        final /* synthetic */ s3.d f50217c;

        /* renamed from: d */
        final /* synthetic */ int f50218d;

        c(String str, Context context, s3.d dVar, int i11) {
            this.f50215a = str;
            this.f50216b = context;
            this.f50217c = dVar;
            this.f50218d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1112e call() {
            try {
                return e.c(this.f50215a, this.f50216b, this.f50217c, this.f50218d);
            } catch (Throwable unused) {
                return new C1112e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements v3.a<C1112e> {

        /* renamed from: a */
        final /* synthetic */ String f50219a;

        d(String str) {
            this.f50219a = str;
        }

        @Override // v3.a
        /* renamed from: a */
        public void accept(C1112e c1112e) {
            synchronized (e.f50208c) {
                androidx.collection.g<String, ArrayList<v3.a<C1112e>>> gVar = e.f50209d;
                ArrayList<v3.a<C1112e>> arrayList = gVar.get(this.f50219a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f50219a);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    arrayList.get(i11).accept(c1112e);
                }
            }
        }
    }

    private static String a(s3.d dVar, int i11) {
        return dVar.d() + "-" + i11;
    }

    private static int b(f.a aVar) {
        int i11 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b11 = aVar.b();
        if (b11 != null && b11.length != 0) {
            i11 = 0;
            for (f.b bVar : b11) {
                int b12 = bVar.b();
                if (b12 != 0) {
                    if (b12 < 0) {
                        return -3;
                    }
                    return b12;
                }
            }
        }
        return i11;
    }

    static C1112e c(String str, Context context, s3.d dVar, int i11) {
        androidx.collection.e<String, Typeface> eVar = f50206a;
        Typeface typeface = eVar.get(str);
        if (typeface != null) {
            return new C1112e(typeface);
        }
        try {
            f.a d11 = s3.c.d(context, dVar, null);
            int b11 = b(d11);
            if (b11 != 0) {
                return new C1112e(b11);
            }
            Typeface b12 = m3.d.b(context, null, d11.b(), i11);
            if (b12 != null) {
                eVar.put(str, b12);
                return new C1112e(b12);
            }
            return new C1112e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1112e(-1);
        }
    }

    public static Typeface d(Context context, s3.d dVar, int i11, Executor executor, s3.a aVar) {
        String a11 = a(dVar, i11);
        Typeface typeface = f50206a.get(a11);
        if (typeface != null) {
            aVar.b(new C1112e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f50208c) {
            androidx.collection.g<String, ArrayList<v3.a<C1112e>>> gVar = f50209d;
            ArrayList<v3.a<C1112e>> arrayList = gVar.get(a11);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<v3.a<C1112e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a11, arrayList2);
            c cVar = new c(a11, context, dVar, i11);
            if (executor == null) {
                executor = f50207b;
            }
            g.b(executor, cVar, new d(a11));
            return null;
        }
    }

    public static Typeface e(Context context, s3.d dVar, s3.a aVar, int i11, int i12) {
        String a11 = a(dVar, i11);
        Typeface typeface = f50206a.get(a11);
        if (typeface != null) {
            aVar.b(new C1112e(typeface));
            return typeface;
        } else if (i12 == -1) {
            C1112e c11 = c(a11, context, dVar, i11);
            aVar.b(c11);
            return c11.f50220a;
        } else {
            try {
                C1112e c1112e = (C1112e) g.c(f50207b, new a(a11, context, dVar, i11), i12);
                aVar.b(c1112e);
                return c1112e.f50220a;
            } catch (InterruptedException unused) {
                aVar.b(new C1112e(-3));
                return null;
            }
        }
    }

    /* renamed from: s3.e$e */
    /* loaded from: classes.dex */
    public static final class C1112e {

        /* renamed from: a */
        final Typeface f50220a;

        /* renamed from: b */
        final int f50221b;

        C1112e(int i11) {
            this.f50220a = null;
            this.f50221b = i11;
        }

        public boolean a() {
            return this.f50221b == 0;
        }

        C1112e(Typeface typeface) {
            this.f50220a = typeface;
            this.f50221b = 0;
        }
    }
}