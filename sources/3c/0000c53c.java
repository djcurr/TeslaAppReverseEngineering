package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
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
    public static final ProtoAdapter<e> f60730c;
    @q(adapter = "com.tesla.generated.optin.OptIn#ADAPTER", jsonName = "optIn", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final vt.a f60731a;
    @q(adapter = "com.tesla.generated.vault.OpenVault#ADAPTER", jsonName = "openVault", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final c f60732b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.RemoteCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            vt.a aVar = null;
            c cVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(aVar, cVar, reader.e(d11));
                } else if (g11 == 1) {
                    aVar = vt.a.f54613d.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    cVar = c.f60726b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, e value) {
            s.g(writer, "writer");
            s.g(value, "value");
            vt.a.f54613d.encodeWithTag(writer, 1, value.c());
            c.f60726b.encodeWithTag(writer, 2, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            s.g(value, "value");
            return value.unknownFields().z() + vt.a.f54613d.encodedSizeWithTag(1, value.c()) + c.f60726b.encodedSizeWithTag(2, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            s.g(value, "value");
            vt.a c11 = value.c();
            vt.a redact = c11 == null ? null : vt.a.f54613d.redact(c11);
            c b11 = value.b();
            return value.a(redact, b11 != null ? c.f60726b.redact(b11) : null, okio.i.f42656d);
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
        f60730c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), o.PROTO_3);
    }

    public e() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ e(vt.a aVar, c cVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final e a(vt.a aVar, c cVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new e(aVar, cVar, unknownFields);
    }

    public final c b() {
        return this.f60732b;
    }

    public final vt.a c() {
        return this.f60731a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(unknownFields(), eVar.unknownFields()) && s.c(this.f60731a, eVar.f60731a) && s.c(this.f60732b, eVar.f60732b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            vt.a aVar = this.f60731a;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            c cVar = this.f60732b;
            int hashCode3 = hashCode2 + (cVar != null ? cVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1143newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        vt.a aVar = this.f60731a;
        if (aVar != null) {
            arrayList.add("opt_in=" + aVar);
        }
        c cVar = this.f60732b;
        if (cVar != null) {
            arrayList.add("open_vault=" + cVar);
        }
        l02 = e0.l0(arrayList, ", ", "RemoteCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1143newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vt.a aVar, c cVar, okio.i unknownFields) {
        super(f60730c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f60731a = aVar;
        this.f60732b = cVar;
        if (!(mr.d.c(aVar, cVar) <= 1)) {
            throw new IllegalArgumentException("At most one of opt_in, open_vault may be non-null".toString());
        }
    }
}