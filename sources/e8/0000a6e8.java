package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class e extends com.squareup.wire.f {

    /* renamed from: j  reason: collision with root package name */
    public static final ProtoAdapter<e> f44018j;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f44019a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f44020b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f44021c;
    @q(adapter = "com.tesla.generated.commandcenter.CommandResult#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final f f44022d;
    @q(adapter = "com.tesla.generated.commandcenter.Transport#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final m f44023e;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f44024f;
    @q(adapter = "com.tesla.generated.commandcenter.HermesState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final h f44025g;
    @q(adapter = "com.tesla.generated.errors.GenericError_E#ADAPTER", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final pt.a f44026h;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final String f44027i;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            f fVar = f.RESULT_NONE;
            m mVar = m.TRANSPORT_NONE;
            h hVar = h.INITIAL_STATE;
            long d11 = reader.d();
            String str = "";
            String str2 = str;
            String str3 = str2;
            int i11 = 0;
            pt.a aVar = null;
            String str4 = null;
            h hVar2 = hVar;
            m mVar2 = mVar;
            while (true) {
                f fVar2 = fVar;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(str, str2, str3, fVar2, mVar2, i11, hVar2, aVar, str4, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            str = ProtoAdapter.STRING.decode(reader);
                        case 2:
                            str2 = ProtoAdapter.STRING.decode(reader);
                        case 3:
                            str3 = ProtoAdapter.STRING.decode(reader);
                        case 4:
                            try {
                                fVar = f.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                break;
                            }
                        case 5:
                            try {
                                mVar2 = m.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            }
                        case 6:
                            i11 = ProtoAdapter.INT32.decode(reader).intValue();
                        case 7:
                            try {
                                hVar2 = h.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                            }
                        case 8:
                            try {
                                aVar = pt.a.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                            }
                        case 9:
                            str4 = ProtoAdapter.STRING.decode(reader);
                        default:
                            reader.m(g11);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            if (!s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.f());
            }
            if (!s.c(value.g(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.g());
            }
            if (value.h() != f.RESULT_NONE) {
                f.ADAPTER.encodeWithTag(writer, 4, value.h());
            }
            if (value.k() != m.TRANSPORT_NONE) {
                m.ADAPTER.encodeWithTag(writer, 5, value.k());
            }
            if (value.j() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.j()));
            }
            if (value.d() != h.INITIAL_STATE) {
                h.ADAPTER.encodeWithTag(writer, 7, value.d());
            }
            pt.a.ADAPTER.encodeWithTag(writer, 8, value.e());
            ProtoAdapter.STRING.encodeWithTag(writer, 9, value.i());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.c());
            }
            if (!s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.f());
            }
            if (!s.c(value.g(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(3, value.g());
            }
            if (value.h() != f.RESULT_NONE) {
                z11 += f.ADAPTER.encodedSizeWithTag(4, value.h());
            }
            if (value.k() != m.TRANSPORT_NONE) {
                z11 += m.ADAPTER.encodedSizeWithTag(5, value.k());
            }
            if (value.j() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.j()));
            }
            if (value.d() != h.INITIAL_STATE) {
                z11 += h.ADAPTER.encodedSizeWithTag(7, value.d());
            }
            return z11 + pt.a.ADAPTER.encodedSizeWithTag(8, value.e()) + ProtoAdapter.STRING.encodedSizeWithTag(9, value.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            s.g(value, "value");
            return e.b(value, null, null, null, null, null, 0, null, null, null, okio.i.f42656d, 511, null);
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
        f44018j = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
    }

    public e() {
        this(null, null, null, null, null, 0, null, null, null, null, 1023, null);
    }

    public /* synthetic */ e(String str, String str2, String str3, f fVar, m mVar, int i11, h hVar, pt.a aVar, String str4, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) == 0 ? str3 : "", (i12 & 8) != 0 ? f.RESULT_NONE : fVar, (i12 & 16) != 0 ? m.TRANSPORT_NONE : mVar, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? h.INITIAL_STATE : hVar, (i12 & 128) != 0 ? null : aVar, (i12 & 256) == 0 ? str4 : null, (i12 & 512) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ e b(e eVar, String str, String str2, String str3, f fVar, m mVar, int i11, h hVar, pt.a aVar, String str4, okio.i iVar, int i12, Object obj) {
        return eVar.a((i12 & 1) != 0 ? eVar.f44019a : str, (i12 & 2) != 0 ? eVar.f44020b : str2, (i12 & 4) != 0 ? eVar.f44021c : str3, (i12 & 8) != 0 ? eVar.f44022d : fVar, (i12 & 16) != 0 ? eVar.f44023e : mVar, (i12 & 32) != 0 ? eVar.f44024f : i11, (i12 & 64) != 0 ? eVar.f44025g : hVar, (i12 & 128) != 0 ? eVar.f44026h : aVar, (i12 & 256) != 0 ? eVar.f44027i : str4, (i12 & 512) != 0 ? eVar.unknownFields() : iVar);
    }

    public final e a(String commandId, String requestId, String response, f result, m transport, int i11, h hermesState, pt.a aVar, String str, okio.i unknownFields) {
        s.g(commandId, "commandId");
        s.g(requestId, "requestId");
        s.g(response, "response");
        s.g(result, "result");
        s.g(transport, "transport");
        s.g(hermesState, "hermesState");
        s.g(unknownFields, "unknownFields");
        return new e(commandId, requestId, response, result, transport, i11, hermesState, aVar, str, unknownFields);
    }

    public final String c() {
        return this.f44019a;
    }

    public final h d() {
        return this.f44025g;
    }

    public final pt.a e() {
        return this.f44026h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(unknownFields(), eVar.unknownFields()) && s.c(this.f44019a, eVar.f44019a) && s.c(this.f44020b, eVar.f44020b) && s.c(this.f44021c, eVar.f44021c) && this.f44022d == eVar.f44022d && this.f44023e == eVar.f44023e && this.f44024f == eVar.f44024f && this.f44025g == eVar.f44025g && this.f44026h == eVar.f44026h && s.c(this.f44027i, eVar.f44027i);
        }
        return false;
    }

    public final String f() {
        return this.f44020b;
    }

    public final String g() {
        return this.f44021c;
    }

    public final f h() {
        return this.f44022d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.f44019a.hashCode()) * 37) + this.f44020b.hashCode()) * 37) + this.f44021c.hashCode()) * 37) + this.f44022d.hashCode()) * 37) + this.f44023e.hashCode()) * 37) + Integer.hashCode(this.f44024f)) * 37) + this.f44025g.hashCode()) * 37;
            pt.a aVar = this.f44026h;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            String str = this.f44027i;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    public final String i() {
        return this.f44027i;
    }

    public final int j() {
        return this.f44024f;
    }

    public final m k() {
        return this.f44023e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m960newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f44019a);
        arrayList.add("commandId=" + i11);
        String i12 = mr.d.i(this.f44020b);
        arrayList.add("requestId=" + i12);
        String i13 = mr.d.i(this.f44021c);
        arrayList.add("response=" + i13);
        f fVar = this.f44022d;
        arrayList.add("result=" + fVar);
        m mVar = this.f44023e;
        arrayList.add("transport=" + mVar);
        int i14 = this.f44024f;
        arrayList.add("statusCode=" + i14);
        h hVar = this.f44025g;
        arrayList.add("hermesState=" + hVar);
        pt.a aVar = this.f44026h;
        if (aVar != null) {
            arrayList.add("nominalError=" + aVar);
        }
        String str = this.f44027i;
        if (str != null) {
            String i15 = mr.d.i(str);
            arrayList.add("resultReason=" + i15);
        }
        l02 = e0.l0(arrayList, ", ", "CommandResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m960newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String commandId, String requestId, String response, f result, m transport, int i11, h hermesState, pt.a aVar, String str, okio.i unknownFields) {
        super(f44018j, unknownFields);
        s.g(commandId, "commandId");
        s.g(requestId, "requestId");
        s.g(response, "response");
        s.g(result, "result");
        s.g(transport, "transport");
        s.g(hermesState, "hermesState");
        s.g(unknownFields, "unknownFields");
        this.f44019a = commandId;
        this.f44020b = requestId;
        this.f44021c = response;
        this.f44022d = result;
        this.f44023e = transport;
        this.f44024f = i11;
        this.f44025g = hermesState;
        this.f44026h = aVar;
        this.f44027i = str;
        if (!(mr.d.c(aVar, str) <= 1)) {
            throw new IllegalArgumentException("At most one of nominalError, resultReason may be non-null".toString());
        }
    }
}