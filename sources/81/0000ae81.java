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
public final class f extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<f> f48472i;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f48473a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "messageId", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f48474b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final i f48475c;
    @q(adapter = "com.tesla.generated.hermes.messages.SubscriptionType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final h f48476d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "namespacePrefix", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final i f48477e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final i f48478f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final i f48479g;
    @q(adapter = "com.tesla.generated.hermes.messages.FlatbuffersMessageOptions#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final qt.b f48480h;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoUnsubscribeMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(k reader) {
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
                    return new f(iVar6, iVar7, iVar2, hVar2, iVar3, iVar4, iVar5, bVar, reader.e(d11));
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
        public void encode(l writer, f value) {
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
        public int encodedSize(f value) {
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
        public f redact(f value) {
            s.g(value, "value");
            qt.b h11 = value.h();
            return f.b(value, null, null, null, null, null, null, null, h11 == null ? null : qt.b.f48441e.redact(h11), i.f42656d, 127, null);
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
        f48472i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ f(i iVar, i iVar2, i iVar3, h hVar, i iVar4, i iVar5, i iVar6, qt.b bVar, i iVar7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? i.f42656d : iVar, (i11 & 2) != 0 ? i.f42656d : iVar2, (i11 & 4) != 0 ? i.f42656d : iVar3, (i11 & 8) != 0 ? h.TopicTypeNormal : hVar, (i11 & 16) != 0 ? i.f42656d : iVar4, (i11 & 32) != 0 ? i.f42656d : iVar5, (i11 & 64) != 0 ? i.f42656d : iVar6, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? i.f42656d : iVar7);
    }

    public static /* synthetic */ f b(f fVar, i iVar, i iVar2, i iVar3, h hVar, i iVar4, i iVar5, i iVar6, qt.b bVar, i iVar7, int i11, Object obj) {
        return fVar.a((i11 & 1) != 0 ? fVar.f48473a : iVar, (i11 & 2) != 0 ? fVar.f48474b : iVar2, (i11 & 4) != 0 ? fVar.f48475c : iVar3, (i11 & 8) != 0 ? fVar.f48476d : hVar, (i11 & 16) != 0 ? fVar.f48477e : iVar4, (i11 & 32) != 0 ? fVar.f48478f : iVar5, (i11 & 64) != 0 ? fVar.f48479g : iVar6, (i11 & 128) != 0 ? fVar.f48480h : bVar, (i11 & 256) != 0 ? fVar.unknownFields() : iVar7);
    }

    public final f a(i txid, i message_id, i topic, h kind, i namespace_prefix, i name, i error, qt.b bVar, i unknownFields) {
        s.g(txid, "txid");
        s.g(message_id, "message_id");
        s.g(topic, "topic");
        s.g(kind, "kind");
        s.g(namespace_prefix, "namespace_prefix");
        s.g(name, "name");
        s.g(error, "error");
        s.g(unknownFields, "unknownFields");
        return new f(txid, message_id, topic, kind, namespace_prefix, name, error, bVar, unknownFields);
    }

    public final i c() {
        return this.f48479g;
    }

    public final h d() {
        return this.f48476d;
    }

    public final i e() {
        return this.f48474b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && s.c(this.f48473a, fVar.f48473a) && s.c(this.f48474b, fVar.f48474b) && s.c(this.f48475c, fVar.f48475c) && this.f48476d == fVar.f48476d && s.c(this.f48477e, fVar.f48477e) && s.c(this.f48478f, fVar.f48478f) && s.c(this.f48479g, fVar.f48479g) && s.c(this.f48480h, fVar.f48480h);
        }
        return false;
    }

    public final i f() {
        return this.f48478f;
    }

    public final i g() {
        return this.f48477e;
    }

    public final qt.b h() {
        return this.f48480h;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.f48473a.hashCode()) * 37) + this.f48474b.hashCode()) * 37) + this.f48475c.hashCode()) * 37) + this.f48476d.hashCode()) * 37) + this.f48477e.hashCode()) * 37) + this.f48478f.hashCode()) * 37) + this.f48479g.hashCode()) * 37;
            qt.b bVar = this.f48480h;
            int hashCode2 = hashCode + (bVar != null ? bVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final i i() {
        return this.f48475c;
    }

    public final i j() {
        return this.f48473a;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1097newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f48473a;
        arrayList.add("txid=" + iVar);
        i iVar2 = this.f48474b;
        arrayList.add("message_id=" + iVar2);
        i iVar3 = this.f48475c;
        arrayList.add("topic=" + iVar3);
        h hVar = this.f48476d;
        arrayList.add("kind=" + hVar);
        i iVar4 = this.f48477e;
        arrayList.add("namespace_prefix=" + iVar4);
        i iVar5 = this.f48478f;
        arrayList.add("name=" + iVar5);
        i iVar6 = this.f48479g;
        arrayList.add("error=" + iVar6);
        qt.b bVar = this.f48480h;
        if (bVar != null) {
            arrayList.add("options=" + bVar);
        }
        l02 = e0.l0(arrayList, ", ", "ProtoUnsubscribeMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1097newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i txid, i message_id, i topic, h kind, i namespace_prefix, i name, i error, qt.b bVar, i unknownFields) {
        super(f48472i, unknownFields);
        s.g(txid, "txid");
        s.g(message_id, "message_id");
        s.g(topic, "topic");
        s.g(kind, "kind");
        s.g(namespace_prefix, "namespace_prefix");
        s.g(name, "name");
        s.g(error, "error");
        s.g(unknownFields, "unknownFields");
        this.f48473a = txid;
        this.f48474b = message_id;
        this.f48475c = topic;
        this.f48476d = kind;
        this.f48477e = namespace_prefix;
        this.f48478f = name;
        this.f48479g = error;
        this.f48480h = bVar;
    }
}