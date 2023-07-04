package oh;

import java.util.List;
import oh.g;

/* loaded from: classes3.dex */
public abstract class m {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract m a();

        public abstract a b(k kVar);

        public abstract a c(List<l> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(p pVar);

        public abstract a g(long j11);

        public abstract a h(long j11);

        public a i(int i11) {
            return d(Integer.valueOf(i11));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new g.b();
    }

    public abstract k b();

    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}