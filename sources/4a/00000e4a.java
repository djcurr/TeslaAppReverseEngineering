package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<w2> f8237c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8238a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8239b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w2> {
        a(com.squareup.wire.b bVar, n00.d<w2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new w2(i11, i12, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.SINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            if (value.d() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            return value.d() != 0 ? z11 + ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w2 redact(w2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return w2.b(value, 0, 0, okio.i.f42656d, 3, null);
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
        f8237c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w2.class), com.squareup.wire.o.PROTO_3);
    }

    public w2() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ w2(int i11, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ w2 b(w2 w2Var, int i11, int i12, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = w2Var.f8238a;
        }
        if ((i13 & 2) != 0) {
            i12 = w2Var.f8239b;
        }
        if ((i13 & 4) != 0) {
            iVar = w2Var.unknownFields();
        }
        return w2Var.a(i11, i12, iVar);
    }

    public final w2 a(int i11, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w2(i11, i12, unknownFields);
    }

    public final int c() {
        return this.f8238a;
    }

    public final int d() {
        return this.f8239b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w2Var.unknownFields()) && this.f8238a == w2Var.f8238a && this.f8239b == w2Var.f8239b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8238a)) * 37) + Integer.hashCode(this.f8239b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m82newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8238a;
        arrayList.add("pressure=" + i11);
        int i12 = this.f8239b;
        arrayList.add("temperature=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "TPData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m82newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(int i11, int i12, okio.i unknownFields) {
        super(f8237c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8238a = i11;
        this.f8239b = i12;
    }
}