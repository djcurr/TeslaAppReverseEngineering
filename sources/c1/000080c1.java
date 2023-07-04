package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class j extends com.squareup.wire.f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<j> f35786h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35787a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35788b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35789c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35790d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final u f35791e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final u f35792f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final u f35793g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, n00.d<j> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearDriveUnit", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            u uVar5 = null;
            u uVar6 = null;
            u uVar7 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        uVar = u.f35845a.decode(reader);
                        break;
                    case 2:
                        uVar2 = u.f35845a.decode(reader);
                        break;
                    case 3:
                        uVar3 = u.f35845a.decode(reader);
                        break;
                    case 4:
                        uVar4 = u.f35845a.decode(reader);
                        break;
                    case 5:
                        uVar5 = u.f35845a.decode(reader);
                        break;
                    case 6:
                        uVar6 = u.f35845a.decode(reader);
                        break;
                    case 7:
                        uVar7 = u.f35845a.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.e());
            protoAdapter.encodeWithTag(writer, 2, value.d());
            protoAdapter.encodeWithTag(writer, 3, value.h());
            protoAdapter.encodeWithTag(writer, 4, value.g());
            protoAdapter.encodeWithTag(writer, 5, value.f());
            protoAdapter.encodeWithTag(writer, 6, value.c());
            protoAdapter.encodeWithTag(writer, 7, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.h()) + protoAdapter.encodedSizeWithTag(4, value.g()) + protoAdapter.encodedSizeWithTag(5, value.f()) + protoAdapter.encodedSizeWithTag(6, value.c()) + protoAdapter.encodedSizeWithTag(7, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            kotlin.jvm.internal.s.g(value, "value");
            u e11 = value.e();
            u redact = e11 == null ? null : u.f35845a.redact(e11);
            u d11 = value.d();
            u redact2 = d11 == null ? null : u.f35845a.redact(d11);
            u h11 = value.h();
            u redact3 = h11 == null ? null : u.f35845a.redact(h11);
            u g11 = value.g();
            u redact4 = g11 == null ? null : u.f35845a.redact(g11);
            u f11 = value.f();
            u redact5 = f11 == null ? null : u.f35845a.redact(f11);
            u c11 = value.c();
            u redact6 = c11 == null ? null : u.f35845a.redact(c11);
            u b11 = value.b();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, b11 != null ? u.f35845a.redact(b11) : null, okio.i.f42656d);
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
        f35786h = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), com.squareup.wire.o.PROTO_3);
    }

    public j() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ j(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) == 0 ? uVar7 : null, (i11 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    public final j a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, unknownFields);
    }

    public final u b() {
        return this.f35793g;
    }

    public final u c() {
        return this.f35792f;
    }

    public final u d() {
        return this.f35788b;
    }

    public final u e() {
        return this.f35787a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), jVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35787a, jVar.f35787a) && kotlin.jvm.internal.s.c(this.f35788b, jVar.f35788b) && kotlin.jvm.internal.s.c(this.f35789c, jVar.f35789c) && kotlin.jvm.internal.s.c(this.f35790d, jVar.f35790d) && kotlin.jvm.internal.s.c(this.f35791e, jVar.f35791e) && kotlin.jvm.internal.s.c(this.f35792f, jVar.f35792f) && kotlin.jvm.internal.s.c(this.f35793g, jVar.f35793g);
        }
        return false;
    }

    public final u f() {
        return this.f35791e;
    }

    public final u g() {
        return this.f35790d;
    }

    public final u h() {
        return this.f35789c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35787a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35788b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35789c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35790d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35791e;
            int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
            u uVar6 = this.f35792f;
            int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
            u uVar7 = this.f35793g;
            int hashCode8 = hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m638newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35787a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35788b;
        if (uVar2 != null) {
            arrayList.add("LargeRear=" + uVar2);
        }
        u uVar3 = this.f35789c;
        if (uVar3 != null) {
            arrayList.add("SmallRear=" + uVar3);
        }
        u uVar4 = this.f35790d;
        if (uVar4 != null) {
            arrayList.add("PM216MOSFET=" + uVar4);
        }
        u uVar5 = this.f35791e;
        if (uVar5 != null) {
            arrayList.add("PM216IGBT=" + uVar5);
        }
        u uVar6 = this.f35792f;
        if (uVar6 != null) {
            arrayList.add("CorianderSingle=" + uVar6);
        }
        u uVar7 = this.f35793g;
        if (uVar7 != null) {
            arrayList.add("CorianderDual=" + uVar7);
        }
        l02 = e0.l0(arrayList, ", ", "RearDriveUnit{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m638newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, okio.i unknownFields) {
        super(f35786h, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35787a = uVar;
        this.f35788b = uVar2;
        this.f35789c = uVar3;
        this.f35790d = uVar4;
        this.f35791e = uVar5;
        this.f35792f = uVar6;
        this.f35793g = uVar7;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7) <= 1)) {
            throw new IllegalArgumentException("At most one of None, LargeRear, SmallRear, PM216MOSFET, PM216IGBT, CorianderSingle, CorianderDual may be non-null".toString());
        }
    }
}