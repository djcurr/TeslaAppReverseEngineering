package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<b> f7931c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "xAccelG", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f7932a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "zAccelG", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f7933b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AccelData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(i11, i12, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            return value.d() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            return b.b(value, 0, 0, okio.i.f42656d, 3, null);
        }
    }

    /* renamed from: bu.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0157b {
        private C0157b() {
        }

        public /* synthetic */ C0157b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0157b(null);
        f7931c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b.class), com.squareup.wire.o.PROTO_3);
    }

    public b() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ b(int i11, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, int i11, int i12, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f7932a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f7933b;
        }
        if ((i13 & 4) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(i11, i12, iVar);
    }

    public final b a(int i11, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b(i11, i12, unknownFields);
    }

    public final int c() {
        return this.f7932a;
    }

    public final int d() {
        return this.f7933b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && this.f7932a == bVar.f7932a && this.f7933b == bVar.f7933b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f7932a)) * 37) + Integer.hashCode(this.f7933b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m12newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f7932a;
        arrayList.add("xAccel_g=" + i11);
        int i12 = this.f7933b;
        arrayList.add("zAccel_g=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "AccelData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m12newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, int i12, okio.i unknownFields) {
        super(f7931c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7932a = i11;
        this.f7933b = i12;
    }
}