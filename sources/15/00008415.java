package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<m> f37518f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final kt.u f37519a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final kt.u f37520b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "startStandard", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final kt.u f37521c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "startMaxRange", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final kt.u f37522d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final kt.u f37523e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m> {
        a(com.squareup.wire.b bVar, n00.d<m> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargingStartStopAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.u uVar = null;
            kt.u uVar2 = null;
            kt.u uVar3 = null;
            kt.u uVar4 = null;
            kt.u uVar5 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m(uVar, uVar2, uVar3, uVar4, uVar5, reader.e(d11));
                } else if (g11 == 1) {
                    uVar = kt.u.f35845a.decode(reader);
                } else if (g11 == 2) {
                    uVar2 = kt.u.f35845a.decode(reader);
                } else if (g11 == 3) {
                    uVar3 = kt.u.f35845a.decode(reader);
                } else if (g11 == 4) {
                    uVar4 = kt.u.f35845a.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    uVar5 = kt.u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, m value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.f());
            protoAdapter.encodeWithTag(writer, 2, value.b());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            protoAdapter.encodeWithTag(writer, 4, value.c());
            protoAdapter.encodeWithTag(writer, 5, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m redact(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.u f11 = value.f();
            kt.u redact = f11 == null ? null : kt.u.f35845a.redact(f11);
            kt.u b11 = value.b();
            kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
            kt.u d11 = value.d();
            kt.u redact3 = d11 == null ? null : kt.u.f35845a.redact(d11);
            kt.u c11 = value.c();
            kt.u redact4 = c11 == null ? null : kt.u.f35845a.redact(c11);
            kt.u e11 = value.e();
            return value.a(redact, redact2, redact3, redact4, e11 != null ? kt.u.f35845a.redact(e11) : null, okio.i.f42656d);
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
        f37518f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m.class), com.squareup.wire.o.PROTO_3);
    }

    public m() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ m(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) == 0 ? uVar5 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public final m a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m(uVar, uVar2, uVar3, uVar4, uVar5, unknownFields);
    }

    public final kt.u b() {
        return this.f37520b;
    }

    public final kt.u c() {
        return this.f37522d;
    }

    public final kt.u d() {
        return this.f37521c;
    }

    public final kt.u e() {
        return this.f37523e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), mVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37519a, mVar.f37519a) && kotlin.jvm.internal.s.c(this.f37520b, mVar.f37520b) && kotlin.jvm.internal.s.c(this.f37521c, mVar.f37521c) && kotlin.jvm.internal.s.c(this.f37522d, mVar.f37522d) && kotlin.jvm.internal.s.c(this.f37523e, mVar.f37523e);
        }
        return false;
    }

    public final kt.u f() {
        return this.f37519a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            kt.u uVar = this.f37519a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            kt.u uVar2 = this.f37520b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            kt.u uVar3 = this.f37521c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            kt.u uVar4 = this.f37522d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            kt.u uVar5 = this.f37523e;
            int hashCode6 = hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m703newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        kt.u uVar = this.f37519a;
        if (uVar != null) {
            arrayList.add("unknown=" + uVar);
        }
        kt.u uVar2 = this.f37520b;
        if (uVar2 != null) {
            arrayList.add("start=" + uVar2);
        }
        kt.u uVar3 = this.f37521c;
        if (uVar3 != null) {
            arrayList.add("start_standard=" + uVar3);
        }
        kt.u uVar4 = this.f37522d;
        if (uVar4 != null) {
            arrayList.add("start_max_range=" + uVar4);
        }
        kt.u uVar5 = this.f37523e;
        if (uVar5 != null) {
            arrayList.add("stop=" + uVar5);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ChargingStartStopAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m703newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
        super(f37518f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37519a = uVar;
        this.f37520b = uVar2;
        this.f37521c = uVar3;
        this.f37522d = uVar4;
        this.f37523e = uVar5;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1)) {
            throw new IllegalArgumentException("At most one of unknown, start, start_standard, start_max_range, stop may be non-null".toString());
        }
    }
}