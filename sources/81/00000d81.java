package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class j0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<j0> f8057d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8058a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8059b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8060c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j0> {
        a(com.squareup.wire.b bVar, n00.d<j0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ConnectionMetrics", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j0(i11, i12, i13, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return value.c() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j0 redact(j0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return j0.b(value, 0, 0, 0, okio.i.f42656d, 7, null);
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
        f8057d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(j0.class), com.squareup.wire.o.PROTO_3);
    }

    public j0() {
        this(0, 0, 0, null, 15, null);
    }

    public /* synthetic */ j0(int i11, int i12, int i13, okio.i iVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ j0 b(j0 j0Var, int i11, int i12, int i13, okio.i iVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = j0Var.f8058a;
        }
        if ((i14 & 2) != 0) {
            i12 = j0Var.f8059b;
        }
        if ((i14 & 4) != 0) {
            i13 = j0Var.f8060c;
        }
        if ((i14 & 8) != 0) {
            iVar = j0Var.unknownFields();
        }
        return j0Var.a(i11, i12, i13, iVar);
    }

    public final j0 a(int i11, int i12, int i13, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j0(i11, i12, i13, unknownFields);
    }

    public final int c() {
        return this.f8060c;
    }

    public final int d() {
        return this.f8058a;
    }

    public final int e() {
        return this.f8059b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), j0Var.unknownFields()) && this.f8058a == j0Var.f8058a && this.f8059b == j0Var.f8059b && this.f8060c == j0Var.f8060c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8058a)) * 37) + Integer.hashCode(this.f8059b)) * 37) + Integer.hashCode(this.f8060c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m41newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8058a;
        arrayList.add("goodConnEventCount=" + i11);
        int i12 = this.f8059b;
        arrayList.add("missedConnEventCount=" + i12);
        int i13 = this.f8060c;
        arrayList.add("badCRCConnEventCount=" + i13);
        l02 = wz.e0.l0(arrayList, ", ", "ConnectionMetrics{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m41newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i11, int i12, int i13, okio.i unknownFields) {
        super(f8057d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8058a = i11;
        this.f8059b = i12;
        this.f8060c = i13;
    }
}