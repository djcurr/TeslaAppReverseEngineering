package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.h;
import hn.e;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kn.k;

/* loaded from: classes2.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, jn.b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: m  reason: collision with root package name */
    private static final fn.a f16961m = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<jn.b> f16962a;

    /* renamed from: b  reason: collision with root package name */
    private final Trace f16963b;

    /* renamed from: c  reason: collision with root package name */
    private final GaugeManager f16964c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16965d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f16966e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f16967f;

    /* renamed from: g  reason: collision with root package name */
    private final List<jn.a> f16968g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Trace> f16969h;

    /* renamed from: i  reason: collision with root package name */
    private final k f16970i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f16971j;

    /* renamed from: k  reason: collision with root package name */
    private h f16972k;

    /* renamed from: l  reason: collision with root package name */
    private h f16973l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    /* loaded from: classes2.dex */
    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
        new b();
    }

    /* synthetic */ Trace(Parcel parcel, boolean z11, a aVar) {
        this(parcel, z11);
    }

    private void b(String str, String str2) {
        if (!l()) {
            if (!this.f16967f.containsKey(str) && this.f16967f.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            String d11 = e.d(new AbstractMap.SimpleEntry(str, str2));
            if (d11 != null) {
                throw new IllegalArgumentException(d11);
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f16965d));
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a m(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f16966e.get(str);
        if (aVar == null) {
            com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
            this.f16966e.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private void n(h hVar) {
        if (this.f16969h.isEmpty()) {
            return;
        }
        Trace trace = this.f16969h.get(this.f16969h.size() - 1);
        if (trace.f16973l == null) {
            trace.f16973l = hVar;
        }
    }

    @Override // jn.b
    public void a(jn.a aVar) {
        if (aVar == null) {
            f16961m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (!j() || l()) {
        } else {
            this.f16968g.add(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f16966e;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public h e() {
        return this.f16973l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public String f() {
        return this.f16965d;
    }

    protected void finalize() {
        try {
            if (k()) {
                f16961m.k("Trace '%s' is started but not stopped when it is destructed!", this.f16965d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public List<jn.a> g() {
        List<jn.a> unmodifiableList;
        synchronized (this.f16968g) {
            ArrayList arrayList = new ArrayList();
            for (jn.a aVar : this.f16968g) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f16967f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f16967f);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f16966e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public h h() {
        return this.f16972k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public List<Trace> i() {
        return this.f16969h;
    }

    @Keep
    public void incrementMetric(String str, long j11) {
        String e11 = e.e(str);
        if (e11 != null) {
            f16961m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e11);
        } else if (!j()) {
            f16961m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f16965d);
        } else if (l()) {
            f16961m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f16965d);
        } else {
            com.google.firebase.perf.metrics.a m11 = m(str.trim());
            m11.c(j11);
            f16961m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m11.a()), this.f16965d);
        }
    }

    @VisibleForTesting
    boolean j() {
        return this.f16972k != null;
    }

    @VisibleForTesting
    boolean k() {
        return j() && !l();
    }

    @VisibleForTesting
    boolean l() {
        return this.f16973l != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z11 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f16961m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f16965d);
            z11 = true;
        } catch (Exception e11) {
            f16961m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e11.getMessage());
        }
        if (z11) {
            this.f16967f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j11) {
        String e11 = e.e(str);
        if (e11 != null) {
            f16961m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e11);
        } else if (!j()) {
            f16961m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f16965d);
        } else if (l()) {
            f16961m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f16965d);
        } else {
            m(str.trim()).d(j11);
            f16961m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j11), this.f16965d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (l()) {
            f16961m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f16967f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.f().I()) {
            f16961m.a("Trace feature is disabled.");
            return;
        }
        String f11 = e.f(this.f16965d);
        if (f11 != null) {
            f16961m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f16965d, f11);
        } else if (this.f16972k != null) {
            f16961m.d("Trace '%s' has already started, should not start again!", this.f16965d);
        } else {
            this.f16972k = this.f16971j.a();
            registerForAppState();
            jn.a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f16962a);
            a(perfSession);
            if (perfSession.f()) {
                this.f16964c.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!j()) {
            f16961m.d("Trace '%s' has not been started so unable to stop!", this.f16965d);
        } else if (l()) {
            f16961m.d("Trace '%s' has already stopped, should not stop again!", this.f16965d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f16962a);
            unregisterForAppState();
            h a11 = this.f16971j.a();
            this.f16973l = a11;
            if (this.f16963b == null) {
                n(a11);
                if (!this.f16965d.isEmpty()) {
                    this.f16970i.C(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().f()) {
                        this.f16964c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                f16961m.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f16963b, 0);
        parcel.writeString(this.f16965d);
        parcel.writeList(this.f16969h);
        parcel.writeMap(this.f16966e);
        parcel.writeParcelable(this.f16972k, 0);
        parcel.writeParcelable(this.f16973l, 0);
        synchronized (this.f16968g) {
            parcel.writeList(this.f16968g);
        }
    }

    private Trace(String str) {
        this(str, k.k(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f16962a = new WeakReference<>(this);
        this.f16963b = null;
        this.f16965d = str.trim();
        this.f16969h = new ArrayList();
        this.f16966e = new ConcurrentHashMap();
        this.f16967f = new ConcurrentHashMap();
        this.f16971j = aVar;
        this.f16970i = kVar;
        this.f16968g = Collections.synchronizedList(new ArrayList());
        this.f16964c = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z11) {
        super(z11 ? null : com.google.firebase.perf.application.a.b());
        this.f16962a = new WeakReference<>(this);
        this.f16963b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f16965d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f16969h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f16966e = concurrentHashMap;
        this.f16967f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f16972k = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f16973l = (h) parcel.readParcelable(h.class.getClassLoader());
        List<jn.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f16968g = synchronizedList;
        parcel.readList(synchronizedList, jn.a.class.getClassLoader());
        if (z11) {
            this.f16970i = null;
            this.f16971j = null;
            this.f16964c = null;
            return;
        }
        this.f16970i = k.k();
        this.f16971j = new com.google.firebase.perf.util.a();
        this.f16964c = GaugeManager.getInstance();
    }
}