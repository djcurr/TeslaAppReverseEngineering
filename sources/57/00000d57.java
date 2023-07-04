package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g1 extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<g1> f8016g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e1 f8017a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCPresence#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final r1 f8018b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEPresence#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f8019c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final b2 f8020d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyFormFactor#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final d1 f8021e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f8022f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g1> {
        a(com.squareup.wire.b bVar, n00.d<g1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            r1 r1Var = r1.NFC_PRESENCE_NOT_PRESENT;
            u uVar = u.BLE_PRESENCE_NOT_PRESENT;
            d1 d1Var = d1.KEY_FORM_FACTOR_UNKNOWN;
            long d11 = reader.d();
            b2 b2Var = null;
            int i11 = 0;
            d1 d1Var2 = d1Var;
            e1 e1Var = null;
            u uVar2 = uVar;
            while (true) {
                r1 r1Var2 = r1Var;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new g1(e1Var, r1Var2, uVar2, b2Var, d1Var2, i11, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            e1Var = e1.f7982b.decode(reader);
                        case 2:
                            try {
                                r1Var = r1.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                break;
                            }
                        case 3:
                            try {
                                uVar2 = u.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            }
                        case 4:
                            b2Var = b2.f7941b.decode(reader);
                        case 5:
                            try {
                                d1Var2 = d1.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                            }
                        case 6:
                            i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        default:
                            reader.m(g11);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != null) {
                e1.f7982b.encodeWithTag(writer, 1, value.e());
            }
            if (value.f() != r1.NFC_PRESENCE_NOT_PRESENT) {
                r1.ADAPTER.encodeWithTag(writer, 2, value.f());
            }
            if (value.c() != u.BLE_PRESENCE_NOT_PRESENT) {
                u.ADAPTER.encodeWithTag(writer, 3, value.c());
            }
            if (value.g() != null) {
                b2.f7941b.encodeWithTag(writer, 4, value.g());
            }
            if (value.d() != d1.KEY_FORM_FACTOR_UNKNOWN) {
                d1.ADAPTER.encodeWithTag(writer, 5, value.d());
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.h()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != null) {
                z11 += e1.f7982b.encodedSizeWithTag(1, value.e());
            }
            if (value.f() != r1.NFC_PRESENCE_NOT_PRESENT) {
                z11 += r1.ADAPTER.encodedSizeWithTag(2, value.f());
            }
            if (value.c() != u.BLE_PRESENCE_NOT_PRESENT) {
                z11 += u.ADAPTER.encodedSizeWithTag(3, value.c());
            }
            if (value.g() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(4, value.g());
            }
            if (value.d() != d1.KEY_FORM_FACTOR_UNKNOWN) {
                z11 += d1.ADAPTER.encodedSizeWithTag(5, value.d());
            }
            return value.h() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.h())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g1 redact(g1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            e1 e11 = value.e();
            e1 redact = e11 == null ? null : e1.f7982b.redact(e11);
            b2 g11 = value.g();
            return g1.b(value, redact, null, null, g11 != null ? b2.f7941b.redact(g11) : null, null, 0, okio.i.f42656d, 54, null);
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
        f8016g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g1.class), com.squareup.wire.o.PROTO_3);
    }

    public g1() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    public /* synthetic */ g1(e1 e1Var, r1 r1Var, u uVar, b2 b2Var, d1 d1Var, int i11, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : e1Var, (i12 & 2) != 0 ? r1.NFC_PRESENCE_NOT_PRESENT : r1Var, (i12 & 4) != 0 ? u.BLE_PRESENCE_NOT_PRESENT : uVar, (i12 & 8) == 0 ? b2Var : null, (i12 & 16) != 0 ? d1.KEY_FORM_FACTOR_UNKNOWN : d1Var, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ g1 b(g1 g1Var, e1 e1Var, r1 r1Var, u uVar, b2 b2Var, d1 d1Var, int i11, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            e1Var = g1Var.f8017a;
        }
        if ((i12 & 2) != 0) {
            r1Var = g1Var.f8018b;
        }
        r1 r1Var2 = r1Var;
        if ((i12 & 4) != 0) {
            uVar = g1Var.f8019c;
        }
        u uVar2 = uVar;
        if ((i12 & 8) != 0) {
            b2Var = g1Var.f8020d;
        }
        b2 b2Var2 = b2Var;
        if ((i12 & 16) != 0) {
            d1Var = g1Var.f8021e;
        }
        d1 d1Var2 = d1Var;
        if ((i12 & 32) != 0) {
            i11 = g1Var.f8022f;
        }
        int i13 = i11;
        if ((i12 & 64) != 0) {
            iVar = g1Var.unknownFields();
        }
        return g1Var.a(e1Var, r1Var2, uVar2, b2Var2, d1Var2, i13, iVar);
    }

    public final g1 a(e1 e1Var, r1 nfcPresence, u blePresence, b2 b2Var, d1 keyFormFactor, int i11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(nfcPresence, "nfcPresence");
        kotlin.jvm.internal.s.g(blePresence, "blePresence");
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g1(e1Var, nfcPresence, blePresence, b2Var, keyFormFactor, i11, unknownFields);
    }

    public final u c() {
        return this.f8019c;
    }

    public final d1 d() {
        return this.f8021e;
    }

    public final e1 e() {
        return this.f8017a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), g1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8017a, g1Var.f8017a) && this.f8018b == g1Var.f8018b && this.f8019c == g1Var.f8019c && kotlin.jvm.internal.s.c(this.f8020d, g1Var.f8020d) && this.f8021e == g1Var.f8021e && this.f8022f == g1Var.f8022f;
        }
        return false;
    }

    public final r1 f() {
        return this.f8018b;
    }

    public final b2 g() {
        return this.f8020d;
    }

    public final int h() {
        return this.f8022f;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            e1 e1Var = this.f8017a;
            int hashCode2 = (((((hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 37) + this.f8018b.hashCode()) * 37) + this.f8019c.hashCode()) * 37;
            b2 b2Var = this.f8020d;
            int hashCode3 = ((((hashCode2 + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f8021e.hashCode()) * 37) + Integer.hashCode(this.f8022f);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m32newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e1 e1Var = this.f8017a;
        if (e1Var != null) {
            arrayList.add("keyId=" + e1Var);
        }
        r1 r1Var = this.f8018b;
        arrayList.add("nfcPresence=" + r1Var);
        u uVar = this.f8019c;
        arrayList.add("blePresence=" + uVar);
        b2 b2Var = this.f8020d;
        if (b2Var != null) {
            arrayList.add("publicKey=" + b2Var);
        }
        d1 d1Var = this.f8021e;
        arrayList.add("keyFormFactor=" + d1Var);
        int i11 = this.f8022f;
        arrayList.add("slot=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "KeyStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m32newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e1 e1Var, r1 nfcPresence, u blePresence, b2 b2Var, d1 keyFormFactor, int i11, okio.i unknownFields) {
        super(f8016g, unknownFields);
        kotlin.jvm.internal.s.g(nfcPresence, "nfcPresence");
        kotlin.jvm.internal.s.g(blePresence, "blePresence");
        kotlin.jvm.internal.s.g(keyFormFactor, "keyFormFactor");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8017a = e1Var;
        this.f8018b = nfcPresence;
        this.f8019c = blePresence;
        this.f8020d = b2Var;
        this.f8021e = keyFormFactor;
        this.f8022f = i11;
    }
}