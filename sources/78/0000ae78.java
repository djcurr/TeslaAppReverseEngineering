package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoAdapter<c> f48446m;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f48447a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f48448b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final Instant f48449c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "senderId", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final i f48450d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "commandType", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f48451e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "requestTxid", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final i f48452f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "statusCode", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final int f48453g;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "responseTopic", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final i f48454h;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final Instant f48455i;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final i f48456j;
    @q(adapter = "com.tesla.generated.hermes.messages.FlatbuffersMessageOptions#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final qt.b f48457k;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "messageId", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final i f48458l;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ProtoCommandMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            long d11 = reader.d();
            i iVar2 = iVar;
            i iVar3 = iVar2;
            i iVar4 = iVar3;
            i iVar5 = iVar4;
            int i11 = 0;
            int i12 = 0;
            Instant instant = null;
            Instant instant2 = null;
            qt.b bVar = null;
            i iVar6 = iVar5;
            i iVar7 = iVar6;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(iVar, iVar6, instant, iVar7, i11, iVar2, i12, iVar3, instant2, iVar4, bVar, iVar5, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        iVar = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        iVar6 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        instant = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 4:
                        iVar7 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 5:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        iVar2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 7:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 8:
                        iVar3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 9:
                        instant2 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 10:
                        iVar4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 11:
                        bVar = qt.b.f48441e.decode(reader);
                        break;
                    case 12:
                        iVar5 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            i n11 = value.n();
            i iVar = i.f42656d;
            if (!s.c(n11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.n());
            }
            if (!s.c(value.m(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.m());
            }
            if (value.d() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.d());
            }
            if (!s.c(value.k(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.k());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.c()));
            }
            if (!s.c(value.i(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 6, value.i());
            }
            if (value.l() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.l()));
            }
            if (!s.c(value.j(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 8, value.j());
            }
            if (value.e() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, value.e());
            }
            if (!s.c(value.h(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 10, value.h());
            }
            if (value.g() != null) {
                qt.b.f48441e.encodeWithTag(writer, 11, value.g());
            }
            if (!s.c(value.f(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 12, value.f());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            i n11 = value.n();
            i iVar = i.f42656d;
            if (!s.c(n11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.n());
            }
            if (!s.c(value.m(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.m());
            }
            if (value.d() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.d());
            }
            if (!s.c(value.k(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.k());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.c()));
            }
            if (!s.c(value.i(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(6, value.i());
            }
            if (value.l() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.l()));
            }
            if (!s.c(value.j(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(8, value.j());
            }
            if (value.e() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.e());
            }
            if (!s.c(value.h(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(10, value.h());
            }
            if (value.g() != null) {
                z11 += qt.b.f48441e.encodedSizeWithTag(11, value.g());
            }
            return !s.c(value.f(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(12, value.f()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            Instant d11 = value.d();
            Instant redact = d11 == null ? null : ProtoAdapter.INSTANT.redact(d11);
            Instant e11 = value.e();
            Instant redact2 = e11 == null ? null : ProtoAdapter.INSTANT.redact(e11);
            qt.b g11 = value.g();
            return c.b(value, null, null, redact, null, 0, null, 0, null, redact2, null, g11 == null ? null : qt.b.f48441e.redact(g11), null, i.f42656d, 2811, null);
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
        f48446m = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, null, null, 0, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ c(i iVar, i iVar2, Instant instant, i iVar3, int i11, i iVar4, int i12, i iVar5, Instant instant2, i iVar6, qt.b bVar, i iVar7, i iVar8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? i.f42656d : iVar, (i13 & 2) != 0 ? i.f42656d : iVar2, (i13 & 4) != 0 ? null : instant, (i13 & 8) != 0 ? i.f42656d : iVar3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? i.f42656d : iVar4, (i13 & 64) == 0 ? i12 : 0, (i13 & 128) != 0 ? i.f42656d : iVar5, (i13 & 256) != 0 ? null : instant2, (i13 & 512) != 0 ? i.f42656d : iVar6, (i13 & 1024) == 0 ? bVar : null, (i13 & 2048) != 0 ? i.f42656d : iVar7, (i13 & 4096) != 0 ? i.f42656d : iVar8);
    }

    public static /* synthetic */ c b(c cVar, i iVar, i iVar2, Instant instant, i iVar3, int i11, i iVar4, int i12, i iVar5, Instant instant2, i iVar6, qt.b bVar, i iVar7, i iVar8, int i13, Object obj) {
        return cVar.a((i13 & 1) != 0 ? cVar.f48447a : iVar, (i13 & 2) != 0 ? cVar.f48448b : iVar2, (i13 & 4) != 0 ? cVar.f48449c : instant, (i13 & 8) != 0 ? cVar.f48450d : iVar3, (i13 & 16) != 0 ? cVar.f48451e : i11, (i13 & 32) != 0 ? cVar.f48452f : iVar4, (i13 & 64) != 0 ? cVar.f48453g : i12, (i13 & 128) != 0 ? cVar.f48454h : iVar5, (i13 & 256) != 0 ? cVar.f48455i : instant2, (i13 & 512) != 0 ? cVar.f48456j : iVar6, (i13 & 1024) != 0 ? cVar.f48457k : bVar, (i13 & 2048) != 0 ? cVar.f48458l : iVar7, (i13 & 4096) != 0 ? cVar.unknownFields() : iVar8);
    }

    public final c a(i txid, i topic, Instant instant, i sender_id, int i11, i request_txid, int i12, i response_topic, Instant instant2, i payload, qt.b bVar, i message_id, i unknownFields) {
        s.g(txid, "txid");
        s.g(topic, "topic");
        s.g(sender_id, "sender_id");
        s.g(request_txid, "request_txid");
        s.g(response_topic, "response_topic");
        s.g(payload, "payload");
        s.g(message_id, "message_id");
        s.g(unknownFields, "unknownFields");
        return new c(txid, topic, instant, sender_id, i11, request_txid, i12, response_topic, instant2, payload, bVar, message_id, unknownFields);
    }

    public final int c() {
        return this.f48451e;
    }

    public final Instant d() {
        return this.f48449c;
    }

    public final Instant e() {
        return this.f48455i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f48447a, cVar.f48447a) && s.c(this.f48448b, cVar.f48448b) && s.c(this.f48449c, cVar.f48449c) && s.c(this.f48450d, cVar.f48450d) && this.f48451e == cVar.f48451e && s.c(this.f48452f, cVar.f48452f) && this.f48453g == cVar.f48453g && s.c(this.f48454h, cVar.f48454h) && s.c(this.f48455i, cVar.f48455i) && s.c(this.f48456j, cVar.f48456j) && s.c(this.f48457k, cVar.f48457k) && s.c(this.f48458l, cVar.f48458l);
        }
        return false;
    }

    public final i f() {
        return this.f48458l;
    }

    public final qt.b g() {
        return this.f48457k;
    }

    public final i h() {
        return this.f48456j;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((unknownFields().hashCode() * 37) + this.f48447a.hashCode()) * 37) + this.f48448b.hashCode()) * 37;
            Instant instant = this.f48449c;
            int hashCode2 = (((((((((((hashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.f48450d.hashCode()) * 37) + Integer.hashCode(this.f48451e)) * 37) + this.f48452f.hashCode()) * 37) + Integer.hashCode(this.f48453g)) * 37) + this.f48454h.hashCode()) * 37;
            Instant instant2 = this.f48455i;
            int hashCode3 = (((hashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.f48456j.hashCode()) * 37;
            qt.b bVar = this.f48457k;
            int hashCode4 = ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.f48458l.hashCode();
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    public final i i() {
        return this.f48452f;
    }

    public final i j() {
        return this.f48454h;
    }

    public final i k() {
        return this.f48450d;
    }

    public final int l() {
        return this.f48453g;
    }

    public final i m() {
        return this.f48448b;
    }

    public final i n() {
        return this.f48447a;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1094newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f48447a;
        arrayList.add("txid=" + iVar);
        i iVar2 = this.f48448b;
        arrayList.add("topic=" + iVar2);
        Instant instant = this.f48449c;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        i iVar3 = this.f48450d;
        arrayList.add("sender_id=" + iVar3);
        int i11 = this.f48451e;
        arrayList.add("command_type=" + i11);
        i iVar4 = this.f48452f;
        arrayList.add("request_txid=" + iVar4);
        int i12 = this.f48453g;
        arrayList.add("status_code=" + i12);
        i iVar5 = this.f48454h;
        arrayList.add("response_topic=" + iVar5);
        Instant instant2 = this.f48455i;
        if (instant2 != null) {
            arrayList.add("expiry=" + instant2);
        }
        i iVar6 = this.f48456j;
        arrayList.add("payload=" + iVar6);
        qt.b bVar = this.f48457k;
        if (bVar != null) {
            arrayList.add("options=" + bVar);
        }
        i iVar7 = this.f48458l;
        arrayList.add("message_id=" + iVar7);
        l02 = e0.l0(arrayList, ", ", "ProtoCommandMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1094newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i txid, i topic, Instant instant, i sender_id, int i11, i request_txid, int i12, i response_topic, Instant instant2, i payload, qt.b bVar, i message_id, i unknownFields) {
        super(f48446m, unknownFields);
        s.g(txid, "txid");
        s.g(topic, "topic");
        s.g(sender_id, "sender_id");
        s.g(request_txid, "request_txid");
        s.g(response_topic, "response_topic");
        s.g(payload, "payload");
        s.g(message_id, "message_id");
        s.g(unknownFields, "unknownFields");
        this.f48447a = txid;
        this.f48448b = topic;
        this.f48449c = instant;
        this.f48450d = sender_id;
        this.f48451e = i11;
        this.f48452f = request_txid;
        this.f48453g = i12;
        this.f48454h = response_topic;
        this.f48455i = instant2;
        this.f48456j = payload;
        this.f48457k = bVar;
        this.f48458l = message_id;
    }
}