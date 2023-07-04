package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<g1> f37415c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37416a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final r1 f37417b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g1> {
        a(com.squareup.wire.b bVar, n00.d<g1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            r1 r1Var = r1.RemoteNavTripOrderReplace;
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g1(str, r1Var, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        r1Var = r1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != r1.RemoteNavTripOrderReplace) {
                r1.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.c());
            }
            return value.d() != r1.RemoteNavTripOrderReplace ? z11 + r1.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g1 redact(g1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return g1.b(value, null, null, okio.i.f42656d, 3, null);
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
        f37415c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g1.class), com.squareup.wire.o.PROTO_3);
    }

    public g1() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ g1(String str, r1 r1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? r1.RemoteNavTripOrderReplace : r1Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ g1 b(g1 g1Var, String str, r1 r1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = g1Var.f37416a;
        }
        if ((i11 & 2) != 0) {
            r1Var = g1Var.f37417b;
        }
        if ((i11 & 4) != 0) {
            iVar = g1Var.unknownFields();
        }
        return g1Var.a(str, r1Var, iVar);
    }

    public final g1 a(String destination, r1 order, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(destination, "destination");
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g1(destination, order, unknownFields);
    }

    public final String c() {
        return this.f37416a;
    }

    public final r1 d() {
        return this.f37417b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), g1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37416a, g1Var.f37416a) && this.f37417b == g1Var.f37417b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f37416a.hashCode()) * 37) + this.f37417b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m681newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37416a);
        arrayList.add("destination=" + i11);
        r1 r1Var = this.f37417b;
        arrayList.add("order=" + r1Var);
        l02 = wz.e0.l0(arrayList, ", ", "NavigationRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m681newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(String destination, r1 order, okio.i unknownFields) {
        super(f37415c, unknownFields);
        kotlin.jvm.internal.s.g(destination, "destination");
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37416a = destination;
        this.f37417b = order;
    }
}