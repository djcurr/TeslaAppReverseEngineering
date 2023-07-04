package ot;

import bu.b1;
import bu.b4;
import bu.d0;
import bu.g2;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import lt.j2;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<b> f43998i;
    @q(adapter = "com.tesla.generated.carserver.server.VehicleAction#ADAPTER", tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final j2 f43999a;
    @q(adapter = "com.tesla.generated.vcsec.RKEAction_E#ADAPTER", tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final g2 f44000b;
    @q(adapter = "com.tesla.generated.vcsec.ClosureMoveRequest#ADAPTER", tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final d0 f44001c;
    @q(adapter = "com.tesla.generated.commandcenter.SharedHMACWhitelistOperation#ADAPTER", tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final l f44002d;
    @q(adapter = "com.tesla.generated.vcsec.InformationRequest#ADAPTER", tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final b1 f44003e;
    @q(adapter = "com.tesla.generated.commandcenter.SessionInfoRequest#ADAPTER", declaredName = "SessionInfoRequest", tag = 7)

    /* renamed from: f  reason: collision with root package name */
    private final k f44004f;
    @q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", tag = 8)

    /* renamed from: g  reason: collision with root package name */
    private final b4 f44005g;
    @q(adapter = "com.tesla.generated.commandcenter.ProxyCommand#ADAPTER", tag = 9)

    /* renamed from: h  reason: collision with root package name */
    private final i f44006h;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            j2 j2Var = null;
            g2 g2Var = null;
            d0 d0Var = null;
            l lVar = null;
            b1 b1Var = null;
            k kVar = null;
            b4 b4Var = null;
            i iVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(j2Var, g2Var, d0Var, lVar, b1Var, kVar, b4Var, iVar, reader.e(d11));
                }
                switch (g11) {
                    case 2:
                        j2Var = j2.H3.decode(reader);
                        break;
                    case 3:
                        try {
                            g2Var = g2.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 4:
                        d0Var = d0.f7968h.decode(reader);
                        break;
                    case 5:
                        lVar = l.f44040c.decode(reader);
                        break;
                    case 6:
                        b1Var = b1.f7936e.decode(reader);
                        break;
                    case 7:
                        kVar = k.f44038b.decode(reader);
                        break;
                    case 8:
                        b4Var = b4.f7947l.decode(reader);
                        break;
                    case 9:
                        iVar = i.f44028e.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            j2.H3.encodeWithTag(writer, 2, value.c());
            g2.ADAPTER.encodeWithTag(writer, 3, value.g());
            d0.f7968h.encodeWithTag(writer, 4, value.d());
            l.f44040c.encodeWithTag(writer, 5, value.h());
            b1.f7936e.encodeWithTag(writer, 6, value.e());
            k.f44038b.encodeWithTag(writer, 7, value.i());
            b4.f7947l.encodeWithTag(writer, 8, value.j());
            i.f44028e.encodeWithTag(writer, 9, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            return value.unknownFields().z() + j2.H3.encodedSizeWithTag(2, value.c()) + g2.ADAPTER.encodedSizeWithTag(3, value.g()) + d0.f7968h.encodedSizeWithTag(4, value.d()) + l.f44040c.encodedSizeWithTag(5, value.h()) + b1.f7936e.encodedSizeWithTag(6, value.e()) + k.f44038b.encodedSizeWithTag(7, value.i()) + b4.f7947l.encodedSizeWithTag(8, value.j()) + i.f44028e.encodedSizeWithTag(9, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            j2 c11 = value.c();
            j2 redact = c11 == null ? null : j2.H3.redact(c11);
            d0 d11 = value.d();
            d0 redact2 = d11 == null ? null : d0.f7968h.redact(d11);
            l h11 = value.h();
            l redact3 = h11 == null ? null : l.f44040c.redact(h11);
            b1 e11 = value.e();
            b1 redact4 = e11 == null ? null : b1.f7936e.redact(e11);
            k i11 = value.i();
            k redact5 = i11 == null ? null : k.f44038b.redact(i11);
            b4 j11 = value.j();
            b4 redact6 = j11 == null ? null : b4.f7947l.redact(j11);
            i f11 = value.f();
            return b.b(value, redact, null, redact2, redact3, redact4, redact5, redact6, f11 != null ? i.f44028e.redact(f11) : null, okio.i.f42656d, 2, null);
        }
    }

    /* renamed from: ot.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0875b {
        private C0875b() {
        }

        public /* synthetic */ C0875b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0875b(null);
        f43998i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ b(j2 j2Var, g2 g2Var, d0 d0Var, l lVar, b1 b1Var, k kVar, b4 b4Var, i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : j2Var, (i11 & 2) != 0 ? null : g2Var, (i11 & 4) != 0 ? null : d0Var, (i11 & 8) != 0 ? null : lVar, (i11 & 16) != 0 ? null : b1Var, (i11 & 32) != 0 ? null : kVar, (i11 & 64) != 0 ? null : b4Var, (i11 & 128) == 0 ? iVar : null, (i11 & 256) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ b b(b bVar, j2 j2Var, g2 g2Var, d0 d0Var, l lVar, b1 b1Var, k kVar, b4 b4Var, i iVar, okio.i iVar2, int i11, Object obj) {
        return bVar.a((i11 & 1) != 0 ? bVar.f43999a : j2Var, (i11 & 2) != 0 ? bVar.f44000b : g2Var, (i11 & 4) != 0 ? bVar.f44001c : d0Var, (i11 & 8) != 0 ? bVar.f44002d : lVar, (i11 & 16) != 0 ? bVar.f44003e : b1Var, (i11 & 32) != 0 ? bVar.f44004f : kVar, (i11 & 64) != 0 ? bVar.f44005g : b4Var, (i11 & 128) != 0 ? bVar.f44006h : iVar, (i11 & 256) != 0 ? bVar.unknownFields() : iVar2);
    }

    public final b a(j2 j2Var, g2 g2Var, d0 d0Var, l lVar, b1 b1Var, k kVar, b4 b4Var, i iVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(j2Var, g2Var, d0Var, lVar, b1Var, kVar, b4Var, iVar, unknownFields);
    }

    public final j2 c() {
        return this.f43999a;
    }

    public final d0 d() {
        return this.f44001c;
    }

    public final b1 e() {
        return this.f44003e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f43999a, bVar.f43999a) && this.f44000b == bVar.f44000b && s.c(this.f44001c, bVar.f44001c) && s.c(this.f44002d, bVar.f44002d) && s.c(this.f44003e, bVar.f44003e) && s.c(this.f44004f, bVar.f44004f) && s.c(this.f44005g, bVar.f44005g) && s.c(this.f44006h, bVar.f44006h);
        }
        return false;
    }

    public final i f() {
        return this.f44006h;
    }

    public final g2 g() {
        return this.f44000b;
    }

    public final l h() {
        return this.f44002d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            j2 j2Var = this.f43999a;
            int hashCode2 = (hashCode + (j2Var != null ? j2Var.hashCode() : 0)) * 37;
            g2 g2Var = this.f44000b;
            int hashCode3 = (hashCode2 + (g2Var != null ? g2Var.hashCode() : 0)) * 37;
            d0 d0Var = this.f44001c;
            int hashCode4 = (hashCode3 + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
            l lVar = this.f44002d;
            int hashCode5 = (hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 37;
            b1 b1Var = this.f44003e;
            int hashCode6 = (hashCode5 + (b1Var != null ? b1Var.hashCode() : 0)) * 37;
            k kVar = this.f44004f;
            int hashCode7 = (hashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 37;
            b4 b4Var = this.f44005g;
            int hashCode8 = (hashCode7 + (b4Var != null ? b4Var.hashCode() : 0)) * 37;
            i iVar = this.f44006h;
            int hashCode9 = hashCode8 + (iVar != null ? iVar.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final k i() {
        return this.f44004f;
    }

    public final b4 j() {
        return this.f44005g;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m958newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        j2 j2Var = this.f43999a;
        if (j2Var != null) {
            arrayList.add("carServerAction=" + j2Var);
        }
        g2 g2Var = this.f44000b;
        if (g2Var != null) {
            arrayList.add("rkeAction=" + g2Var);
        }
        d0 d0Var = this.f44001c;
        if (d0Var != null) {
            arrayList.add("closureAction=" + d0Var);
        }
        l lVar = this.f44002d;
        if (lVar != null) {
            arrayList.add("sharedHmacWhitelistOperation=" + lVar);
        }
        b1 b1Var = this.f44003e;
        if (b1Var != null) {
            arrayList.add("informationRequest=" + b1Var);
        }
        k kVar = this.f44004f;
        if (kVar != null) {
            arrayList.add("tesla_proto_SessionInfoRequest=" + kVar);
        }
        b4 b4Var = this.f44005g;
        if (b4Var != null) {
            arrayList.add("whitelistOperation=" + b4Var);
        }
        i iVar = this.f44006h;
        if (iVar != null) {
            arrayList.add("proxyCommand=" + iVar);
        }
        l02 = e0.l0(arrayList, ", ", "CommandAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m958newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j2 j2Var, g2 g2Var, d0 d0Var, l lVar, b1 b1Var, k kVar, b4 b4Var, i iVar, okio.i unknownFields) {
        super(f43998i, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f43999a = j2Var;
        this.f44000b = g2Var;
        this.f44001c = d0Var;
        this.f44002d = lVar;
        this.f44003e = b1Var;
        this.f44004f = kVar;
        this.f44005g = b4Var;
        this.f44006h = iVar;
        if (!(mr.d.e(j2Var, g2Var, d0Var, lVar, b1Var, kVar, b4Var, iVar) <= 1)) {
            throw new IllegalArgumentException("At most one of carServerAction, rkeAction, closureAction, sharedHmacWhitelistOperation, informationRequest, tesla_proto_SessionInfoRequest, whitelistOperation, proxyCommand may be non-null".toString());
        }
    }
}