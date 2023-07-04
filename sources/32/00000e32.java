package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<v> f8217c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8218a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8219b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v> {
        a(com.squareup.wire.b bVar, n00.d<v> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.Capabilities", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v(z11, z12, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            return value.c() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v redact(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            return v.b(value, false, false, okio.i.f42656d, 3, null);
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
        f8217c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v.class), com.squareup.wire.o.PROTO_3);
    }

    public v() {
        this(false, false, null, 7, null);
    }

    public /* synthetic */ v(boolean z11, boolean z12, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ v b(v vVar, boolean z11, boolean z12, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = vVar.f8218a;
        }
        if ((i11 & 2) != 0) {
            z12 = vVar.f8219b;
        }
        if ((i11 & 4) != 0) {
            iVar = vVar.unknownFields();
        }
        return vVar.a(z11, z12, iVar);
    }

    public final v a(boolean z11, boolean z12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v(z11, z12, unknownFields);
    }

    public final boolean c() {
        return this.f8219b;
    }

    public final boolean d() {
        return this.f8218a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), vVar.unknownFields()) && this.f8218a == vVar.f8218a && this.f8219b == vVar.f8219b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f8218a)) * 37) + Boolean.hashCode(this.f8219b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m77newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f8218a;
        arrayList.add("chargePortOpen=" + z11);
        boolean z12 = this.f8219b;
        arrayList.add("chargePortClose=" + z12);
        l02 = wz.e0.l0(arrayList, ", ", "Capabilities{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m77newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z11, boolean z12, okio.i unknownFields) {
        super(f8217c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8218a = z11;
        this.f8219b = z12;
    }
}