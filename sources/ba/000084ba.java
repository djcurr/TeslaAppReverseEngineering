package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class x2 extends com.squareup.wire.f {

    /* renamed from: j  reason: collision with root package name */
    public static final ProtoAdapter<x2> f37707j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ChargeStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final Instant f37708a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ClimateStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final Instant f37709b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "ClosuresStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final Instant f37710c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "DriveStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final Instant f37711d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "GuiSettingsTimestamp", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final Instant f37712e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "LocationStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: f  reason: collision with root package name */
    private final Instant f37713f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "VehicleConfigTimestamp", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: g  reason: collision with root package name */
    private final Instant f37714g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "VehicleStateTimestamp", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: h  reason: collision with root package name */
    private final Instant f37715h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "decryptionErrorField", label = q.a.PACKED, tag = 10)

    /* renamed from: i  reason: collision with root package name */
    private final List<Integer> f37716i;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<x2> {
        a(com.squareup.wire.b bVar, n00.d<x2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataAck", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public x2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            Instant instant = null;
            Instant instant2 = null;
            Instant instant3 = null;
            Instant instant4 = null;
            Instant instant5 = null;
            Instant instant6 = null;
            Instant instant7 = null;
            Instant instant8 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new x2(instant, instant2, instant3, instant4, instant5, instant6, instant7, instant8, arrayList, reader.e(d11));
                }
                switch (g11) {
                    case 2:
                        instant = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 3:
                        instant2 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 4:
                        instant3 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 5:
                        instant4 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 6:
                        instant5 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 7:
                        instant6 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 8:
                        instant7 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 9:
                        instant8 = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 10:
                        arrayList.add(ProtoAdapter.INT32.decode(reader));
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, x2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.d());
            }
            if (value.e() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.e());
            }
            if (value.g() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 5, value.g());
            }
            if (value.h() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, value.h());
            }
            if (value.i() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.i());
            }
            if (value.j() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 8, value.j());
            }
            if (value.k() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, value.k());
            }
            ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 10, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(x2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.c());
            }
            if (value.d() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.d());
            }
            if (value.e() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.e());
            }
            if (value.g() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.g());
            }
            if (value.h() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.h());
            }
            if (value.i() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.i());
            }
            if (value.j() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.j());
            }
            if (value.k() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.k());
            }
            return z11 + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(10, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public x2 redact(x2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            Instant c11 = value.c();
            Instant redact = c11 == null ? null : ProtoAdapter.INSTANT.redact(c11);
            Instant d11 = value.d();
            Instant redact2 = d11 == null ? null : ProtoAdapter.INSTANT.redact(d11);
            Instant e11 = value.e();
            Instant redact3 = e11 == null ? null : ProtoAdapter.INSTANT.redact(e11);
            Instant g11 = value.g();
            Instant redact4 = g11 == null ? null : ProtoAdapter.INSTANT.redact(g11);
            Instant h11 = value.h();
            Instant redact5 = h11 == null ? null : ProtoAdapter.INSTANT.redact(h11);
            Instant i11 = value.i();
            Instant redact6 = i11 == null ? null : ProtoAdapter.INSTANT.redact(i11);
            Instant j11 = value.j();
            Instant redact7 = j11 == null ? null : ProtoAdapter.INSTANT.redact(j11);
            Instant k11 = value.k();
            return x2.b(value, redact, redact2, redact3, redact4, redact5, redact6, redact7, k11 != null ? ProtoAdapter.INSTANT.redact(k11) : null, null, okio.i.f42656d, 256, null);
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
        f37707j = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(x2.class), com.squareup.wire.o.PROTO_3);
    }

    public x2() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ x2(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : instant2, (i11 & 4) != 0 ? null : instant3, (i11 & 8) != 0 ? null : instant4, (i11 & 16) != 0 ? null : instant5, (i11 & 32) != 0 ? null : instant6, (i11 & 64) != 0 ? null : instant7, (i11 & 128) == 0 ? instant8 : null, (i11 & 256) != 0 ? wz.w.i() : list, (i11 & 512) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x2 b(x2 x2Var, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List list, okio.i iVar, int i11, Object obj) {
        return x2Var.a((i11 & 1) != 0 ? x2Var.f37708a : instant, (i11 & 2) != 0 ? x2Var.f37709b : instant2, (i11 & 4) != 0 ? x2Var.f37710c : instant3, (i11 & 8) != 0 ? x2Var.f37711d : instant4, (i11 & 16) != 0 ? x2Var.f37712e : instant5, (i11 & 32) != 0 ? x2Var.f37713f : instant6, (i11 & 64) != 0 ? x2Var.f37714g : instant7, (i11 & 128) != 0 ? x2Var.f37715h : instant8, (i11 & 256) != 0 ? x2Var.f37716i : list, (i11 & 512) != 0 ? x2Var.unknownFields() : iVar);
    }

    public final x2 a(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List<Integer> decryption_error_field, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(decryption_error_field, "decryption_error_field");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new x2(instant, instant2, instant3, instant4, instant5, instant6, instant7, instant8, decryption_error_field, unknownFields);
    }

    public final Instant c() {
        return this.f37708a;
    }

    public final Instant d() {
        return this.f37709b;
    }

    public final Instant e() {
        return this.f37710c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x2) {
            x2 x2Var = (x2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), x2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37708a, x2Var.f37708a) && kotlin.jvm.internal.s.c(this.f37709b, x2Var.f37709b) && kotlin.jvm.internal.s.c(this.f37710c, x2Var.f37710c) && kotlin.jvm.internal.s.c(this.f37711d, x2Var.f37711d) && kotlin.jvm.internal.s.c(this.f37712e, x2Var.f37712e) && kotlin.jvm.internal.s.c(this.f37713f, x2Var.f37713f) && kotlin.jvm.internal.s.c(this.f37714g, x2Var.f37714g) && kotlin.jvm.internal.s.c(this.f37715h, x2Var.f37715h) && kotlin.jvm.internal.s.c(this.f37716i, x2Var.f37716i);
        }
        return false;
    }

    public final List<Integer> f() {
        return this.f37716i;
    }

    public final Instant g() {
        return this.f37711d;
    }

    public final Instant h() {
        return this.f37712e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Instant instant = this.f37708a;
            int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.f37709b;
            int hashCode3 = (hashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
            Instant instant3 = this.f37710c;
            int hashCode4 = (hashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
            Instant instant4 = this.f37711d;
            int hashCode5 = (hashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
            Instant instant5 = this.f37712e;
            int hashCode6 = (hashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
            Instant instant6 = this.f37713f;
            int hashCode7 = (hashCode6 + (instant6 != null ? instant6.hashCode() : 0)) * 37;
            Instant instant7 = this.f37714g;
            int hashCode8 = (hashCode7 + (instant7 != null ? instant7.hashCode() : 0)) * 37;
            Instant instant8 = this.f37715h;
            int hashCode9 = ((hashCode8 + (instant8 != null ? instant8.hashCode() : 0)) * 37) + this.f37716i.hashCode();
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final Instant i() {
        return this.f37713f;
    }

    public final Instant j() {
        return this.f37714g;
    }

    public final Instant k() {
        return this.f37715h;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m753newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Instant instant = this.f37708a;
        if (instant != null) {
            arrayList.add("ChargeState_timestamp=" + instant);
        }
        Instant instant2 = this.f37709b;
        if (instant2 != null) {
            arrayList.add("ClimateState_timestamp=" + instant2);
        }
        Instant instant3 = this.f37710c;
        if (instant3 != null) {
            arrayList.add("ClosuresState_timestamp=" + instant3);
        }
        Instant instant4 = this.f37711d;
        if (instant4 != null) {
            arrayList.add("DriveState_timestamp=" + instant4);
        }
        Instant instant5 = this.f37712e;
        if (instant5 != null) {
            arrayList.add("GuiSettings_timestamp=" + instant5);
        }
        Instant instant6 = this.f37713f;
        if (instant6 != null) {
            arrayList.add("LocationState_timestamp=" + instant6);
        }
        Instant instant7 = this.f37714g;
        if (instant7 != null) {
            arrayList.add("VehicleConfig_timestamp=" + instant7);
        }
        Instant instant8 = this.f37715h;
        if (instant8 != null) {
            arrayList.add("VehicleState_timestamp=" + instant8);
        }
        if (!this.f37716i.isEmpty()) {
            List<Integer> list = this.f37716i;
            arrayList.add("decryption_error_field=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "VehicleDataAck{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m753newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, List<Integer> decryption_error_field, okio.i unknownFields) {
        super(f37707j, unknownFields);
        kotlin.jvm.internal.s.g(decryption_error_field, "decryption_error_field");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37708a = instant;
        this.f37709b = instant2;
        this.f37710c = instant3;
        this.f37711d = instant4;
        this.f37712e = instant5;
        this.f37713f = instant6;
        this.f37714g = instant7;
        this.f37715h = instant8;
        this.f37716i = mr.d.g("decryption_error_field", decryption_error_field);
    }
}