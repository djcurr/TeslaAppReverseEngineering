package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<e1> f37377c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "volumeDelta", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Integer f37378a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "volumeAbsoluteFloat", tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final Float f37379b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e1> {
        a(com.squareup.wire.b bVar, n00.d<e1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaUpdateVolume", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Integer num = null;
            Float f11 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e1(num, f11, reader.e(d11));
                } else if (g11 == 1) {
                    num = ProtoAdapter.SINT32.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    f11 = ProtoAdapter.FLOAT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter.SINT32.encodeWithTag(writer, 1, value.d());
            ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + ProtoAdapter.SINT32.encodedSizeWithTag(1, value.d()) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e1 redact(e1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return e1.b(value, null, null, okio.i.f42656d, 3, null);
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
        f37377c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(e1.class), com.squareup.wire.o.PROTO_3);
    }

    public e1() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ e1(Integer num, Float f11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ e1 b(e1 e1Var, Integer num, Float f11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = e1Var.f37378a;
        }
        if ((i11 & 2) != 0) {
            f11 = e1Var.f37379b;
        }
        if ((i11 & 4) != 0) {
            iVar = e1Var.unknownFields();
        }
        return e1Var.a(num, f11, iVar);
    }

    public final e1 a(Integer num, Float f11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e1(num, f11, unknownFields);
    }

    public final Float c() {
        return this.f37379b;
    }

    public final Integer d() {
        return this.f37378a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), e1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37378a, e1Var.f37378a) && kotlin.jvm.internal.s.b(this.f37379b, e1Var.f37379b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.f37378a;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Float f11 = this.f37379b;
            int hashCode3 = hashCode2 + (f11 != null ? f11.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m673newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Integer num = this.f37378a;
        if (num != null) {
            arrayList.add("volume_delta=" + num);
        }
        Float f11 = this.f37379b;
        if (f11 != null) {
            arrayList.add("volume_absolute_float=" + f11);
        }
        l02 = wz.e0.l0(arrayList, ", ", "MediaUpdateVolume{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m673newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Integer num, Float f11, okio.i unknownFields) {
        super(f37377c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37378a = num;
        this.f37379b = f11;
        if (!(mr.d.c(num, f11) <= 1)) {
            throw new IllegalArgumentException("At most one of volume_delta, volume_absolute_float may be non-null".toString());
        }
    }
}