package gu;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: gu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0535a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f28091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0535a(k params, Throwable error) {
            super(params, null);
            kotlin.jvm.internal.s.g(params, "params");
            kotlin.jvm.internal.s.g(error, "error");
            this.f28091a = error;
        }

        public final Throwable a() {
            return this.f28091a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final k f28092a;

        /* renamed from: b  reason: collision with root package name */
        private final qt.d f28093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k params, qt.d message) {
            super(params, null);
            kotlin.jvm.internal.s.g(params, "params");
            kotlin.jvm.internal.s.g(message, "message");
            this.f28092a = params;
            this.f28093b = message;
        }

        public final qt.d a() {
            return this.f28093b;
        }

        public k b() {
            return this.f28092a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(b(), bVar.b()) && kotlin.jvm.internal.s.c(this.f28093b, bVar.f28093b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f28093b.hashCode();
        }

        public String toString() {
            k b11 = b();
            qt.d dVar = this.f28093b;
            return "Success(params=" + b11 + ", message=" + dVar + ")";
        }
    }

    private a(k kVar) {
    }

    public /* synthetic */ a(k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar);
    }
}