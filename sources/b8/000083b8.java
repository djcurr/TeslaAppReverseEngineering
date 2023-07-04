package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<e2> f37380b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.StwHeatLevel#ADAPTER", jsonName = "stwHeatLevel", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.q f37381a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e2> {
        a(com.squareup.wire.b bVar, n00.d<e2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.StwHeatLevelAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            kt.q qVar = kt.q.StwHeatLevel_Unknown;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e2(qVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        qVar = kt.q.ADAPTER.decode(reader);
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
        public void encode(com.squareup.wire.l writer, e2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != kt.q.StwHeatLevel_Unknown) {
                kt.q.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != kt.q.StwHeatLevel_Unknown ? z11 + kt.q.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e2 redact(e2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return e2.b(value, null, okio.i.f42656d, 1, null);
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
        f37380b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(e2.class), com.squareup.wire.o.PROTO_3);
    }

    public e2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ e2(kt.q qVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? kt.q.StwHeatLevel_Unknown : qVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ e2 b(e2 e2Var, kt.q qVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = e2Var.f37381a;
        }
        if ((i11 & 2) != 0) {
            iVar = e2Var.unknownFields();
        }
        return e2Var.a(qVar, iVar);
    }

    public final e2 a(kt.q stw_heat_level, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(stw_heat_level, "stw_heat_level");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e2(stw_heat_level, unknownFields);
    }

    public final kt.q c() {
        return this.f37381a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), e2Var.unknownFields()) && this.f37381a == e2Var.f37381a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37381a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m674newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.q qVar = this.f37381a;
        arrayList.add("stw_heat_level=" + qVar);
        l02 = wz.e0.l0(arrayList, ", ", "StwHeatLevelAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m674newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(kt.q stw_heat_level, okio.i unknownFields) {
        super(f37380b, unknownFields);
        kotlin.jvm.internal.s.g(stw_heat_level, "stw_heat_level");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37381a = stw_heat_level;
    }
}