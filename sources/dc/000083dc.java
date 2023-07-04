package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h2 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<h2> f37427b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "calendarData", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37428a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h2> {
        a(com.squareup.wire.b bVar, n00.d<h2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.UISetUpcomingCalendarEntries", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h2(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h2 redact(h2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return h2.b(value, null, okio.i.f42656d, 1, null);
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
        f37427b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h2.class), com.squareup.wire.o.PROTO_3);
    }

    public h2() {
        this(null, null, 3, null);
    }

    public /* synthetic */ h2(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ h2 b(h2 h2Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = h2Var.f37428a;
        }
        if ((i11 & 2) != 0) {
            iVar = h2Var.unknownFields();
        }
        return h2Var.a(str, iVar);
    }

    public final h2 a(String calendar_data, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(calendar_data, "calendar_data");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h2(calendar_data, unknownFields);
    }

    public final String c() {
        return this.f37428a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            h2 h2Var = (h2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37428a, h2Var.f37428a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37428a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m686newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37428a);
        arrayList.add("calendar_data=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "UISetUpcomingCalendarEntries{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m686newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(String calendar_data, okio.i unknownFields) {
        super(f37427b, unknownFields);
        kotlin.jvm.internal.s.g(calendar_data, "calendar_data");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37428a = calendar_data;
    }
}