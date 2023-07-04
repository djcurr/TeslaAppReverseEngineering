package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b2> f37349b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37350a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b2> {
        a(com.squareup.wire.b bVar, n00.d<b2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SetVehicleNameAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b2(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b2 redact(b2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return b2.b(value, null, okio.i.f42656d, 1, null);
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
        f37349b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b2.class), com.squareup.wire.o.PROTO_3);
    }

    public b2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b2(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b2 b(b2 b2Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b2Var.f37350a;
        }
        if ((i11 & 2) != 0) {
            iVar = b2Var.unknownFields();
        }
        return b2Var.a(str, iVar);
    }

    public final b2 a(String vehicleName, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(vehicleName, "vehicleName");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b2(vehicleName, unknownFields);
    }

    public final String c() {
        return this.f37350a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37350a, b2Var.f37350a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37350a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m658newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37350a);
        arrayList.add("vehicleName=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "SetVehicleNameAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m658newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String vehicleName, okio.i unknownFields) {
        super(f37349b, unknownFields);
        kotlin.jvm.internal.s.g(vehicleName, "vehicleName");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37350a = vehicleName;
    }
}