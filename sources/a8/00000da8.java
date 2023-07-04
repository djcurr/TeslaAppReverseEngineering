package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class l3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<l3> f8089d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final g1 f8090a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final b2 f8091b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final d1 f8092c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l3> {
        a(com.squareup.wire.b bVar, n00.d<l3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UnknownKeyInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            d1 d1Var = d1.KEY_FORM_FACTOR_UNKNOWN;
            long d11 = reader.d();
            g1 g1Var = null;
            b2 b2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l3(g1Var, b2Var, d1Var, reader.e(d11));
                } else if (g11 == 1) {
                    g1Var = g1.f8016g.decode(reader);
                } else if (g11 == 2) {
                    b2Var = b2.f7941b.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        d1Var = d1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != null) {
                g1.f8016g.encodeWithTag(writer, 1, value.d());
            }
            if (value.e() != null) {
                b2.f7941b.encodeWithTag(writer, 2, value.e());
            }
            if (value.c() != d1.KEY_FORM_FACTOR_UNKNOWN) {
                d1.ADAPTER.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != null) {
                z11 += g1.f8016g.encodedSizeWithTag(1, value.d());
            }
            if (value.e() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(2, value.e());
            }
            return value.c() != d1.KEY_FORM_FACTOR_UNKNOWN ? z11 + d1.ADAPTER.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l3 redact(l3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            g1 d11 = value.d();
            g1 redact = d11 == null ? null : g1.f8016g.redact(d11);
            b2 e11 = value.e();
            return l3.b(value, redact, e11 != null ? b2.f7941b.redact(e11) : null, null, okio.i.f42656d, 4, null);
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
        f8089d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(l3.class), com.squareup.wire.o.PROTO_3);
    }

    public l3() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ l3(g1 g1Var, b2 b2Var, d1 d1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : g1Var, (i11 & 2) != 0 ? null : b2Var, (i11 & 4) != 0 ? d1.KEY_FORM_FACTOR_UNKNOWN : d1Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ l3 b(l3 l3Var, g1 g1Var, b2 b2Var, d1 d1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g1Var = l3Var.f8090a;
        }
        if ((i11 & 2) != 0) {
            b2Var = l3Var.f8091b;
        }
        if ((i11 & 4) != 0) {
            d1Var = l3Var.f8092c;
        }
        if ((i11 & 8) != 0) {
            iVar = l3Var.unknownFields();
        }
        return l3Var.a(g1Var, b2Var, d1Var, iVar);
    }

    public final l3 a(g1 g1Var, b2 b2Var, d1 keyFormFactor, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l3(g1Var, b2Var, keyFormFactor, unknownFields);
    }

    public final d1 c() {
        return this.f8092c;
    }

    public final g1 d() {
        return this.f8090a;
    }

    public final b2 e() {
        return this.f8091b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l3) {
            l3 l3Var = (l3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), l3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8090a, l3Var.f8090a) && kotlin.jvm.internal.s.c(this.f8091b, l3Var.f8091b) && this.f8092c == l3Var.f8092c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            g1 g1Var = this.f8090a;
            int hashCode2 = (hashCode + (g1Var != null ? g1Var.hashCode() : 0)) * 37;
            b2 b2Var = this.f8091b;
            int hashCode3 = ((hashCode2 + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f8092c.hashCode();
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m49newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        g1 g1Var = this.f8090a;
        if (g1Var != null) {
            arrayList.add("keyStatus=" + g1Var);
        }
        b2 b2Var = this.f8091b;
        if (b2Var != null) {
            arrayList.add("publicKey=" + b2Var);
        }
        d1 d1Var = this.f8092c;
        arrayList.add("keyFormFactor=" + d1Var);
        l02 = wz.e0.l0(arrayList, ", ", "UnknownKeyInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m49newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(g1 g1Var, b2 b2Var, d1 keyFormFactor, okio.i unknownFields) {
        super(f8089d, unknownFields);
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8090a = g1Var;
        this.f8091b = b2Var;
        this.f8092c = keyFormFactor;
    }
}