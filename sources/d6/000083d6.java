package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<h0> f37422d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeMetaData", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37423a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f37424b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f37425c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h0> {
        a(com.squareup.wire.b bVar, n00.d<h0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetNearbyChargingSites", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h0(z11, i11, i12, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return value.c() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h0 redact(h0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return h0.b(value, false, 0, 0, okio.i.f42656d, 7, null);
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
        f37422d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h0.class), com.squareup.wire.o.PROTO_3);
    }

    public h0() {
        this(false, 0, 0, null, 15, null);
    }

    public /* synthetic */ h0(boolean z11, int i11, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ h0 b(h0 h0Var, boolean z11, int i11, int i12, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = h0Var.f37423a;
        }
        if ((i13 & 2) != 0) {
            i11 = h0Var.f37424b;
        }
        if ((i13 & 4) != 0) {
            i12 = h0Var.f37425c;
        }
        if ((i13 & 8) != 0) {
            iVar = h0Var.unknownFields();
        }
        return h0Var.a(z11, i11, i12, iVar);
    }

    public final h0 a(boolean z11, int i11, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h0(z11, i11, i12, unknownFields);
    }

    public final int c() {
        return this.f37425c;
    }

    public final boolean d() {
        return this.f37423a;
    }

    public final int e() {
        return this.f37424b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h0Var.unknownFields()) && this.f37423a == h0Var.f37423a && this.f37424b == h0Var.f37424b && this.f37425c == h0Var.f37425c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37423a)) * 37) + Integer.hashCode(this.f37424b)) * 37) + Integer.hashCode(this.f37425c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m684newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37423a;
        arrayList.add("include_meta_data=" + z11);
        int i11 = this.f37424b;
        arrayList.add("radius=" + i11);
        int i12 = this.f37425c;
        arrayList.add("count=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "GetNearbyChargingSites{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m684newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(boolean z11, int i11, int i12, okio.i unknownFields) {
        super(f37422d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37423a = z11;
        this.f37424b = i11;
        this.f37425c = i12;
    }
}