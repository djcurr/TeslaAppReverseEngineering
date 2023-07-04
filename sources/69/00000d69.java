package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h2 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<h2> f8035f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: a  reason: collision with root package name */
    private final b2 f8036a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.keys.Role#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b  reason: collision with root package name */
    private final rt.a f8037b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8038c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", tag = 1)

    /* renamed from: d  reason: collision with root package name */
    private final b2 f8039d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)

    /* renamed from: e  reason: collision with root package name */
    private final Integer f8040e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h2> {
        a(com.squareup.wire.b bVar, n00.d<h2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ReplaceKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            rt.a aVar = rt.a.ROLE_NONE;
            long d11 = reader.d();
            b2 b2Var = null;
            Integer num = null;
            boolean z11 = false;
            b2 b2Var2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h2(b2Var, aVar, z11, b2Var2, num, reader.e(d11));
                } else if (g11 == 1) {
                    b2Var2 = b2.f7941b.decode(reader);
                } else if (g11 == 2) {
                    num = ProtoAdapter.UINT32.decode(reader);
                } else if (g11 == 3) {
                    b2Var = b2.f7941b.decode(reader);
                } else if (g11 == 4) {
                    try {
                        aVar = rt.a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != null) {
                b2.f7941b.encodeWithTag(writer, 3, value.e());
            }
            if (value.d() != rt.a.ROLE_NONE) {
                rt.a.ADAPTER.encodeWithTag(writer, 4, value.d());
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.c()));
            }
            b2.f7941b.encodeWithTag(writer, 1, value.f());
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.g());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != null) {
                z11 += b2.f7941b.encodedSizeWithTag(3, value.e());
            }
            if (value.d() != rt.a.ROLE_NONE) {
                z11 += rt.a.ADAPTER.encodedSizeWithTag(4, value.d());
            }
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.c()));
            }
            return z11 + b2.f7941b.encodedSizeWithTag(1, value.f()) + ProtoAdapter.UINT32.encodedSizeWithTag(2, value.g());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h2 redact(h2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            b2 e11 = value.e();
            b2 redact = e11 == null ? null : b2.f7941b.redact(e11);
            b2 f11 = value.f();
            return h2.b(value, redact, null, false, f11 != null ? b2.f7941b.redact(f11) : null, null, okio.i.f42656d, 22, null);
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
        f8035f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h2.class), com.squareup.wire.o.PROTO_3);
    }

    public h2() {
        this(null, null, false, null, null, null, 63, null);
    }

    public /* synthetic */ h2(b2 b2Var, rt.a aVar, boolean z11, b2 b2Var2, Integer num, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : b2Var, (i11 & 2) != 0 ? rt.a.ROLE_NONE : aVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : b2Var2, (i11 & 16) == 0 ? num : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ h2 b(h2 h2Var, b2 b2Var, rt.a aVar, boolean z11, b2 b2Var2, Integer num, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            b2Var = h2Var.f8036a;
        }
        if ((i11 & 2) != 0) {
            aVar = h2Var.f8037b;
        }
        rt.a aVar2 = aVar;
        if ((i11 & 4) != 0) {
            z11 = h2Var.f8038c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            b2Var2 = h2Var.f8039d;
        }
        b2 b2Var3 = b2Var2;
        if ((i11 & 16) != 0) {
            num = h2Var.f8040e;
        }
        Integer num2 = num;
        if ((i11 & 32) != 0) {
            iVar = h2Var.unknownFields();
        }
        return h2Var.a(b2Var, aVar2, z12, b2Var3, num2, iVar);
    }

    public final h2 a(b2 b2Var, rt.a keyRole, boolean z11, b2 b2Var2, Integer num, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h2(b2Var, keyRole, z11, b2Var2, num, unknownFields);
    }

    public final boolean c() {
        return this.f8038c;
    }

    public final rt.a d() {
        return this.f8037b;
    }

    public final b2 e() {
        return this.f8036a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            h2 h2Var = (h2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8036a, h2Var.f8036a) && this.f8037b == h2Var.f8037b && this.f8038c == h2Var.f8038c && kotlin.jvm.internal.s.c(this.f8039d, h2Var.f8039d) && kotlin.jvm.internal.s.c(this.f8040e, h2Var.f8040e);
        }
        return false;
    }

    public final b2 f() {
        return this.f8039d;
    }

    public final Integer g() {
        return this.f8040e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            b2 b2Var = this.f8036a;
            int hashCode2 = (((((hashCode + (b2Var != null ? b2Var.hashCode() : 0)) * 37) + this.f8037b.hashCode()) * 37) + Boolean.hashCode(this.f8038c)) * 37;
            b2 b2Var2 = this.f8039d;
            int hashCode3 = (hashCode2 + (b2Var2 != null ? b2Var2.hashCode() : 0)) * 37;
            Integer num = this.f8040e;
            int hashCode4 = hashCode3 + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m36newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        b2 b2Var = this.f8036a;
        if (b2Var != null) {
            arrayList.add("keyToAdd=" + b2Var);
        }
        rt.a aVar = this.f8037b;
        arrayList.add("keyRole=" + aVar);
        boolean z11 = this.f8038c;
        arrayList.add("impermanent=" + z11);
        b2 b2Var2 = this.f8039d;
        if (b2Var2 != null) {
            arrayList.add("publicKeyToReplace=" + b2Var2);
        }
        Integer num = this.f8040e;
        if (num != null) {
            arrayList.add("slotToReplace=" + num);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ReplaceKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m36newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(b2 b2Var, rt.a keyRole, boolean z11, b2 b2Var2, Integer num, okio.i unknownFields) {
        super(f8035f, unknownFields);
        kotlin.jvm.internal.s.g(keyRole, "keyRole");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8036a = b2Var;
        this.f8037b = keyRole;
        this.f8038c = z11;
        this.f8039d = b2Var2;
        this.f8040e = num;
        if (!(mr.d.c(b2Var2, num) <= 1)) {
            throw new IllegalArgumentException("At most one of publicKeyToReplace, slotToReplace may be non-null".toString());
        }
    }
}