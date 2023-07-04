package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class u0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<u0> f8212b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterLocation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final p3 f8213a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<u0> {
        a(com.squareup.wire.b bVar, n00.d<u0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.GetCodeDescriptor", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            p3 p3Var = p3.UPDATER_LOCATION_NONE;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new u0(p3Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        p3Var = p3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != p3.UPDATER_LOCATION_NONE) {
                p3.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != p3.UPDATER_LOCATION_NONE ? z11 + p3.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u0 redact(u0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return u0.b(value, null, okio.i.f42656d, 1, null);
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
        f8212b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(u0.class), com.squareup.wire.o.PROTO_3);
    }

    public u0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ u0(p3 p3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p3.UPDATER_LOCATION_NONE : p3Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ u0 b(u0 u0Var, p3 p3Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            p3Var = u0Var.f8213a;
        }
        if ((i11 & 2) != 0) {
            iVar = u0Var.unknownFields();
        }
        return u0Var.a(p3Var, iVar);
    }

    public final u0 a(p3 location, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(location, "location");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u0(location, unknownFields);
    }

    public final p3 c() {
        return this.f8213a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), u0Var.unknownFields()) && this.f8213a == u0Var.f8213a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8213a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m75newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        p3 p3Var = this.f8213a;
        arrayList.add("location=" + p3Var);
        l02 = wz.e0.l0(arrayList, ", ", "GetCodeDescriptor{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m75newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p3 location, okio.i unknownFields) {
        super(f8212b, unknownFields);
        kotlin.jvm.internal.s.g(location, "location");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8213a = location;
    }
}