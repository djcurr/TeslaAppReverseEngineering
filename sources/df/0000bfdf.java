package xt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b> f57697b;
    @q(adapter = "com.tesla.generated.signatures.KeyIdentity#ADAPTER", jsonName = "keyIdentity", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e f57698a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.GetSessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            e eVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(eVar, reader.e(d11));
                } else if (g11 == 1) {
                    eVar = e.f57706c.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.b() != null) {
                e.f57706c.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + e.f57706c.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            e b11 = value.b();
            return value.a(b11 == null ? null : e.f57706c.redact(b11), okio.i.f42656d);
        }
    }

    /* renamed from: xt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1310b {
        private C1310b() {
        }

        public /* synthetic */ C1310b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1310b(null);
        f57697b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b(e eVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : eVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final b a(e eVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(eVar, unknownFields);
    }

    public final e b() {
        return this.f57698a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f57698a, bVar.f57698a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            e eVar = this.f57698a;
            int hashCode2 = hashCode + (eVar != null ? eVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1126newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e eVar = this.f57698a;
        if (eVar != null) {
            arrayList.add("key_identity=" + eVar);
        }
        l02 = e0.l0(arrayList, ", ", "GetSessionInfoRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1126newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, okio.i unknownFields) {
        super(f57697b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f57698a = eVar;
    }
}