package n10;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public interface m extends g20.t {

    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: n10.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0786a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final byte[] f40221a;

            public final byte[] b() {
                return this.f40221a;
            }
        }

        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final o f40222a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                kotlin.jvm.internal.s.g(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f40222a = kotlinJvmBinaryClass;
            }

            public final o b() {
                return this.f40222a;
            }

            public /* synthetic */ b(o oVar, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(oVar, (i11 & 2) != 0 ? null : bArr);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar == null) {
                return null;
            }
            return bVar.b();
        }
    }

    a b(l10.g gVar);

    a c(u10.b bVar);
}