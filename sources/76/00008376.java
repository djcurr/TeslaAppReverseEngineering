package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mt.k;

/* loaded from: classes6.dex */
public final class a2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<a2> f37339b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CopActivationTemp#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final k.f f37340a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<a2> {
        a(com.squareup.wire.b bVar, n00.d<a2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SetCopTempAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            k.f fVar = k.f.CopActivationTempUnspecified;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a2(fVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        fVar = k.f.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, a2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != k.f.CopActivationTempUnspecified) {
                k.f.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != k.f.CopActivationTempUnspecified ? z11 + k.f.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a2 redact(a2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return a2.b(value, null, okio.i.f42656d, 1, null);
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
        f37339b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(a2.class), com.squareup.wire.o.PROTO_3);
    }

    public a2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ a2(k.f fVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.f.CopActivationTempUnspecified : fVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ a2 b(a2 a2Var, k.f fVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = a2Var.f37340a;
        }
        if ((i11 & 2) != 0) {
            iVar = a2Var.unknownFields();
        }
        return a2Var.a(fVar, iVar);
    }

    public final a2 a(k.f copActivationTemp, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(copActivationTemp, "copActivationTemp");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new a2(copActivationTemp, unknownFields);
    }

    public final k.f c() {
        return this.f37340a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), a2Var.unknownFields()) && this.f37340a == a2Var.f37340a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37340a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m653newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        k.f fVar = this.f37340a;
        arrayList.add("copActivationTemp=" + fVar);
        l02 = wz.e0.l0(arrayList, ", ", "SetCopTempAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m653newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(k.f copActivationTemp, okio.i unknownFields) {
        super(f37339b, unknownFields);
        kotlin.jvm.internal.s.g(copActivationTemp, "copActivationTemp");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37340a = copActivationTemp;
    }
}