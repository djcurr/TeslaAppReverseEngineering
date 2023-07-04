package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class z1 extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<z1> f8295e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final b2 f8296a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final int f8297b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final rt.a f8298c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistKeyPermission_E#ADAPTER", label = q.a.REPEATED, tag = 2)

    /* renamed from: d  reason: collision with root package name */
    private final List<a4> f8299d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<z1> {
        a(com.squareup.wire.b bVar, n00.d<z1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PermissionChange", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public z1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            rt.a aVar = rt.a.ROLE_NONE;
            long d11 = reader.d();
            b2 b2Var = null;
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new z1(b2Var, arrayList, i11, aVar, reader.e(d11));
                } else if (g11 == 1) {
                    b2Var = b2.f7941b.decode(reader);
                } else if (g11 == 2) {
                    try {
                        arrayList.add(a4.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        vz.b0 b0Var = vz.b0.f54756a;
                    }
                } else if (g11 == 3) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    try {
                        aVar = rt.a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, z1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                b2.f7941b.encodeWithTag(writer, 1, value.c());
            }
            a4.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.e());
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.f()));
            }
            if (value.d() != rt.a.ROLE_NONE) {
                rt.a.ADAPTER.encodeWithTag(writer, 4, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(z1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(1, value.c());
            }
            int encodedSizeWithTag = z11 + a4.ADAPTER.asRepeated().encodedSizeWithTag(2, value.e());
            if (value.f() != 0) {
                encodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.f()));
            }
            return value.d() != rt.a.ROLE_NONE ? encodedSizeWithTag + rt.a.ADAPTER.encodedSizeWithTag(4, value.d()) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public z1 redact(z1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            b2 c11 = value.c();
            return z1.b(value, c11 == null ? null : b2.f7941b.redact(c11), null, 0, null, okio.i.f42656d, 14, null);
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
        f8295e = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(z1.class), com.squareup.wire.o.PROTO_3);
    }

    public z1() {
        this(null, null, 0, null, null, 31, null);
    }

    public /* synthetic */ z1(b2 b2Var, List list, int i11, rt.a aVar, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : b2Var, (i12 & 2) != 0 ? wz.w.i() : list, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? rt.a.ROLE_NONE : aVar, (i12 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ z1 b(z1 z1Var, b2 b2Var, List list, int i11, rt.a aVar, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            b2Var = z1Var.f8296a;
        }
        List<a4> list2 = list;
        if ((i12 & 2) != 0) {
            list2 = z1Var.f8299d;
        }
        List list3 = list2;
        if ((i12 & 4) != 0) {
            i11 = z1Var.f8297b;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            aVar = z1Var.f8298c;
        }
        rt.a aVar2 = aVar;
        if ((i12 & 16) != 0) {
            iVar = z1Var.unknownFields();
        }
        return z1Var.a(b2Var, list3, i13, aVar2, iVar);
    }

    public final z1 a(b2 b2Var, List<? extends a4> permission, int i11, rt.a keyRole, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(permission, "permission");
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new z1(b2Var, permission, i11, keyRole, unknownFields);
    }

    public final b2 c() {
        return this.f8296a;
    }

    public final rt.a d() {
        return this.f8298c;
    }

    public final List<a4> e() {
        return this.f8299d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), z1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8296a, z1Var.f8296a) && kotlin.jvm.internal.s.c(this.f8299d, z1Var.f8299d) && this.f8297b == z1Var.f8297b && this.f8298c == z1Var.f8298c;
        }
        return false;
    }

    public final int f() {
        return this.f8297b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            b2 b2Var = this.f8296a;
            int hashCode2 = ((((((hashCode + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f8299d.hashCode()) * 37) + Integer.hashCode(this.f8297b)) * 37) + this.f8298c.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m91newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        b2 b2Var = this.f8296a;
        if (b2Var != null) {
            arrayList.add("key=" + b2Var);
        }
        if (!this.f8299d.isEmpty()) {
            List<a4> list = this.f8299d;
            arrayList.add("permission=" + list);
        }
        int i11 = this.f8297b;
        arrayList.add("secondsToBeActive=" + i11);
        rt.a aVar = this.f8298c;
        arrayList.add("keyRole=" + aVar);
        l02 = wz.e0.l0(arrayList, ", ", "PermissionChange{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m91newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(b2 b2Var, List<? extends a4> permission, int i11, rt.a keyRole, okio.i unknownFields) {
        super(f8295e, unknownFields);
        kotlin.jvm.internal.s.g(permission, "permission");
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8296a = b2Var;
        this.f8297b = i11;
        this.f8298c = keyRole;
        this.f8299d = mr.d.g("permission", permission);
    }
}