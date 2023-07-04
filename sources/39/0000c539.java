package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class d extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<d> f60728b;
    @q(adapter = "com.tesla.generated.vault.VaultKey#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f60729a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.RemoteClientKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(i.f60749c.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            i.f60749c.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            return value.unknownFields().z() + i.f60749c.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            return value.a(mr.d.a(value.b(), i.f60749c), okio.i.f42656d);
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
        f60728b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, 3, null);
    }

    public /* synthetic */ d(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final d a(List<i> pubkeys, okio.i unknownFields) {
        s.g(pubkeys, "pubkeys");
        s.g(unknownFields, "unknownFields");
        return new d(pubkeys, unknownFields);
    }

    public final List<i> b() {
        return this.f60729a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f60729a, dVar.f60729a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f60729a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1142newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f60729a.isEmpty()) {
            List<i> list = this.f60729a;
            arrayList.add("pubkeys=" + list);
        }
        l02 = e0.l0(arrayList, ", ", "RemoteClientKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1142newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<i> pubkeys, okio.i unknownFields) {
        super(f60728b, unknownFields);
        s.g(pubkeys, "pubkeys");
        s.g(unknownFields, "unknownFields");
        this.f60729a = mr.d.g("pubkeys", pubkeys);
    }
}