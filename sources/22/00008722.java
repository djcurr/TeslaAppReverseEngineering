package mr;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import java.util.Objects;
import kotlin.jvm.internal.u;
import vz.m;

/* loaded from: classes2.dex */
public abstract class b<M, B> {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f38913a;

    /* loaded from: classes2.dex */
    static final class a extends u implements h00.a<ProtoAdapter<Object>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final ProtoAdapter<Object> invoke() {
            if (b.this.l()) {
                ProtoAdapter.a aVar = ProtoAdapter.Companion;
                ProtoAdapter<?> e11 = b.this.e();
                Objects.requireNonNull(e11, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                ProtoAdapter<?> i11 = b.this.i();
                Objects.requireNonNull(i11, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                ProtoAdapter<Object> e12 = aVar.e(e11, i11);
                Objects.requireNonNull(e12, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return e12;
            }
            ProtoAdapter<?> withLabel$wire_runtime = b.this.i().withLabel$wire_runtime(b.this.f());
            Objects.requireNonNull(withLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return withLabel$wire_runtime;
        }
    }

    public b() {
        vz.k a11;
        a11 = m.a(new a());
        this.f38913a = a11;
    }

    public abstract Object a(M m11);

    public final ProtoAdapter<Object> b() {
        return (ProtoAdapter) this.f38913a.getValue();
    }

    public abstract String c();

    public abstract Object d(B b11);

    public abstract ProtoAdapter<?> e();

    public abstract q.a f();

    public abstract String g();

    public abstract boolean h();

    public abstract ProtoAdapter<?> i();

    public abstract int j();

    public abstract String k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n(B b11, Object obj);

    public abstract void o(B b11, Object obj);
}