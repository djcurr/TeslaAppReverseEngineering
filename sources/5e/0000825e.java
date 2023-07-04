package l5;

import androidx.work.a0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<T> f36613a = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends i<List<a0>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d5.i f36614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36615c;

        a(d5.i iVar, String str) {
            this.f36614b = iVar;
            this.f36615c = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // l5.i
        /* renamed from: d */
        public List<a0> c() {
            return k5.p.f34404t.apply(this.f36614b.v().l().r(this.f36615c));
        }
    }

    public static i<List<a0>> a(d5.i iVar, String str) {
        return new a(iVar, str);
    }

    public com.google.common.util.concurrent.c<T> b() {
        return this.f36613a;
    }

    abstract T c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f36613a.p(c());
        } catch (Throwable th2) {
            this.f36613a.q(th2);
        }
    }
}