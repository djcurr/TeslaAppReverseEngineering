package p4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.savedstate.SavedStateRegistry;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.v, u0, androidx.lifecycle.o, androidx.savedstate.c {

    /* renamed from: n  reason: collision with root package name */
    public static final a f46004n = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f46005a;

    /* renamed from: b  reason: collision with root package name */
    private p f46006b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f46007c;

    /* renamed from: d  reason: collision with root package name */
    private p.c f46008d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f46009e;

    /* renamed from: f  reason: collision with root package name */
    private final String f46010f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f46011g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.lifecycle.x f46012h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.savedstate.b f46013i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f46014j;

    /* renamed from: k  reason: collision with root package name */
    private final vz.k f46015k;

    /* renamed from: l  reason: collision with root package name */
    private final vz.k f46016l;

    /* renamed from: m  reason: collision with root package name */
    private p.c f46017m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i b(a aVar, Context context, p pVar, Bundle bundle, p.c cVar, a0 a0Var, String str, Bundle bundle2, int i11, Object obj) {
            String str2;
            Bundle bundle3 = (i11 & 4) != 0 ? null : bundle;
            p.c cVar2 = (i11 & 8) != 0 ? p.c.CREATED : cVar;
            a0 a0Var2 = (i11 & 16) != 0 ? null : a0Var;
            if ((i11 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return aVar.a(context, pVar, bundle3, cVar2, a0Var2, str2, (i11 & 64) != 0 ? null : bundle2);
        }

        public final i a(Context context, p destination, Bundle bundle, p.c hostLifecycleState, a0 a0Var, String id2, Bundle bundle2) {
            kotlin.jvm.internal.s.g(destination, "destination");
            kotlin.jvm.internal.s.g(hostLifecycleState, "hostLifecycleState");
            kotlin.jvm.internal.s.g(id2, "id");
            return new i(context, destination, bundle, hostLifecycleState, a0Var, id2, bundle2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.savedstate.c owner, Bundle bundle) {
            super(owner, bundle);
            kotlin.jvm.internal.s.g(owner, "owner");
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            kotlin.jvm.internal.s.g(handle, "handle");
            return new c(handle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends p0 {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f46018a;

        public c(l0 handle) {
            kotlin.jvm.internal.s.g(handle, "handle");
            this.f46018a = handle;
        }

        public final l0 g() {
            return this.f46018a;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<m0> {
        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final m0 invoke() {
            Context context = i.this.f46005a;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            i iVar = i.this;
            return new m0(application, iVar, iVar.d());
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<l0> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final l0 invoke() {
            if (i.this.f46014j) {
                if (i.this.f46012h.b() != p.c.DESTROYED) {
                    i iVar = i.this;
                    return ((c) new s0(iVar, new b(iVar, null)).a(c.class)).g();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    private i(Context context, p pVar, Bundle bundle, p.c cVar, a0 a0Var, String str, Bundle bundle2) {
        vz.k a11;
        vz.k a12;
        this.f46005a = context;
        this.f46006b = pVar;
        this.f46007c = bundle;
        this.f46008d = cVar;
        this.f46009e = a0Var;
        this.f46010f = str;
        this.f46011g = bundle2;
        this.f46012h = new androidx.lifecycle.x(this);
        androidx.savedstate.b a13 = androidx.savedstate.b.a(this);
        kotlin.jvm.internal.s.f(a13, "create(this)");
        this.f46013i = a13;
        a11 = vz.m.a(new d());
        this.f46015k = a11;
        a12 = vz.m.a(new e());
        this.f46016l = a12;
        this.f46017m = p.c.INITIALIZED;
    }

    public /* synthetic */ i(Context context, p pVar, Bundle bundle, p.c cVar, a0 a0Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pVar, bundle, cVar, a0Var, str, bundle2);
    }

    private final m0 e() {
        return (m0) this.f46015k.getValue();
    }

    public final Bundle d() {
        return this.f46007c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L88
            boolean r1 = r7 instanceof p4.i
            if (r1 != 0) goto L9
            goto L88
        L9:
            java.lang.String r1 = r6.f46010f
            p4.i r7 = (p4.i) r7
            java.lang.String r2 = r7.f46010f
            boolean r1 = kotlin.jvm.internal.s.c(r1, r2)
            r2 = 1
            if (r1 == 0) goto L88
            p4.p r1 = r6.f46006b
            p4.p r3 = r7.f46006b
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 == 0) goto L88
            androidx.lifecycle.x r1 = r6.f46012h
            androidx.lifecycle.x r3 = r7.f46012h
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 == 0) goto L88
            androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
            androidx.savedstate.SavedStateRegistry r3 = r7.getSavedStateRegistry()
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 == 0) goto L88
            android.os.Bundle r1 = r6.f46007c
            android.os.Bundle r3 = r7.f46007c
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 != 0) goto L87
            android.os.Bundle r1 = r6.f46007c
            if (r1 != 0) goto L48
        L46:
            r7 = r0
            goto L85
        L48:
            java.util.Set r1 = r1.keySet()
            if (r1 != 0) goto L4f
            goto L46
        L4f:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L57
        L55:
            r7 = r2
            goto L82
        L57:
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.d()
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.d()
            if (r5 != 0) goto L77
            r3 = 0
            goto L7b
        L77:
            java.lang.Object r3 = r5.get(r3)
        L7b:
            boolean r3 = kotlin.jvm.internal.s.c(r4, r3)
            if (r3 != 0) goto L5b
            r7 = r0
        L82:
            if (r7 != r2) goto L46
            r7 = r2
        L85:
            if (r7 == 0) goto L88
        L87:
            r0 = r2
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.i.equals(java.lang.Object):boolean");
    }

    public final p f() {
        return this.f46006b;
    }

    public final String g() {
        return this.f46010f;
    }

    @Override // androidx.lifecycle.o
    public s0.b getDefaultViewModelProviderFactory() {
        return e();
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        return this.f46012h;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistry b11 = this.f46013i.b();
        kotlin.jvm.internal.s.f(b11, "savedStateRegistryController.savedStateRegistry");
        return b11;
    }

    @Override // androidx.lifecycle.u0
    public t0 getViewModelStore() {
        if (this.f46014j) {
            if (this.f46012h.b() != p.c.DESTROYED) {
                a0 a0Var = this.f46009e;
                if (a0Var != null) {
                    return a0Var.d(this.f46010f);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final p.c h() {
        return this.f46017m;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f46010f.hashCode() * 31) + this.f46006b.hashCode();
        Bundle bundle = this.f46007c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i11 = hashCode * 31;
                Object obj = d().get(str);
                hashCode = i11 + (obj == null ? 0 : obj.hashCode());
            }
        }
        return (((hashCode * 31) + this.f46012h.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final l0 i() {
        return (l0) this.f46016l.getValue();
    }

    public final void k(p.b event) {
        kotlin.jvm.internal.s.g(event, "event");
        p.c targetState = event.getTargetState();
        kotlin.jvm.internal.s.f(targetState, "event.targetState");
        this.f46008d = targetState;
        o();
    }

    public final void l(Bundle outBundle) {
        kotlin.jvm.internal.s.g(outBundle, "outBundle");
        this.f46013i.d(outBundle);
    }

    public final void m(p pVar) {
        kotlin.jvm.internal.s.g(pVar, "<set-?>");
        this.f46006b = pVar;
    }

    public final void n(p.c maxState) {
        kotlin.jvm.internal.s.g(maxState, "maxState");
        this.f46017m = maxState;
        o();
    }

    public final void o() {
        if (!this.f46014j) {
            this.f46013i.c(this.f46011g);
            this.f46014j = true;
        }
        if (this.f46008d.ordinal() < this.f46017m.ordinal()) {
            this.f46012h.p(this.f46008d);
        } else {
            this.f46012h.p(this.f46017m);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(i entry, Bundle bundle) {
        this(entry.f46005a, entry.f46006b, bundle, entry.f46008d, entry.f46009e, entry.f46010f, entry.f46011g);
        kotlin.jvm.internal.s.g(entry, "entry");
        this.f46008d = entry.f46008d;
        n(entry.f46017m);
    }
}