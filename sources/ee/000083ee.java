package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<i2> f37440b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ChargeOnSolarFeature#ADAPTER", jsonName = "chargeOnSolar", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f37441a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i2> {
        a(com.squareup.wire.b bVar, n00.d<i2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.UpdateChargeOnSolarFeatureRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            i iVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i2(iVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = i.f37429d.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                i.f37429d.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + i.f37429d.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i2 redact(i2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            i b11 = value.b();
            return value.a(b11 == null ? null : i.f37429d.redact(b11), okio.i.f42656d);
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
        f37440b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i2.class), com.squareup.wire.o.PROTO_3);
    }

    public i2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ i2(i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2);
    }

    public final i2 a(i iVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i2(iVar, unknownFields);
    }

    public final i b() {
        return this.f37441a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), i2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37441a, i2Var.f37441a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            i iVar = this.f37441a;
            int hashCode2 = hashCode + (iVar != null ? iVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m691newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f37441a;
        if (iVar != null) {
            arrayList.add("charge_on_solar=" + iVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "UpdateChargeOnSolarFeatureRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m691newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(i iVar, okio.i unknownFields) {
        super(f37440b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37441a = iVar;
    }
}