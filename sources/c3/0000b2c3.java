package st;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class a extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<a> f50632b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxExcessSolarPowerW", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Float f50633a;

    /* renamed from: st.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1124a extends ProtoAdapter<a> {
        C1124a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ChargeOnSolarLimits", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            Float f11 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(f11, reader.e(d11));
                } else if (g11 == 1) {
                    f11 = ProtoAdapter.FLOAT.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            ProtoAdapter.FLOAT.encodeWithTag(writer, 1, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            return value.unknownFields().z() + ProtoAdapter.FLOAT.encodedSizeWithTag(1, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, okio.i.f42656d, 1, null);
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
        f50632b = new C1124a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, 3, null);
    }

    public /* synthetic */ a(Float f11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, Float f11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = aVar.f50633a;
        }
        if ((i11 & 2) != 0) {
            iVar = aVar.unknownFields();
        }
        return aVar.a(f11, iVar);
    }

    public final a a(Float f11, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new a(f11, unknownFields);
    }

    public final Float c() {
        return this.f50633a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.b(this.f50633a, aVar.f50633a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Float f11 = this.f50633a;
            int hashCode2 = hashCode + (f11 != null ? f11.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1099newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Float f11 = this.f50633a;
        if (f11 != null) {
            arrayList.add("max_excess_solar_power_w=" + f11);
        }
        l02 = e0.l0(arrayList, ", ", "ChargeOnSolarLimits{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1099newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Float f11, okio.i unknownFields) {
        super(f50632b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f50633a = f11;
    }
}