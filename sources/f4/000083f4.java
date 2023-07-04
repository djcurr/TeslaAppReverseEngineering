package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import com.tesla.proto.energy.rate_tariff.v1.RateTariff;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class j0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<j0> f37443b;
    @com.squareup.wire.q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateTariff#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final RateTariff f37444a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j0> {
        a(com.squareup.wire.b bVar, n00.d<j0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetRateTariffResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            RateTariff rateTariff = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j0(rateTariff, reader.e(d11));
                } else if (g11 == 1) {
                    rateTariff = RateTariff.ADAPTER.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                RateTariff.ADAPTER.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + RateTariff.ADAPTER.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j0 redact(j0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            RateTariff b11 = value.b();
            return value.a(b11 == null ? null : RateTariff.ADAPTER.redact(b11), okio.i.f42656d);
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
        f37443b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(j0.class), com.squareup.wire.o.PROTO_3);
    }

    public j0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ j0(RateTariff rateTariff, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : rateTariff, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final j0 a(RateTariff rateTariff, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j0(rateTariff, unknownFields);
    }

    public final RateTariff b() {
        return this.f37444a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), j0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37444a, j0Var.f37444a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RateTariff rateTariff = this.f37444a;
            int hashCode2 = hashCode + (rateTariff != null ? rateTariff.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m693newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        RateTariff rateTariff = this.f37444a;
        if (rateTariff != null) {
            arrayList.add("tariff=" + rateTariff);
        }
        l02 = wz.e0.l0(arrayList, ", ", "GetRateTariffResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m693newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(RateTariff rateTariff, okio.i unknownFields) {
        super(f37443b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37444a = rateTariff;
    }
}