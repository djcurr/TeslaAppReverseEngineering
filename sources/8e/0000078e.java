package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, p0> f5222a = new HashMap<>();

    public final void a() {
        for (p0 p0Var : this.f5222a.values()) {
            p0Var.clear();
        }
        this.f5222a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p0 b(String str) {
        return this.f5222a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.f5222a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, p0 p0Var) {
        p0 put = this.f5222a.put(str, p0Var);
        if (put != null) {
            put.onCleared();
        }
    }
}