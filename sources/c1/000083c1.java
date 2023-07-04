package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f1 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<f1> f37385d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final double f37386a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final double f37387b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final r1 f37388c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f1> {
        a(com.squareup.wire.b bVar, n00.d<f1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationGpsRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            r1 r1Var = r1.RemoteNavTripOrderReplace;
            long d11 = reader.d();
            double d12 = 0.0d;
            double d13 = 0.0d;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f1(d13, d12, r1Var, reader.e(d11));
                } else if (g11 == 1) {
                    d13 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 == 2) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        r1Var = r1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.c() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.c()));
            }
            if (!(value.d() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.d()));
            }
            if (value.e() != r1.RemoteNavTripOrderReplace) {
                r1.ADAPTER.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.c() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.c()));
            }
            if (!(value.d() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.d()));
            }
            return value.e() != r1.RemoteNavTripOrderReplace ? z11 + r1.ADAPTER.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f1 redact(f1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return f1.b(value, 0.0d, 0.0d, null, okio.i.f42656d, 7, null);
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
        f37385d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f1.class), com.squareup.wire.o.PROTO_3);
    }

    public f1() {
        this(0.0d, 0.0d, null, null, 15, null);
    }

    public /* synthetic */ f1(double d11, double d12, r1 r1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) == 0 ? d12 : 0.0d, (i11 & 4) != 0 ? r1.RemoteNavTripOrderReplace : r1Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f1 b(f1 f1Var, double d11, double d12, r1 r1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = f1Var.f37386a;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = f1Var.f37387b;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            r1Var = f1Var.f37388c;
        }
        r1 r1Var2 = r1Var;
        if ((i11 & 8) != 0) {
            iVar = f1Var.unknownFields();
        }
        return f1Var.a(d13, d14, r1Var2, iVar);
    }

    public final f1 a(double d11, double d12, r1 order, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f1(d11, d12, order, unknownFields);
    }

    public final double c() {
        return this.f37386a;
    }

    public final double d() {
        return this.f37387b;
    }

    public final r1 e() {
        return this.f37388c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), f1Var.unknownFields())) {
                if (this.f37386a == f1Var.f37386a) {
                    return ((this.f37387b > f1Var.f37387b ? 1 : (this.f37387b == f1Var.f37387b ? 0 : -1)) == 0) && this.f37388c == f1Var.f37388c;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.f37386a)) * 37) + Double.hashCode(this.f37387b)) * 37) + this.f37388c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m677newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.f37386a;
        arrayList.add("lat=" + d11);
        double d12 = this.f37387b;
        arrayList.add("lon=" + d12);
        r1 r1Var = this.f37388c;
        arrayList.add("order=" + r1Var);
        l02 = wz.e0.l0(arrayList, ", ", "NavigationGpsRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m677newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(double d11, double d12, r1 order, okio.i unknownFields) {
        super(f37385d, unknownFields);
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37386a = d11;
        this.f37387b = d12;
        this.f37388c = order;
    }
}