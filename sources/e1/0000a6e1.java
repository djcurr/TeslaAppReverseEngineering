package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import wz.e0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<c> f44007i;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f44008a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f44009b;
    @q(adapter = "com.tesla.generated.commandcenter.CommandRequestSource#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final d f44010c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: d  reason: collision with root package name */
    private final boolean f44011d;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: e  reason: collision with root package name */
    private final boolean f44012e;
    @q(adapter = "com.tesla.generated.commandcenter.CommandAction#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: f  reason: collision with root package name */
    private final ot.b f44013f;
    @q(adapter = "com.tesla.generated.commandcenter.Transport#ADAPTER", label = q.a.REPEATED, tag = 3)

    /* renamed from: g  reason: collision with root package name */
    private final List<m> f44014g;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f44015h;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {

        /* renamed from: a  reason: collision with root package name */
        private final vz.k f44016a;

        /* renamed from: ot.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0876a extends u implements h00.a<ProtoAdapter<Map<String, ? extends String>>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0876a f44017a = new C0876a();

            C0876a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final ProtoAdapter<Map<String, String>> invoke() {
                ProtoAdapter.a aVar = ProtoAdapter.Companion;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return aVar.e(protoAdapter, protoAdapter);
            }
        }

        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandRequest", oVar, (Object) null);
            vz.k a11;
            a11 = vz.m.a(C0876a.f44017a);
            this.f44016a = a11;
        }

        private final ProtoAdapter<Map<String, String>> d() {
            return (ProtoAdapter) this.f44016a.getValue();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            d dVar = d.SOURCE_NONE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long d11 = reader.d();
            String str = "";
            boolean z11 = false;
            boolean z12 = false;
            ot.b bVar = null;
            d dVar2 = dVar;
            String str2 = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(str, str2, arrayList, dVar2, linkedHashMap, z11, z12, bVar, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        str = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        try {
                            arrayList.add(m.ADAPTER.decode(reader));
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            b0 b0Var = b0.f54756a;
                            break;
                        }
                    case 4:
                        try {
                            dVar2 = d.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            break;
                        }
                    case 5:
                        linkedHashMap.putAll(d().decode(reader));
                        break;
                    case 6:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 7:
                        z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 8:
                        bVar = ot.b.f43998i.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.e());
            }
            if (!s.c(value.j(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.j());
            }
            m.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.i());
            if (value.h() != d.SOURCE_NONE) {
                d.ADAPTER.encodeWithTag(writer, 4, value.h());
            }
            d().encodeWithTag(writer, 5, value.g());
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.f()));
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.d()));
            }
            if (value.c() != null) {
                ot.b.f43998i.encodeWithTag(writer, 8, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.e());
            }
            if (!s.c(value.j(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.j());
            }
            int encodedSizeWithTag = z11 + m.ADAPTER.asRepeated().encodedSizeWithTag(3, value.i());
            if (value.h() != d.SOURCE_NONE) {
                encodedSizeWithTag += d.ADAPTER.encodedSizeWithTag(4, value.h());
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + d().encodedSizeWithTag(5, value.g());
            if (value.f()) {
                encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.f()));
            }
            if (value.d()) {
                encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.d()));
            }
            return value.c() != null ? encodedSizeWithTag2 + ot.b.f43998i.encodedSizeWithTag(8, value.c()) : encodedSizeWithTag2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: e */
        public c redact(c value) {
            s.g(value, "value");
            ot.b c11 = value.c();
            return c.b(value, null, null, null, null, null, false, false, c11 == null ? null : ot.b.f43998i.redact(c11), okio.i.f42656d, 127, null);
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
        f44007i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, null, null, null, false, false, null, null, 511, null);
    }

    public /* synthetic */ c(String str, String str2, List list, d dVar, Map map, boolean z11, boolean z12, ot.b bVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? w.i() : list, (i11 & 8) != 0 ? d.SOURCE_NONE : dVar, (i11 & 16) != 0 ? s0.i() : map, (i11 & 32) != 0 ? false : z11, (i11 & 64) == 0 ? z12 : false, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c b(c cVar, String str, String str2, List list, d dVar, Map map, boolean z11, boolean z12, ot.b bVar, okio.i iVar, int i11, Object obj) {
        return cVar.a((i11 & 1) != 0 ? cVar.f44008a : str, (i11 & 2) != 0 ? cVar.f44009b : str2, (i11 & 4) != 0 ? cVar.f44014g : list, (i11 & 8) != 0 ? cVar.f44010c : dVar, (i11 & 16) != 0 ? cVar.f44015h : map, (i11 & 32) != 0 ? cVar.f44011d : z11, (i11 & 64) != 0 ? cVar.f44012e : z12, (i11 & 128) != 0 ? cVar.f44013f : bVar, (i11 & 256) != 0 ? cVar.unknownFields() : iVar);
    }

    public final c a(String id2, String vehicleId, List<? extends m> transports, d source, Map<String, String> oapiHeaders, boolean z11, boolean z12, ot.b bVar, okio.i unknownFields) {
        s.g(id2, "id");
        s.g(vehicleId, "vehicleId");
        s.g(transports, "transports");
        s.g(source, "source");
        s.g(oapiHeaders, "oapiHeaders");
        s.g(unknownFields, "unknownFields");
        return new c(id2, vehicleId, transports, source, oapiHeaders, z11, z12, bVar, unknownFields);
    }

    public final ot.b c() {
        return this.f44013f;
    }

    public final boolean d() {
        return this.f44012e;
    }

    public final String e() {
        return this.f44008a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f44008a, cVar.f44008a) && s.c(this.f44009b, cVar.f44009b) && s.c(this.f44014g, cVar.f44014g) && this.f44010c == cVar.f44010c && s.c(this.f44015h, cVar.f44015h) && this.f44011d == cVar.f44011d && this.f44012e == cVar.f44012e && s.c(this.f44013f, cVar.f44013f);
        }
        return false;
    }

    public final boolean f() {
        return this.f44011d;
    }

    public final Map<String, String> g() {
        return this.f44015h;
    }

    public final d h() {
        return this.f44010c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.f44008a.hashCode()) * 37) + this.f44009b.hashCode()) * 37) + this.f44014g.hashCode()) * 37) + this.f44010c.hashCode()) * 37) + this.f44015h.hashCode()) * 37) + Boolean.hashCode(this.f44011d)) * 37) + Boolean.hashCode(this.f44012e)) * 37;
            ot.b bVar = this.f44013f;
            int hashCode2 = hashCode + (bVar != null ? bVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final List<m> i() {
        return this.f44014g;
    }

    public final String j() {
        return this.f44009b;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m959newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f44008a);
        arrayList.add("id=" + i11);
        String i12 = mr.d.i(this.f44009b);
        arrayList.add("vehicleId=" + i12);
        if (!this.f44014g.isEmpty()) {
            List<m> list = this.f44014g;
            arrayList.add("transports=" + list);
        }
        d dVar = this.f44010c;
        arrayList.add("source=" + dVar);
        if (!this.f44015h.isEmpty()) {
            Map<String, String> map = this.f44015h;
            arrayList.add("oapiHeaders=" + map);
        }
        boolean z11 = this.f44011d;
        arrayList.add("letSleep=" + z11);
        boolean z12 = this.f44012e;
        arrayList.add("bypassCounter=" + z12);
        ot.b bVar = this.f44013f;
        if (bVar != null) {
            arrayList.add("action=" + bVar);
        }
        l02 = e0.l0(arrayList, ", ", "CommandRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m959newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String id2, String vehicleId, List<? extends m> transports, d source, Map<String, String> oapiHeaders, boolean z11, boolean z12, ot.b bVar, okio.i unknownFields) {
        super(f44007i, unknownFields);
        s.g(id2, "id");
        s.g(vehicleId, "vehicleId");
        s.g(transports, "transports");
        s.g(source, "source");
        s.g(oapiHeaders, "oapiHeaders");
        s.g(unknownFields, "unknownFields");
        this.f44008a = id2;
        this.f44009b = vehicleId;
        this.f44010c = source;
        this.f44011d = z11;
        this.f44012e = z12;
        this.f44013f = bVar;
        this.f44014g = mr.d.g("transports", transports);
        this.f44015h = mr.d.h("oapiHeaders", oapiHeaders);
    }
}