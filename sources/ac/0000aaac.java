package ph;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ph.b;

/* loaded from: classes3.dex */
public abstract class i {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public final a a(String str, int i11) {
            e().put(str, String.valueOf(i11));
            return this;
        }

        public final a b(String str, long j11) {
            e().put(str, String.valueOf(j11));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j11);

        public abstract a j(String str);

        public abstract a k(long j11);
    }

    public static a a() {
        return new b.C0993b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new b.C0993b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
    }
}