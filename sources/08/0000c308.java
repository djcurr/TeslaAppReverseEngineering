package yt;

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
import xt.j;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: k  reason: collision with root package name */
    public static final ProtoAdapter<f> f59754k;
    @q(adapter = "com.tesla.generated.universalmessage.Destination#ADAPTER", jsonName = "toDestination", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: a  reason: collision with root package name */
    private final yt.a f59755a;
    @q(adapter = "com.tesla.generated.universalmessage.Destination#ADAPTER", jsonName = "fromDestination", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: b  reason: collision with root package name */
    private final yt.a f59756b;
    @q(adapter = "com.tesla.generated.universalmessage.MessageStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: c  reason: collision with root package name */
    private final d f59757c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "requestUuid", label = q.a.OMIT_IDENTITY, tag = 50)

    /* renamed from: d  reason: collision with root package name */
    private final i f59758d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 51)

    /* renamed from: e  reason: collision with root package name */
    private final i f59759e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 52)

    /* renamed from: f  reason: collision with root package name */
    private final int f59760f;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "protobufMessageAsBytes", tag = 10)

    /* renamed from: g  reason: collision with root package name */
    private final i f59761g;
    @q(adapter = "com.tesla.generated.universalmessage.SessionInfoRequest#ADAPTER", jsonName = "sessionInfoRequest", tag = 14)

    /* renamed from: h  reason: collision with root package name */
    private final g f59762h;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "sessionInfo", tag = 15)

    /* renamed from: i  reason: collision with root package name */
    private final i f59763i;
    @q(adapter = "com.tesla.generated.signatures.SignatureData#ADAPTER", jsonName = "signatureData", tag = 13)

    /* renamed from: j  reason: collision with root package name */
    private final j f59764j;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.RoutableMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            long d11 = reader.d();
            yt.a aVar = null;
            d dVar = null;
            i iVar2 = null;
            g gVar = null;
            i iVar3 = null;
            j jVar = null;
            int i11 = 0;
            i iVar4 = iVar;
            yt.a aVar2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(aVar2, aVar, dVar, iVar, iVar4, i11, iVar2, gVar, iVar3, jVar, reader.e(d11));
                } else if (g11 == 6) {
                    aVar2 = yt.a.f59748c.decode(reader);
                } else if (g11 == 7) {
                    aVar = yt.a.f59748c.decode(reader);
                } else if (g11 != 10) {
                    switch (g11) {
                        case 12:
                            dVar = d.f59751c.decode(reader);
                            continue;
                        case 13:
                            jVar = j.f57720g.decode(reader);
                            continue;
                        case 14:
                            gVar = g.f59765c.decode(reader);
                            continue;
                        case 15:
                            iVar3 = ProtoAdapter.BYTES.decode(reader);
                            continue;
                        default:
                            switch (g11) {
                                case 50:
                                    iVar = ProtoAdapter.BYTES.decode(reader);
                                    continue;
                                case 51:
                                    iVar4 = ProtoAdapter.BYTES.decode(reader);
                                    continue;
                                case 52:
                                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                                    continue;
                                    continue;
                                default:
                                    reader.m(g11);
                                    continue;
                            }
                    }
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, f value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.k() != null) {
                yt.a.f59748c.encodeWithTag(writer, 6, value.k());
            }
            if (value.d() != null) {
                yt.a.f59748c.encodeWithTag(writer, 7, value.d());
            }
            if (value.j() != null) {
                d.f59751c.encodeWithTag(writer, 12, value.j());
            }
            i f11 = value.f();
            i iVar = i.f42656d;
            if (!s.c(f11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 50, value.f());
            }
            if (!s.c(value.l(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 51, value.l());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 52, Integer.valueOf(value.c()));
            }
            ProtoAdapter<i> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(writer, 10, value.e());
            g.f59765c.encodeWithTag(writer, 14, value.h());
            protoAdapter.encodeWithTag(writer, 15, value.g());
            j.f57720g.encodeWithTag(writer, 13, value.i());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.k() != null) {
                z11 += yt.a.f59748c.encodedSizeWithTag(6, value.k());
            }
            if (value.d() != null) {
                z11 += yt.a.f59748c.encodedSizeWithTag(7, value.d());
            }
            if (value.j() != null) {
                z11 += d.f59751c.encodedSizeWithTag(12, value.j());
            }
            i f11 = value.f();
            i iVar = i.f42656d;
            if (!s.c(f11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(50, value.f());
            }
            if (!s.c(value.l(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(51, value.l());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(52, Integer.valueOf(value.c()));
            }
            ProtoAdapter<i> protoAdapter = ProtoAdapter.BYTES;
            return z11 + protoAdapter.encodedSizeWithTag(10, value.e()) + g.f59765c.encodedSizeWithTag(14, value.h()) + protoAdapter.encodedSizeWithTag(15, value.g()) + j.f57720g.encodedSizeWithTag(13, value.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            s.g(value, "value");
            yt.a k11 = value.k();
            yt.a redact = k11 == null ? null : yt.a.f59748c.redact(k11);
            yt.a d11 = value.d();
            yt.a redact2 = d11 == null ? null : yt.a.f59748c.redact(d11);
            d j11 = value.j();
            d redact3 = j11 == null ? null : d.f59751c.redact(j11);
            g h11 = value.h();
            g redact4 = h11 == null ? null : g.f59765c.redact(h11);
            j i11 = value.i();
            return f.b(value, redact, redact2, redact3, null, null, 0, null, redact4, null, i11 != null ? j.f57720g.redact(i11) : null, i.f42656d, 376, null);
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
        f59754k = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, null, null, null, null, 0, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ f(yt.a aVar, yt.a aVar2, d dVar, i iVar, i iVar2, int i11, i iVar3, g gVar, i iVar4, j jVar, i iVar5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? null : aVar2, (i12 & 4) != 0 ? null : dVar, (i12 & 8) != 0 ? i.f42656d : iVar, (i12 & 16) != 0 ? i.f42656d : iVar2, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : iVar3, (i12 & 128) != 0 ? null : gVar, (i12 & 256) != 0 ? null : iVar4, (i12 & 512) == 0 ? jVar : null, (i12 & 1024) != 0 ? i.f42656d : iVar5);
    }

    public static /* synthetic */ f b(f fVar, yt.a aVar, yt.a aVar2, d dVar, i iVar, i iVar2, int i11, i iVar3, g gVar, i iVar4, j jVar, i iVar5, int i12, Object obj) {
        return fVar.a((i12 & 1) != 0 ? fVar.f59755a : aVar, (i12 & 2) != 0 ? fVar.f59756b : aVar2, (i12 & 4) != 0 ? fVar.f59757c : dVar, (i12 & 8) != 0 ? fVar.f59758d : iVar, (i12 & 16) != 0 ? fVar.f59759e : iVar2, (i12 & 32) != 0 ? fVar.f59760f : i11, (i12 & 64) != 0 ? fVar.f59761g : iVar3, (i12 & 128) != 0 ? fVar.f59762h : gVar, (i12 & 256) != 0 ? fVar.f59763i : iVar4, (i12 & 512) != 0 ? fVar.f59764j : jVar, (i12 & 1024) != 0 ? fVar.unknownFields() : iVar5);
    }

    public final f a(yt.a aVar, yt.a aVar2, d dVar, i request_uuid, i uuid, int i11, i iVar, g gVar, i iVar2, j jVar, i unknownFields) {
        s.g(request_uuid, "request_uuid");
        s.g(uuid, "uuid");
        s.g(unknownFields, "unknownFields");
        return new f(aVar, aVar2, dVar, request_uuid, uuid, i11, iVar, gVar, iVar2, jVar, unknownFields);
    }

    public final int c() {
        return this.f59760f;
    }

    public final yt.a d() {
        return this.f59756b;
    }

    public final i e() {
        return this.f59761g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && s.c(this.f59755a, fVar.f59755a) && s.c(this.f59756b, fVar.f59756b) && s.c(this.f59757c, fVar.f59757c) && s.c(this.f59758d, fVar.f59758d) && s.c(this.f59759e, fVar.f59759e) && this.f59760f == fVar.f59760f && s.c(this.f59761g, fVar.f59761g) && s.c(this.f59762h, fVar.f59762h) && s.c(this.f59763i, fVar.f59763i) && s.c(this.f59764j, fVar.f59764j);
        }
        return false;
    }

    public final i f() {
        return this.f59758d;
    }

    public final i g() {
        return this.f59763i;
    }

    public final g h() {
        return this.f59762h;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            yt.a aVar = this.f59755a;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            yt.a aVar2 = this.f59756b;
            int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 37;
            d dVar = this.f59757c;
            int hashCode4 = (((((((hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.f59758d.hashCode()) * 37) + this.f59759e.hashCode()) * 37) + Integer.hashCode(this.f59760f)) * 37;
            i iVar = this.f59761g;
            int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            g gVar = this.f59762h;
            int hashCode6 = (hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            i iVar2 = this.f59763i;
            int hashCode7 = (hashCode6 + (iVar2 != null ? iVar2.hashCode() : 0)) * 37;
            j jVar = this.f59764j;
            int hashCode8 = hashCode7 + (jVar != null ? jVar.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }
        return i11;
    }

    public final j i() {
        return this.f59764j;
    }

    public final d j() {
        return this.f59757c;
    }

    public final yt.a k() {
        return this.f59755a;
    }

    public final i l() {
        return this.f59759e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1137newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        yt.a aVar = this.f59755a;
        if (aVar != null) {
            arrayList.add("to_destination=" + aVar);
        }
        yt.a aVar2 = this.f59756b;
        if (aVar2 != null) {
            arrayList.add("from_destination=" + aVar2);
        }
        d dVar = this.f59757c;
        if (dVar != null) {
            arrayList.add("signedMessageStatus=" + dVar);
        }
        i iVar = this.f59758d;
        arrayList.add("request_uuid=" + iVar);
        i iVar2 = this.f59759e;
        arrayList.add("uuid=" + iVar2);
        int i11 = this.f59760f;
        arrayList.add("flags=" + i11);
        i iVar3 = this.f59761g;
        if (iVar3 != null) {
            arrayList.add("protobuf_message_as_bytes=" + iVar3);
        }
        g gVar = this.f59762h;
        if (gVar != null) {
            arrayList.add("session_info_request=" + gVar);
        }
        i iVar4 = this.f59763i;
        if (iVar4 != null) {
            arrayList.add("session_info=" + iVar4);
        }
        j jVar = this.f59764j;
        if (jVar != null) {
            arrayList.add("signature_data=" + jVar);
        }
        l02 = e0.l0(arrayList, ", ", "RoutableMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1137newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yt.a aVar, yt.a aVar2, d dVar, i request_uuid, i uuid, int i11, i iVar, g gVar, i iVar2, j jVar, i unknownFields) {
        super(f59754k, unknownFields);
        s.g(request_uuid, "request_uuid");
        s.g(uuid, "uuid");
        s.g(unknownFields, "unknownFields");
        this.f59755a = aVar;
        this.f59756b = aVar2;
        this.f59757c = dVar;
        this.f59758d = request_uuid;
        this.f59759e = uuid;
        this.f59760f = i11;
        this.f59761g = iVar;
        this.f59762h = gVar;
        this.f59763i = iVar2;
        this.f59764j = jVar;
        if (!(mr.d.d(iVar, gVar, iVar2) <= 1)) {
            throw new IllegalArgumentException("At most one of protobuf_message_as_bytes, session_info_request, session_info may be non-null".toString());
        }
    }
}