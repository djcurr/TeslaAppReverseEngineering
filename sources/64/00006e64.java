package fm;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.d0;
import com.google.firebase.crashlytics.internal.common.q;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.common.v;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26678a;

    /* renamed from: b  reason: collision with root package name */
    private final gm.f f26679b;

    /* renamed from: c  reason: collision with root package name */
    private final f f26680c;

    /* renamed from: d  reason: collision with root package name */
    private final q f26681d;

    /* renamed from: e  reason: collision with root package name */
    private final fm.a f26682e;

    /* renamed from: f  reason: collision with root package name */
    private final hm.b f26683f;

    /* renamed from: g  reason: collision with root package name */
    private final r f26684g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<gm.d> f26685h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<gm.a>> f26686i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Void r52) {
            JSONObject a11 = d.this.f26683f.a(d.this.f26679b, true);
            if (a11 != null) {
                gm.e b11 = d.this.f26680c.b(a11);
                d.this.f26682e.c(b11.d(), a11);
                d.this.q(a11, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.f26679b.f28029f);
                d.this.f26685h.set(b11);
                ((TaskCompletionSource) d.this.f26686i.get()).trySetResult(b11.c());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.trySetResult(b11.c());
                d.this.f26686i.set(taskCompletionSource);
            }
            return Tasks.forResult(null);
        }
    }

    d(Context context, gm.f fVar, q qVar, f fVar2, fm.a aVar, hm.b bVar, r rVar) {
        AtomicReference<gm.d> atomicReference = new AtomicReference<>();
        this.f26685h = atomicReference;
        this.f26686i = new AtomicReference<>(new TaskCompletionSource());
        this.f26678a = context;
        this.f26679b = fVar;
        this.f26681d = qVar;
        this.f26680c = fVar2;
        this.f26682e = aVar;
        this.f26683f = bVar;
        this.f26684g = rVar;
        atomicReference.set(b.e(qVar));
    }

    public static d l(Context context, String str, v vVar, cm.b bVar, String str2, String str3, dm.f fVar, r rVar) {
        String g11 = vVar.g();
        d0 d0Var = new d0();
        return new d(context, new gm.f(str, vVar.h(), vVar.i(), vVar.j(), vVar, com.google.firebase.crashlytics.internal.common.g.h(com.google.firebase.crashlytics.internal.common.g.n(context), str, str3, str2), str3, str2, s.determineFrom(g11).getId()), d0Var, new f(d0Var), new fm.a(fVar), new hm.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), rVar);
    }

    private gm.e m(c cVar) {
        gm.e eVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject b11 = this.f26682e.b();
                if (b11 != null) {
                    gm.e b12 = this.f26680c.b(b11);
                    if (b12 != null) {
                        q(b11, "Loaded cached settings: ");
                        long a11 = this.f26681d.a();
                        if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar) && b12.e(a11)) {
                            wl.f.f().i("Cached settings have expired.");
                        }
                        try {
                            wl.f.f().i("Returning cached settings.");
                            eVar = b12;
                        } catch (Exception e11) {
                            e = e11;
                            eVar = b12;
                            wl.f.f().e("Failed to get cached settings", e);
                            return eVar;
                        }
                    } else {
                        wl.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    wl.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return eVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.g.r(this.f26678a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        wl.f f11 = wl.f.f();
        f11.b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.internal.common.g.r(this.f26678a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // fm.e
    public gm.d a() {
        return this.f26685h.get();
    }

    @Override // fm.e
    public Task<gm.a> b() {
        return this.f26686i.get().getTask();
    }

    boolean k() {
        return !n().equals(this.f26679b.f28029f);
    }

    public Task<Void> o(c cVar, Executor executor) {
        gm.e m11;
        if (!k() && (m11 = m(cVar)) != null) {
            this.f26685h.set(m11);
            this.f26686i.get().trySetResult(m11.c());
            return Tasks.forResult(null);
        }
        gm.e m12 = m(c.IGNORE_CACHE_EXPIRATION);
        if (m12 != null) {
            this.f26685h.set(m12);
            this.f26686i.get().trySetResult(m12.c());
        }
        return this.f26684g.j(executor).onSuccessTask(executor, new a());
    }

    public Task<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }
}