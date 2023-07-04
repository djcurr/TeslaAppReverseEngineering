package ox;

import ch.qos.logback.core.CoreConstants;
import io.grpc.okhttp.internal.e;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ox.a f45198a;

    /* renamed from: b  reason: collision with root package name */
    private final e f45199b;

    /* renamed from: ox.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0959b {

        /* renamed from: a  reason: collision with root package name */
        private ox.a f45200a;

        /* renamed from: b  reason: collision with root package name */
        private e.b f45201b = new e.b();

        public b c() {
            if (this.f45200a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0959b d(String str, String str2) {
            this.f45201b.f(str, str2);
            return this;
        }

        public C0959b e(ox.a aVar) {
            if (aVar != null) {
                this.f45200a = aVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    public e a() {
        return this.f45199b;
    }

    public ox.a b() {
        return this.f45198a;
    }

    public String toString() {
        return "Request{url=" + this.f45198a + CoreConstants.CURLY_RIGHT;
    }

    private b(C0959b c0959b) {
        this.f45198a = c0959b.f45200a;
        this.f45199b = c0959b.f45201b.c();
    }
}