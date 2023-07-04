package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<m1> f8097c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8098a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8099b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m1> {
        a(com.squareup.wire.b bVar, n00.d<m1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.MISessionRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m1(i11, iVar, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, m1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m1 redact(m1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return m1.b(value, 0, null, okio.i.f42656d, 3, null);
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
        f8097c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m1.class), com.squareup.wire.o.PROTO_3);
    }

    public m1() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ m1(int i11, okio.i iVar, okio.i iVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? okio.i.f42656d : iVar, (i12 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ m1 b(m1 m1Var, int i11, okio.i iVar, okio.i iVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = m1Var.f8098a;
        }
        if ((i12 & 2) != 0) {
            iVar = m1Var.f8099b;
        }
        if ((i12 & 4) != 0) {
            iVar2 = m1Var.unknownFields();
        }
        return m1Var.a(i11, iVar, iVar2);
    }

    public final m1 a(int i11, okio.i accessoryConfigurationData, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(accessoryConfigurationData, "accessoryConfigurationData");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m1(i11, accessoryConfigurationData, unknownFields);
    }

    public final okio.i c() {
        return this.f8099b;
    }

    public final int d() {
        return this.f8098a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), m1Var.unknownFields()) && this.f8098a == m1Var.f8098a && kotlin.jvm.internal.s.c(this.f8099b, m1Var.f8099b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8098a)) * 37) + this.f8099b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m51newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8098a;
        arrayList.add("sessionId=" + i11);
        okio.i iVar = this.f8099b;
        arrayList.add("accessoryConfigurationData=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "MISessionRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m51newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i11, okio.i accessoryConfigurationData, okio.i unknownFields) {
        super(f8097c, unknownFields);
        kotlin.jvm.internal.s.g(accessoryConfigurationData, "accessoryConfigurationData");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8098a = i11;
        this.f8099b = accessoryConfigurationData;
    }
}