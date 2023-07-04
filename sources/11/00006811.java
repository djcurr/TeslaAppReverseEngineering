package eo;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f25221a = new HashMap();

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f25222a;

        /* renamed from: b  reason: collision with root package name */
        private final sm.b f25223b;

        @KeepForSdk
        public <RemoteT extends b> a(Class<RemoteT> cls, sm.b<Object> bVar) {
            this.f25222a = cls;
            this.f25223b = bVar;
        }

        final sm.b a() {
            return this.f25223b;
        }

        final Class b() {
            return this.f25222a;
        }
    }

    @KeepForSdk
    public c(Set<a> set) {
        for (a aVar : set) {
            this.f25221a.put(aVar.b(), aVar.a());
        }
    }
}