package en;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes2.dex */
public final class f implements tw.e<RemoteConfigManager> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25213a;

    public f(a aVar) {
        this.f25213a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) tw.h.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f25213a);
    }
}