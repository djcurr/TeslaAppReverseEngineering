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
public final class e extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<e> f57706c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "publicKey", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f57707a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "keyId", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f57708b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.KeyIdentity", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            okio.i iVar = null;
            okio.i iVar2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e value) {
            s.g(writer, "writer");
            s.g(value, "value");
            ProtoAdapter<okio.i> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(writer, 1, value.d());
            protoAdapter.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<okio.i> protoAdapter = ProtoAdapter.BYTES;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            s.g(value, "value");
            return e.b(value, null, null, okio.i.f42656d, 3, null);
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
        f57706c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
    }

    public e() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ e(okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : iVar, (i11 & 2) != 0 ? null : iVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ e b(e eVar, okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = eVar.f57707a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = eVar.f57708b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = eVar.unknownFields();
        }
        return eVar.a(iVar, iVar2, iVar3);
    }

    public final e a(okio.i iVar, okio.i iVar2, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new e(iVar, iVar2, unknownFields);
    }

    public final okio.i c() {
        return this.f57708b;
    }

    public final okio.i d() {
        return this.f57707a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(unknownFields(), eVar.unknownFields()) && s.c(this.f57707a, eVar.f57707a) && s.c(this.f57708b, eVar.f57708b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            okio.i iVar = this.f57707a;
            int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 37;
            okio.i iVar2 = this.f57708b;
            int hashCode3 = hashCode2 + (iVar2 != null ? iVar2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1129newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f57707a;
        if (iVar != null) {
            arrayList.add("public_key=" + iVar);
        }
        okio.i iVar2 = this.f57708b;
        if (iVar2 != null) {
            arrayList.add("key_id=" + iVar2);
        }
        l02 = e0.l0(arrayList, ", ", "KeyIdentity{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1129newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(okio.i iVar, okio.i iVar2, okio.i unknownFields) {
        super(f57706c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f57707a = iVar;
        this.f57708b = iVar2;
        if (!(mr.d.c(iVar, iVar2) <= 1)) {
            throw new IllegalArgumentException("At most one of public_key, key_id may be non-null".toString());
        }
    }
}