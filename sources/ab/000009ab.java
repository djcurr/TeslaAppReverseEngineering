package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private UUID f6530a;

    /* renamed from: b  reason: collision with root package name */
    private k5.p f6531b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f6532c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends c0> {

        /* renamed from: c  reason: collision with root package name */
        k5.p f6535c;

        /* renamed from: a  reason: collision with root package name */
        boolean f6533a = false;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f6536d = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        UUID f6534b = UUID.randomUUID();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Class<? extends ListenableWorker> cls) {
            this.f6535c = new k5.p(this.f6534b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f6536d.add(str);
            return d();
        }

        public final W b() {
            W c11 = c();
            c cVar = this.f6535c.f34414j;
            int i11 = Build.VERSION.SDK_INT;
            boolean z11 = (i11 >= 24 && cVar.e()) || cVar.f() || cVar.g() || (i11 >= 23 && cVar.h());
            k5.p pVar = this.f6535c;
            if (pVar.f34421q) {
                if (!z11) {
                    if (pVar.f34411g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            this.f6534b = UUID.randomUUID();
            k5.p pVar2 = new k5.p(this.f6535c);
            this.f6535c = pVar2;
            pVar2.f34405a = this.f6534b.toString();
            return c11;
        }

        abstract W c();

        abstract B d();

        public final B e(androidx.work.a aVar, long j11, TimeUnit timeUnit) {
            this.f6533a = true;
            k5.p pVar = this.f6535c;
            pVar.f34416l = aVar;
            pVar.e(timeUnit.toMillis(j11));
            return d();
        }

        public final B f(c cVar) {
            this.f6535c.f34414j = cVar;
            return d();
        }

        public B g(long j11, TimeUnit timeUnit) {
            this.f6535c.f34411g = timeUnit.toMillis(j11);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f6535c.f34411g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B h(e eVar) {
            this.f6535c.f34409e = eVar;
            return d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c0(UUID uuid, k5.p pVar, Set<String> set) {
        this.f6530a = uuid;
        this.f6531b = pVar;
        this.f6532c = set;
    }

    public UUID a() {
        return this.f6530a;
    }

    public String b() {
        return this.f6530a.toString();
    }

    public Set<String> c() {
        return this.f6532c;
    }

    public k5.p d() {
        return this.f6531b;
    }
}