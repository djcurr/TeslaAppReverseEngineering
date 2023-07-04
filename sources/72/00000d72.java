package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<i0> f8045d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.OperationStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final y1 f8046a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage_status#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final q2 f8047b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation_status#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final d4 f8048c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i0> {
        a(com.squareup.wire.b bVar, n00.d<i0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CommandStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            y1 y1Var = y1.OPERATIONSTATUS_OK;
            long d11 = reader.d();
            q2 q2Var = null;
            d4 d4Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i0(y1Var, q2Var, d4Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        y1Var = y1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    q2Var = q2.f8184c.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    d4Var = d4.f7976d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != y1.OPERATIONSTATUS_OK) {
                y1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            q2.f8184c.encodeWithTag(writer, 2, value.d());
            d4.f7976d.encodeWithTag(writer, 3, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != y1.OPERATIONSTATUS_OK) {
                z11 += y1.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return z11 + q2.f8184c.encodedSizeWithTag(2, value.d()) + d4.f7976d.encodedSizeWithTag(3, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i0 redact(i0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            q2 d11 = value.d();
            q2 redact = d11 == null ? null : q2.f8184c.redact(d11);
            d4 e11 = value.e();
            return i0.b(value, null, redact, e11 != null ? d4.f7976d.redact(e11) : null, okio.i.f42656d, 1, null);
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
        f8045d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i0.class), com.squareup.wire.o.PROTO_3);
    }

    public i0() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ i0(y1 y1Var, q2 q2Var, d4 d4Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? y1.OPERATIONSTATUS_OK : y1Var, (i11 & 2) != 0 ? null : q2Var, (i11 & 4) != 0 ? null : d4Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ i0 b(i0 i0Var, y1 y1Var, q2 q2Var, d4 d4Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            y1Var = i0Var.f8046a;
        }
        if ((i11 & 2) != 0) {
            q2Var = i0Var.f8047b;
        }
        if ((i11 & 4) != 0) {
            d4Var = i0Var.f8048c;
        }
        if ((i11 & 8) != 0) {
            iVar = i0Var.unknownFields();
        }
        return i0Var.a(y1Var, q2Var, d4Var, iVar);
    }

    public final i0 a(y1 operationStatus, q2 q2Var, d4 d4Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(operationStatus, "operationStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i0(operationStatus, q2Var, d4Var, unknownFields);
    }

    public final y1 c() {
        return this.f8046a;
    }

    public final q2 d() {
        return this.f8047b;
    }

    public final d4 e() {
        return this.f8048c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), i0Var.unknownFields()) && this.f8046a == i0Var.f8046a && kotlin.jvm.internal.s.c(this.f8047b, i0Var.f8047b) && kotlin.jvm.internal.s.c(this.f8048c, i0Var.f8048c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f8046a.hashCode()) * 37;
            q2 q2Var = this.f8047b;
            int hashCode2 = (hashCode + (q2Var != null ? q2Var.hashCode() : 0)) * 37;
            d4 d4Var = this.f8048c;
            int hashCode3 = hashCode2 + (d4Var != null ? d4Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m38newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        y1 y1Var = this.f8046a;
        arrayList.add("operationStatus=" + y1Var);
        q2 q2Var = this.f8047b;
        if (q2Var != null) {
            arrayList.add("signedMessageStatus=" + q2Var);
        }
        d4 d4Var = this.f8048c;
        if (d4Var != null) {
            arrayList.add("whitelistOperationStatus=" + d4Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "CommandStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m38newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(y1 operationStatus, q2 q2Var, d4 d4Var, okio.i unknownFields) {
        super(f8045d, unknownFields);
        kotlin.jvm.internal.s.g(operationStatus, "operationStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8046a = operationStatus;
        this.f8047b = q2Var;
        this.f8048c = d4Var;
        if (!(mr.d.c(q2Var, d4Var) <= 1)) {
            throw new IllegalArgumentException("At most one of signedMessageStatus, whitelistOperationStatus may be non-null".toString());
        }
    }
}