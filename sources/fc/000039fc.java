package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.d;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.q;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tm.e;

@KeepForSdk
/* loaded from: classes2.dex */
public class c {

    /* renamed from: j */
    private static final Clock f17074j = DefaultClock.getInstance();

    /* renamed from: k */
    private static final Random f17075k = new Random();

    /* renamed from: a */
    private final Map<String, a> f17076a;

    /* renamed from: b */
    private final Context f17077b;

    /* renamed from: c */
    private final ExecutorService f17078c;

    /* renamed from: d */
    private final d f17079d;

    /* renamed from: e */
    private final e f17080e;

    /* renamed from: f */
    private final ql.b f17081f;

    /* renamed from: g */
    private final sm.b<sl.a> f17082g;

    /* renamed from: h */
    private final String f17083h;

    /* renamed from: i */
    private Map<String, String> f17084i;

    public c(Context context, d dVar, e eVar, ql.b bVar, sm.b<sl.a> bVar2) {
        this(context, Executors.newCachedThreadPool(), dVar, eVar, bVar, bVar2, true);
    }

    public static /* synthetic */ sl.a a() {
        return m();
    }

    private com.google.firebase.remoteconfig.internal.d d(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.d.h(Executors.newCachedThreadPool(), n.c(this.f17077b, String.format("%s_%s_%s_%s.json", "frc", this.f17083h, str, str2)));
    }

    private l h(com.google.firebase.remoteconfig.internal.d dVar, com.google.firebase.remoteconfig.internal.d dVar2) {
        return new l(this.f17078c, dVar, dVar2);
    }

    static m i(Context context, String str, String str2) {
        return new m(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static q j(d dVar, String str, sm.b<sl.a> bVar) {
        if (l(dVar) && str.equals("firebase")) {
            return new q(bVar);
        }
        return null;
    }

    private static boolean k(d dVar, String str) {
        return str.equals("firebase") && l(dVar);
    }

    private static boolean l(d dVar) {
        return dVar.l().equals("[DEFAULT]");
    }

    public static /* synthetic */ sl.a m() {
        return null;
    }

    synchronized a b(d dVar, String str, e eVar, ql.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.d dVar2, com.google.firebase.remoteconfig.internal.d dVar3, com.google.firebase.remoteconfig.internal.d dVar4, j jVar, l lVar, m mVar) {
        if (!this.f17076a.containsKey(str)) {
            a aVar = new a(this.f17077b, dVar, eVar, k(dVar, str) ? bVar : null, executor, dVar2, dVar3, dVar4, jVar, lVar, mVar);
            aVar.o();
            this.f17076a.put(str, aVar);
        }
        return this.f17076a.get(str);
    }

    @KeepForSdk
    public synchronized a c(String str) {
        com.google.firebase.remoteconfig.internal.d d11;
        com.google.firebase.remoteconfig.internal.d d12;
        com.google.firebase.remoteconfig.internal.d d13;
        m i11;
        l h11;
        d11 = d(str, "fetch");
        d12 = d(str, "activate");
        d13 = d(str, "defaults");
        i11 = i(this.f17077b, this.f17083h, str);
        h11 = h(d12, d13);
        final q j11 = j(this.f17079d, str, this.f17082g);
        if (j11 != null) {
            h11.b(new BiConsumer() { // from class: mn.h
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    j11.a((String) obj, (com.google.firebase.remoteconfig.internal.e) obj2);
                }
            });
        }
        return b(this.f17079d, str, this.f17080e, this.f17081f, this.f17078c, d11, d12, d13, f(str, d11, i11), h11, i11);
    }

    public a e() {
        return c("firebase");
    }

    synchronized j f(String str, com.google.firebase.remoteconfig.internal.d dVar, m mVar) {
        return new j(this.f17080e, l(this.f17079d) ? this.f17082g : new sm.b() { // from class: mn.i
            @Override // sm.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.a();
            }
        }, this.f17078c, f17074j, f17075k, dVar, g(this.f17079d.m().b(), str, mVar), mVar, this.f17084i);
    }

    ConfigFetchHttpClient g(String str, String str2, m mVar) {
        return new ConfigFetchHttpClient(this.f17077b, this.f17079d.m().c(), str, str2, mVar.b(), mVar.b());
    }

    protected c(Context context, ExecutorService executorService, d dVar, e eVar, ql.b bVar, sm.b<sl.a> bVar2, boolean z11) {
        this.f17076a = new HashMap();
        this.f17084i = new HashMap();
        this.f17077b = context;
        this.f17078c = executorService;
        this.f17079d = dVar;
        this.f17080e = eVar;
        this.f17081f = bVar;
        this.f17082g = bVar2;
        this.f17083h = dVar.m().c();
        if (z11) {
            Tasks.call(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.e();
                }
            });
        }
    }
}