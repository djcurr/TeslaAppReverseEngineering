package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class e extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<e> f38960b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarNoChargeReason#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final st.b f38961a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarStateNoChargeRecommended", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            st.b bVar = st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(bVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        bVar = st.b.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID) {
                st.b.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID ? z11 + st.b.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            return e.b(value, null, okio.i.f42656d, 1, null);
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
        f38960b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), com.squareup.wire.o.PROTO_3);
    }

    public e() {
        this(null, null, 3, null);
    }

    public /* synthetic */ e(st.b bVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID : bVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ e b(e eVar, st.b bVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = eVar.f38961a;
        }
        if ((i11 & 2) != 0) {
            iVar = eVar.unknownFields();
        }
        return eVar.a(bVar, iVar);
    }

    public final e a(st.b reason, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(reason, "reason");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e(reason, unknownFields);
    }

    public final st.b c() {
        return this.f38961a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && this.f38961a == eVar.f38961a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f38961a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m768newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        st.b bVar = this.f38961a;
        arrayList.add("reason=" + bVar);
        l02 = e0.l0(arrayList, ", ", "ChargeOnSolarStateNoChargeRecommended{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m768newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(st.b reason, okio.i unknownFields) {
        super(f38960b, unknownFields);
        kotlin.jvm.internal.s.g(reason, "reason");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f38961a = reason;
    }
}