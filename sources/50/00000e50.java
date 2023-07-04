package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class x extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<x> f8244d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8245a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8246b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f8247c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<x> {
        a(com.squareup.wire.b bVar, n00.d<x> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CertificateInParts", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public x decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new x(i11, i12, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, x value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(x value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            return !kotlin.jvm.internal.s.c(value.d(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public x redact(x value) {
            kotlin.jvm.internal.s.g(value, "value");
            return x.b(value, 0, 0, null, okio.i.f42656d, 7, null);
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
        f8244d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(x.class), com.squareup.wire.o.PROTO_3);
    }

    public x() {
        this(0, 0, null, null, 15, null);
    }

    public /* synthetic */ x(int i11, int i12, okio.i iVar, okio.i iVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? okio.i.f42656d : iVar, (i13 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ x b(x xVar, int i11, int i12, okio.i iVar, okio.i iVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = xVar.f8245a;
        }
        if ((i13 & 2) != 0) {
            i12 = xVar.f8246b;
        }
        if ((i13 & 4) != 0) {
            iVar = xVar.f8247c;
        }
        if ((i13 & 8) != 0) {
            iVar2 = xVar.unknownFields();
        }
        return xVar.a(i11, i12, iVar, iVar2);
    }

    public final x a(int i11, int i12, okio.i data_, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(data_, "data_");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new x(i11, i12, data_, unknownFields);
    }

    public final int c() {
        return this.f8246b;
    }

    public final okio.i d() {
        return this.f8247c;
    }

    public final int e() {
        return this.f8245a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), xVar.unknownFields()) && this.f8245a == xVar.f8245a && this.f8246b == xVar.f8246b && kotlin.jvm.internal.s.c(this.f8247c, xVar.f8247c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8245a)) * 37) + Integer.hashCode(this.f8246b)) * 37) + this.f8247c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m84newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8245a;
        arrayList.add("startIndex=" + i11);
        int i12 = this.f8246b;
        arrayList.add("certificateSize=" + i12);
        okio.i iVar = this.f8247c;
        arrayList.add("data_=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "CertificateInParts{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m84newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i11, int i12, okio.i data_, okio.i unknownFields) {
        super(f8244d, unknownFields);
        kotlin.jvm.internal.s.g(data_, "data_");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8245a = i11;
        this.f8246b = i12;
        this.f8247c = data_;
    }
}