package iz;

import io.realm.i0;
import io.realm.l0;
import io.realm.q0;
import java.util.IdentityHashMap;

/* loaded from: classes5.dex */
public class a implements iz.b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iz.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0607a extends ThreadLocal<d<q0>> {
        C0607a(a aVar) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public d<q0> initialValue() {
            return new d<>(null);
        }
    }

    /* loaded from: classes5.dex */
    class b extends ThreadLocal<d<i0>> {
        b(a aVar) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public d<i0> initialValue() {
            return new d<>(null);
        }
    }

    /* loaded from: classes5.dex */
    class c extends ThreadLocal<d<l0>> {
        c(a aVar) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public d<l0> initialValue() {
            return new d<>(null);
        }
    }

    static {
        ey.a aVar = ey.a.LATEST;
    }

    public a(boolean z11) {
        new C0607a(this);
        new b(this);
        new c(this);
    }

    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return 37;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d<K> {
        private d() {
            new IdentityHashMap();
        }

        /* synthetic */ d(C0607a c0607a) {
            this();
        }
    }
}