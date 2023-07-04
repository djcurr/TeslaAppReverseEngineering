package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class u2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<u2> f8214c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8215a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8216b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<u2> {
        a(com.squareup.wire.b bVar, n00.d<u2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.StageBlock", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new u2(i11, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.c()));
            }
            return !kotlin.jvm.internal.s.c(value.d(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u2 redact(u2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return u2.b(value, 0, null, okio.i.f42656d, 3, null);
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
        f8214c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(u2.class), com.squareup.wire.o.PROTO_3);
    }

    public u2() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ u2(int i11, okio.i iVar, okio.i iVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? okio.i.f42656d : iVar, (i12 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ u2 b(u2 u2Var, int i11, okio.i iVar, okio.i iVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = u2Var.f8215a;
        }
        if ((i12 & 2) != 0) {
            iVar = u2Var.f8216b;
        }
        if ((i12 & 4) != 0) {
            iVar2 = u2Var.unknownFields();
        }
        return u2Var.a(i11, iVar, iVar2);
    }

    public final u2 a(int i11, okio.i blockToStage, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(blockToStage, "blockToStage");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u2(i11, blockToStage, unknownFields);
    }

    public final int c() {
        return this.f8215a;
    }

    public final okio.i d() {
        return this.f8216b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), u2Var.unknownFields()) && this.f8215a == u2Var.f8215a && kotlin.jvm.internal.s.c(this.f8216b, u2Var.f8216b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8215a)) * 37) + this.f8216b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m76newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8215a;
        arrayList.add("blockAddress=" + i11);
        okio.i iVar = this.f8216b;
        arrayList.add("blockToStage=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "StageBlock{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m76newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i11, okio.i blockToStage, okio.i unknownFields) {
        super(f8214c, unknownFields);
        kotlin.jvm.internal.s.g(blockToStage, "blockToStage");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8215a = i11;
        this.f8216b = blockToStage;
    }
}