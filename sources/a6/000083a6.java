package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d3 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<d3> f37368c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sessionId", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f37369a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37370b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d3> {
        a(com.squareup.wire.b bVar, n00.d<d3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VitalsSubscriptionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d3(i11, str, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d3 redact(d3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return d3.b(value, 0, null, okio.i.f42656d, 3, null);
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
        f37368c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d3.class), com.squareup.wire.o.PROTO_3);
    }

    public d3() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ d3(int i11, String str, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ d3 b(d3 d3Var, int i11, String str, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = d3Var.f37369a;
        }
        if ((i12 & 2) != 0) {
            str = d3Var.f37370b;
        }
        if ((i12 & 4) != 0) {
            iVar = d3Var.unknownFields();
        }
        return d3Var.a(i11, str, iVar);
    }

    public final d3 a(int i11, String error, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(error, "error");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d3(i11, error, unknownFields);
    }

    public final String c() {
        return this.f37370b;
    }

    public final int d() {
        return this.f37369a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), d3Var.unknownFields()) && this.f37369a == d3Var.f37369a && kotlin.jvm.internal.s.c(this.f37370b, d3Var.f37370b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f37369a)) * 37) + this.f37370b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m669newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f37369a;
        arrayList.add("session_id=" + i11);
        String i12 = mr.d.i(this.f37370b);
        arrayList.add("error=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "VitalsSubscriptionResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m669newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(int i11, String error, okio.i unknownFields) {
        super(f37368c, unknownFields);
        kotlin.jvm.internal.s.g(error, "error");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37369a = i11;
        this.f37370b = error;
    }
}