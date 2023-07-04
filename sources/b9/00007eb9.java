package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: b */
    private static final f f34991b = new f(true);

    /* renamed from: a */
    private final Map<a, h.f<?, ?>> f34992a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f34993a;

        /* renamed from: b */
        private final int f34994b;

        a(Object obj, int i11) {
            this.f34993a = obj;
            this.f34994b = i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f34993a == aVar.f34993a && this.f34994b == aVar.f34994b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f34993a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f34994b;
        }
    }

    f() {
        this.f34992a = new HashMap();
    }

    public static f c() {
        return f34991b;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.f<?, ?> fVar) {
        this.f34992a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends o> h.f<ContainingType, ?> b(ContainingType containingtype, int i11) {
        return (h.f<ContainingType, ?>) this.f34992a.get(new a(containingtype, i11));
    }

    private f(boolean z11) {
        this.f34992a = Collections.emptyMap();
    }
}