package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class r extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<r> f37577b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitMph", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final double f37578a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, n00.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DrivingSetSpeedLimitAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public r decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            double d12 = 0.0d;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new r(d12, reader.e(d11));
                }
                if (g11 == 1) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, r value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.c() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !((value.c() > 0.0d ? 1 : (value.c() == 0.0d ? 0 : -1)) == 0) ? z11 + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public r redact(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            return r.b(value, 0.0d, okio.i.f42656d, 1, null);
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
        f37577b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(r.class), com.squareup.wire.o.PROTO_3);
    }

    public r() {
        this(0.0d, null, 3, null);
    }

    public /* synthetic */ r(double d11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ r b(r rVar, double d11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = rVar.f37578a;
        }
        if ((i11 & 2) != 0) {
            iVar = rVar.unknownFields();
        }
        return rVar.a(d11, iVar);
    }

    public final r a(double d11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new r(d11, unknownFields);
    }

    public final double c() {
        return this.f37578a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), rVar.unknownFields())) {
                return (this.f37578a > rVar.f37578a ? 1 : (this.f37578a == rVar.f37578a ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.f37578a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m723newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.f37578a;
        arrayList.add("limit_mph=" + d11);
        l02 = wz.e0.l0(arrayList, ", ", "DrivingSetSpeedLimitAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m723newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(double d11, okio.i unknownFields) {
        super(f37577b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37578a = d11;
    }
}