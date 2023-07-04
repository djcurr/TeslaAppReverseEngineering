package y70;

import android.os.Looper;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final Looper f59366a;

        public a(Looper looper) {
            this.f59366a = looper;
        }

        @Override // y70.g
        public boolean a() {
            return this.f59366a == Looper.myLooper();
        }

        @Override // y70.g
        public k b(c cVar) {
            return new e(cVar, this.f59366a, 10);
        }
    }

    boolean a();

    k b(c cVar);
}