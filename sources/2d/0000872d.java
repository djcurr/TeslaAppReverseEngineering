package mr;

import ch.qos.logback.core.CoreConstants;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class k<M, B> extends ProtoAdapter<M> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<? super M> f38922a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, b<M, B>> f38923b;

    /* renamed from: c  reason: collision with root package name */
    private final FieldOrOneOfBinding<M, B>[] f38924c;

    /* renamed from: d  reason: collision with root package name */
    private final g<M, B> f38925d;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g<M, B> binding) {
        super(com.squareup.wire.b.LENGTH_DELIMITED, binding.e(), binding.getTypeUrl(), binding.getSyntax());
        String g11;
        s.g(binding, "binding");
        this.f38925d = binding;
        this.f38922a = binding.e();
        Map<Integer, b<M, B>> fields = binding.getFields();
        this.f38923b = fields;
        Object[] array = fields.values().toArray(new b[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        b<?, ?>[] bVarArr = (b[]) array;
        this.f38924c = bVarArr;
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (b<?, ?> bVar : bVarArr) {
            arrayList.add(a(bVar));
        }
        b[] bVarArr2 = this.f38924c;
        ArrayList arrayList2 = new ArrayList(bVarArr2.length);
        for (b bVar2 : bVarArr2) {
            if (!s.c(a(bVar2), bVar2.c())) {
                g11 = bVar2.c();
            } else {
                g11 = s.c(a(bVar2), bVar2.g()) ^ true ? bVar2.g() : null;
            }
            arrayList2.add(g11);
        }
    }

    public final String a(b<?, ?> jsonName) {
        s.g(jsonName, "$this$jsonName");
        return jsonName.k().length() == 0 ? jsonName.c() : jsonName.k();
    }

    public final B b() {
        return this.f38925d.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(com.squareup.wire.k reader) {
        ProtoAdapter<?> i11;
        s.g(reader, "reader");
        B b11 = b();
        long d11 = reader.d();
        while (true) {
            int g11 = reader.g();
            if (g11 == -1) {
                reader.e(d11);
                return this.f38925d.b(b11);
            }
            b<M, B> bVar = this.f38923b.get(Integer.valueOf(g11));
            if (bVar != null) {
                try {
                    if (bVar.l()) {
                        i11 = bVar.b();
                    } else {
                        i11 = bVar.i();
                    }
                    Object decode = i11.decode(reader);
                    s.e(decode);
                    bVar.o(b11, decode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                    this.f38925d.g(b11, g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                }
            } else {
                com.squareup.wire.b h11 = reader.h();
                s.e(h11);
                this.f38925d.g(b11, g11, h11, h11.rawProtoAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(com.squareup.wire.l writer, M value) {
        s.g(writer, "writer");
        s.g(value, "value");
        for (b<M, B> bVar : this.f38923b.values()) {
            Object a11 = bVar.a(value);
            if (a11 != null) {
                bVar.b().encodeWithTag(writer, bVar.j(), a11);
            }
        }
        writer.a(this.f38925d.c(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M value) {
        s.g(value, "value");
        int a11 = this.f38925d.a(value);
        if (a11 != 0) {
            return a11;
        }
        int i11 = 0;
        for (b<M, B> bVar : this.f38923b.values()) {
            Object a12 = bVar.a(value);
            if (a12 != null) {
                i11 += bVar.b().encodedSizeWithTag(bVar.j(), a12);
            }
        }
        int z11 = i11 + this.f38925d.c(value).z();
        this.f38925d.d(value, z11);
        return z11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && s.c(((k) obj).f38922a, this.f38922a);
    }

    public int hashCode() {
        return this.f38922a.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M value) {
        s.g(value, "value");
        B newBuilder = this.f38925d.newBuilder();
        for (b<M, B> bVar : this.f38923b.values()) {
            if (bVar.h() && bVar.f() == q.a.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + bVar.g() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean m11 = bVar.m();
            if (!bVar.h() && (!m11 || bVar.f().isRepeated())) {
                if (m11 && bVar.f().isRepeated()) {
                    Object d11 = bVar.d(newBuilder);
                    Objects.requireNonNull(d11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    ProtoAdapter<?> i11 = bVar.i();
                    Objects.requireNonNull(i11, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                    bVar.n(newBuilder, d.a((List) d11, i11));
                }
            } else {
                Object d12 = bVar.d(newBuilder);
                if (d12 != null) {
                    bVar.n(newBuilder, bVar.b().redact(d12));
                }
            }
        }
        this.f38925d.f(newBuilder);
        return this.f38925d.b(newBuilder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M value) {
        s.g(value, "value");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38922a.o());
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (b<M, B> bVar : this.f38923b.values()) {
            Object a11 = bVar.a(value);
            if (a11 != null) {
                if (!z11) {
                    sb2.append(", ");
                }
                z11 = false;
                sb2.append(bVar.g());
                sb2.append('=');
                if (bVar.h()) {
                    a11 = "██";
                }
                sb2.append(a11);
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}