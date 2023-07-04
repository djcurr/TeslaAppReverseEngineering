package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class w2 extends com.squareup.wire.f {

    /* renamed from: n */
    public static final ProtoAdapter<w2> f37685n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings#ADAPTER", jsonName = "guiSettings", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a */
    private final mt.n f37686a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState#ADAPTER", jsonName = "chargeState", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b */
    private final mt.j f37687b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState#ADAPTER", jsonName = "climateState", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c */
    private final mt.k f37688c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DriveState#ADAPTER", jsonName = "driveState", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d */
    private final mt.m f37689d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState#ADAPTER", jsonName = "vehicleState", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e */
    private final mt.v f37690e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig#ADAPTER", jsonName = "vehicleConfig", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: f */
    private final mt.u f37691f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LocationState#ADAPTER", jsonName = "locationState", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: g */
    private final mt.o f37692g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState#ADAPTER", jsonName = "closuresState", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: h */
    private final mt.l f37693h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "protoJsonVersion", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: i */
    private final int f37694i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uploadReason", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: j */
    private final String f37695j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsOptionalFields", label = q.a.OMIT_IDENTITY, tag = 999)

    /* renamed from: k */
    private final boolean f37696k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.EncryptedData#ADAPTER", jsonName = "encryptedData", label = q.a.REPEATED, tag = 11)

    /* renamed from: l */
    private final List<t> f37697l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", label = q.a.REPEATED, tag = 900)

    /* renamed from: m */
    private final List<n1> f37698m;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w2> {
        a(com.squareup.wire.b bVar, n00.d<w2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w2 decode(com.squareup.wire.k reader) {
            ArrayList arrayList;
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            long d11 = reader.d();
            mt.n nVar = null;
            int i11 = 0;
            boolean z11 = false;
            mt.j jVar = null;
            mt.m mVar = null;
            mt.v vVar = null;
            mt.u uVar = null;
            mt.o oVar = null;
            mt.l lVar = null;
            String str = "";
            mt.k kVar = null;
            while (true) {
                int g11 = reader.g();
                ArrayList arrayList4 = arrayList3;
                if (g11 == -1) {
                    return new w2(nVar, jVar, kVar, mVar, vVar, uVar, oVar, lVar, i11, arrayList2, str, arrayList4, z11, reader.e(d11));
                }
                if (g11 != 900) {
                    if (g11 != 999) {
                        switch (g11) {
                            case 2:
                                nVar = mt.n.f39177l.decode(reader);
                                break;
                            case 3:
                                jVar = mt.j.f38966d4.decode(reader);
                                break;
                            case 4:
                                kVar = mt.k.S3.decode(reader);
                                break;
                            case 5:
                                mVar = mt.m.f39158w.decode(reader);
                                break;
                            case 6:
                                vVar = mt.v.U3.decode(reader);
                                break;
                            case 7:
                                uVar = mt.u.f39282e4.decode(reader);
                                break;
                            case 8:
                                oVar = mt.o.A.decode(reader);
                                break;
                            case 9:
                                lVar = mt.l.f39108p1.decode(reader);
                                break;
                            case 10:
                                i11 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 11:
                                arrayList2.add(t.f37611d.decode(reader));
                                break;
                            case 12:
                                str = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.m(g11);
                                break;
                        }
                    } else {
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = arrayList4;
                    arrayList.add(n1.f37534d.decode(reader));
                }
                arrayList3 = arrayList;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.h() != null) {
                mt.n.f39177l.encodeWithTag(writer, 2, value.h());
            }
            if (value.c() != null) {
                mt.j.f38966d4.encodeWithTag(writer, 3, value.c());
            }
            if (value.d() != null) {
                mt.k.S3.encodeWithTag(writer, 4, value.d());
            }
            if (value.f() != null) {
                mt.m.f39158w.encodeWithTag(writer, 5, value.f());
            }
            if (value.o() != null) {
                mt.v.U3.encodeWithTag(writer, 6, value.o());
            }
            if (value.n() != null) {
                mt.u.f39282e4.encodeWithTag(writer, 7, value.n());
            }
            if (value.i() != null) {
                mt.o.A.encodeWithTag(writer, 8, value.i());
            }
            if (value.e() != null) {
                mt.l.f39108p1.encodeWithTag(writer, 9, value.e());
            }
            if (value.k() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 10, Integer.valueOf(value.k()));
            }
            t.f37611d.asRepeated().encodeWithTag(writer, 11, value.g());
            if (!kotlin.jvm.internal.s.c(value.m(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 12, value.m());
            }
            n1.f37534d.asRepeated().encodeWithTag(writer, 900, value.j());
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 999, Boolean.valueOf(value.l()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.h() != null) {
                z11 += mt.n.f39177l.encodedSizeWithTag(2, value.h());
            }
            if (value.c() != null) {
                z11 += mt.j.f38966d4.encodedSizeWithTag(3, value.c());
            }
            if (value.d() != null) {
                z11 += mt.k.S3.encodedSizeWithTag(4, value.d());
            }
            if (value.f() != null) {
                z11 += mt.m.f39158w.encodedSizeWithTag(5, value.f());
            }
            if (value.o() != null) {
                z11 += mt.v.U3.encodedSizeWithTag(6, value.o());
            }
            if (value.n() != null) {
                z11 += mt.u.f39282e4.encodedSizeWithTag(7, value.n());
            }
            if (value.i() != null) {
                z11 += mt.o.A.encodedSizeWithTag(8, value.i());
            }
            if (value.e() != null) {
                z11 += mt.l.f39108p1.encodedSizeWithTag(9, value.e());
            }
            if (value.k() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.k()));
            }
            int encodedSizeWithTag = z11 + t.f37611d.asRepeated().encodedSizeWithTag(11, value.g());
            if (!kotlin.jvm.internal.s.c(value.m(), "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(12, value.m());
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + n1.f37534d.asRepeated().encodedSizeWithTag(900, value.j());
            return value.l() ? encodedSizeWithTag2 + ProtoAdapter.BOOL.encodedSizeWithTag(999, Boolean.valueOf(value.l())) : encodedSizeWithTag2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w2 redact(w2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            mt.n h11 = value.h();
            mt.n redact = h11 == null ? null : mt.n.f39177l.redact(h11);
            mt.j c11 = value.c();
            mt.j redact2 = c11 == null ? null : mt.j.f38966d4.redact(c11);
            mt.k d11 = value.d();
            mt.k redact3 = d11 == null ? null : mt.k.S3.redact(d11);
            mt.m f11 = value.f();
            mt.m redact4 = f11 == null ? null : mt.m.f39158w.redact(f11);
            mt.v o11 = value.o();
            mt.v redact5 = o11 == null ? null : mt.v.U3.redact(o11);
            mt.u n11 = value.n();
            mt.u redact6 = n11 == null ? null : mt.u.f39282e4.redact(n11);
            mt.o i11 = value.i();
            mt.o redact7 = i11 == null ? null : mt.o.A.redact(i11);
            mt.l e11 = value.e();
            return w2.b(value, redact, redact2, redact3, redact4, redact5, redact6, redact7, e11 != null ? mt.l.f39108p1.redact(e11) : null, 0, mr.d.a(value.g(), t.f37611d), null, mr.d.a(value.j(), n1.f37534d), false, okio.i.f42656d, 5376, null);
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
        f37685n = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w2.class), com.squareup.wire.o.PROTO_3);
    }

    public w2() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, false, null, 16383, null);
    }

    public /* synthetic */ w2(mt.n nVar, mt.j jVar, mt.k kVar, mt.m mVar, mt.v vVar, mt.u uVar, mt.o oVar, mt.l lVar, int i11, List list, String str, List list2, boolean z11, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : nVar, (i12 & 2) != 0 ? null : jVar, (i12 & 4) != 0 ? null : kVar, (i12 & 8) != 0 ? null : mVar, (i12 & 16) != 0 ? null : vVar, (i12 & 32) != 0 ? null : uVar, (i12 & 64) != 0 ? null : oVar, (i12 & 128) == 0 ? lVar : null, (i12 & 256) != 0 ? 0 : i11, (i12 & 512) != 0 ? wz.w.i() : list, (i12 & 1024) != 0 ? "" : str, (i12 & 2048) != 0 ? wz.w.i() : list2, (i12 & 4096) == 0 ? z11 : false, (i12 & PKIFailureInfo.certRevoked) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w2 b(w2 w2Var, mt.n nVar, mt.j jVar, mt.k kVar, mt.m mVar, mt.v vVar, mt.u uVar, mt.o oVar, mt.l lVar, int i11, List list, String str, List list2, boolean z11, okio.i iVar, int i12, Object obj) {
        return w2Var.a((i12 & 1) != 0 ? w2Var.f37686a : nVar, (i12 & 2) != 0 ? w2Var.f37687b : jVar, (i12 & 4) != 0 ? w2Var.f37688c : kVar, (i12 & 8) != 0 ? w2Var.f37689d : mVar, (i12 & 16) != 0 ? w2Var.f37690e : vVar, (i12 & 32) != 0 ? w2Var.f37691f : uVar, (i12 & 64) != 0 ? w2Var.f37692g : oVar, (i12 & 128) != 0 ? w2Var.f37693h : lVar, (i12 & 256) != 0 ? w2Var.f37694i : i11, (i12 & 512) != 0 ? w2Var.f37697l : list, (i12 & 1024) != 0 ? w2Var.f37695j : str, (i12 & 2048) != 0 ? w2Var.f37698m : list2, (i12 & 4096) != 0 ? w2Var.f37696k : z11, (i12 & PKIFailureInfo.certRevoked) != 0 ? w2Var.unknownFields() : iVar);
    }

    public final w2 a(mt.n nVar, mt.j jVar, mt.k kVar, mt.m mVar, mt.v vVar, mt.u uVar, mt.o oVar, mt.l lVar, int i11, List<t> encrypted_data, String upload_reason, List<n1> piiKeyResponse, boolean z11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(encrypted_data, "encrypted_data");
        kotlin.jvm.internal.s.g(upload_reason, "upload_reason");
        kotlin.jvm.internal.s.g(piiKeyResponse, "piiKeyResponse");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w2(nVar, jVar, kVar, mVar, vVar, uVar, oVar, lVar, i11, encrypted_data, upload_reason, piiKeyResponse, z11, unknownFields);
    }

    public final mt.j c() {
        return this.f37687b;
    }

    public final mt.k d() {
        return this.f37688c;
    }

    public final mt.l e() {
        return this.f37693h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37686a, w2Var.f37686a) && kotlin.jvm.internal.s.c(this.f37687b, w2Var.f37687b) && kotlin.jvm.internal.s.c(this.f37688c, w2Var.f37688c) && kotlin.jvm.internal.s.c(this.f37689d, w2Var.f37689d) && kotlin.jvm.internal.s.c(this.f37690e, w2Var.f37690e) && kotlin.jvm.internal.s.c(this.f37691f, w2Var.f37691f) && kotlin.jvm.internal.s.c(this.f37692g, w2Var.f37692g) && kotlin.jvm.internal.s.c(this.f37693h, w2Var.f37693h) && this.f37694i == w2Var.f37694i && kotlin.jvm.internal.s.c(this.f37697l, w2Var.f37697l) && kotlin.jvm.internal.s.c(this.f37695j, w2Var.f37695j) && kotlin.jvm.internal.s.c(this.f37698m, w2Var.f37698m) && this.f37696k == w2Var.f37696k;
        }
        return false;
    }

    public final mt.m f() {
        return this.f37689d;
    }

    public final List<t> g() {
        return this.f37697l;
    }

    public final mt.n h() {
        return this.f37686a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            mt.n nVar = this.f37686a;
            int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 37;
            mt.j jVar = this.f37687b;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 37;
            mt.k kVar = this.f37688c;
            int hashCode4 = (hashCode3 + (kVar != null ? kVar.hashCode() : 0)) * 37;
            mt.m mVar = this.f37689d;
            int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 37;
            mt.v vVar = this.f37690e;
            int hashCode6 = (hashCode5 + (vVar != null ? vVar.hashCode() : 0)) * 37;
            mt.u uVar = this.f37691f;
            int hashCode7 = (hashCode6 + (uVar != null ? uVar.hashCode() : 0)) * 37;
            mt.o oVar = this.f37692g;
            int hashCode8 = (hashCode7 + (oVar != null ? oVar.hashCode() : 0)) * 37;
            mt.l lVar = this.f37693h;
            int hashCode9 = ((((((((((hashCode8 + (lVar != null ? lVar.hashCode() : 0)) * 37) + Integer.hashCode(this.f37694i)) * 37) + this.f37697l.hashCode()) * 37) + this.f37695j.hashCode()) * 37) + this.f37698m.hashCode()) * 37) + Boolean.hashCode(this.f37696k);
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final mt.o i() {
        return this.f37692g;
    }

    public final List<n1> j() {
        return this.f37698m;
    }

    public final int k() {
        return this.f37694i;
    }

    public final boolean l() {
        return this.f37696k;
    }

    public final String m() {
        return this.f37695j;
    }

    public final mt.u n() {
        return this.f37691f;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m749newBuilder();
    }

    public final mt.v o() {
        return this.f37690e;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        mt.n nVar = this.f37686a;
        if (nVar != null) {
            arrayList.add("gui_settings=" + nVar);
        }
        mt.j jVar = this.f37687b;
        if (jVar != null) {
            arrayList.add("charge_state=" + jVar);
        }
        mt.k kVar = this.f37688c;
        if (kVar != null) {
            arrayList.add("climate_state=" + kVar);
        }
        mt.m mVar = this.f37689d;
        if (mVar != null) {
            arrayList.add("drive_state=" + mVar);
        }
        mt.v vVar = this.f37690e;
        if (vVar != null) {
            arrayList.add("vehicle_state=" + vVar);
        }
        mt.u uVar = this.f37691f;
        if (uVar != null) {
            arrayList.add("vehicle_config=" + uVar);
        }
        mt.o oVar = this.f37692g;
        if (oVar != null) {
            arrayList.add("location_state=" + oVar);
        }
        mt.l lVar = this.f37693h;
        if (lVar != null) {
            arrayList.add("closures_state=" + lVar);
        }
        int i11 = this.f37694i;
        arrayList.add("proto_json_version=" + i11);
        if (!this.f37697l.isEmpty()) {
            List<t> list = this.f37697l;
            arrayList.add("encrypted_data=" + list);
        }
        String i12 = mr.d.i(this.f37695j);
        arrayList.add("upload_reason=" + i12);
        if (!this.f37698m.isEmpty()) {
            List<n1> list2 = this.f37698m;
            arrayList.add("piiKeyResponse=" + list2);
        }
        boolean z11 = this.f37696k;
        arrayList.add("supports_optional_fields=" + z11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m749newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(mt.n nVar, mt.j jVar, mt.k kVar, mt.m mVar, mt.v vVar, mt.u uVar, mt.o oVar, mt.l lVar, int i11, List<t> encrypted_data, String upload_reason, List<n1> piiKeyResponse, boolean z11, okio.i unknownFields) {
        super(f37685n, unknownFields);
        kotlin.jvm.internal.s.g(encrypted_data, "encrypted_data");
        kotlin.jvm.internal.s.g(upload_reason, "upload_reason");
        kotlin.jvm.internal.s.g(piiKeyResponse, "piiKeyResponse");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37686a = nVar;
        this.f37687b = jVar;
        this.f37688c = kVar;
        this.f37689d = mVar;
        this.f37690e = vVar;
        this.f37691f = uVar;
        this.f37692g = oVar;
        this.f37693h = lVar;
        this.f37694i = i11;
        this.f37695j = upload_reason;
        this.f37696k = z11;
        this.f37697l = mr.d.g("encrypted_data", encrypted_data);
        this.f37698m = mr.d.g("piiKeyResponse", piiKeyResponse);
    }
}