package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d0 extends com.squareup.wire.f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<d0> f7968h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e0 f7969a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e0 f7970b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final e0 f7971c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final e0 f7972d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final e0 f7973e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final e0 f7974f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final e0 f7975g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d0> {
        a(com.squareup.wire.b bVar, n00.d<d0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ClosureMoveRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            e0 e0Var = e0.CLOSURE_MOVE_TYPE_NONE;
            long d11 = reader.d();
            e0 e0Var2 = e0Var;
            e0 e0Var3 = e0Var2;
            e0 e0Var4 = e0Var3;
            e0 e0Var5 = e0Var4;
            e0 e0Var6 = e0Var5;
            e0 e0Var7 = e0Var6;
            e0 e0Var8 = e0Var7;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d0(e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        try {
                            e0Var2 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 2:
                        try {
                            e0Var3 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            break;
                        }
                    case 3:
                        try {
                            e0Var4 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                            break;
                        }
                    case 4:
                        try {
                            e0Var5 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                            break;
                        }
                    case 5:
                        try {
                            e0Var6 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                            break;
                        }
                    case 6:
                        try {
                            e0Var7 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e16.f20831a));
                            break;
                        }
                    case 7:
                        try {
                            e0Var8 = e0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e17.f20831a));
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
        public void encode(com.squareup.wire.l writer, d0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            e0 d11 = value.d();
            e0 e0Var = e0.CLOSURE_MOVE_TYPE_NONE;
            if (d11 != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 1, value.d());
            }
            if (value.e() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 2, value.e());
            }
            if (value.g() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 3, value.g());
            }
            if (value.h() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 4, value.h());
            }
            if (value.i() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 5, value.i());
            }
            if (value.f() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 6, value.f());
            }
            if (value.c() != e0Var) {
                e0.ADAPTER.encodeWithTag(writer, 7, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            e0 d11 = value.d();
            e0 e0Var = e0.CLOSURE_MOVE_TYPE_NONE;
            if (d11 != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(1, value.d());
            }
            if (value.e() != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(2, value.e());
            }
            if (value.g() != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(3, value.g());
            }
            if (value.h() != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(4, value.h());
            }
            if (value.i() != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(5, value.i());
            }
            if (value.f() != e0Var) {
                z11 += e0.ADAPTER.encodedSizeWithTag(6, value.f());
            }
            return value.c() != e0Var ? z11 + e0.ADAPTER.encodedSizeWithTag(7, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d0 redact(d0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return d0.b(value, null, null, null, null, null, null, null, okio.i.f42656d, 127, null);
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
        f7968h = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d0.class), com.squareup.wire.o.PROTO_3);
    }

    public d0() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ d0(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, e0 e0Var6, e0 e0Var7, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var, (i11 & 2) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var2, (i11 & 4) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var3, (i11 & 8) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var4, (i11 & 16) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var5, (i11 & 32) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var6, (i11 & 64) != 0 ? e0.CLOSURE_MOVE_TYPE_NONE : e0Var7, (i11 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ d0 b(d0 d0Var, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, e0 e0Var6, e0 e0Var7, okio.i iVar, int i11, Object obj) {
        return d0Var.a((i11 & 1) != 0 ? d0Var.f7969a : e0Var, (i11 & 2) != 0 ? d0Var.f7970b : e0Var2, (i11 & 4) != 0 ? d0Var.f7971c : e0Var3, (i11 & 8) != 0 ? d0Var.f7972d : e0Var4, (i11 & 16) != 0 ? d0Var.f7973e : e0Var5, (i11 & 32) != 0 ? d0Var.f7974f : e0Var6, (i11 & 64) != 0 ? d0Var.f7975g : e0Var7, (i11 & 128) != 0 ? d0Var.unknownFields() : iVar);
    }

    public final d0 a(e0 frontDriverDoor, e0 frontPassengerDoor, e0 rearDriverDoor, e0 rearPassengerDoor, e0 rearTrunk, e0 frontTrunk, e0 chargePort, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(frontDriverDoor, "frontDriverDoor");
        kotlin.jvm.internal.s.g(frontPassengerDoor, "frontPassengerDoor");
        kotlin.jvm.internal.s.g(rearDriverDoor, "rearDriverDoor");
        kotlin.jvm.internal.s.g(rearPassengerDoor, "rearPassengerDoor");
        kotlin.jvm.internal.s.g(rearTrunk, "rearTrunk");
        kotlin.jvm.internal.s.g(frontTrunk, "frontTrunk");
        kotlin.jvm.internal.s.g(chargePort, "chargePort");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d0(frontDriverDoor, frontPassengerDoor, rearDriverDoor, rearPassengerDoor, rearTrunk, frontTrunk, chargePort, unknownFields);
    }

    public final e0 c() {
        return this.f7975g;
    }

    public final e0 d() {
        return this.f7969a;
    }

    public final e0 e() {
        return this.f7970b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), d0Var.unknownFields()) && this.f7969a == d0Var.f7969a && this.f7970b == d0Var.f7970b && this.f7971c == d0Var.f7971c && this.f7972d == d0Var.f7972d && this.f7973e == d0Var.f7973e && this.f7974f == d0Var.f7974f && this.f7975g == d0Var.f7975g;
        }
        return false;
    }

    public final e0 f() {
        return this.f7974f;
    }

    public final e0 g() {
        return this.f7971c;
    }

    public final e0 h() {
        return this.f7972d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((((unknownFields().hashCode() * 37) + this.f7969a.hashCode()) * 37) + this.f7970b.hashCode()) * 37) + this.f7971c.hashCode()) * 37) + this.f7972d.hashCode()) * 37) + this.f7973e.hashCode()) * 37) + this.f7974f.hashCode()) * 37) + this.f7975g.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final e0 i() {
        return this.f7973e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m22newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e0 e0Var = this.f7969a;
        arrayList.add("frontDriverDoor=" + e0Var);
        e0 e0Var2 = this.f7970b;
        arrayList.add("frontPassengerDoor=" + e0Var2);
        e0 e0Var3 = this.f7971c;
        arrayList.add("rearDriverDoor=" + e0Var3);
        e0 e0Var4 = this.f7972d;
        arrayList.add("rearPassengerDoor=" + e0Var4);
        e0 e0Var5 = this.f7973e;
        arrayList.add("rearTrunk=" + e0Var5);
        e0 e0Var6 = this.f7974f;
        arrayList.add("frontTrunk=" + e0Var6);
        e0 e0Var7 = this.f7975g;
        arrayList.add("chargePort=" + e0Var7);
        l02 = wz.e0.l0(arrayList, ", ", "ClosureMoveRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m22newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 frontDriverDoor, e0 frontPassengerDoor, e0 rearDriverDoor, e0 rearPassengerDoor, e0 rearTrunk, e0 frontTrunk, e0 chargePort, okio.i unknownFields) {
        super(f7968h, unknownFields);
        kotlin.jvm.internal.s.g(frontDriverDoor, "frontDriverDoor");
        kotlin.jvm.internal.s.g(frontPassengerDoor, "frontPassengerDoor");
        kotlin.jvm.internal.s.g(rearDriverDoor, "rearDriverDoor");
        kotlin.jvm.internal.s.g(rearPassengerDoor, "rearPassengerDoor");
        kotlin.jvm.internal.s.g(rearTrunk, "rearTrunk");
        kotlin.jvm.internal.s.g(frontTrunk, "frontTrunk");
        kotlin.jvm.internal.s.g(chargePort, "chargePort");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7969a = frontDriverDoor;
        this.f7970b = frontPassengerDoor;
        this.f7971c = rearDriverDoor;
        this.f7972d = rearPassengerDoor;
        this.f7973e = rearTrunk;
        this.f7974f = frontTrunk;
        this.f7975g = chargePort;
    }
}