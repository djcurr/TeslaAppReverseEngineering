package q4;

import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import java.util.UUID;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a extends p0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f47367a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f47368b;

    /* renamed from: c  reason: collision with root package name */
    private l1.c f47369c;

    public a(l0 handle) {
        s.g(handle, "handle");
        this.f47367a = "SaveableStateHolder_BackStackEntryKey";
        UUID uuid = (UUID) handle.c("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            handle.h("SaveableStateHolder_BackStackEntryKey", uuid);
            s.f(uuid, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.f47368b = uuid;
    }

    public final UUID g() {
        return this.f47368b;
    }

    public final void h(l1.c cVar) {
        this.f47369c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p0
    public void onCleared() {
        super.onCleared();
        l1.c cVar = this.f47369c;
        if (cVar == null) {
            return;
        }
        cVar.b(this.f47368b);
    }
}