package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class d extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<d> f48459d;
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoCommandMessage#ADAPTER", jsonName = "commandMessage", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final c f48460a;
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoSubscribeMessage#ADAPTER", jsonName = "subscribeMessage", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e f48461b;
    @q(adapter = "com.tesla.generated.hermes.messages.ProtoUnsubscribeMessage#ADAPTER", jsonName = "unsubscribeMessage", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final f f48462c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            c cVar = null;
            e eVar = null;
            f fVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(cVar, eVar, fVar, reader.e(d11));
                } else if (g11 == 1) {
                    cVar = c.f48446m.decode(reader);
                } else if (g11 == 2) {
                    eVar = e.f48463i.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    fVar = f.f48472i.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            c.f48446m.encodeWithTag(writer, 1, value.b());
            e.f48463i.encodeWithTag(writer, 2, value.c());
            f.f48472i.encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            return value.unknownFields().z() + c.f48446m.encodedSizeWithTag(1, value.b()) + e.f48463i.encodedSizeWithTag(2, value.c()) + f.f48472i.encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            c b11 = value.b();
            c redact = b11 == null ? null : c.f48446m.redact(b11);
            e c11 = value.c();
            e redact2 = c11 == null ? null : e.f48463i.redact(c11);
            f d11 = value.d();
            return value.a(redact, redact2, d11 != null ? f.f48472i.redact(d11) : null, i.f42656d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f48459d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ d(c cVar, e eVar, f fVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? null : eVar, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? i.f42656d : iVar);
    }

    public final d a(c cVar, e eVar, f fVar, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new d(cVar, eVar, fVar, unknownFields);
    }

    public final c b() {
        return this.f48460a;
    }

    public final e c() {
        return this.f48461b;
    }

    public final f d() {
        return this.f48462c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f48460a, dVar.f48460a) && s.c(this.f48461b, dVar.f48461b) && s.c(this.f48462c, dVar.f48462c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            c cVar = this.f48460a;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
            e eVar = this.f48461b;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            f fVar = this.f48462c;
            int hashCode4 = hashCode3 + (fVar != null ? fVar.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1095newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        c cVar = this.f48460a;
        if (cVar != null) {
            arrayList.add("command_message=" + cVar);
        }
        e eVar = this.f48461b;
        if (eVar != null) {
            arrayList.add("subscribe_message=" + eVar);
        }
        f fVar = this.f48462c;
        if (fVar != null) {
            arrayList.add("unsubscribe_message=" + fVar);
        }
        l02 = e0.l0(arrayList, ", ", "ProtoMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1095newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, e eVar, f fVar, i unknownFields) {
        super(f48459d, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f48460a = cVar;
        this.f48461b = eVar;
        this.f48462c = fVar;
        if (!(mr.d.d(cVar, eVar, fVar) <= 1)) {
            throw new IllegalArgumentException("At most one of command_message, subscribe_message, unsubscribe_message may be non-null".toString());
        }
    }
}