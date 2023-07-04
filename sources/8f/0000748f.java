package i30;

import h00.l;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: i30.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0578a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final c30.b<?> f29824a;

        @Override // i30.a
        public c30.b<?> a(List<? extends c30.b<?>> typeArgumentsSerializers) {
            s.g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f29824a;
        }

        public final c30.b<?> b() {
            return this.f29824a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0578a) && s.c(((C0578a) obj).f29824a, this.f29824a);
        }

        public int hashCode() {
            return this.f29824a.hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final l<List<? extends c30.b<?>>, c30.b<?>> f29825a;

        @Override // i30.a
        public c30.b<?> a(List<? extends c30.b<?>> typeArgumentsSerializers) {
            s.g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f29825a.invoke(typeArgumentsSerializers);
        }

        public final l<List<? extends c30.b<?>>, c30.b<?>> b() {
            return this.f29825a;
        }
    }

    private a() {
    }

    public abstract c30.b<?> a(List<? extends c30.b<?>> list);
}