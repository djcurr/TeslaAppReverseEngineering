package y10;

import k20.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;

/* loaded from: classes5.dex */
public abstract class k extends g<b0> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f58974b = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String message) {
            kotlin.jvm.internal.s.g(message, "message");
            return new b(message);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends k {

        /* renamed from: c  reason: collision with root package name */
        private final String f58975c;

        public b(String message) {
            kotlin.jvm.internal.s.g(message, "message");
            this.f58975c = message;
        }

        @Override // y10.g
        /* renamed from: d */
        public k0 a(w00.x module) {
            kotlin.jvm.internal.s.g(module, "module");
            k0 j11 = k20.v.j(this.f58975c);
            kotlin.jvm.internal.s.f(j11, "createErrorType(message)");
            return j11;
        }

        @Override // y10.g
        public String toString() {
            return this.f58975c;
        }
    }

    public k() {
        super(b0.f54756a);
    }

    @Override // y10.g
    /* renamed from: c */
    public b0 b() {
        throw new UnsupportedOperationException();
    }
}