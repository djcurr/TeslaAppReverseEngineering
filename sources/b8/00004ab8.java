package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: p  reason: collision with root package name */
    static final Handler f20735p = new a(Looper.getMainLooper());

    /* renamed from: q  reason: collision with root package name */
    static volatile t f20736q = null;

    /* renamed from: a  reason: collision with root package name */
    private final d f20737a;

    /* renamed from: b  reason: collision with root package name */
    private final g f20738b;

    /* renamed from: c  reason: collision with root package name */
    private final c f20739c;

    /* renamed from: d  reason: collision with root package name */
    private final List<y> f20740d;

    /* renamed from: e  reason: collision with root package name */
    final Context f20741e;

    /* renamed from: f  reason: collision with root package name */
    final i f20742f;

    /* renamed from: g  reason: collision with root package name */
    final com.squareup.picasso.d f20743g;

    /* renamed from: h  reason: collision with root package name */
    final a0 f20744h;

    /* renamed from: i  reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f20745i;

    /* renamed from: j  reason: collision with root package name */
    final Map<ImageView, h> f20746j;

    /* renamed from: k  reason: collision with root package name */
    final ReferenceQueue<Object> f20747k;

    /* renamed from: l  reason: collision with root package name */
    final Bitmap.Config f20748l;

    /* renamed from: m  reason: collision with root package name */
    boolean f20749m;

    /* renamed from: n  reason: collision with root package name */
    volatile boolean f20750n;

    /* renamed from: o  reason: collision with root package name */
    boolean f20751o;

    /* loaded from: classes2.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().f20750n) {
                    d0.t("Main", "canceled", aVar.f20617b.d(), "target got garbage collected");
                }
                aVar.f20616a.a(aVar.k());
                return;
            }
            int i12 = 0;
            if (i11 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i12 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i12);
                    cVar.f20667b.c(cVar);
                    i12++;
                }
            } else if (i11 == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i12 < size2) {
                    com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i12);
                    aVar2.f20616a.l(aVar2);
                    i12++;
                }
            } else {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f20752a;

        /* renamed from: b  reason: collision with root package name */
        private j f20753b;

        /* renamed from: c  reason: collision with root package name */
        private ExecutorService f20754c;

        /* renamed from: d  reason: collision with root package name */
        private com.squareup.picasso.d f20755d;

        /* renamed from: e  reason: collision with root package name */
        private d f20756e;

        /* renamed from: f  reason: collision with root package name */
        private g f20757f;

        /* renamed from: g  reason: collision with root package name */
        private List<y> f20758g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f20759h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f20760i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f20761j;

        public b(Context context) {
            if (context != null) {
                this.f20752a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public t a() {
            Context context = this.f20752a;
            if (this.f20753b == null) {
                this.f20753b = new s(context);
            }
            if (this.f20755d == null) {
                this.f20755d = new m(context);
            }
            if (this.f20754c == null) {
                this.f20754c = new v();
            }
            if (this.f20757f == null) {
                this.f20757f = g.f20765a;
            }
            a0 a0Var = new a0(this.f20755d);
            return new t(context, new i(context, this.f20754c, t.f20735p, this.f20753b, this.f20755d, a0Var), this.f20755d, this.f20756e, this.f20757f, this.f20758g, a0Var, this.f20759h, this.f20760i, this.f20761j);
        }
    }

    /* loaded from: classes2.dex */
    private static class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<Object> f20762a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f20763b;

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Exception f20764a;

            a(c cVar, Exception exc) {
                this.f20764a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f20764a);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f20762a = referenceQueue;
            this.f20763b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0361a c0361a = (a.C0361a) this.f20762a.remove(1000L);
                    Message obtainMessage = this.f20763b.obtainMessage();
                    if (c0361a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0361a.f20628a;
                        this.f20763b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e11) {
                    this.f20763b.post(new a(this, e11));
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(t tVar, Uri uri, Exception exc);
    }

    /* loaded from: classes2.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        e(int i11) {
            this.debugColor = i11;
        }
    }

    /* loaded from: classes2.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes2.dex */
    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f20765a = new a();

        /* loaded from: classes2.dex */
        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.t.g
            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    t(Context context, i iVar, com.squareup.picasso.d dVar, d dVar2, g gVar, List<y> list, a0 a0Var, Bitmap.Config config, boolean z11, boolean z12) {
        this.f20741e = context;
        this.f20742f = iVar;
        this.f20743g = dVar;
        this.f20737a = dVar2;
        this.f20738b = gVar;
        this.f20748l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.f(context));
        arrayList.add(new o(context));
        arrayList.add(new com.squareup.picasso.g(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f20702d, a0Var));
        this.f20740d = Collections.unmodifiableList(arrayList);
        this.f20744h = a0Var;
        this.f20745i = new WeakHashMap();
        this.f20746j = new WeakHashMap();
        this.f20749m = z11;
        this.f20750n = z12;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f20747k = referenceQueue;
        c cVar = new c(referenceQueue, f20735p);
        this.f20739c = cVar;
        cVar.start();
    }

    private void e(Bitmap bitmap, e eVar, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f20745i.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.f20750n) {
                d0.t("Main", "errored", aVar.f20617b.d(), exc.getMessage());
            }
        } else if (eVar != null) {
            aVar.b(bitmap, eVar);
            if (this.f20750n) {
                String d11 = aVar.f20617b.d();
                d0.t("Main", "completed", d11, "from " + eVar);
            }
        } else {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
    }

    public static t g() {
        if (f20736q == null) {
            synchronized (t.class) {
                if (f20736q == null) {
                    Context context = PicassoProvider.f20615a;
                    if (context != null) {
                        f20736q = new b(context).a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f20736q;
    }

    void a(Object obj) {
        d0.c();
        com.squareup.picasso.a remove = this.f20745i.remove(obj);
        if (remove != null) {
            remove.a();
            this.f20742f.c(remove);
        }
        if (obj instanceof ImageView) {
            h remove2 = this.f20746j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    void c(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h11 = cVar.h();
        List<com.squareup.picasso.a> i11 = cVar.i();
        boolean z11 = true;
        boolean z12 = (i11 == null || i11.isEmpty()) ? false : true;
        if (h11 == null && !z12) {
            z11 = false;
        }
        if (z11) {
            Uri uri = cVar.j().f20779d;
            Exception k11 = cVar.k();
            Bitmap s11 = cVar.s();
            e o11 = cVar.o();
            if (h11 != null) {
                e(s11, o11, h11, k11);
            }
            if (z12) {
                int size = i11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e(s11, o11, i11.get(i12), k11);
                }
            }
            d dVar = this.f20737a;
            if (dVar == null || k11 == null) {
                return;
            }
            dVar.a(this, uri, k11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ImageView imageView, h hVar) {
        if (this.f20746j.containsKey(imageView)) {
            a(imageView);
        }
        this.f20746j.put(imageView, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(com.squareup.picasso.a aVar) {
        Object k11 = aVar.k();
        if (k11 != null && this.f20745i.get(k11) != aVar) {
            a(k11);
            this.f20745i.put(k11, aVar);
        }
        m(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<y> h() {
        return this.f20740d;
    }

    public x i(Uri uri) {
        return new x(this, uri, 0);
    }

    public x j(File file) {
        if (file == null) {
            return new x(this, null, 0);
        }
        return i(Uri.fromFile(file));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap k(String str) {
        Bitmap bitmap = this.f20743g.get(str);
        if (bitmap != null) {
            this.f20744h.d();
        } else {
            this.f20744h.e();
        }
        return bitmap;
    }

    void l(com.squareup.picasso.a aVar) {
        Bitmap k11 = p.shouldReadFromMemoryCache(aVar.f20620e) ? k(aVar.d()) : null;
        if (k11 != null) {
            e eVar = e.MEMORY;
            e(k11, eVar, aVar, null);
            if (this.f20750n) {
                String d11 = aVar.f20617b.d();
                d0.t("Main", "completed", d11, "from " + eVar);
                return;
            }
            return;
        }
        f(aVar);
        if (this.f20750n) {
            d0.s("Main", "resumed", aVar.f20617b.d());
        }
    }

    void m(com.squareup.picasso.a aVar) {
        this.f20742f.h(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w n(w wVar) {
        w a11 = this.f20738b.a(wVar);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Request transformer " + this.f20738b.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}