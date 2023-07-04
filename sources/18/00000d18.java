package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<c2> f7963c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final b2 f7964a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKeyStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final d2 f7965b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c2> {
        a(com.squareup.wire.b bVar, n00.d<c2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PublicKeyResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            d2 d2Var = d2.PUBLIC_KEY_STATUS_NONE;
            long d11 = reader.d();
            b2 b2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c2(b2Var, d2Var, reader.e(d11));
                } else if (g11 == 1) {
                    b2Var = b2.f7941b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        d2Var = d2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                b2.f7941b.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != d2.PUBLIC_KEY_STATUS_NONE) {
                d2.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(1, value.c());
            }
            return value.d() != d2.PUBLIC_KEY_STATUS_NONE ? z11 + d2.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c2 redact(c2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            b2 c11 = value.c();
            return c2.b(value, c11 == null ? null : b2.f7941b.redact(c11), null, okio.i.f42656d, 2, null);
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
        f7963c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c2.class), com.squareup.wire.o.PROTO_3);
    }

    public c2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ c2(b2 b2Var, d2 d2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : b2Var, (i11 & 2) != 0 ? d2.PUBLIC_KEY_STATUS_NONE : d2Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ c2 b(c2 c2Var, b2 b2Var, d2 d2Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            b2Var = c2Var.f7964a;
        }
        if ((i11 & 2) != 0) {
            d2Var = c2Var.f7965b;
        }
        if ((i11 & 4) != 0) {
            iVar = c2Var.unknownFields();
        }
        return c2Var.a(b2Var, d2Var, iVar);
    }

    public final c2 a(b2 b2Var, d2 publicKeyStatus, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(publicKeyStatus, "publicKeyStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new c2(b2Var, publicKeyStatus, unknownFields);
    }

    public final b2 c() {
        return this.f7964a;
    }

    public final d2 d() {
        return this.f7965b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), c2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f7964a, c2Var.f7964a) && this.f7965b == c2Var.f7965b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            b2 b2Var = this.f7964a;
            int hashCode2 = ((hashCode + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f7965b.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m20newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        b2 b2Var = this.f7964a;
        if (b2Var != null) {
            arrayList.add("publicKey=" + b2Var);
        }
        d2 d2Var = this.f7965b;
        arrayList.add("publicKeyStatus=" + d2Var);
        l02 = wz.e0.l0(arrayList, ", ", "PublicKeyResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m20newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(b2 b2Var, d2 publicKeyStatus, okio.i unknownFields) {
        super(f7963c, unknownFields);
        kotlin.jvm.internal.s.g(publicKeyStatus, "publicKeyStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7964a = b2Var;
        this.f7965b = publicKeyStatus;
    }
}