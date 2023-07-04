package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<b3> f7943d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f7944a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f7945b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MLXWakePeriod_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final q1 f7946c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b3> {
        a(com.squareup.wire.b bVar, n00.d<b3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPMotionConfig", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            q1 q1Var = q1.MLXWAKEPERIOD_2_MS;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b3(i11, i12, q1Var, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        q1Var = q1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.c() != q1.MLXWAKEPERIOD_2_MS) {
                q1.ADAPTER.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return value.c() != q1.MLXWAKEPERIOD_2_MS ? z11 + q1.ADAPTER.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b3 redact(b3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return b3.b(value, 0, 0, null, okio.i.f42656d, 7, null);
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
        f7943d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b3.class), com.squareup.wire.o.PROTO_3);
    }

    public b3() {
        this(0, 0, null, null, 15, null);
    }

    public /* synthetic */ b3(int i11, int i12, q1 q1Var, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? q1.MLXWAKEPERIOD_2_MS : q1Var, (i13 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b3 b(b3 b3Var, int i11, int i12, q1 q1Var, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = b3Var.f7944a;
        }
        if ((i13 & 2) != 0) {
            i12 = b3Var.f7945b;
        }
        if ((i13 & 4) != 0) {
            q1Var = b3Var.f7946c;
        }
        if ((i13 & 8) != 0) {
            iVar = b3Var.unknownFields();
        }
        return b3Var.a(i11, i12, q1Var, iVar);
    }

    public final b3 a(int i11, int i12, q1 PTMeasurePeriod, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(PTMeasurePeriod, "PTMeasurePeriod");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b3(i11, i12, PTMeasurePeriod, unknownFields);
    }

    public final q1 c() {
        return this.f7946c;
    }

    public final int d() {
        return this.f7944a;
    }

    public final int e() {
        return this.f7945b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b3) {
            b3 b3Var = (b3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b3Var.unknownFields()) && this.f7944a == b3Var.f7944a && this.f7945b == b3Var.f7945b && this.f7946c == b3Var.f7946c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f7944a)) * 37) + Integer.hashCode(this.f7945b)) * 37) + this.f7946c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m16newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f7944a;
        arrayList.add("pressureDelta=" + i11);
        int i12 = this.f7945b;
        arrayList.add("temperatureDelta=" + i12);
        q1 q1Var = this.f7946c;
        arrayList.add("PTMeasurePeriod=" + q1Var);
        l02 = wz.e0.l0(arrayList, ", ", "TPMotionConfig{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m16newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(int i11, int i12, q1 PTMeasurePeriod, okio.i unknownFields) {
        super(f7943d, unknownFields);
        kotlin.jvm.internal.s.g(PTMeasurePeriod, "PTMeasurePeriod");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7944a = i11;
        this.f7945b = i12;
        this.f7946c = PTMeasurePeriod;
    }
}