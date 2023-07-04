package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class s extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<s> f8197c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEConfigCommandType_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final t f8198a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEConfig#ADAPTER", declaredName = "BLEConfig", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final q f8199b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s> {
        a(com.squareup.wire.b bVar, n00.d<s> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.BLEConfigCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            t tVar = t.BLE_CONFIG_COMMAND_TYPE_NONE;
            long d11 = reader.d();
            q qVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s(tVar, qVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        tVar = t.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    qVar = q.f8178c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != t.BLE_CONFIG_COMMAND_TYPE_NONE) {
                t.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != null) {
                q.f8178c.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != t.BLE_CONFIG_COMMAND_TYPE_NONE) {
                z11 += t.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return value.d() != null ? z11 + q.f8178c.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s redact(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            q d11 = value.d();
            return s.b(value, null, d11 == null ? null : q.f8178c.redact(d11), okio.i.f42656d, 1, null);
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
        f8197c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s.class), com.squareup.wire.o.PROTO_3);
    }

    public s() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ s(t tVar, q qVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t.BLE_CONFIG_COMMAND_TYPE_NONE : tVar, (i11 & 2) != 0 ? null : qVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s b(s sVar, t tVar, q qVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = sVar.f8198a;
        }
        if ((i11 & 2) != 0) {
            qVar = sVar.f8199b;
        }
        if ((i11 & 4) != 0) {
            iVar = sVar.unknownFields();
        }
        return sVar.a(tVar, qVar, iVar);
    }

    public final s a(t BLEConfigCommandType, q qVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(BLEConfigCommandType, "BLEConfigCommandType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s(BLEConfigCommandType, qVar, unknownFields);
    }

    public final t c() {
        return this.f8198a;
    }

    public final q d() {
        return this.f8199b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), sVar.unknownFields()) && this.f8198a == sVar.f8198a && kotlin.jvm.internal.s.c(this.f8199b, sVar.f8199b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f8198a.hashCode()) * 37;
            q qVar = this.f8199b;
            int hashCode2 = hashCode + (qVar != null ? qVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m70newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        t tVar = this.f8198a;
        arrayList.add("BLEConfigCommandType=" + tVar);
        q qVar = this.f8199b;
        if (qVar != null) {
            arrayList.add("VCSEC_BLEConfig=" + qVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "BLEConfigCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m70newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t BLEConfigCommandType, q qVar, okio.i unknownFields) {
        super(f8197c, unknownFields);
        kotlin.jvm.internal.s.g(BLEConfigCommandType, "BLEConfigCommandType");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8198a = BLEConfigCommandType;
        this.f8199b = qVar;
    }
}