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
public final class e extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<e> f48463i;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f48464a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "messageId", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f48465b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final i f48466c;
    @q(adapter = "com.tesla.generated.hermes.messages.SubscriptionType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final h f48467d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "namespacePrefix", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final i f48468e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final i f48469f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final i f48470g;
    @q(adapter = "com.tesla.generated.hermes.messages.FlatbuffersMessageOptions#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final qt.b f48471h;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoSubscribeMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            h hVar = h.TopicTypeNormal;
            long d11 = reader.d();
            i iVar2 = iVar;
            i iVar3 = iVar2;
            i iVar4 = iVar3;
            i iVar5 = iVar4;
            h hVar2 = hVar;
            qt.b bVar = null;
            i iVar6 = iVar5;
            i iVar7 = iVar6;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(iVar6, iVar7, iVar2, hVar2, iVar3, iVar4, iVar5, bVar, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        iVar6 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        iVar7 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        iVar2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 4:
                        try {
                            hVar2 = h.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 5:
                        iVar3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        iVar4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 7:
                        iVar5 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 8:
                        bVar = qt.b.f48441e.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, e value) {
            s.g(writer, "writer");
            s.g(value, "value");
            i j11 = value.j();
            i iVar = i.f42656d;
            if (!s.c(j11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.j());
            }
            if (!s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.e());
            }
            if (!s.c(value.i(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.i());
            }
            if (value.d() != h.TopicTypeNormal) {
                h.ADAPTER.encodeWithTag(writer, 4, value.d());
            }
            if (!s.c(value.g(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.g());
            }
            if (!s.c(value.f(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.f());
            }
            if (!s.c(value.c(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 7, value.c());
            }
            if (value.h() != null) {
                qt.b.f48441e.encodeWithTag(writer, 8, value.h());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            i j11 = value.j();
            i iVar = i.f42656d;
            if (!s.c(j11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.j());
            }
            if (!s.c(value.e(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.e());
            }
            if (!s.c(value.i(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.i());
            }
            if (value.d() != h.TopicTypeNormal) {
                z11 += h.ADAPTER.encodedSizeWithTag(4, value.d());
            }
            if (!s.c(value.g(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.g());
            }
            if (!s.c(value.f(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(6, value.f());
            }
            if (!s.c(value.c(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.c());
            }
            return value.h() != null ? z11 + qt.b.f48441e.encodedSizeWithTag(8, value.h()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            s.g(value, "value");
            qt.b h11 = value.h();
            return e.b(value, null, null, null, null, null, null, null, h11 == null ? null : qt.b.f48441e.redact(h11), i.f42656d, 127, null);
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
        f48463i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ e(i iVar, i iVar2, i iVar3, h hVar, i iVar4, i iVar5, i iVar6, qt.b bVar, i iVar7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? i.f42656d : iVar, (i11 & 2) != 0 ? i.f42656d : iVar2, (i11 & 4) != 0 ? i.f42656d : iVar3, (i11 & 8) != 0 ? h.TopicTypeNormal : hVar, (i11 & 16) != 0 ? i.f42656d : iVar4, (i11 & 32) != 0 ? i.f42656d : iVar5, (i11 & 64) != 0 ? i.f42656d : iVar6, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? i.f42656d : iVar7);
    }

    public static /* synthetic */ e b(e eVar, i iVar, i iVar2, i iVar3, h hVar, i iVar4, i iVar5, i iVar6, qt.b bVar, i iVar7, int i11, Object obj) {
        return eVar.a((i11 & 1) != 0 ? eVar.f48464a : iVar, (i11 & 2) != 0 ? eVar.f48465b : iVar2, (i11 & 4) != 0 ? eVar.f48466c : iVar3, (i11 & 8) != 0 ? eVar.f48467d : hVar, (i11 & 16) != 0 ? eVar.f48468e : iVar4, (i11 & 32) != 0 ? eVar.f48469f : iVar5, (i11 & 64) != 0 ? eVar.f48470g : iVar6, (i11 & 128) != 0 ? eVar.f48471h : bVar, (i11 & 256) != 0 ? eVar.unknownFields() : iVar7);
    }

    public final e a(i txid, i message_id, i topic, h kind, i namespace_prefix, i name, i error, qt.b bVar, i unknownFields) {
        s.g(txid, "txid");
        s.g(message_id, "message_id");
        s.g(topic, "topic");
        s.g(kind, "kind");
        s.g(namespace_prefix, "namespace_prefix");
        s.g(name, "name");
        s.g(error, "error");
        s.g(unknownFields, "unknownFields");
        return new e(txid, message_id, topic, kind, namespace_prefix, name, error, bVar, unknownFields);
    }

    public final i c() {
        return this.f48470g;
    }

    public final h d() {
        return this.f48467d;
    }

    public final i e() {
        return this.f48465b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(unknownFields(), eVar.unknownFields()) && s.c(this.f48464a, eVar.f48464a) && s.c(this.f48465b, eVar.f48465b) && s.c(this.f48466c, eVar.f48466c) && this.f48467d == eVar.f48467d && s.c(this.f48468e, eVar.f48468e) && s.c(this.f48469f, eVar.f48469f) && s.c(this.f48470g, eVar.f48470g) && s.c(this.f48471h, eVar.f48471h);
        }
        return false;
    }

    public final i f() {
        return this.f48469f;
    }

    public final i g() {
        return this.f48468e;
    }

    public final qt.b h() {
        return this.f48471h;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.f48464a.hashCode()) * 37) + this.f48465b.hashCode()) * 37) + this.f48466c.hashCode()) * 37) + this.f48467d.hashCode()) * 37) + this.f48468e.hashCode()) * 37) + this.f48469f.hashCode()) * 37) + this.f48470g.hashCode()) * 37;
            qt.b bVar = this.f48471h;
            int hashCode2 = hashCode + (bVar != null ? bVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final i i() {
        return this.f48466c;
    }

    public final i j() {
        return this.f48464a;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1096newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f48464a;
        arrayList.add("txid=" + iVar);
        i iVar2 = this.f48465b;
        arrayList.add("message_id=" + iVar2);
        i iVar3 = this.f48466c;
        arrayList.add("topic=" + iVar3);
        h hVar = this.f48467d;
        arrayList.add("kind=" + hVar);
        i iVar4 = this.f48468e;
        arrayList.add("namespace_prefix=" + iVar4);
        i iVar5 = this.f48469f;
        arrayList.add("name=" + iVar5);
        i iVar6 = this.f48470g;
        arrayList.add("error=" + iVar6);
        qt.b bVar = this.f48471h;
        if (bVar != null) {
            arrayList.add("options=" + bVar);
        }
        l02 = e0.l0(arrayList, ", ", "ProtoSubscribeMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1096newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i txid, i message_id, i topic, h kind, i namespace_prefix, i name, i error, qt.b bVar, i unknownFields) {
        super(f48463i, unknownFields);
        s.g(txid, "txid");
        s.g(message_id, "message_id");
        s.g(topic, "topic");
        s.g(kind, "kind");
        s.g(namespace_prefix, "namespace_prefix");
        s.g(name, "name");
        s.g(error, "error");
        s.g(unknownFields, "unknownFields");
        this.f48464a = txid;
        this.f48465b = message_id;
        this.f48466c = topic;
        this.f48467d = kind;
        this.f48468e = namespace_prefix;
        this.f48469f = name;
        this.f48470g = error;
        this.f48471h = bVar;
    }
}