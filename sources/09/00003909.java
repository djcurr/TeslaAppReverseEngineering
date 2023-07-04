package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import qm.j;
import wm.d;
import wm.f;

/* loaded from: classes2.dex */
public class c implements tm.e {

    /* renamed from: m */
    private static final Object f16680m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f16681n = new a();

    /* renamed from: a */
    private final com.google.firebase.d f16682a;

    /* renamed from: b */
    private final wm.c f16683b;

    /* renamed from: c */
    private final vm.c f16684c;

    /* renamed from: d */
    private final h f16685d;

    /* renamed from: e */
    private final vm.b f16686e;

    /* renamed from: f */
    private final tm.g f16687f;

    /* renamed from: g */
    private final Object f16688g;

    /* renamed from: h */
    private final ExecutorService f16689h;

    /* renamed from: i */
    private final ExecutorService f16690i;

    /* renamed from: j */
    private String f16691j;

    /* renamed from: k */
    private Set<um.a> f16692k;

    /* renamed from: l */
    private final List<g> f16693l;

    /* loaded from: classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f16694a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f16694a.getAndIncrement())));
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16695a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16696b;

        static {
            int[] iArr = new int[f.b.values().length];
            f16696b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16696b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16696b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f16695a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16695a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(com.google.firebase.d dVar, sm.b<j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16681n), dVar, new wm.c(dVar.j(), bVar), new vm.c(dVar), h.c(), new vm.b(dVar), new tm.g());
    }

    private String A(vm.d dVar) {
        if ((!this.f16682a.l().equals("CHIME_ANDROID_SDK") && !this.f16682a.t()) || !dVar.m()) {
            return this.f16687f.a();
        }
        String f11 = this.f16686e.f();
        return TextUtils.isEmpty(f11) ? this.f16687f.a() : f11;
    }

    private vm.d B(vm.d dVar) {
        wm.d d11 = this.f16683b.d(n(), dVar.d(), u(), o(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f16686e.i());
        int i11 = b.f16695a[d11.e().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return dVar.s(d11.c(), d11.d(), this.f16685d.b(), d11.b().c(), d11.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f16688g) {
            Iterator<g> it2 = this.f16693l.iterator();
            while (it2.hasNext()) {
                if (it2.next().a(exc)) {
                    it2.remove();
                }
            }
        }
    }

    private void D(vm.d dVar) {
        synchronized (this.f16688g) {
            Iterator<g> it2 = this.f16693l.iterator();
            while (it2.hasNext()) {
                if (it2.next().b(dVar)) {
                    it2.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f16691j = str;
    }

    private synchronized void F(vm.d dVar, vm.d dVar2) {
        if (this.f16692k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (um.a aVar : this.f16692k) {
                aVar.a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ void b(c cVar, boolean z11) {
        cVar.w(z11);
    }

    public static /* synthetic */ void c(c cVar) {
        cVar.x();
    }

    public static /* synthetic */ void d(c cVar, boolean z11) {
        cVar.y(z11);
    }

    public static /* synthetic */ Void e(c cVar) {
        return cVar.j();
    }

    private Task<f> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.f16685d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(g gVar) {
        synchronized (this.f16688g) {
            this.f16693l.add(gVar);
        }
    }

    public Void j() {
        E(null);
        vm.d s11 = s();
        if (s11.k()) {
            this.f16683b.e(n(), s11.d(), u(), s11.f());
        }
        v(s11.r());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(boolean r3) {
        /*
            r2 = this;
            vm.d r0 = r2.s()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.h r3 = r2.f16685d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            vm.d r3 = r2.m(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            vm.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.v(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L5b:
            r2.D(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.w(boolean):void");
    }

    /* renamed from: l */
    public final void y(final boolean z11) {
        vm.d t11 = t();
        if (z11) {
            t11 = t11.p();
        }
        D(t11);
        this.f16690i.execute(new Runnable() { // from class: tm.b
            {
                com.google.firebase.installations.c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.b(com.google.firebase.installations.c.this, z11);
            }
        });
    }

    private vm.d m(vm.d dVar) {
        wm.f f11 = this.f16683b.f(n(), dVar.d(), u(), dVar.f());
        int i11 = b.f16696b[f11.b().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    E(null);
                    return dVar.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(f11.c(), f11.d(), this.f16685d.b());
    }

    private synchronized String p() {
        return this.f16691j;
    }

    public static c q() {
        return r(com.google.firebase.d.k());
    }

    public static c r(com.google.firebase.d dVar) {
        Preconditions.checkArgument(dVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) dVar.i(tm.e.class);
    }

    private vm.d s() {
        vm.d d11;
        synchronized (f16680m) {
            com.google.firebase.installations.b a11 = com.google.firebase.installations.b.a(this.f16682a.j(), "generatefid.lock");
            d11 = this.f16684c.d();
            if (a11 != null) {
                a11.b();
            }
        }
        return d11;
    }

    private vm.d t() {
        vm.d d11;
        synchronized (f16680m) {
            com.google.firebase.installations.b a11 = com.google.firebase.installations.b.a(this.f16682a.j(), "generatefid.lock");
            d11 = this.f16684c.d();
            if (d11.j()) {
                d11 = this.f16684c.b(d11.t(A(d11)));
            }
            if (a11 != null) {
                a11.b();
            }
        }
        return d11;
    }

    private void v(vm.d dVar) {
        synchronized (f16680m) {
            com.google.firebase.installations.b a11 = com.google.firebase.installations.b.a(this.f16682a.j(), "generatefid.lock");
            this.f16684c.b(dVar);
            if (a11 != null) {
                a11.b();
            }
        }
    }

    public /* synthetic */ void x() {
        y(false);
    }

    private void z() {
        Preconditions.checkNotEmpty(o(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(n(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(o()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(n()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // tm.e
    public Task<f> a(final boolean z11) {
        z();
        Task<f> f11 = f();
        this.f16689h.execute(new Runnable() { // from class: tm.c
            {
                com.google.firebase.installations.c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.d(com.google.firebase.installations.c.this, z11);
            }
        });
        return f11;
    }

    @Override // tm.e
    public Task<String> getId() {
        z();
        String p11 = p();
        if (p11 != null) {
            return Tasks.forResult(p11);
        }
        Task<String> g11 = g();
        this.f16689h.execute(new Runnable() { // from class: tm.a
            {
                com.google.firebase.installations.c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.c(com.google.firebase.installations.c.this);
            }
        });
        return g11;
    }

    public Task<Void> i() {
        return Tasks.call(this.f16689h, new Callable() { // from class: tm.d
            {
                com.google.firebase.installations.c.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.installations.c.e(com.google.firebase.installations.c.this);
            }
        });
    }

    String n() {
        return this.f16682a.m().b();
    }

    String o() {
        return this.f16682a.m().c();
    }

    String u() {
        return this.f16682a.m().e();
    }

    c(ExecutorService executorService, com.google.firebase.d dVar, wm.c cVar, vm.c cVar2, h hVar, vm.b bVar, tm.g gVar) {
        this.f16688g = new Object();
        this.f16692k = new HashSet();
        this.f16693l = new ArrayList();
        this.f16682a = dVar;
        this.f16683b = cVar;
        this.f16684c = cVar2;
        this.f16685d = hVar;
        this.f16686e = bVar;
        this.f16687f = gVar;
        this.f16689h = executorService;
        this.f16690i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16681n);
    }
}