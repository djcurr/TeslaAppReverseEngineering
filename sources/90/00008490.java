package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class u2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<u2> f37648c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.f f37649a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37650b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<u2> {
        a(com.squareup.wire.b bVar, n00.d<u2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlTriggerHomelinkAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.f fVar = null;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new u2(fVar, str, reader.e(d11));
                } else if (g11 == 1) {
                    fVar = kt.f.f35777c.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                kt.f.f35777c.encodeWithTag(writer, 1, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += kt.f.f35777c.encodedSizeWithTag(1, value.c());
            }
            return !kotlin.jvm.internal.s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u2 redact(u2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.f c11 = value.c();
            return u2.b(value, c11 == null ? null : kt.f.f35777c.redact(c11), null, okio.i.f42656d, 2, null);
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
        f37648c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(u2.class), com.squareup.wire.o.PROTO_3);
    }

    public u2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ u2(kt.f fVar, String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ u2 b(u2 u2Var, kt.f fVar, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = u2Var.f37649a;
        }
        if ((i11 & 2) != 0) {
            str = u2Var.f37650b;
        }
        if ((i11 & 4) != 0) {
            iVar = u2Var.unknownFields();
        }
        return u2Var.a(fVar, str, iVar);
    }

    public final u2 a(kt.f fVar, String token, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u2(fVar, token, unknownFields);
    }

    public final kt.f c() {
        return this.f37649a;
    }

    public final String d() {
        return this.f37650b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), u2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37649a, u2Var.f37649a) && kotlin.jvm.internal.s.c(this.f37650b, u2Var.f37650b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            kt.f fVar = this.f37649a;
            int hashCode2 = ((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.f37650b.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m739newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.f fVar = this.f37649a;
        if (fVar != null) {
            arrayList.add("location=" + fVar);
        }
        String i11 = mr.d.i(this.f37650b);
        arrayList.add("token=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleControlTriggerHomelinkAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m739newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(kt.f fVar, String token, okio.i unknownFields) {
        super(f37648c, unknownFields);
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37649a = fVar;
        this.f37650b = token;
    }
}