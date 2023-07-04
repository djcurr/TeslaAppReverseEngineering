package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d4 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<d4> f7976d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation_information_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final c4 f7977a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final e1 f7978b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.OperationStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final y1 f7979c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d4> {
        a(com.squareup.wire.b bVar, n00.d<d4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.WhitelistOperation_status", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d4 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            c4 c4Var = c4.WHITELISTOPERATION_INFORMATION_NONE;
            y1 y1Var = y1.OPERATIONSTATUS_OK;
            long d11 = reader.d();
            e1 e1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d4(c4Var, e1Var, y1Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        c4Var = c4.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    e1Var = e1.f7982b.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        y1Var = y1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d4 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != c4.WHITELISTOPERATION_INFORMATION_NONE) {
                c4.ADAPTER.encodeWithTag(writer, 1, value.e());
            }
            if (value.d() != null) {
                e1.f7982b.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != y1.OPERATIONSTATUS_OK) {
                y1.ADAPTER.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d4 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != c4.WHITELISTOPERATION_INFORMATION_NONE) {
                z11 += c4.ADAPTER.encodedSizeWithTag(1, value.e());
            }
            if (value.d() != null) {
                z11 += e1.f7982b.encodedSizeWithTag(2, value.d());
            }
            return value.c() != y1.OPERATIONSTATUS_OK ? z11 + y1.ADAPTER.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d4 redact(d4 value) {
            kotlin.jvm.internal.s.g(value, "value");
            e1 d11 = value.d();
            return d4.b(value, null, d11 == null ? null : e1.f7982b.redact(d11), null, okio.i.f42656d, 5, null);
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
        f7976d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d4.class), com.squareup.wire.o.PROTO_3);
    }

    public d4() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ d4(c4 c4Var, e1 e1Var, y1 y1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c4.WHITELISTOPERATION_INFORMATION_NONE : c4Var, (i11 & 2) != 0 ? null : e1Var, (i11 & 4) != 0 ? y1.OPERATIONSTATUS_OK : y1Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ d4 b(d4 d4Var, c4 c4Var, e1 e1Var, y1 y1Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c4Var = d4Var.f7977a;
        }
        if ((i11 & 2) != 0) {
            e1Var = d4Var.f7978b;
        }
        if ((i11 & 4) != 0) {
            y1Var = d4Var.f7979c;
        }
        if ((i11 & 8) != 0) {
            iVar = d4Var.unknownFields();
        }
        return d4Var.a(c4Var, e1Var, y1Var, iVar);
    }

    public final d4 a(c4 whitelistOperationInformation, e1 e1Var, y1 operationStatus, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(whitelistOperationInformation, "whitelistOperationInformation");
        kotlin.jvm.internal.s.g(operationStatus, "operationStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d4(whitelistOperationInformation, e1Var, operationStatus, unknownFields);
    }

    public final y1 c() {
        return this.f7979c;
    }

    public final e1 d() {
        return this.f7978b;
    }

    public final c4 e() {
        return this.f7977a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d4) {
            d4 d4Var = (d4) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), d4Var.unknownFields()) && this.f7977a == d4Var.f7977a && kotlin.jvm.internal.s.c(this.f7978b, d4Var.f7978b) && this.f7979c == d4Var.f7979c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f7977a.hashCode()) * 37;
            e1 e1Var = this.f7978b;
            int hashCode2 = ((hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 37) + this.f7979c.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m23newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        c4 c4Var = this.f7977a;
        arrayList.add("whitelistOperationInformation=" + c4Var);
        e1 e1Var = this.f7978b;
        if (e1Var != null) {
            arrayList.add("signerOfOperation=" + e1Var);
        }
        y1 y1Var = this.f7979c;
        arrayList.add("operationStatus=" + y1Var);
        l02 = wz.e0.l0(arrayList, ", ", "WhitelistOperation_status{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m23newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(c4 whitelistOperationInformation, e1 e1Var, y1 operationStatus, okio.i unknownFields) {
        super(f7976d, unknownFields);
        kotlin.jvm.internal.s.g(whitelistOperationInformation, "whitelistOperationInformation");
        kotlin.jvm.internal.s.g(operationStatus, "operationStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7977a = whitelistOperationInformation;
        this.f7978b = e1Var;
        this.f7979c = operationStatus;
    }
}