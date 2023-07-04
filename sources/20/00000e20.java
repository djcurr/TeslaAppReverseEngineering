package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t3 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<t3> f8210b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f8211a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t3> {
        a(com.squareup.wire.b bVar, n00.d<t3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.VehicleInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t3(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t3 redact(t3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return t3.b(value, null, okio.i.f42656d, 1, null);
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
        f8210b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(t3.class), com.squareup.wire.o.PROTO_3);
    }

    public t3() {
        this(null, null, 3, null);
    }

    public /* synthetic */ t3(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ t3 b(t3 t3Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = t3Var.f8211a;
        }
        if ((i11 & 2) != 0) {
            iVar = t3Var.unknownFields();
        }
        return t3Var.a(str, iVar);
    }

    public final t3 a(String VIN, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(VIN, "VIN");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t3(VIN, unknownFields);
    }

    public final String c() {
        return this.f8211a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), t3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8211a, t3Var.f8211a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8211a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m74newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f8211a);
        arrayList.add("VIN=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m74newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(String VIN, okio.i unknownFields) {
        super(f8210b, unknownFields);
        kotlin.jvm.internal.s.g(VIN, "VIN");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8211a = VIN;
    }
}