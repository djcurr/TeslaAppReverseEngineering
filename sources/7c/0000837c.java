package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<b> f37343c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.OperationStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final l1 f37344a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ResultReason#ADAPTER", jsonName = "resultReason", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final v1 f37345b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ActionStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            l1 l1Var = l1.OPERATIONSTATUS_OK;
            long d11 = reader.d();
            v1 v1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(l1Var, v1Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        l1Var = l1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    v1Var = v1.f37670b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != l1.OPERATIONSTATUS_OK) {
                l1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != null) {
                v1.f37670b.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != l1.OPERATIONSTATUS_OK) {
                z11 += l1.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return value.d() != null ? z11 + v1.f37670b.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            v1 d11 = value.d();
            return b.b(value, null, d11 == null ? null : v1.f37670b.redact(d11), okio.i.f42656d, 1, null);
        }
    }

    /* renamed from: lt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0711b {
        private C0711b() {
        }

        public /* synthetic */ C0711b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0711b(null);
        f37343c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b.class), com.squareup.wire.o.PROTO_3);
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ b(l1 l1Var, v1 v1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? l1.OPERATIONSTATUS_OK : l1Var, (i11 & 2) != 0 ? null : v1Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, l1 l1Var, v1 v1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l1Var = bVar.f37344a;
        }
        if ((i11 & 2) != 0) {
            v1Var = bVar.f37345b;
        }
        if ((i11 & 4) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(l1Var, v1Var, iVar);
    }

    public final b a(l1 result, v1 v1Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(result, "result");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b(result, v1Var, unknownFields);
    }

    public final l1 c() {
        return this.f37344a;
    }

    public final v1 d() {
        return this.f37345b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && this.f37344a == bVar.f37344a && kotlin.jvm.internal.s.c(this.f37345b, bVar.f37345b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f37344a.hashCode()) * 37;
            v1 v1Var = this.f37345b;
            int hashCode2 = hashCode + (v1Var != null ? v1Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m655newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        l1 l1Var = this.f37344a;
        arrayList.add("result=" + l1Var);
        v1 v1Var = this.f37345b;
        if (v1Var != null) {
            arrayList.add("result_reason=" + v1Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ActionStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m655newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l1 result, v1 v1Var, okio.i unknownFields) {
        super(f37343c, unknownFields);
        kotlin.jvm.internal.s.g(result, "result");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37344a = result;
        this.f37345b = v1Var;
    }
}