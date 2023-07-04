package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v2 extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<v2> f8222g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8223a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8224b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPNotifyReason_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final d3 f8225c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "batteryVoltageMV", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8226d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8227e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPMSAdvType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final z2 f8228f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v2> {
        a(com.squareup.wire.b bVar, n00.d<v2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPAdv", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            d3 d3Var = d3.TP_NOTIFY_REASON_UNKNOWN;
            z2 z2Var = z2.TPMS_ADV_TYPE_SEMI;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v2(i11, i12, d3Var, i13, i14, z2Var, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        i11 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 2:
                        i12 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 3:
                        try {
                            d3Var = d3.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 4:
                        i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        i14 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        try {
                            z2Var = z2.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            break;
                        }
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.h() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.h()));
            }
            if (value.g() != d3.TP_NOTIFY_REASON_UNKNOWN) {
                d3.ADAPTER.encodeWithTag(writer, 3, value.g());
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.c()));
            }
            if (value.f() != z2.TPMS_ADV_TYPE_SEMI) {
                z2.ADAPTER.encodeWithTag(writer, 6, value.f());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.h()));
            }
            if (value.g() != d3.TP_NOTIFY_REASON_UNKNOWN) {
                z11 += d3.ADAPTER.encodedSizeWithTag(3, value.g());
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.c()));
            }
            return value.f() != z2.TPMS_ADV_TYPE_SEMI ? z11 + z2.ADAPTER.encodedSizeWithTag(6, value.f()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v2 redact(v2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return v2.b(value, 0, 0, null, 0, 0, null, okio.i.f42656d, 63, null);
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
        f8222g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v2.class), com.squareup.wire.o.PROTO_3);
    }

    public v2() {
        this(0, 0, null, 0, 0, null, null, 127, null);
    }

    public /* synthetic */ v2(int i11, int i12, d3 d3Var, int i13, int i14, z2 z2Var, okio.i iVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? d3.TP_NOTIFY_REASON_UNKNOWN : d3Var, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) == 0 ? i14 : 0, (i15 & 32) != 0 ? z2.TPMS_ADV_TYPE_SEMI : z2Var, (i15 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ v2 b(v2 v2Var, int i11, int i12, d3 d3Var, int i13, int i14, z2 z2Var, okio.i iVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = v2Var.f8223a;
        }
        if ((i15 & 2) != 0) {
            i12 = v2Var.f8224b;
        }
        int i16 = i12;
        if ((i15 & 4) != 0) {
            d3Var = v2Var.f8225c;
        }
        d3 d3Var2 = d3Var;
        if ((i15 & 8) != 0) {
            i13 = v2Var.f8226d;
        }
        int i17 = i13;
        if ((i15 & 16) != 0) {
            i14 = v2Var.f8227e;
        }
        int i18 = i14;
        if ((i15 & 32) != 0) {
            z2Var = v2Var.f8228f;
        }
        z2 z2Var2 = z2Var;
        if ((i15 & 64) != 0) {
            iVar = v2Var.unknownFields();
        }
        return v2Var.a(i11, i16, d3Var2, i17, i18, z2Var2, iVar);
    }

    public final v2 a(int i11, int i12, d3 TPNotifyReason, int i13, int i14, z2 TPMSAdvType, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(TPNotifyReason, "TPNotifyReason");
        kotlin.jvm.internal.s.g(TPMSAdvType, "TPMSAdvType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v2(i11, i12, TPNotifyReason, i13, i14, TPMSAdvType, unknownFields);
    }

    public final int c() {
        return this.f8227e;
    }

    public final int d() {
        return this.f8226d;
    }

    public final int e() {
        return this.f8223a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2) {
            v2 v2Var = (v2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), v2Var.unknownFields()) && this.f8223a == v2Var.f8223a && this.f8224b == v2Var.f8224b && this.f8225c == v2Var.f8225c && this.f8226d == v2Var.f8226d && this.f8227e == v2Var.f8227e && this.f8228f == v2Var.f8228f;
        }
        return false;
    }

    public final z2 f() {
        return this.f8228f;
    }

    public final d3 g() {
        return this.f8225c;
    }

    public final int h() {
        return this.f8224b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8223a)) * 37) + Integer.hashCode(this.f8224b)) * 37) + this.f8225c.hashCode()) * 37) + Integer.hashCode(this.f8226d)) * 37) + Integer.hashCode(this.f8227e)) * 37) + this.f8228f.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m79newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8223a;
        arrayList.add("pressure=" + i11);
        int i12 = this.f8224b;
        arrayList.add("temperature=" + i12);
        d3 d3Var = this.f8225c;
        arrayList.add("TPNotifyReason=" + d3Var);
        int i13 = this.f8226d;
        arrayList.add("batteryVoltage_mV=" + i13);
        int i14 = this.f8227e;
        arrayList.add("advertismentCount=" + i14);
        z2 z2Var = this.f8228f;
        arrayList.add("TPMSAdvType=" + z2Var);
        l02 = wz.e0.l0(arrayList, ", ", "TPAdv{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m79newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(int i11, int i12, d3 TPNotifyReason, int i13, int i14, z2 TPMSAdvType, okio.i unknownFields) {
        super(f8222g, unknownFields);
        kotlin.jvm.internal.s.g(TPNotifyReason, "TPNotifyReason");
        kotlin.jvm.internal.s.g(TPMSAdvType, "TPMSAdvType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8223a = i11;
        this.f8224b = i12;
        this.f8225c = TPNotifyReason;
        this.f8226d = i13;
        this.f8227e = i14;
        this.f8228f = TPMSAdvType;
    }
}