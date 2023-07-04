package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class j1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<j1> f37445c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f37446a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.RemoteNavTripOrder_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final r1 f37447b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j1> {
        a(com.squareup.wire.b bVar, n00.d<j1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationSuperchargerRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            r1 r1Var = r1.RemoteNavTripOrderReplace;
            long d11 = reader.d();
            long j11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j1(j11, r1Var, reader.e(d11));
                } else if (g11 == 1) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
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
        public void encode(com.squareup.wire.l writer, j1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.c()));
            }
            if (value.d() != r1.RemoteNavTripOrderReplace) {
                r1.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.c()));
            }
            return value.d() != r1.RemoteNavTripOrderReplace ? z11 + r1.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j1 redact(j1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return j1.b(value, 0L, null, okio.i.f42656d, 3, null);
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
        f37445c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(j1.class), com.squareup.wire.o.PROTO_3);
    }

    public j1() {
        this(0L, null, null, 7, null);
    }

    public /* synthetic */ j1(long j11, r1 r1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? r1.RemoteNavTripOrderReplace : r1Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ j1 b(j1 j1Var, long j11, r1 r1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = j1Var.f37446a;
        }
        if ((i11 & 2) != 0) {
            r1Var = j1Var.f37447b;
        }
        if ((i11 & 4) != 0) {
            iVar = j1Var.unknownFields();
        }
        return j1Var.a(j11, r1Var, iVar);
    }

    public final j1 a(long j11, r1 order, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j1(j11, order, unknownFields);
    }

    public final long c() {
        return this.f37446a;
    }

    public final r1 d() {
        return this.f37447b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), j1Var.unknownFields()) && this.f37446a == j1Var.f37446a && this.f37447b == j1Var.f37447b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.f37446a)) * 37) + this.f37447b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m694newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f37446a;
        arrayList.add("id=" + j11);
        r1 r1Var = this.f37447b;
        arrayList.add("order=" + r1Var);
        l02 = wz.e0.l0(arrayList, ", ", "NavigationSuperchargerRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m694newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j11, r1 order, okio.i unknownFields) {
        super(f37445c, unknownFields);
        kotlin.jvm.internal.s.g(order, "order");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37446a = j11;
        this.f37447b = order;
    }
}