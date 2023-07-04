package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g3 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<g3> f8023f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8024a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8025b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MLXWakePeriod_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final q1 f8026c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8027d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8028e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g3> {
        a(com.squareup.wire.b bVar, n00.d<g3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPStationaryConfig", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            q1 q1Var = q1.MLXWAKEPERIOD_2_MS;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g3(i11, i12, q1Var, i13, i14, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 3) {
                    try {
                        q1Var = q1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 4) {
                    i13 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    i14 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.g() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.g()));
            }
            if (value.d() != q1.MLXWAKEPERIOD_2_MS) {
                q1.ADAPTER.encodeWithTag(writer, 3, value.d());
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.c()));
            }
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.f()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.g() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.g()));
            }
            if (value.d() != q1.MLXWAKEPERIOD_2_MS) {
                z11 += q1.ADAPTER.encodedSizeWithTag(3, value.d());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.c()));
            }
            return value.f() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.f())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g3 redact(g3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return g3.b(value, 0, 0, null, 0, 0, okio.i.f42656d, 31, null);
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
        f8023f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g3.class), com.squareup.wire.o.PROTO_3);
    }

    public g3() {
        this(0, 0, null, 0, 0, null, 63, null);
    }

    public /* synthetic */ g3(int i11, int i12, q1 q1Var, int i13, int i14, okio.i iVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? q1.MLXWAKEPERIOD_2_MS : q1Var, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) == 0 ? i14 : 0, (i15 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ g3 b(g3 g3Var, int i11, int i12, q1 q1Var, int i13, int i14, okio.i iVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = g3Var.f8024a;
        }
        if ((i15 & 2) != 0) {
            i12 = g3Var.f8025b;
        }
        int i16 = i12;
        if ((i15 & 4) != 0) {
            q1Var = g3Var.f8026c;
        }
        q1 q1Var2 = q1Var;
        if ((i15 & 8) != 0) {
            i13 = g3Var.f8027d;
        }
        int i17 = i13;
        if ((i15 & 16) != 0) {
            i14 = g3Var.f8028e;
        }
        int i18 = i14;
        if ((i15 & 32) != 0) {
            iVar = g3Var.unknownFields();
        }
        return g3Var.a(i11, i16, q1Var2, i17, i18, iVar);
    }

    public final g3 a(int i11, int i12, q1 accelMeasurePeriod, int i13, int i14, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(accelMeasurePeriod, "accelMeasurePeriod");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g3(i11, i12, accelMeasurePeriod, i13, i14, unknownFields);
    }

    public final int c() {
        return this.f8027d;
    }

    public final q1 d() {
        return this.f8026c;
    }

    public final int e() {
        return this.f8024a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g3) {
            g3 g3Var = (g3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), g3Var.unknownFields()) && this.f8024a == g3Var.f8024a && this.f8025b == g3Var.f8025b && this.f8026c == g3Var.f8026c && this.f8027d == g3Var.f8027d && this.f8028e == g3Var.f8028e;
        }
        return false;
    }

    public final int f() {
        return this.f8028e;
    }

    public final int g() {
        return this.f8025b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8024a)) * 37) + Integer.hashCode(this.f8025b)) * 37) + this.f8026c.hashCode()) * 37) + Integer.hashCode(this.f8027d)) * 37) + Integer.hashCode(this.f8028e);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m33newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8024a;
        arrayList.add("lowPressureThreshold=" + i11);
        int i12 = this.f8025b;
        arrayList.add("pressureDelta=" + i12);
        q1 q1Var = this.f8026c;
        arrayList.add("accelMeasurePeriod=" + q1Var);
        int i13 = this.f8027d;
        arrayList.add("absoluteAccelWakeThreshold=" + i13);
        int i14 = this.f8028e;
        arrayList.add("PTMeasureMod=" + i14);
        l02 = wz.e0.l0(arrayList, ", ", "TPStationaryConfig{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m33newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(int i11, int i12, q1 accelMeasurePeriod, int i13, int i14, okio.i unknownFields) {
        super(f8023f, unknownFields);
        kotlin.jvm.internal.s.g(accelMeasurePeriod, "accelMeasurePeriod");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8024a = i11;
        this.f8025b = i12;
        this.f8026c = accelMeasurePeriod;
        this.f8027d = i13;
        this.f8028e = i14;
    }
}