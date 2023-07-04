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
public final class c extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c> f50634b;
    @q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarNoChargeReason#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final st.b f50635a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ChargeOnSolarNoChargeRecommended", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(k reader) {
            s.g(reader, "reader");
            st.b bVar = st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(bVar, reader.e(d11));
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
        public void encode(l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID) {
                st.b.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID ? z11 + st.b.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            return c.b(value, null, okio.i.f42656d, 1, null);
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
        f50634b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c(st.b bVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? st.b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID : bVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ c b(c cVar, st.b bVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = cVar.f50635a;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.unknownFields();
        }
        return cVar.a(bVar, iVar);
    }

    public final c a(st.b reason, okio.i unknownFields) {
        s.g(reason, "reason");
        s.g(unknownFields, "unknownFields");
        return new c(reason, unknownFields);
    }

    public final st.b c() {
        return this.f50635a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && this.f50635a == cVar.f50635a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f50635a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1100newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        st.b bVar = this.f50635a;
        arrayList.add("reason=" + bVar);
        l02 = e0.l0(arrayList, ", ", "ChargeOnSolarNoChargeRecommended{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1100newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(st.b reason, okio.i unknownFields) {
        super(f50634b, unknownFields);
        s.g(reason, "reason");
        s.g(unknownFields, "unknownFields");
        this.f50635a = reason;
    }
}