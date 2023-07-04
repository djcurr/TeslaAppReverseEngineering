package j20;

import vz.b0;

/* loaded from: classes5.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33143a = a.f33144a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f33144a = new a();

        private a() {
        }

        public final d a(Runnable runnable, h00.l<? super InterruptedException, b0> lVar) {
            if (runnable != null && lVar != null) {
                return new c(runnable, lVar);
            }
            return new d(null, 1, null);
        }
    }

    void lock();

    void unlock();
}