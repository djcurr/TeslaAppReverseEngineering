package d5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.b;
import androidx.work.b0;
import androidx.work.c0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.q;
import androidx.work.s;
import androidx.work.t;
import androidx.work.v;
import androidx.work.x;
import androidx.work.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class i extends b0 {

    /* renamed from: j  reason: collision with root package name */
    private static i f23640j;

    /* renamed from: k  reason: collision with root package name */
    private static i f23641k;

    /* renamed from: l  reason: collision with root package name */
    private static final Object f23642l;

    /* renamed from: a  reason: collision with root package name */
    private Context f23643a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.b f23644b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f23645c;

    /* renamed from: d  reason: collision with root package name */
    private m5.a f23646d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f23647e;

    /* renamed from: f  reason: collision with root package name */
    private d f23648f;

    /* renamed from: g  reason: collision with root package name */
    private l5.e f23649g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23650h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f23651i;

    static {
        q.f("WorkManagerImpl");
        f23640j = null;
        f23641k = null;
        f23642l = new Object();
    }

    public i(Context context, androidx.work.b bVar, m5.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(x.f6706a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (d5.i.f23641k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        d5.i.f23641k = new d5.i(r4, r5, new m5.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        d5.i.f23640j = d5.i.f23641k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = d5.i.f23642l
            monitor-enter(r0)
            d5.i r1 = d5.i.f23640j     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            d5.i r2 = d5.i.f23641k     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            d5.i r1 = d5.i.f23641k     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            d5.i r1 = new d5.i     // Catch: java.lang.Throwable -> L34
            m5.b r2 = new m5.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            d5.i.f23641k = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            d5.i r4 = d5.i.f23641k     // Catch: java.lang.Throwable -> L34
            d5.i.f23640j = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.k(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    public static i q() {
        synchronized (f23642l) {
            i iVar = f23640j;
            if (iVar != null) {
                return iVar;
            }
            return f23641k;
        }
    }

    public static i r(Context context) {
        i q11;
        synchronized (f23642l) {
            q11 = q();
            if (q11 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    k(applicationContext, ((b.c) applicationContext).g());
                    q11 = r(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return q11;
    }

    private void x(Context context, androidx.work.b bVar, m5.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f23643a = applicationContext;
        this.f23644b = bVar;
        this.f23646d = aVar;
        this.f23645c = workDatabase;
        this.f23647e = list;
        this.f23648f = dVar;
        this.f23649g = new l5.e(workDatabase);
        this.f23650h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f23646d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void A(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f23642l) {
            this.f23651i = pendingResult;
            if (this.f23650h) {
                pendingResult.finish();
                this.f23651i = null;
            }
        }
    }

    public void B(String str) {
        C(str, null);
    }

    public void C(String str, WorkerParameters.a aVar) {
        this.f23646d.b(new l5.h(this, str, aVar));
    }

    public void D(String str) {
        this.f23646d.b(new l5.j(this, str, true));
    }

    public void E(String str) {
        this.f23646d.b(new l5.j(this, str, false));
    }

    @Override // androidx.work.b0
    public z b(String str, androidx.work.h hVar, List<s> list) {
        if (!list.isEmpty()) {
            return new g(this, str, hVar, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // androidx.work.b0
    public t c(String str) {
        l5.a c11 = l5.a.c(str, this, true);
        this.f23646d.b(c11);
        return c11.d();
    }

    @Override // androidx.work.b0
    public t e(List<? extends c0> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.b0
    public t f(String str, androidx.work.g gVar, v vVar) {
        return n(str, gVar, vVar).a();
    }

    @Override // androidx.work.b0
    public t h(String str, androidx.work.h hVar, List<s> list) {
        return new g(this, str, hVar, list).a();
    }

    @Override // androidx.work.b0
    public com.google.common.util.concurrent.c<List<a0>> j(String str) {
        l5.i<List<a0>> a11 = l5.i.a(this, str);
        this.f23646d.c().execute(a11);
        return a11.b();
    }

    public t l(UUID uuid) {
        l5.a b11 = l5.a.b(uuid, this);
        this.f23646d.b(b11);
        return b11.d();
    }

    public List<e> m(Context context, androidx.work.b bVar, m5.a aVar) {
        return Arrays.asList(f.a(context, this), new e5.b(context, bVar, aVar, this));
    }

    public g n(String str, androidx.work.g gVar, v vVar) {
        androidx.work.h hVar;
        if (gVar == androidx.work.g.KEEP) {
            hVar = androidx.work.h.KEEP;
        } else {
            hVar = androidx.work.h.REPLACE;
        }
        return new g(this, str, hVar, Collections.singletonList(vVar));
    }

    public Context o() {
        return this.f23643a;
    }

    public androidx.work.b p() {
        return this.f23644b;
    }

    public l5.e s() {
        return this.f23649g;
    }

    public d t() {
        return this.f23648f;
    }

    public List<e> u() {
        return this.f23647e;
    }

    public WorkDatabase v() {
        return this.f23645c;
    }

    public m5.a w() {
        return this.f23646d;
    }

    public void y() {
        synchronized (f23642l) {
            this.f23650h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f23651i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f23651i = null;
            }
        }
    }

    public void z() {
        if (Build.VERSION.SDK_INT >= 23) {
            f5.b.b(o());
        }
        v().l().j();
        f.b(p(), v(), u());
    }

    public i(Context context, androidx.work.b bVar, m5.a aVar, boolean z11) {
        this(context, bVar, aVar, WorkDatabase.c(context.getApplicationContext(), aVar.c(), z11));
    }

    public i(Context context, androidx.work.b bVar, m5.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        q.e(new q.a(bVar.j()));
        List<e> m11 = m(applicationContext, bVar, aVar);
        x(context, bVar, aVar, workDatabase, m11, new d(context, bVar, aVar, workDatabase, m11));
    }
}