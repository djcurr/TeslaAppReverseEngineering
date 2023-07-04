package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends p0 {

    /* renamed from: h  reason: collision with root package name */
    private static final s0.b f4963h = new a();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4967d;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Fragment> f4964a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, t> f4965b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, t0> f4966c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4968e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4969f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4970g = false;

    /* loaded from: classes.dex */
    class a implements s0.b {
        a() {
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> cls) {
            return new t(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(boolean z11) {
        this.f4967d = z11;
    }

    private void i(String str) {
        t tVar = this.f4965b.get(str);
        if (tVar != null) {
            tVar.onCleared();
            this.f4965b.remove(str);
        }
        t0 t0Var = this.f4966c.get(str);
        if (t0Var != null) {
            t0Var.a();
            this.f4966c.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t l(t0 t0Var) {
        return (t) new s0(t0Var, f4963h).a(t.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        if (this.f4970g) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4964a.containsKey(fragment.mWho)) {
        } else {
            this.f4964a.put(fragment.mWho, fragment);
            if (q.G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4964a.equals(tVar.f4964a) && this.f4965b.equals(tVar.f4965b) && this.f4966c.equals(tVar.f4966c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (q.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(String str) {
        if (q.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f4964a.hashCode() * 31) + this.f4965b.hashCode()) * 31) + this.f4966c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j(String str) {
        return this.f4964a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t k(Fragment fragment) {
        t tVar = this.f4965b.get(fragment.mWho);
        if (tVar == null) {
            t tVar2 = new t(this.f4967d);
            this.f4965b.put(fragment.mWho, tVar2);
            return tVar2;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> m() {
        return new ArrayList(this.f4964a.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0 n(Fragment fragment) {
        t0 t0Var = this.f4966c.get(fragment.mWho);
        if (t0Var == null) {
            t0 t0Var2 = new t0();
            this.f4966c.put(fragment.mWho, t0Var2);
            return t0Var2;
        }
        return t0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f4968e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p0
    public void onCleared() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4968e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        if (this.f4970g) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4964a.remove(fragment.mWho) != null) && q.G0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z11) {
        this.f4970g = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(Fragment fragment) {
        if (this.f4964a.containsKey(fragment.mWho)) {
            if (this.f4967d) {
                return this.f4968e;
            }
            return !this.f4969f;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it2 = this.f4964a.values().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it3 = this.f4965b.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it4 = this.f4966c.keySet().iterator();
        while (it4.hasNext()) {
            sb2.append(it4.next());
            if (it4.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}