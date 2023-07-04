package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class o2 extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<o2> f8141g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8142a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: b  reason: collision with root package name */
    private final int f8143b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f8144c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: d  reason: collision with root package name */
    private final okio.i f8145d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignatureType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: e  reason: collision with root package name */
    private final n2 f8146e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: f  reason: collision with root package name */
    private final okio.i f8147f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o2> {
        a(com.squareup.wire.b bVar, n00.d<o2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SignedMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            n2 n2Var = n2.SIGNATURE_TYPE_AES_GCM;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            okio.i iVar3 = iVar2;
            n2 n2Var2 = n2Var;
            int i11 = 0;
            okio.i iVar4 = iVar3;
            okio.i iVar5 = iVar4;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o2(iVar4, i11, iVar5, iVar2, n2Var2, iVar3, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        iVar4 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 2:
                        iVar2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        try {
                            n2Var2 = n2.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 4:
                        iVar3 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 5:
                        iVar5 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i h11 = value.h();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(h11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.h());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.e(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.e());
            }
            if (value.g() != n2.SIGNATURE_TYPE_AES_GCM) {
                n2.ADAPTER.encodeWithTag(writer, 3, value.g());
            }
            if (!kotlin.jvm.internal.s.c(value.f(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.f());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i h11 = value.h();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(h11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.h());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.e(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.e());
            }
            if (value.g() != n2.SIGNATURE_TYPE_AES_GCM) {
                z11 += n2.ADAPTER.encodedSizeWithTag(3, value.g());
            }
            return !kotlin.jvm.internal.s.c(value.f(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.f()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o2 redact(o2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return o2.b(value, null, 0, null, null, null, null, okio.i.f42656d, 63, null);
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
        f8141g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(o2.class), com.squareup.wire.o.PROTO_3);
    }

    public o2() {
        this(null, 0, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ o2(okio.i iVar, int i11, okio.i iVar2, okio.i iVar3, n2 n2Var, okio.i iVar4, okio.i iVar5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.i.f42656d : iVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.i.f42656d : iVar2, (i12 & 8) != 0 ? okio.i.f42656d : iVar3, (i12 & 16) != 0 ? n2.SIGNATURE_TYPE_AES_GCM : n2Var, (i12 & 32) != 0 ? okio.i.f42656d : iVar4, (i12 & 64) != 0 ? okio.i.f42656d : iVar5);
    }

    public static /* synthetic */ o2 b(o2 o2Var, okio.i iVar, int i11, okio.i iVar2, okio.i iVar3, n2 n2Var, okio.i iVar4, okio.i iVar5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iVar = o2Var.f8142a;
        }
        if ((i12 & 2) != 0) {
            i11 = o2Var.f8143b;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            iVar2 = o2Var.f8144c;
        }
        okio.i iVar6 = iVar2;
        if ((i12 & 8) != 0) {
            iVar3 = o2Var.f8145d;
        }
        okio.i iVar7 = iVar3;
        if ((i12 & 16) != 0) {
            n2Var = o2Var.f8146e;
        }
        n2 n2Var2 = n2Var;
        if ((i12 & 32) != 0) {
            iVar4 = o2Var.f8147f;
        }
        okio.i iVar8 = iVar4;
        if ((i12 & 64) != 0) {
            iVar5 = o2Var.unknownFields();
        }
        return o2Var.a(iVar, i13, iVar6, iVar7, n2Var2, iVar8, iVar5);
    }

    public final o2 a(okio.i token, int i11, okio.i keyId, okio.i protobufMessageAsBytes, n2 signatureType, okio.i signature, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(keyId, "keyId");
        kotlin.jvm.internal.s.g(protobufMessageAsBytes, "protobufMessageAsBytes");
        kotlin.jvm.internal.s.g(signatureType, "signatureType");
        kotlin.jvm.internal.s.g(signature, "signature");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o2(token, i11, keyId, protobufMessageAsBytes, signatureType, signature, unknownFields);
    }

    public final int c() {
        return this.f8143b;
    }

    public final okio.i d() {
        return this.f8144c;
    }

    public final okio.i e() {
        return this.f8145d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            o2 o2Var = (o2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), o2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8142a, o2Var.f8142a) && this.f8143b == o2Var.f8143b && kotlin.jvm.internal.s.c(this.f8144c, o2Var.f8144c) && kotlin.jvm.internal.s.c(this.f8145d, o2Var.f8145d) && this.f8146e == o2Var.f8146e && kotlin.jvm.internal.s.c(this.f8147f, o2Var.f8147f);
        }
        return false;
    }

    public final okio.i f() {
        return this.f8147f;
    }

    public final n2 g() {
        return this.f8146e;
    }

    public final okio.i h() {
        return this.f8142a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + this.f8142a.hashCode()) * 37) + Integer.hashCode(this.f8143b)) * 37) + this.f8144c.hashCode()) * 37) + this.f8145d.hashCode()) * 37) + this.f8146e.hashCode()) * 37) + this.f8147f.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m60newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8142a;
        arrayList.add("token=" + iVar);
        int i11 = this.f8143b;
        arrayList.add("counter=" + i11);
        okio.i iVar2 = this.f8144c;
        arrayList.add("keyId=" + iVar2);
        okio.i iVar3 = this.f8145d;
        arrayList.add("protobufMessageAsBytes=" + iVar3);
        n2 n2Var = this.f8146e;
        arrayList.add("signatureType=" + n2Var);
        okio.i iVar4 = this.f8147f;
        arrayList.add("signature=" + iVar4);
        l02 = wz.e0.l0(arrayList, ", ", "SignedMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m60newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(okio.i token, int i11, okio.i keyId, okio.i protobufMessageAsBytes, n2 signatureType, okio.i signature, okio.i unknownFields) {
        super(f8141g, unknownFields);
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(keyId, "keyId");
        kotlin.jvm.internal.s.g(protobufMessageAsBytes, "protobufMessageAsBytes");
        kotlin.jvm.internal.s.g(signatureType, "signatureType");
        kotlin.jvm.internal.s.g(signature, "signature");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8142a = token;
        this.f8143b = i11;
        this.f8144c = keyId;
        this.f8145d = protobufMessageAsBytes;
        this.f8146e = signatureType;
        this.f8147f = signature;
    }
}