package an;

import com.google.firebase.messaging.k0;
import om.d;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final an.a f939a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private an.a f940a = null;

        a() {
        }

        public b a() {
            return new b(this.f940a);
        }

        public a b(an.a aVar) {
            this.f940a = aVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(an.a aVar) {
        this.f939a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public an.a a() {
        return this.f939a;
    }

    public byte[] c() {
        return k0.a(this);
    }
}