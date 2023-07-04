package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class y extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<y> f8274c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8275a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8276b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<y> {
        a(com.squareup.wire.b bVar, n00.d<y> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CertificateRead", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public y decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new y(i11, i12, reader.e(d11));
                }
                if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, y value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(y value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            return value.c() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public y redact(y value) {
            kotlin.jvm.internal.s.g(value, "value");
            return y.b(value, 0, 0, okio.i.f42656d, 3, null);
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
        f8274c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(y.class), com.squareup.wire.o.PROTO_3);
    }

    public y() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ y(int i11, int i12, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ y b(y yVar, int i11, int i12, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = yVar.f8275a;
        }
        if ((i13 & 2) != 0) {
            i12 = yVar.f8276b;
        }
        if ((i13 & 4) != 0) {
            iVar = yVar.unknownFields();
        }
        return yVar.a(i11, i12, iVar);
    }

    public final y a(int i11, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new y(i11, i12, unknownFields);
    }

    public final int c() {
        return this.f8276b;
    }

    public final int d() {
        return this.f8275a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), yVar.unknownFields()) && this.f8275a == yVar.f8275a && this.f8276b == yVar.f8276b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8275a)) * 37) + Integer.hashCode(this.f8276b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m87newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8275a;
        arrayList.add("readIndex=" + i11);
        int i12 = this.f8276b;
        arrayList.add("lengthToRead=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "CertificateRead{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m87newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i11, int i12, okio.i unknownFields) {
        super(f8274c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8275a = i11;
        this.f8276b = i12;
    }
}