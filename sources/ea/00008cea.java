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
public final class a extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<a> f41864b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41865a;

    /* renamed from: nt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0818a extends ProtoAdapter<a> {
        C0818a(com.squareup.wire.b bVar, n00.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/center_display.RemoteServiceAccessCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(z11, reader.e(d11));
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
        public void encode(l writer, a value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, false, i.f42656d, 1, null);
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
        f41864b = new C0818a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(false, null, 3, null);
    }

    public /* synthetic */ a(boolean z11, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, boolean z11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = aVar.f41865a;
        }
        if ((i11 & 2) != 0) {
            iVar = aVar.unknownFields();
        }
        return aVar.a(z11, iVar);
    }

    public final a a(boolean z11, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new a(z11, unknownFields);
    }

    public final boolean c() {
        return this.f41865a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && this.f41865a == aVar.f41865a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.f41865a);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m813newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f41865a;
        arrayList.add("allowed=" + z11);
        l02 = e0.l0(arrayList, ", ", "RemoteServiceAccessCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m813newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z11, i unknownFields) {
        super(f41864b, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f41865a = z11;
    }
}