package ut;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;
import vz.b0;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b> f53661b;
    @q(adapter = "com.tesla.generated.notificationactions.NotificationAction#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<ut.a> f53662a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/NotificationActions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(k reader) {
            s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    try {
                        arrayList.add(ut.a.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        b0 b0Var = b0.f54756a;
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
            ut.a.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            s.g(value, "value");
            return value.unknownFields().z() + ut.a.ADAPTER.asRepeated().encodedSizeWithTag(1, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            s.g(value, "value");
            return b.b(value, null, i.f42656d, 1, null);
        }
    }

    /* renamed from: ut.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1204b {
        private C1204b() {
        }

        public /* synthetic */ C1204b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1204b(null);
        f53661b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), o.PROTO_3);
    }

    public b() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b(List list, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w.i() : list, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, List list, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f53662a;
        }
        if ((i11 & 2) != 0) {
            iVar = bVar.unknownFields();
        }
        return bVar.a(list, iVar);
    }

    public final b a(List<? extends ut.a> actions, i unknownFields) {
        s.g(actions, "actions");
        s.g(unknownFields, "unknownFields");
        return new b(actions, unknownFields);
    }

    public final List<ut.a> c() {
        return this.f53662a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(unknownFields(), bVar.unknownFields()) && s.c(this.f53662a, bVar.f53662a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f53662a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1115newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f53662a.isEmpty()) {
            List<ut.a> list = this.f53662a;
            arrayList.add("actions=" + list);
        }
        l02 = e0.l0(arrayList, ", ", "NotificationActions{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1115newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<? extends ut.a> actions, i unknownFields) {
        super(f53661b, unknownFields);
        s.g(actions, "actions");
        s.g(unknownFields, "unknownFields");
        this.f53662a = mr.d.g("actions", actions);
    }
}