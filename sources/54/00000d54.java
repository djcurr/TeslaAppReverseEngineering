package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g0 extends com.squareup.wire.f {

    /* renamed from: h */
    public static final ProtoAdapter<g0> f8008h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final ClosureState f8009a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final ClosureState f8010b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final ClosureState f8011c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d */
    private final ClosureState f8012d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e */
    private final ClosureState f8013e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f */
    private final ClosureState f8014f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g */
    private final ClosureState f8015g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g0> {
        a(com.squareup.wire.b bVar, n00.d<g0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ClosureStatuses", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g0 mo28decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ClosureState closureState = ClosureState.CLOSURESTATE_CLOSED;
            long d11 = reader.d();
            ClosureState closureState2 = closureState;
            ClosureState closureState3 = closureState2;
            ClosureState closureState4 = closureState3;
            ClosureState closureState5 = closureState4;
            ClosureState closureState6 = closureState5;
            ClosureState closureState7 = closureState6;
            ClosureState closureState8 = closureState7;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g0(closureState2, closureState3, closureState4, closureState5, closureState6, closureState7, closureState8, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        try {
                            closureState2 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 2:
                        try {
                            closureState3 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                            break;
                        }
                    case 3:
                        try {
                            closureState4 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                            break;
                        }
                    case 4:
                        try {
                            closureState5 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                            break;
                        }
                    case 5:
                        try {
                            closureState6 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                            break;
                        }
                    case 6:
                        try {
                            closureState7 = ClosureState.ADAPTER.mo28decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e16.f20831a));
                            break;
                        }
                    case 7:
                        try {
                            closureState8 = ClosureState.ADAPTER.mo28decode(reader);
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
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void encode(com.squareup.wire.l writer, g0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ClosureState d11 = value.d();
            ClosureState closureState = ClosureState.CLOSURESTATE_CLOSED;
            if (d11 != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 1, value.d());
            }
            if (value.e() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 2, value.e());
            }
            if (value.g() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 3, value.g());
            }
            if (value.h() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 4, value.h());
            }
            if (value.i() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 5, value.i());
            }
            if (value.f() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 6, value.f());
            }
            if (value.c() != closureState) {
                ClosureState.ADAPTER.encodeWithTag(writer, 7, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c  reason: avoid collision after fix types in other method */
        public int encodedSize(g0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ClosureState d11 = value.d();
            ClosureState closureState = ClosureState.CLOSURESTATE_CLOSED;
            if (d11 != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(1, value.d());
            }
            if (value.e() != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(2, value.e());
            }
            if (value.g() != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(3, value.g());
            }
            if (value.h() != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(4, value.h());
            }
            if (value.i() != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(5, value.i());
            }
            if (value.f() != closureState) {
                z11 += ClosureState.ADAPTER.encodedSizeWithTag(6, value.f());
            }
            return value.c() != closureState ? z11 + ClosureState.ADAPTER.encodedSizeWithTag(7, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d  reason: avoid collision after fix types in other method */
        public g0 redact(g0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return g0.b(value, null, null, null, null, null, null, null, okio.i.f42656d, 127, null);
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
        f8008h = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g0.class), com.squareup.wire.o.PROTO_3);
    }

    public g0() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ g0(ClosureState closureState, ClosureState closureState2, ClosureState closureState3, ClosureState closureState4, ClosureState closureState5, ClosureState closureState6, ClosureState closureState7, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState, (i11 & 2) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState2, (i11 & 4) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState3, (i11 & 8) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState4, (i11 & 16) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState5, (i11 & 32) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState6, (i11 & 64) != 0 ? ClosureState.CLOSURESTATE_CLOSED : closureState7, (i11 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ g0 b(g0 g0Var, ClosureState closureState, ClosureState closureState2, ClosureState closureState3, ClosureState closureState4, ClosureState closureState5, ClosureState closureState6, ClosureState closureState7, okio.i iVar, int i11, Object obj) {
        return g0Var.a((i11 & 1) != 0 ? g0Var.f8009a : closureState, (i11 & 2) != 0 ? g0Var.f8010b : closureState2, (i11 & 4) != 0 ? g0Var.f8011c : closureState3, (i11 & 8) != 0 ? g0Var.f8012d : closureState4, (i11 & 16) != 0 ? g0Var.f8013e : closureState5, (i11 & 32) != 0 ? g0Var.f8014f : closureState6, (i11 & 64) != 0 ? g0Var.f8015g : closureState7, (i11 & 128) != 0 ? g0Var.unknownFields() : iVar);
    }

    public final g0 a(ClosureState frontDriverDoor, ClosureState frontPassengerDoor, ClosureState rearDriverDoor, ClosureState rearPassengerDoor, ClosureState rearTrunk, ClosureState frontTrunk, ClosureState chargePort, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(frontDriverDoor, "frontDriverDoor");
        kotlin.jvm.internal.s.g(frontPassengerDoor, "frontPassengerDoor");
        kotlin.jvm.internal.s.g(rearDriverDoor, "rearDriverDoor");
        kotlin.jvm.internal.s.g(rearPassengerDoor, "rearPassengerDoor");
        kotlin.jvm.internal.s.g(rearTrunk, "rearTrunk");
        kotlin.jvm.internal.s.g(frontTrunk, "frontTrunk");
        kotlin.jvm.internal.s.g(chargePort, "chargePort");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g0(frontDriverDoor, frontPassengerDoor, rearDriverDoor, rearPassengerDoor, rearTrunk, frontTrunk, chargePort, unknownFields);
    }

    public final ClosureState c() {
        return this.f8015g;
    }

    public final ClosureState d() {
        return this.f8009a;
    }

    public final ClosureState e() {
        return this.f8010b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), g0Var.unknownFields()) && this.f8009a == g0Var.f8009a && this.f8010b == g0Var.f8010b && this.f8011c == g0Var.f8011c && this.f8012d == g0Var.f8012d && this.f8013e == g0Var.f8013e && this.f8014f == g0Var.f8014f && this.f8015g == g0Var.f8015g;
        }
        return false;
    }

    public final ClosureState f() {
        return this.f8014f;
    }

    public final ClosureState g() {
        return this.f8011c;
    }

    public final ClosureState h() {
        return this.f8012d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((((unknownFields().hashCode() * 37) + this.f8009a.hashCode()) * 37) + this.f8010b.hashCode()) * 37) + this.f8011c.hashCode()) * 37) + this.f8012d.hashCode()) * 37) + this.f8013e.hashCode()) * 37) + this.f8014f.hashCode()) * 37) + this.f8015g.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final ClosureState i() {
        return this.f8013e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m31newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        ClosureState closureState = this.f8009a;
        arrayList.add("frontDriverDoor=" + closureState);
        ClosureState closureState2 = this.f8010b;
        arrayList.add("frontPassengerDoor=" + closureState2);
        ClosureState closureState3 = this.f8011c;
        arrayList.add("rearDriverDoor=" + closureState3);
        ClosureState closureState4 = this.f8012d;
        arrayList.add("rearPassengerDoor=" + closureState4);
        ClosureState closureState5 = this.f8013e;
        arrayList.add("rearTrunk=" + closureState5);
        ClosureState closureState6 = this.f8014f;
        arrayList.add("frontTrunk=" + closureState6);
        ClosureState closureState7 = this.f8015g;
        arrayList.add("chargePort=" + closureState7);
        l02 = wz.e0.l0(arrayList, ", ", "ClosureStatuses{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m31newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ClosureState frontDriverDoor, ClosureState frontPassengerDoor, ClosureState rearDriverDoor, ClosureState rearPassengerDoor, ClosureState rearTrunk, ClosureState frontTrunk, ClosureState chargePort, okio.i unknownFields) {
        super(f8008h, unknownFields);
        kotlin.jvm.internal.s.g(frontDriverDoor, "frontDriverDoor");
        kotlin.jvm.internal.s.g(frontPassengerDoor, "frontPassengerDoor");
        kotlin.jvm.internal.s.g(rearDriverDoor, "rearDriverDoor");
        kotlin.jvm.internal.s.g(rearPassengerDoor, "rearPassengerDoor");
        kotlin.jvm.internal.s.g(rearTrunk, "rearTrunk");
        kotlin.jvm.internal.s.g(frontTrunk, "frontTrunk");
        kotlin.jvm.internal.s.g(chargePort, "chargePort");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8009a = frontDriverDoor;
        this.f8010b = frontPassengerDoor;
        this.f8011c = rearDriverDoor;
        this.f8012d = rearPassengerDoor;
        this.f8013e = rearTrunk;
        this.f8014f = frontTrunk;
        this.f8015g = chargePort;
    }
}