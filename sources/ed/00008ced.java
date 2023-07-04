package nt;

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
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b> f41866b;
    @q(adapter = "com.tesla.generated.centerdisplay.server.RemoteServiceAccessCommand#ADAPTER", jsonName = "remoteServiceAccessCommand", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final nt.a f41867a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/center_display.Request", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            nt.a aVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(aVar, reader.e(d11));
                } else if (g11 == 1) {
                    aVar = nt.a.f41864b.decode(reader);
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
            nt.a.f41864b.encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            return value.unknownFields().z() + nt.a.f41864b.encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            nt.a b11 = value.b();
            return value.a(b11 == null ? null : nt.a.f41864b.redact(b11), i.f42656d);
        }
    }

    /* renamed from: nt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0819b {
        private C0819b() {
        }

        public /* synthetic */ C0819b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0819b(null);
        f41866b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b(nt.a aVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public final b a(nt.a aVar, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new b(aVar, unknownFields);
    }

    public final nt.a b() {
        return this.f41867a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f41867a, bVar.f41867a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            nt.a aVar = this.f41867a;
            int hashCode2 = hashCode + (aVar != null ? aVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m814newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        nt.a aVar = this.f41867a;
        if (aVar != null) {
            arrayList.add("remote_service_access_command=" + aVar);
        }
        l02 = e0.l0(arrayList, ", ", "Request{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m814newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nt.a aVar, i unknownFields) {
        super(f41866b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f41867a = aVar;
    }
}