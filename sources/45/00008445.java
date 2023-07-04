package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<p2> f37566b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "offsetSec", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f37567a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p2> {
        a(com.squareup.wire.b bVar, n00.d<p2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlScheduleSoftwareUpdateAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p2(i11, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p2 redact(p2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return p2.b(value, 0, okio.i.f42656d, 1, null);
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
        f37566b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p2.class), com.squareup.wire.o.PROTO_3);
    }

    public p2() {
        this(0, null, 3, null);
    }

    public /* synthetic */ p2(int i11, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ p2 b(p2 p2Var, int i11, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = p2Var.f37567a;
        }
        if ((i12 & 2) != 0) {
            iVar = p2Var.unknownFields();
        }
        return p2Var.a(i11, iVar);
    }

    public final p2 a(int i11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p2(i11, unknownFields);
    }

    public final int c() {
        return this.f37567a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2) {
            p2 p2Var = (p2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), p2Var.unknownFields()) && this.f37567a == p2Var.f37567a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Integer.hashCode(this.f37567a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m718newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f37567a;
        arrayList.add("offset_sec=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleControlScheduleSoftwareUpdateAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m718newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i11, okio.i unknownFields) {
        super(f37566b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37567a = i11;
    }
}