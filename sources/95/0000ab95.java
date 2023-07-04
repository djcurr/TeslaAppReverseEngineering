package pt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b> f46915b;
    @q(adapter = "com.tesla.generated.errors.GenericError_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final pt.a f46916a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Errors.NominalError", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            pt.a aVar = pt.a.GENERICERROR_NONE;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(aVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        aVar = pt.a.ADAPTER.decode(reader);
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
        public void encode(l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != pt.a.GENERICERROR_NONE) {
                pt.a.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != pt.a.GENERICERROR_NONE ? z11 + pt.a.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return b.b(value, null, i.f42656d, 1, null);
        }
    }

    /* renamed from: pt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1006b {
        private C1006b() {
        }

        public /* synthetic */ C1006b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1006b(null);
        f46915b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b(pt.a aVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? pt.a.GENERICERROR_NONE : aVar, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ b b(b bVar, pt.a aVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = bVar.f46916a;
        }
        if ((i11 & 2) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(aVar, iVar);
    }

    public final b a(pt.a genericError, i unknownFields) {
        s.g(genericError, "genericError");
        s.g(unknownFields, "unknownFields");
        return new b(genericError, unknownFields);
    }

    public final pt.a c() {
        return this.f46916a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && this.f46916a == bVar.f46916a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f46916a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1092newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        pt.a aVar = this.f46916a;
        arrayList.add("genericError=" + aVar);
        l02 = e0.l0(arrayList, ", ", "NominalError{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1092newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pt.a genericError, i unknownFields) {
        super(f46915b, unknownFields);
        s.g(genericError, "genericError");
        s.g(unknownFields, "unknownFields");
        this.f46916a = genericError;
    }
}