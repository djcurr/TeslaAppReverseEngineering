package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.j;
import com.google.firebase.remoteconfig.internal.m;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: j */
    public static final long f17124j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f17125k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final tm.e f17126a;

    /* renamed from: b */
    private final sm.b<sl.a> f17127b;

    /* renamed from: c */
    private final Executor f17128c;

    /* renamed from: d */
    private final Clock f17129d;

    /* renamed from: e */
    private final Random f17130e;

    /* renamed from: f */
    private final d f17131f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f17132g;

    /* renamed from: h */
    private final m f17133h;

    /* renamed from: i */
    private final Map<String, String> f17134i;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final int f17135a;

        /* renamed from: b */
        private final e f17136b;

        /* renamed from: c */
        private final String f17137c;

        private a(Date date, int i11, e eVar, String str) {
            this.f17135a = i11;
            this.f17136b = eVar;
            this.f17137c = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(e eVar, String str) {
            return new a(eVar.e(), 0, eVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public e d() {
            return this.f17136b;
        }

        String e() {
            return this.f17137c;
        }

        int f() {
            return this.f17135a;
        }
    }

    public j(tm.e eVar, sm.b<sl.a> bVar, Executor executor, Clock clock, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.f17126a = eVar;
        this.f17127b = bVar;
        this.f17128c = executor;
        this.f17129d = clock;
        this.f17130e = random;
        this.f17131f = dVar;
        this.f17132g = configFetchHttpClient;
        this.f17133h = mVar;
        this.f17134i = map;
    }

    private boolean e(long j11, Date date) {
        Date e11 = this.f17133h.e();
        if (e11.equals(m.f17147d)) {
            return false;
        }
        return date.before(new Date(e11.getTime() + TimeUnit.SECONDS.toMillis(j11)));
    }

    private FirebaseRemoteConfigServerException f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int a11 = firebaseRemoteConfigServerException.a();
        if (a11 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a11 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a11 == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (a11 != 500) {
                switch (a11) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        int a12 = firebaseRemoteConfigServerException.a();
        return new FirebaseRemoteConfigServerException(a12, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String g(long j11) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j11)));
    }

    private a j(String str, String str2, Date date) {
        try {
            a fetch = this.f17132g.fetch(this.f17132g.c(), str, str2, o(), this.f17133h.d(), this.f17134i, date);
            if (fetch.e() != null) {
                this.f17133h.i(fetch.e());
            }
            this.f17133h.g();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e11) {
            m.a v11 = v(e11.a(), date);
            if (u(v11, e11.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(v11.a().getTime());
            }
            throw f(e11);
        }
    }

    private Task<a> k(String str, String str2, Date date) {
        try {
            final a j11 = j(str, str2, date);
            if (j11.f() != 0) {
                return Tasks.forResult(j11);
            }
            return this.f17131f.k(j11.d()).onSuccessTask(this.f17128c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    e eVar = (e) obj;
                    forResult = Tasks.forResult(j.a.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e11) {
            return Tasks.forException(e11);
        }
    }

    /* renamed from: l */
    public Task<a> q(Task<e> task, long j11) {
        Task continueWithTask;
        final Date date = new Date(this.f17129d.currentTimeMillis());
        if (task.isSuccessful() && e(j11, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date m11 = m(date);
        if (m11 != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(g(m11.getTime() - date.getTime()), m11.getTime()));
        } else {
            final Task<String> id2 = this.f17126a.getId();
            final Task<com.google.firebase.installations.f> a11 = this.f17126a.a(false);
            continueWithTask = Tasks.whenAllComplete(id2, a11).continueWithTask(this.f17128c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task s11;
                    s11 = j.this.s(id2, a11, date, task2);
                    return s11;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f17128c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task t11;
                t11 = j.this.t(date, task2);
                return t11;
            }
        });
    }

    private Date m(Date date) {
        Date a11 = this.f17133h.a().a();
        if (date.before(a11)) {
            return a11;
        }
        return null;
    }

    private long n(int i11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f17125k;
        long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
        return (millis / 2) + this.f17130e.nextInt((int) millis);
    }

    private Map<String, String> o() {
        HashMap hashMap = new HashMap();
        sl.a aVar = this.f17127b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.c(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean p(int i11) {
        return i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    public /* synthetic */ Task s(Task task, Task task2, Date date, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return k((String) task.getResult(), ((com.google.firebase.installations.f) task2.getResult()).b(), date);
    }

    public /* synthetic */ Task t(Date date, Task task) {
        x(task, date);
        return task;
    }

    private boolean u(m.a aVar, int i11) {
        return aVar.b() > 1 || i11 == 429;
    }

    private m.a v(int i11, Date date) {
        if (p(i11)) {
            w(date);
        }
        return this.f17133h.a();
    }

    private void w(Date date) {
        int b11 = this.f17133h.a().b() + 1;
        this.f17133h.h(b11, new Date(date.getTime() + n(b11)));
    }

    private void x(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f17133h.k(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f17133h.l();
        } else {
            this.f17133h.j();
        }
    }

    public Task<a> h() {
        return i(this.f17133h.f());
    }

    public Task<a> i(final long j11) {
        return this.f17131f.e().continueWithTask(this.f17128c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task q11;
                q11 = j.this.q(j11, task);
                return q11;
            }
        });
    }
}