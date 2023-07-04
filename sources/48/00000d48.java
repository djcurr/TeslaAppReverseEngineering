package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<f1> f7994b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final d1 f7995a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f1> {
        a(com.squareup.wire.b bVar, n00.d<f1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyMetadata", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            d1 d1Var = d1.KEY_FORM_FACTOR_UNKNOWN;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f1(d1Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        d1Var = d1.ADAPTER.decode(reader);
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
        public void encode(com.squareup.wire.l writer, f1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != d1.KEY_FORM_FACTOR_UNKNOWN) {
                d1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != d1.KEY_FORM_FACTOR_UNKNOWN ? z11 + d1.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f1 redact(f1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return f1.b(value, null, okio.i.f42656d, 1, null);
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
        f7994b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f1.class), com.squareup.wire.o.PROTO_3);
    }

    public f1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ f1(d1 d1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? d1.KEY_FORM_FACTOR_UNKNOWN : d1Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f1 b(f1 f1Var, d1 d1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d1Var = f1Var.f7995a;
        }
        if ((i11 & 2) != 0) {
            iVar = f1Var.unknownFields();
        }
        return f1Var.a(d1Var, iVar);
    }

    public final f1 a(d1 keyFormFactor, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f1(keyFormFactor, unknownFields);
    }

    public final d1 c() {
        return this.f7995a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), f1Var.unknownFields()) && this.f7995a == f1Var.f7995a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f7995a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m28newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        d1 d1Var = this.f7995a;
        arrayList.add("keyFormFactor=" + d1Var);
        l02 = wz.e0.l0(arrayList, ", ", "KeyMetadata{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m28newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(d1 keyFormFactor, okio.i unknownFields) {
        super(f7994b, unknownFields);
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7995a = keyFormFactor;
    }
}