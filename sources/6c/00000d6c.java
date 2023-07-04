package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<h3> f8041d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8042a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f8043b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "batteryVoltageMV", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8044c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h3> {
        a(com.squareup.wire.b bVar, n00.d<h3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPWheelUnitInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h3(iVar, iVar2, i11, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d());
            }
            return value.c() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h3 redact(h3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return h3.b(value, null, null, 0, okio.i.f42656d, 7, null);
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
        f8041d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h3.class), com.squareup.wire.o.PROTO_3);
    }

    public h3() {
        this(null, null, 0, null, 15, null);
    }

    public /* synthetic */ h3(okio.i iVar, okio.i iVar2, int i11, okio.i iVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.i.f42656d : iVar, (i12 & 2) != 0 ? okio.i.f42656d : iVar2, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ h3 b(h3 h3Var, okio.i iVar, okio.i iVar2, int i11, okio.i iVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iVar = h3Var.f8042a;
        }
        if ((i12 & 2) != 0) {
            iVar2 = h3Var.f8043b;
        }
        if ((i12 & 4) != 0) {
            i11 = h3Var.f8044c;
        }
        if ((i12 & 8) != 0) {
            iVar3 = h3Var.unknownFields();
        }
        return h3Var.a(iVar, iVar2, i11, iVar3);
    }

    public final h3 a(okio.i TIAppCRC, okio.i MLXAppCRC, int i11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(TIAppCRC, "TIAppCRC");
        kotlin.jvm.internal.s.g(MLXAppCRC, "MLXAppCRC");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h3(TIAppCRC, MLXAppCRC, i11, unknownFields);
    }

    public final int c() {
        return this.f8044c;
    }

    public final okio.i d() {
        return this.f8043b;
    }

    public final okio.i e() {
        return this.f8042a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8042a, h3Var.f8042a) && kotlin.jvm.internal.s.c(this.f8043b, h3Var.f8043b) && this.f8044c == h3Var.f8044c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8042a.hashCode()) * 37) + this.f8043b.hashCode()) * 37) + Integer.hashCode(this.f8044c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m37newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8042a;
        arrayList.add("TIAppCRC=" + iVar);
        okio.i iVar2 = this.f8043b;
        arrayList.add("MLXAppCRC=" + iVar2);
        int i11 = this.f8044c;
        arrayList.add("batteryVoltage_mV=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "TPWheelUnitInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m37newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(okio.i TIAppCRC, okio.i MLXAppCRC, int i11, okio.i unknownFields) {
        super(f8041d, unknownFields);
        kotlin.jvm.internal.s.g(TIAppCRC, "TIAppCRC");
        kotlin.jvm.internal.s.g(MLXAppCRC, "MLXAppCRC");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8042a = TIAppCRC;
        this.f8043b = MLXAppCRC;
        this.f8044c = i11;
    }
}