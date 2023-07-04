package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b4 extends com.squareup.wire.f {

    /* renamed from: l  reason: collision with root package name */
    public static final ProtoAdapter<b4> f7947l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: a  reason: collision with root package name */
    private final f1 f7948a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 1)

    /* renamed from: b  reason: collision with root package name */
    private final b2 f7949b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 2)

    /* renamed from: c  reason: collision with root package name */
    private final b2 f7950c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 3)

    /* renamed from: d  reason: collision with root package name */
    private final z1 f7951d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 4)

    /* renamed from: e  reason: collision with root package name */
    private final z1 f7952e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 5)

    /* renamed from: f  reason: collision with root package name */
    private final z1 f7953f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final z1 f7954g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final z1 f7955h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PermissionChange#ADAPTER", tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final z1 f7956i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f7957j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ReplaceKey#ADAPTER", tag = 17)

    /* renamed from: k  reason: collision with root package name */
    private final h2 f7958k;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b4> {
        a(com.squareup.wire.b bVar, n00.d<b4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistOperation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b4 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            f1 f1Var = null;
            b2 b2Var = null;
            b2 b2Var2 = null;
            z1 z1Var = null;
            z1 z1Var2 = null;
            z1 z1Var3 = null;
            z1 z1Var4 = null;
            z1 z1Var5 = null;
            z1 z1Var6 = null;
            Boolean bool = null;
            h2 h2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b4(f1Var, b2Var, b2Var2, z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, bool, h2Var, reader.e(d11));
                } else if (g11 == 16) {
                    bool = ProtoAdapter.BOOL.decode(reader);
                } else if (g11 != 17) {
                    switch (g11) {
                        case 1:
                            b2Var = b2.f7941b.decode(reader);
                            continue;
                        case 2:
                            b2Var2 = b2.f7941b.decode(reader);
                            continue;
                        case 3:
                            z1Var = z1.f8295e.decode(reader);
                            continue;
                        case 4:
                            z1Var2 = z1.f8295e.decode(reader);
                            continue;
                        case 5:
                            z1Var3 = z1.f8295e.decode(reader);
                            continue;
                        case 6:
                            f1Var = f1.f7994b.decode(reader);
                            continue;
                        case 7:
                            z1Var4 = z1.f8295e.decode(reader);
                            continue;
                        case 8:
                            z1Var5 = z1.f8295e.decode(reader);
                            continue;
                        case 9:
                            z1Var6 = z1.f8295e.decode(reader);
                            continue;
                        default:
                            reader.m(g11);
                            continue;
                    }
                } else {
                    h2Var = h2.f8035f.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b4 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.h() != null) {
                f1.f7994b.encodeWithTag(writer, 6, value.h());
            }
            ProtoAdapter<b2> protoAdapter = b2.f7941b;
            protoAdapter.encodeWithTag(writer, 1, value.g());
            protoAdapter.encodeWithTag(writer, 2, value.k());
            ProtoAdapter<z1> protoAdapter2 = z1.f8295e;
            protoAdapter2.encodeWithTag(writer, 3, value.f());
            protoAdapter2.encodeWithTag(writer, 4, value.j());
            protoAdapter2.encodeWithTag(writer, 5, value.e());
            protoAdapter2.encodeWithTag(writer, 7, value.m());
            protoAdapter2.encodeWithTag(writer, 8, value.c());
            protoAdapter2.encodeWithTag(writer, 9, value.d());
            ProtoAdapter.BOOL.encodeWithTag(writer, 16, value.i());
            h2.f8035f.encodeWithTag(writer, 17, value.l());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b4 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.h() != null) {
                z11 += f1.f7994b.encodedSizeWithTag(6, value.h());
            }
            ProtoAdapter<b2> protoAdapter = b2.f7941b;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(1, value.g()) + protoAdapter.encodedSizeWithTag(2, value.k());
            ProtoAdapter<z1> protoAdapter2 = z1.f8295e;
            return encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.f()) + protoAdapter2.encodedSizeWithTag(4, value.j()) + protoAdapter2.encodedSizeWithTag(5, value.e()) + protoAdapter2.encodedSizeWithTag(7, value.m()) + protoAdapter2.encodedSizeWithTag(8, value.c()) + protoAdapter2.encodedSizeWithTag(9, value.d()) + ProtoAdapter.BOOL.encodedSizeWithTag(16, value.i()) + h2.f8035f.encodedSizeWithTag(17, value.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b4 redact(b4 value) {
            kotlin.jvm.internal.s.g(value, "value");
            f1 h11 = value.h();
            f1 redact = h11 == null ? null : f1.f7994b.redact(h11);
            b2 g11 = value.g();
            b2 redact2 = g11 == null ? null : b2.f7941b.redact(g11);
            b2 k11 = value.k();
            b2 redact3 = k11 == null ? null : b2.f7941b.redact(k11);
            z1 f11 = value.f();
            z1 redact4 = f11 == null ? null : z1.f8295e.redact(f11);
            z1 j11 = value.j();
            z1 redact5 = j11 == null ? null : z1.f8295e.redact(j11);
            z1 e11 = value.e();
            z1 redact6 = e11 == null ? null : z1.f8295e.redact(e11);
            z1 m11 = value.m();
            z1 redact7 = m11 == null ? null : z1.f8295e.redact(m11);
            z1 c11 = value.c();
            z1 redact8 = c11 == null ? null : z1.f8295e.redact(c11);
            z1 d11 = value.d();
            z1 redact9 = d11 == null ? null : z1.f8295e.redact(d11);
            h2 l11 = value.l();
            return b4.b(value, redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, null, l11 != null ? h2.f8035f.redact(l11) : null, okio.i.f42656d, 512, null);
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
        f7947l = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b4.class), com.squareup.wire.o.PROTO_3);
    }

    public b4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ b4(f1 f1Var, b2 b2Var, b2 b2Var2, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, z1 z1Var6, Boolean bool, h2 h2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : f1Var, (i11 & 2) != 0 ? null : b2Var, (i11 & 4) != 0 ? null : b2Var2, (i11 & 8) != 0 ? null : z1Var, (i11 & 16) != 0 ? null : z1Var2, (i11 & 32) != 0 ? null : z1Var3, (i11 & 64) != 0 ? null : z1Var4, (i11 & 128) != 0 ? null : z1Var5, (i11 & 256) != 0 ? null : z1Var6, (i11 & 512) != 0 ? null : bool, (i11 & 1024) == 0 ? h2Var : null, (i11 & 2048) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b4 b(b4 b4Var, f1 f1Var, b2 b2Var, b2 b2Var2, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, z1 z1Var6, Boolean bool, h2 h2Var, okio.i iVar, int i11, Object obj) {
        return b4Var.a((i11 & 1) != 0 ? b4Var.f7948a : f1Var, (i11 & 2) != 0 ? b4Var.f7949b : b2Var, (i11 & 4) != 0 ? b4Var.f7950c : b2Var2, (i11 & 8) != 0 ? b4Var.f7951d : z1Var, (i11 & 16) != 0 ? b4Var.f7952e : z1Var2, (i11 & 32) != 0 ? b4Var.f7953f : z1Var3, (i11 & 64) != 0 ? b4Var.f7954g : z1Var4, (i11 & 128) != 0 ? b4Var.f7955h : z1Var5, (i11 & 256) != 0 ? b4Var.f7956i : z1Var6, (i11 & 512) != 0 ? b4Var.f7957j : bool, (i11 & 1024) != 0 ? b4Var.f7958k : h2Var, (i11 & 2048) != 0 ? b4Var.unknownFields() : iVar);
    }

    public final b4 a(f1 f1Var, b2 b2Var, b2 b2Var2, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, z1 z1Var6, Boolean bool, h2 h2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b4(f1Var, b2Var, b2Var2, z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, bool, h2Var, unknownFields);
    }

    public final z1 c() {
        return this.f7955h;
    }

    public final z1 d() {
        return this.f7956i;
    }

    public final z1 e() {
        return this.f7953f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b4) {
            b4 b4Var = (b4) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b4Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f7948a, b4Var.f7948a) && kotlin.jvm.internal.s.c(this.f7949b, b4Var.f7949b) && kotlin.jvm.internal.s.c(this.f7950c, b4Var.f7950c) && kotlin.jvm.internal.s.c(this.f7951d, b4Var.f7951d) && kotlin.jvm.internal.s.c(this.f7952e, b4Var.f7952e) && kotlin.jvm.internal.s.c(this.f7953f, b4Var.f7953f) && kotlin.jvm.internal.s.c(this.f7954g, b4Var.f7954g) && kotlin.jvm.internal.s.c(this.f7955h, b4Var.f7955h) && kotlin.jvm.internal.s.c(this.f7956i, b4Var.f7956i) && kotlin.jvm.internal.s.c(this.f7957j, b4Var.f7957j) && kotlin.jvm.internal.s.c(this.f7958k, b4Var.f7958k);
        }
        return false;
    }

    public final z1 f() {
        return this.f7951d;
    }

    public final b2 g() {
        return this.f7949b;
    }

    public final f1 h() {
        return this.f7948a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            f1 f1Var = this.f7948a;
            int hashCode2 = (hashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 37;
            b2 b2Var = this.f7949b;
            int hashCode3 = (hashCode2 + (b2Var != null ? b2Var.hashCode() : 0)) * 37;
            b2 b2Var2 = this.f7950c;
            int hashCode4 = (hashCode3 + (b2Var2 != null ? b2Var2.hashCode() : 0)) * 37;
            z1 z1Var = this.f7951d;
            int hashCode5 = (hashCode4 + (z1Var != null ? z1Var.hashCode() : 0)) * 37;
            z1 z1Var2 = this.f7952e;
            int hashCode6 = (hashCode5 + (z1Var2 != null ? z1Var2.hashCode() : 0)) * 37;
            z1 z1Var3 = this.f7953f;
            int hashCode7 = (hashCode6 + (z1Var3 != null ? z1Var3.hashCode() : 0)) * 37;
            z1 z1Var4 = this.f7954g;
            int hashCode8 = (hashCode7 + (z1Var4 != null ? z1Var4.hashCode() : 0)) * 37;
            z1 z1Var5 = this.f7955h;
            int hashCode9 = (hashCode8 + (z1Var5 != null ? z1Var5.hashCode() : 0)) * 37;
            z1 z1Var6 = this.f7956i;
            int hashCode10 = (hashCode9 + (z1Var6 != null ? z1Var6.hashCode() : 0)) * 37;
            Boolean bool = this.f7957j;
            int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 37;
            h2 h2Var = this.f7958k;
            int hashCode12 = hashCode11 + (h2Var != null ? h2Var.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }
        return i11;
    }

    public final Boolean i() {
        return this.f7957j;
    }

    public final z1 j() {
        return this.f7952e;
    }

    public final b2 k() {
        return this.f7950c;
    }

    public final h2 l() {
        return this.f7958k;
    }

    public final z1 m() {
        return this.f7954g;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m17newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        f1 f1Var = this.f7948a;
        if (f1Var != null) {
            arrayList.add("metadataForKey=" + f1Var);
        }
        b2 b2Var = this.f7949b;
        if (b2Var != null) {
            arrayList.add("addPublicKeyToWhitelist=" + b2Var);
        }
        b2 b2Var2 = this.f7950c;
        if (b2Var2 != null) {
            arrayList.add("removePublicKeyFromWhitelist=" + b2Var2);
        }
        z1 z1Var = this.f7951d;
        if (z1Var != null) {
            arrayList.add("addPermissionsToPublicKey=" + z1Var);
        }
        z1 z1Var2 = this.f7952e;
        if (z1Var2 != null) {
            arrayList.add("removePermissionsFromPublicKey=" + z1Var2);
        }
        z1 z1Var3 = this.f7953f;
        if (z1Var3 != null) {
            arrayList.add("addKeyToWhitelistAndAddPermissions=" + z1Var3);
        }
        z1 z1Var4 = this.f7954g;
        if (z1Var4 != null) {
            arrayList.add("updateKeyAndPermissions=" + z1Var4);
        }
        z1 z1Var5 = this.f7955h;
        if (z1Var5 != null) {
            arrayList.add("addImpermanentKey=" + z1Var5);
        }
        z1 z1Var6 = this.f7956i;
        if (z1Var6 != null) {
            arrayList.add("addImpermanentKeyAndRemoveExisting=" + z1Var6);
        }
        Boolean bool = this.f7957j;
        if (bool != null) {
            arrayList.add("removeAllImpermanentKeys=" + bool);
        }
        h2 h2Var = this.f7958k;
        if (h2Var != null) {
            arrayList.add("replaceKey=" + h2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "WhitelistOperation{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m17newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(f1 f1Var, b2 b2Var, b2 b2Var2, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, z1 z1Var6, Boolean bool, h2 h2Var, okio.i unknownFields) {
        super(f7947l, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7948a = f1Var;
        this.f7949b = b2Var;
        this.f7950c = b2Var2;
        this.f7951d = z1Var;
        this.f7952e = z1Var2;
        this.f7953f = z1Var3;
        this.f7954g = z1Var4;
        this.f7955h = z1Var5;
        this.f7956i = z1Var6;
        this.f7957j = bool;
        this.f7958k = h2Var;
        if (!(mr.d.e(b2Var, b2Var2, z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, bool, h2Var) <= 1)) {
            throw new IllegalArgumentException("At most one of addPublicKeyToWhitelist, removePublicKeyFromWhitelist, addPermissionsToPublicKey, removePermissionsFromPublicKey, addKeyToWhitelistAndAddPermissions, updateKeyAndPermissions, addImpermanentKey, addImpermanentKeyAndRemoveExisting, removeAllImpermanentKeys, replaceKey may be non-null".toString());
        }
    }
}