package nr;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f41802c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<okio.i> f41803a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f41804b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: nr.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0814a extends kotlin.jvm.internal.u implements h00.a<okio.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ okio.i f41805a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0814a(okio.i iVar) {
                super(0);
                this.f41805a = iVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final okio.i invoke() {
                return this.f41805a;
            }
        }

        /* loaded from: classes2.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.a<okio.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.l<okio.g, vz.b0> f41806a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(h00.l<? super okio.g, vz.b0> lVar) {
                super(0);
                this.f41806a = lVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final okio.i invoke() {
                okio.f fVar = new okio.f();
                this.f41806a.invoke(fVar);
                return fVar.j1();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(h00.a<? extends okio.i> lazy) {
            kotlin.jvm.internal.s.g(lazy, "lazy");
            return new i(lazy, null);
        }

        public final i b(okio.i byteString) {
            kotlin.jvm.internal.s.g(byteString, "byteString");
            return new i(new C0814a(byteString), null);
        }

        public final i c(h00.l<? super okio.g, vz.b0> lazy) {
            kotlin.jvm.internal.s.g(lazy, "lazy");
            return a(new b(lazy));
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<okio.i> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final okio.i invoke() {
            return (okio.i) i.this.f41803a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i(h00.a<? extends okio.i> aVar) {
        this.f41803a = aVar;
        this.f41804b = vz.l.a(new b());
    }

    public /* synthetic */ i(h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final okio.i b() {
        return (okio.i) this.f41804b.getValue();
    }

    public boolean equals(Object obj) {
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(b(), iVar.b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "Snapshot(" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}