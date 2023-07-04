package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class u0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<u0> f37628b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "powerOn", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37629a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<u0> {
        a(com.squareup.wire.b bVar, n00.d<u0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSteeringWheelHeaterAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new u0(z11, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u0 redact(u0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return u0.b(value, false, okio.i.f42656d, 1, null);
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
        f37628b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(u0.class), com.squareup.wire.o.PROTO_3);
    }

    public u0() {
        this(false, null, 3, null);
    }

    public /* synthetic */ u0(boolean z11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ u0 b(u0 u0Var, boolean z11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = u0Var.f37629a;
        }
        if ((i11 & 2) != 0) {
            iVar = u0Var.unknownFields();
        }
        return u0Var.a(z11, iVar);
    }

    public final u0 a(boolean z11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u0(z11, unknownFields);
    }

    public final boolean c() {
        return this.f37629a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), u0Var.unknownFields()) && this.f37629a == u0Var.f37629a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37629a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m737newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37629a;
        arrayList.add("power_on=" + z11);
        l02 = wz.e0.l0(arrayList, ", ", "HvacSteeringWheelHeaterAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m737newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z11, okio.i unknownFields) {
        super(f37628b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37629a = z11;
    }
}