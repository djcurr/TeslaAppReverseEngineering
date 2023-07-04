package wt;

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
public final class a extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<a> f56174b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filePath", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f56175a;

    /* renamed from: wt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1273a extends ProtoAdapter<a> {
        C1273a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/FileUploadRequestPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public a decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new a(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
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
            if (!s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(a value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public a redact(a value) {
            s.g(value, "value");
            return a.b(value, null, i.f42656d, 1, null);
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
        f56174b = new C1273a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), o.PROTO_3);
    }

    public a() {
        this(null, null, 3, null);
    }

    public /* synthetic */ a(String str, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ a b(a aVar, String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f56175a;
        }
        if ((i11 & 2) != 0) {
            iVar = aVar.unknownFields();
        }
        return aVar.a(str, iVar);
    }

    public final a a(String file_path, i unknownFields) {
        s.g(file_path, "file_path");
        s.g(unknownFields, "unknownFields");
        return new a(file_path, unknownFields);
    }

    public final String c() {
        return this.f56175a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(unknownFields(), aVar.unknownFields()) && s.c(this.f56175a, aVar.f56175a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f56175a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1122newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f56175a);
        arrayList.add("file_path=" + i11);
        l02 = e0.l0(arrayList, ", ", "FileUploadRequestPayload{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1122newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String file_path, i unknownFields) {
        super(f56174b, unknownFields);
        s.g(file_path, "file_path");
        s.g(unknownFields, "unknownFields");
        this.f56175a = file_path;
    }
}