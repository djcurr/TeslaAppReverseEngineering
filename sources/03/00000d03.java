package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b1 extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<b1> f7936e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.InformationRequestType#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final c1 f7937a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e1 f7938b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f7939c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final Integer f7940d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b1> {
        a(com.squareup.wire.b bVar, n00.d<b1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.InformationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            c1 c1Var = c1.INFORMATION_REQUEST_TYPE_GET_STATUS;
            long d11 = reader.d();
            e1 e1Var = null;
            okio.i iVar = null;
            Integer num = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b1(c1Var, e1Var, iVar, num, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        c1Var = c1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    e1Var = e1.f7982b.decode(reader);
                } else if (g11 == 3) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    num = ProtoAdapter.UINT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != c1.INFORMATION_REQUEST_TYPE_GET_STATUS) {
                c1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            e1.f7982b.encodeWithTag(writer, 2, value.d());
            ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.e());
            ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != c1.INFORMATION_REQUEST_TYPE_GET_STATUS) {
                z11 += c1.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return z11 + e1.f7982b.encodedSizeWithTag(2, value.d()) + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.e()) + ProtoAdapter.UINT32.encodedSizeWithTag(4, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b1 redact(b1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            e1 d11 = value.d();
            return b1.b(value, null, d11 == null ? null : e1.f7982b.redact(d11), null, null, okio.i.f42656d, 13, null);
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
        f7936e = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b1.class), com.squareup.wire.o.PROTO_3);
    }

    public b1() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ b1(c1 c1Var, e1 e1Var, okio.i iVar, Integer num, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c1.INFORMATION_REQUEST_TYPE_GET_STATUS : c1Var, (i11 & 2) != 0 ? null : e1Var, (i11 & 4) != 0 ? null : iVar, (i11 & 8) == 0 ? num : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ b1 b(b1 b1Var, c1 c1Var, e1 e1Var, okio.i iVar, Integer num, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c1Var = b1Var.f7937a;
        }
        if ((i11 & 2) != 0) {
            e1Var = b1Var.f7938b;
        }
        e1 e1Var2 = e1Var;
        if ((i11 & 4) != 0) {
            iVar = b1Var.f7939c;
        }
        okio.i iVar3 = iVar;
        if ((i11 & 8) != 0) {
            num = b1Var.f7940d;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            iVar2 = b1Var.unknownFields();
        }
        return b1Var.a(c1Var, e1Var2, iVar3, num2, iVar2);
    }

    public final b1 a(c1 informationRequestType, e1 e1Var, okio.i iVar, Integer num, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(informationRequestType, "informationRequestType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b1(informationRequestType, e1Var, iVar, num, unknownFields);
    }

    public final c1 c() {
        return this.f7937a;
    }

    public final e1 d() {
        return this.f7938b;
    }

    public final okio.i e() {
        return this.f7939c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b1Var.unknownFields()) && this.f7937a == b1Var.f7937a && kotlin.jvm.internal.s.c(this.f7938b, b1Var.f7938b) && kotlin.jvm.internal.s.c(this.f7939c, b1Var.f7939c) && kotlin.jvm.internal.s.c(this.f7940d, b1Var.f7940d);
        }
        return false;
    }

    public final Integer f() {
        return this.f7940d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f7937a.hashCode()) * 37;
            e1 e1Var = this.f7938b;
            int hashCode2 = (hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 37;
            okio.i iVar = this.f7939c;
            int hashCode3 = (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            Integer num = this.f7940d;
            int hashCode4 = hashCode3 + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m14newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        c1 c1Var = this.f7937a;
        arrayList.add("informationRequestType=" + c1Var);
        e1 e1Var = this.f7938b;
        if (e1Var != null) {
            arrayList.add("keyId=" + e1Var);
        }
        okio.i iVar = this.f7939c;
        if (iVar != null) {
            arrayList.add("publicKey=" + iVar);
        }
        Integer num = this.f7940d;
        if (num != null) {
            arrayList.add("slot=" + num);
        }
        l02 = wz.e0.l0(arrayList, ", ", "InformationRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m14newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 informationRequestType, e1 e1Var, okio.i iVar, Integer num, okio.i unknownFields) {
        super(f7936e, unknownFields);
        kotlin.jvm.internal.s.g(informationRequestType, "informationRequestType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7937a = informationRequestType;
        this.f7938b = e1Var;
        this.f7939c = iVar;
        this.f7940d = num;
        if (!(mr.d.d(e1Var, iVar, num) <= 1)) {
            throw new IllegalArgumentException("At most one of keyId, publicKey, slot may be non-null".toString());
        }
    }
}