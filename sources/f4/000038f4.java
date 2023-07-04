package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import ul.n;
import ul.t;

/* loaded from: classes.dex */
public class d {

    /* renamed from: j */
    private static final Object f16645j = new Object();

    /* renamed from: k */
    private static final Executor f16646k = new ExecutorC0304d();

    /* renamed from: l */
    static final Map<String, d> f16647l = new androidx.collection.a();

    /* renamed from: a */
    private final Context f16648a;

    /* renamed from: b */
    private final String f16649b;

    /* renamed from: c */
    private final i f16650c;

    /* renamed from: d */
    private final n f16651d;

    /* renamed from: g */
    private final t<ym.a> f16654g;

    /* renamed from: h */
    private final sm.b<qm.g> f16655h;

    /* renamed from: e */
    private final AtomicBoolean f16652e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f16653f = new AtomicBoolean();

    /* renamed from: i */
    private final List<b> f16656i = new CopyOnWriteArrayList();

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface b {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z11);
    }

    /* loaded from: classes.dex */
    public static class c implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<c> f16657a = new AtomicReference<>();

        private c() {
        }

        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f16657a.get() == null) {
                    c cVar = new c();
                    if (f16657a.compareAndSet(null, cVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z11) {
            synchronized (d.f16645j) {
                Iterator it2 = new ArrayList(d.f16647l.values()).iterator();
                while (it2.hasNext()) {
                    d dVar = (d) it2.next();
                    if (dVar.f16652e.get()) {
                        dVar.x(z11);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.d$d */
    /* loaded from: classes.dex */
    private static class ExecutorC0304d implements Executor {

        /* renamed from: a */
        private static final Handler f16658a = new Handler(Looper.getMainLooper());

        private ExecutorC0304d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f16658a.post(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<e> f16659b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f16660a;

        public e(Context context) {
            this.f16660a = context;
        }

        public static void b(Context context) {
            if (f16659b.get() == null) {
                e eVar = new e(context);
                if (f16659b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f16660a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (d.f16645j) {
                for (d dVar : d.f16647l.values()) {
                    dVar.o();
                }
            }
            c();
        }
    }

    protected d(final Context context, String str, i iVar) {
        new CopyOnWriteArrayList();
        this.f16648a = (Context) Preconditions.checkNotNull(context);
        this.f16649b = Preconditions.checkNotEmpty(str);
        this.f16650c = (i) Preconditions.checkNotNull(iVar);
        n e11 = n.i(f16646k).d(ul.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(ul.d.p(context, Context.class, new Class[0])).b(ul.d.p(this, d.class, new Class[0])).b(ul.d.p(iVar, i.class, new Class[0])).e();
        this.f16651d = e11;
        this.f16654g = new t<>(new sm.b() { // from class: com.google.firebase.c
            {
                d.this = this;
            }

            @Override // sm.b
            public final Object get() {
                ym.a u11;
                u11 = d.this.u(context);
                return u11;
            }
        });
        this.f16655h = e11.d(qm.g.class);
        g(new b() { // from class: com.google.firebase.b
            {
                d.this = this;
            }

            @Override // com.google.firebase.d.b
            public final void onBackgroundStateChanged(boolean z11) {
                d.this.v(z11);
            }
        });
    }

    private void h() {
        Preconditions.checkState(!this.f16653f.get(), "FirebaseApp was deleted");
    }

    public static d k() {
        d dVar;
        synchronized (f16645j) {
            dVar = f16647l.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    public void o() {
        if (!r3.n.a(this.f16648a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            e.b(this.f16648a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f16651d.l(t());
        this.f16655h.get().n();
    }

    public static d p(Context context) {
        synchronized (f16645j) {
            if (f16647l.containsKey("[DEFAULT]")) {
                return k();
            }
            i a11 = i.a(context);
            if (a11 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return q(context, a11);
        }
    }

    public static d q(Context context, i iVar) {
        return r(context, iVar, "[DEFAULT]");
    }

    public static d r(Context context, i iVar, String str) {
        d dVar;
        c.b(context);
        String w11 = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16645j) {
            Map<String, d> map = f16647l;
            boolean z11 = !map.containsKey(w11);
            Preconditions.checkState(z11, "FirebaseApp name " + w11 + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            dVar = new d(context, w11, iVar);
            map.put(w11, dVar);
        }
        dVar.o();
        return dVar;
    }

    public /* synthetic */ ym.a u(Context context) {
        return new ym.a(context, n(), (pm.c) this.f16651d.a(pm.c.class));
    }

    public /* synthetic */ void v(boolean z11) {
        if (z11) {
            return;
        }
        this.f16655h.get().n();
    }

    private static String w(String str) {
        return str.trim();
    }

    public void x(boolean z11) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f16656i) {
            bVar.onBackgroundStateChanged(z11);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f16649b.equals(((d) obj).l());
        }
        return false;
    }

    @KeepForSdk
    public void g(b bVar) {
        h();
        if (this.f16652e.get() && BackgroundDetector.getInstance().isInBackground()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.f16656i.add(bVar);
    }

    public int hashCode() {
        return this.f16649b.hashCode();
    }

    @KeepForSdk
    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f16651d.a(cls);
    }

    public Context j() {
        h();
        return this.f16648a;
    }

    public String l() {
        h();
        return this.f16649b;
    }

    public i m() {
        h();
        return this.f16650c;
    }

    @KeepForSdk
    public String n() {
        return Base64Utils.encodeUrlSafeNoPadding(l().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(m().c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public boolean s() {
        h();
        return this.f16654g.get().b();
    }

    @KeepForSdk
    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f16649b).add("options", this.f16650c).toString();
    }

    @KeepForSdk
    public void y(Boolean bool) {
        h();
        this.f16654g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void z(boolean z11) {
        y(Boolean.valueOf(z11));
    }
}