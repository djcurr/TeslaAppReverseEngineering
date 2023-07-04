package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class y2 extends com.squareup.wire.f {

    /* renamed from: l  reason: collision with root package name */
    public static final ProtoAdapter<y2> f37724l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyRequest#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: a  reason: collision with root package name */
    private final m1 f37725a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "subscriptionDurationS", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final int f37726b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "subscriptionPingS", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: c  reason: collision with root package name */
    private final int f37727c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ChargeStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final int f37728d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ClimateStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final int f37729e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ClosuresStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: f  reason: collision with root package name */
    private final int f37730f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "DriveStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final int f37731g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "GuiSettingsMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: h  reason: collision with root package name */
    private final int f37732h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "LocationStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: i  reason: collision with root package name */
    private final int f37733i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "VehicleConfigMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: j  reason: collision with root package name */
    private final int f37734j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "VehicleStateMaxUpdateRateMs", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: k  reason: collision with root package name */
    private final int f37735k;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<y2> {
        a(com.squareup.wire.b bVar, n00.d<y2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataSubscription", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public y2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            m1 m1Var = null;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new y2(m1Var, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, reader.e(d11));
                }
                switch (g11) {
                    case 3:
                        i11 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        i17 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 5:
                        i13 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 6:
                        i14 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 7:
                        i16 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 8:
                        i21 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 9:
                        i19 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 10:
                        i18 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 11:
                        i15 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 12:
                        i12 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 13:
                        m1Var = m1.f37525c.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, y2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.i() != null) {
                m1.f37525c.encodeWithTag(writer, 13, value.i());
            }
            if (value.j() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.j()));
            }
            if (value.k() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.k()));
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.c()));
            }
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 11, Integer.valueOf(value.e()));
            }
            if (value.f() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.f()));
            }
            if (value.g() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.g()));
            }
            if (value.h() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 10, Integer.valueOf(value.h()));
            }
            if (value.l() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 9, Integer.valueOf(value.l()));
            }
            if (value.m() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 8, Integer.valueOf(value.m()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(y2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.i() != null) {
                z11 += m1.f37525c.encodedSizeWithTag(13, value.i());
            }
            if (value.j() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.j()));
            }
            if (value.k() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.k()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.c()));
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(11, Integer.valueOf(value.e()));
            }
            if (value.f() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.f()));
            }
            if (value.g() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.g()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.h()));
            }
            if (value.l() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.l()));
            }
            return value.m() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.m())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public y2 redact(y2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            m1 i11 = value.i();
            return y2.b(value, i11 == null ? null : m1.f37525c.redact(i11), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, okio.i.f42656d, 2046, null);
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
        f37724l = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(y2.class), com.squareup.wire.o.PROTO_3);
    }

    public y2() {
        this(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 4095, null);
    }

    public /* synthetic */ y2(m1 m1Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i iVar, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? null : m1Var, (i22 & 2) != 0 ? 0 : i11, (i22 & 4) != 0 ? 0 : i12, (i22 & 8) != 0 ? 0 : i13, (i22 & 16) != 0 ? 0 : i14, (i22 & 32) != 0 ? 0 : i15, (i22 & 64) != 0 ? 0 : i16, (i22 & 128) != 0 ? 0 : i17, (i22 & 256) != 0 ? 0 : i18, (i22 & 512) != 0 ? 0 : i19, (i22 & 1024) == 0 ? i21 : 0, (i22 & 2048) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ y2 b(y2 y2Var, m1 m1Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i iVar, int i22, Object obj) {
        return y2Var.a((i22 & 1) != 0 ? y2Var.f37725a : m1Var, (i22 & 2) != 0 ? y2Var.f37726b : i11, (i22 & 4) != 0 ? y2Var.f37727c : i12, (i22 & 8) != 0 ? y2Var.f37728d : i13, (i22 & 16) != 0 ? y2Var.f37729e : i14, (i22 & 32) != 0 ? y2Var.f37730f : i15, (i22 & 64) != 0 ? y2Var.f37731g : i16, (i22 & 128) != 0 ? y2Var.f37732h : i17, (i22 & 256) != 0 ? y2Var.f37733i : i18, (i22 & 512) != 0 ? y2Var.f37734j : i19, (i22 & 1024) != 0 ? y2Var.f37735k : i21, (i22 & 2048) != 0 ? y2Var.unknownFields() : iVar);
    }

    public final y2 a(m1 m1Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new y2(m1Var, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, unknownFields);
    }

    public final int c() {
        return this.f37728d;
    }

    public final int d() {
        return this.f37729e;
    }

    public final int e() {
        return this.f37730f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), y2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37725a, y2Var.f37725a) && this.f37726b == y2Var.f37726b && this.f37727c == y2Var.f37727c && this.f37728d == y2Var.f37728d && this.f37729e == y2Var.f37729e && this.f37730f == y2Var.f37730f && this.f37731g == y2Var.f37731g && this.f37732h == y2Var.f37732h && this.f37733i == y2Var.f37733i && this.f37734j == y2Var.f37734j && this.f37735k == y2Var.f37735k;
        }
        return false;
    }

    public final int f() {
        return this.f37731g;
    }

    public final int g() {
        return this.f37732h;
    }

    public final int h() {
        return this.f37733i;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            m1 m1Var = this.f37725a;
            int hashCode2 = ((((((((((((((((((((hashCode + (m1Var != null ? m1Var.hashCode() : 0)) * 37) + Integer.hashCode(this.f37726b)) * 37) + Integer.hashCode(this.f37727c)) * 37) + Integer.hashCode(this.f37728d)) * 37) + Integer.hashCode(this.f37729e)) * 37) + Integer.hashCode(this.f37730f)) * 37) + Integer.hashCode(this.f37731g)) * 37) + Integer.hashCode(this.f37732h)) * 37) + Integer.hashCode(this.f37733i)) * 37) + Integer.hashCode(this.f37734j)) * 37) + Integer.hashCode(this.f37735k);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final m1 i() {
        return this.f37725a;
    }

    public final int j() {
        return this.f37726b;
    }

    public final int k() {
        return this.f37727c;
    }

    public final int l() {
        return this.f37734j;
    }

    public final int m() {
        return this.f37735k;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m757newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        m1 m1Var = this.f37725a;
        if (m1Var != null) {
            arrayList.add("piiKeyRequest=" + m1Var);
        }
        int i11 = this.f37726b;
        arrayList.add("subscription_duration_s=" + i11);
        int i12 = this.f37727c;
        arrayList.add("subscription_ping_s=" + i12);
        int i13 = this.f37728d;
        arrayList.add("ChargeState_max_update_rate_ms=" + i13);
        int i14 = this.f37729e;
        arrayList.add("ClimateState_max_update_rate_ms=" + i14);
        int i15 = this.f37730f;
        arrayList.add("ClosuresState_max_update_rate_ms=" + i15);
        int i16 = this.f37731g;
        arrayList.add("DriveState_max_update_rate_ms=" + i16);
        int i17 = this.f37732h;
        arrayList.add("GuiSettings_max_update_rate_ms=" + i17);
        int i18 = this.f37733i;
        arrayList.add("LocationState_max_update_rate_ms=" + i18);
        int i19 = this.f37734j;
        arrayList.add("VehicleConfig_max_update_rate_ms=" + i19);
        int i21 = this.f37735k;
        arrayList.add("VehicleState_max_update_rate_ms=" + i21);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleDataSubscription{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m757newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(m1 m1Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i unknownFields) {
        super(f37724l, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37725a = m1Var;
        this.f37726b = i11;
        this.f37727c = i12;
        this.f37728d = i13;
        this.f37729e = i14;
        this.f37730f = i15;
        this.f37731g = i16;
        this.f37732h = i17;
        this.f37733i = i18;
        this.f37734j = i19;
        this.f37735k = i21;
    }
}