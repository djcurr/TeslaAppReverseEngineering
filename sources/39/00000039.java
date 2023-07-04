package a10;

import kotlin.jvm.internal.s;
import w00.o0;

/* loaded from: classes5.dex */
public final class m implements k10.b {

    /* renamed from: a  reason: collision with root package name */
    public static final m f127a = new m();

    /* loaded from: classes5.dex */
    public static final class a implements k10.a {

        /* renamed from: b  reason: collision with root package name */
        private final b10.n f128b;

        public a(b10.n javaElement) {
            s.g(javaElement, "javaElement");
            this.f128b = javaElement;
        }

        @Override // w00.n0
        public o0 b() {
            o0 NO_SOURCE_FILE = o0.f55304a;
            s.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // k10.a
        /* renamed from: d */
        public b10.n c() {
            return this.f128b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private m() {
    }

    @Override // k10.b
    public k10.a a(l10.l javaElement) {
        s.g(javaElement, "javaElement");
        return new a((b10.n) javaElement);
    }
}