package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class y3 extends com.squareup.wire.f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<y3> f8284h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e1 f8285a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final b2 f8286b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final f1 f8287c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final int f8288d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final int f8289e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: f  reason: collision with root package name */
    private final rt.a f8290f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistKeyPermission_E#ADAPTER", label = q.a.REPEATED, tag = 3)

    /* renamed from: g  reason: collision with root package name */
    private final List<a4> f8291g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<y3> {
        a(com.squareup.wire.b bVar, n00.d<y3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistEntryInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public y3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            rt.a aVar = rt.a.ROLE_NONE;
            long d11 = reader.d();
            e1 e1Var = null;
            int i11 = 0;
            int i12 = 0;
            b2 b2Var = null;
            f1 f1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new y3(e1Var, b2Var, arrayList, f1Var, i11, i12, aVar, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        e1Var = e1.f7982b.decode(reader);
                        break;
                    case 2:
                        b2Var = b2.f7941b.decode(reader);
                        break;
                    case 3:
                        try {
                            arrayList.add(a4.ADAPTER.decode(reader));
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            vz.b0 b0Var = vz.b0.f54756a;
                            break;
                        }
                    case 4:
                        f1Var = f1.f7994b.decode(reader);
                        break;
                    case 5:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        try {
                            aVar = rt.a.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            break;
                        }
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, y3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                e1.f7982b.encodeWithTag(writer, 1, value.c());
            }
            if (value.g() != null) {
                b2.f7941b.encodeWithTag(writer, 2, value.g());
            }
            a4.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.f());
            if (value.e() != null) {
                f1.f7994b.encodeWithTag(writer, 4, value.e());
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.h()));
            }
            if (value.i() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.i()));
            }
            if (value.d() != rt.a.ROLE_NONE) {
                rt.a.ADAPTER.encodeWithTag(writer, 7, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(y3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += e1.f7982b.encodedSizeWithTag(1, value.c());
            }
            if (value.g() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(2, value.g());
            }
            int encodedSizeWithTag = z11 + a4.ADAPTER.asRepeated().encodedSizeWithTag(3, value.f());
            if (value.e() != null) {
                encodedSizeWithTag += f1.f7994b.encodedSizeWithTag(4, value.e());
            }
            if (value.h() != 0) {
                encodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.h()));
            }
            if (value.i() != 0) {
                encodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.i()));
            }
            return value.d() != rt.a.ROLE_NONE ? encodedSizeWithTag + rt.a.ADAPTER.encodedSizeWithTag(7, value.d()) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public y3 redact(y3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            e1 c11 = value.c();
            e1 redact = c11 == null ? null : e1.f7982b.redact(c11);
            b2 g11 = value.g();
            b2 redact2 = g11 == null ? null : b2.f7941b.redact(g11);
            f1 e11 = value.e();
            return y3.b(value, redact, redact2, null, e11 != null ? f1.f7994b.redact(e11) : null, 0, 0, null, okio.i.f42656d, 116, null);
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
        f8284h = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(y3.class), com.squareup.wire.o.PROTO_3);
    }

    public y3() {
        this(null, null, null, null, 0, 0, null, null, 255, null);
    }

    public /* synthetic */ y3(e1 e1Var, b2 b2Var, List list, f1 f1Var, int i11, int i12, rt.a aVar, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : e1Var, (i13 & 2) != 0 ? null : b2Var, (i13 & 4) != 0 ? wz.w.i() : list, (i13 & 8) == 0 ? f1Var : null, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) == 0 ? i12 : 0, (i13 & 64) != 0 ? rt.a.ROLE_NONE : aVar, (i13 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y3 b(y3 y3Var, e1 e1Var, b2 b2Var, List list, f1 f1Var, int i11, int i12, rt.a aVar, okio.i iVar, int i13, Object obj) {
        return y3Var.a((i13 & 1) != 0 ? y3Var.f8285a : e1Var, (i13 & 2) != 0 ? y3Var.f8286b : b2Var, (i13 & 4) != 0 ? y3Var.f8291g : list, (i13 & 8) != 0 ? y3Var.f8287c : f1Var, (i13 & 16) != 0 ? y3Var.f8288d : i11, (i13 & 32) != 0 ? y3Var.f8289e : i12, (i13 & 64) != 0 ? y3Var.f8290f : aVar, (i13 & 128) != 0 ? y3Var.unknownFields() : iVar);
    }

    public final y3 a(e1 e1Var, b2 b2Var, List<? extends a4> permissions, f1 f1Var, int i11, int i12, rt.a keyRole, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(permissions, "permissions");
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new y3(e1Var, b2Var, permissions, f1Var, i11, i12, keyRole, unknownFields);
    }

    public final e1 c() {
        return this.f8285a;
    }

    public final rt.a d() {
        return this.f8290f;
    }

    public final f1 e() {
        return this.f8287c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), y3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8285a, y3Var.f8285a) && kotlin.jvm.internal.s.c(this.f8286b, y3Var.f8286b) && kotlin.jvm.internal.s.c(this.f8291g, y3Var.f8291g) && kotlin.jvm.internal.s.c(this.f8287c, y3Var.f8287c) && this.f8288d == y3Var.f8288d && this.f8289e == y3Var.f8289e && this.f8290f == y3Var.f8290f;
        }
        return false;
    }

    public final List<a4> f() {
        return this.f8291g;
    }

    public final b2 g() {
        return this.f8286b;
    }

    public final int h() {
        return this.f8288d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            e1 e1Var = this.f8285a;
            int hashCode2 = (hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 37;
            b2 b2Var = this.f8286b;
            int hashCode3 = (((hashCode2 + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f8291g.hashCode()) * 37;
            f1 f1Var = this.f8287c;
            int hashCode4 = ((((((hashCode3 + (f1Var != null ? f1Var.hashCode() : 0)) * 37) + Integer.hashCode(this.f8288d)) * 37) + Integer.hashCode(this.f8289e)) * 37) + this.f8290f.hashCode();
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    public final int i() {
        return this.f8289e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m89newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e1 e1Var = this.f8285a;
        if (e1Var != null) {
            arrayList.add("keyId=" + e1Var);
        }
        b2 b2Var = this.f8286b;
        if (b2Var != null) {
            arrayList.add("publicKey=" + b2Var);
        }
        if (!this.f8291g.isEmpty()) {
            List<a4> list = this.f8291g;
            arrayList.add("permissions=" + list);
        }
        f1 f1Var = this.f8287c;
        if (f1Var != null) {
            arrayList.add("metadataForKey=" + f1Var);
        }
        int i11 = this.f8288d;
        arrayList.add("secondsEntryRemainsActive=" + i11);
        int i12 = this.f8289e;
        arrayList.add("slot=" + i12);
        rt.a aVar = this.f8290f;
        arrayList.add("keyRole=" + aVar);
        l02 = wz.e0.l0(arrayList, ", ", "WhitelistEntryInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m89newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(e1 e1Var, b2 b2Var, List<? extends a4> permissions, f1 f1Var, int i11, int i12, rt.a keyRole, okio.i unknownFields) {
        super(f8284h, unknownFields);
        kotlin.jvm.internal.s.g(permissions, "permissions");
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8285a = e1Var;
        this.f8286b = b2Var;
        this.f8287c = f1Var;
        this.f8288d = i11;
        this.f8289e = i12;
        this.f8290f = keyRole;
        this.f8291g = mr.d.g("permissions", permissions);
    }
}