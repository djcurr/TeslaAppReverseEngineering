package nr;

import ch.qos.logback.core.CoreConstants;
import java.io.EOFException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: f  reason: collision with root package name */
    public static final a f41832f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final n00.b f41833a;

    /* renamed from: b  reason: collision with root package name */
    private final r f41834b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.a<String> f41835c;

    /* renamed from: d  reason: collision with root package name */
    private final vz.k f41836d;

    /* renamed from: e  reason: collision with root package name */
    private final u20.h<r> f41837e;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(okio.i bytes) {
            r a11;
            kotlin.jvm.internal.s.g(bytes, "bytes");
            okio.f fVar = new okio.f();
            fVar.w1(bytes);
            try {
                String b11 = j.b(fVar);
                byte readByte = fVar.readByte();
                if (readByte == 0) {
                    a11 = null;
                } else if (readByte == 1) {
                    a11 = r.f41832f.a(fVar.j1());
                } else {
                    throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                }
                return new r(g00.a.e(Class.forName(b11)), a11, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<r, r> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41838a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final r invoke(r it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.f41834b;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<r, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41839a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(r it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.d();
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<String> {
        d() {
            super(0);
        }

        @Override // h00.a
        public final String invoke() {
            return r.this.f41833a instanceof n00.d ? g00.a.b((n00.d) r.this.f41833a).getName() : r.this.f41833a.toString();
        }
    }

    public r(n00.b type, r rVar, h00.a<String> aVar) {
        vz.k b11;
        kotlin.jvm.internal.s.g(type, "type");
        this.f41833a = type;
        this.f41834b = rVar;
        this.f41835c = aVar;
        if ((type instanceof n00.d) || ((type instanceof n00.p) && (((n00.p) type).c() instanceof n00.d))) {
            b11 = vz.m.b(kotlin.b.PUBLICATION, new d());
            this.f41836d = b11;
            this.f41837e = u20.k.k(this, b.f41838a);
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        Object value = this.f41836d.getValue();
        kotlin.jvm.internal.s.f(value, "<get-typeName>(...)");
        return (String) value;
    }

    public final okio.i e() {
        okio.i iVar = null;
        if (this.f41833a instanceof n00.d) {
            r rVar = this.f41834b;
            if (rVar != null) {
                okio.i e11 = rVar.e();
                if (e11 == null) {
                    return null;
                }
                iVar = e11;
            }
            okio.f fVar = new okio.f();
            j.d(fVar, d());
            if (iVar != null) {
                fVar.O0(1);
                fVar.w1(iVar);
            } else {
                fVar.O0(0);
            }
            return fVar.j1();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (!kotlin.jvm.internal.s.c(this.f41833a, rVar.f41833a) || !kotlin.jvm.internal.s.c(this.f41834b, rVar.f41834b)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f41833a.hashCode() * 31;
        r rVar = this.f41834b;
        return hashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    public String toString() {
        h00.a<String> aVar = this.f41835c;
        String invoke = aVar == null ? null : aVar.invoke();
        if (invoke == null) {
            String y11 = u20.k.y(this.f41837e, null, null, null, 0, null, c.f41839a, 31, null);
            return "WorkflowIdentifier(" + y11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return invoke;
    }

    public /* synthetic */ r(n00.b bVar, r rVar, h00.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? null : rVar, (i11 & 4) != 0 ? null : aVar);
    }
}