package p4;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m extends p0 implements a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f46083b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final s0.b f46084c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, t0> f46085a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements s0.b {
        a() {
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            return new m();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(t0 viewModelStore) {
            kotlin.jvm.internal.s.g(viewModelStore, "viewModelStore");
            p0 a11 = new s0(viewModelStore, m.f46084c).a(m.class);
            kotlin.jvm.internal.s.f(a11, "get(VM::class.java)");
            return (m) a11;
        }
    }

    @Override // p4.a0
    public t0 d(String backStackEntryId) {
        kotlin.jvm.internal.s.g(backStackEntryId, "backStackEntryId");
        t0 t0Var = this.f46085a.get(backStackEntryId);
        if (t0Var == null) {
            t0 t0Var2 = new t0();
            this.f46085a.put(backStackEntryId, t0Var2);
            return t0Var2;
        }
        return t0Var;
    }

    public final void h(String backStackEntryId) {
        kotlin.jvm.internal.s.g(backStackEntryId, "backStackEntryId");
        t0 remove = this.f46085a.remove(backStackEntryId);
        if (remove == null) {
            return;
        }
        remove.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p0
    public void onCleared() {
        for (t0 t0Var : this.f46085a.values()) {
            t0Var.a();
        }
        this.f46085a.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it2 = this.f46085a.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }
}