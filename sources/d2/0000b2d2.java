package st;

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
import wz.e0;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<f> f50639b;
    @q(adapter = "com.tesla.generated.managedcharging.ErrorCode#ADAPTER", jsonName = "errorCode", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e f50640a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ErrorResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(k reader) {
            s.g(reader, "reader");
            e eVar = e.ERROR_CODE_INVALID;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(eVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        eVar = e.ADAPTER.decode(reader);
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
        public void encode(l writer, f value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != e.ERROR_CODE_INVALID) {
                e.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != e.ERROR_CODE_INVALID ? z11 + e.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            s.g(value, "value");
            return f.b(value, null, okio.i.f42656d, 1, null);
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
        f50639b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), o.PROTO_3);
    }

    public f() {
        this(null, null, 3, null);
    }

    public /* synthetic */ f(e eVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? e.ERROR_CODE_INVALID : eVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f b(f fVar, e eVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = fVar.f50640a;
        }
        if ((i11 & 2) != 0) {
            iVar = fVar.unknownFields();
        }
        return fVar.a(eVar, iVar);
    }

    public final f a(e error_code, okio.i unknownFields) {
        s.g(error_code, "error_code");
        s.g(unknownFields, "unknownFields");
        return new f(error_code, unknownFields);
    }

    public final e c() {
        return this.f50640a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return s.c(unknownFields(), fVar.unknownFields()) && this.f50640a == fVar.f50640a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f50640a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1102newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e eVar = this.f50640a;
        arrayList.add("error_code=" + eVar);
        l02 = e0.l0(arrayList, ", ", "ErrorResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1102newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e error_code, okio.i unknownFields) {
        super(f50639b, unknownFields);
        s.g(error_code, "error_code");
        s.g(unknownFields, "unknownFields");
        this.f50640a = error_code;
    }
}