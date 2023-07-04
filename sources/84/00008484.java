package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t2 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<t2> f37621f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "absoluteLevel", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Integer f37622a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "deltaLevel", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final Integer f37623b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final kt.u f37624c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final kt.u f37625d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", declaredName = "open", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final kt.u f37626e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t2> {
        a(com.squareup.wire.b bVar, n00.d<t2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlSunroofOpenCloseAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Integer num = null;
            Integer num2 = null;
            kt.u uVar = null;
            kt.u uVar2 = null;
            kt.u uVar3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t2(num, num2, uVar, uVar2, uVar3, reader.e(d11));
                } else if (g11 == 1) {
                    num = ProtoAdapter.INT32.decode(reader);
                } else if (g11 == 2) {
                    num2 = ProtoAdapter.SINT32.decode(reader);
                } else if (g11 == 3) {
                    uVar = kt.u.f35845a.decode(reader);
                } else if (g11 == 4) {
                    uVar2 = kt.u.f35845a.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    uVar3 = kt.u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter.INT32.encodeWithTag(writer, 1, value.c());
            ProtoAdapter.SINT32.encodeWithTag(writer, 2, value.e());
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            protoAdapter.encodeWithTag(writer, 3, value.g());
            protoAdapter.encodeWithTag(writer, 4, value.d());
            protoAdapter.encodeWithTag(writer, 5, value.f());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z() + ProtoAdapter.INT32.encodedSizeWithTag(1, value.c()) + ProtoAdapter.SINT32.encodedSizeWithTag(2, value.e());
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(3, value.g()) + protoAdapter.encodedSizeWithTag(4, value.d()) + protoAdapter.encodedSizeWithTag(5, value.f());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t2 redact(t2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.u g11 = value.g();
            kt.u redact = g11 == null ? null : kt.u.f35845a.redact(g11);
            kt.u d11 = value.d();
            kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
            kt.u f11 = value.f();
            return t2.b(value, null, null, redact, redact2, f11 != null ? kt.u.f35845a.redact(f11) : null, okio.i.f42656d, 3, null);
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
        f37621f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(t2.class), com.squareup.wire.o.PROTO_3);
    }

    public t2() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ t2(Integer num, Integer num2, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : uVar, (i11 & 8) != 0 ? null : uVar2, (i11 & 16) == 0 ? uVar3 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ t2 b(t2 t2Var, Integer num, Integer num2, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = t2Var.f37622a;
        }
        if ((i11 & 2) != 0) {
            num2 = t2Var.f37623b;
        }
        Integer num3 = num2;
        if ((i11 & 4) != 0) {
            uVar = t2Var.f37624c;
        }
        kt.u uVar4 = uVar;
        if ((i11 & 8) != 0) {
            uVar2 = t2Var.f37625d;
        }
        kt.u uVar5 = uVar2;
        if ((i11 & 16) != 0) {
            uVar3 = t2Var.f37626e;
        }
        kt.u uVar6 = uVar3;
        if ((i11 & 32) != 0) {
            iVar = t2Var.unknownFields();
        }
        return t2Var.a(num, num3, uVar4, uVar5, uVar6, iVar);
    }

    public final t2 a(Integer num, Integer num2, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t2(num, num2, uVar, uVar2, uVar3, unknownFields);
    }

    public final Integer c() {
        return this.f37622a;
    }

    public final kt.u d() {
        return this.f37625d;
    }

    public final Integer e() {
        return this.f37623b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), t2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37622a, t2Var.f37622a) && kotlin.jvm.internal.s.c(this.f37623b, t2Var.f37623b) && kotlin.jvm.internal.s.c(this.f37624c, t2Var.f37624c) && kotlin.jvm.internal.s.c(this.f37625d, t2Var.f37625d) && kotlin.jvm.internal.s.c(this.f37626e, t2Var.f37626e);
        }
        return false;
    }

    public final kt.u f() {
        return this.f37626e;
    }

    public final kt.u g() {
        return this.f37624c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.f37622a;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f37623b;
            int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
            kt.u uVar = this.f37624c;
            int hashCode4 = (hashCode3 + (uVar != null ? uVar.hashCode() : 0)) * 37;
            kt.u uVar2 = this.f37625d;
            int hashCode5 = (hashCode4 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            kt.u uVar3 = this.f37626e;
            int hashCode6 = hashCode5 + (uVar3 != null ? uVar3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m735newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Integer num = this.f37622a;
        if (num != null) {
            arrayList.add("absolute_level=" + num);
        }
        Integer num2 = this.f37623b;
        if (num2 != null) {
            arrayList.add("delta_level=" + num2);
        }
        kt.u uVar = this.f37624c;
        if (uVar != null) {
            arrayList.add("vent=" + uVar);
        }
        kt.u uVar2 = this.f37625d;
        if (uVar2 != null) {
            arrayList.add("close=" + uVar2);
        }
        kt.u uVar3 = this.f37626e;
        if (uVar3 != null) {
            arrayList.add("open_=" + uVar3);
        }
        l02 = wz.e0.l0(arrayList, ", ", "VehicleControlSunroofOpenCloseAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m735newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Integer num, Integer num2, kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
        super(f37621f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37622a = num;
        this.f37623b = num2;
        this.f37624c = uVar;
        this.f37625d = uVar2;
        this.f37626e = uVar3;
        if (mr.d.c(num, num2) <= 1) {
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of vent, close, open_ may be non-null".toString());
            }
            return;
        }
        throw new IllegalArgumentException("At most one of absolute_level, delta_level may be non-null".toString());
    }
}