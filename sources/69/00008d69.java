package o1;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a */
    private final f f42056a;

    /* renamed from: b */
    private final f f42057b;

    /* loaded from: classes.dex */
    static final class a extends u implements p<String, f.c, String> {

        /* renamed from: a */
        public static final a f42058a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final String invoke(String acc, f.c element) {
            s.g(acc, "acc");
            s.g(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(f outer, f inner) {
        s.g(outer, "outer");
        s.g(inner, "inner");
        this.f42056a = outer;
        this.f42057b = inner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1.f
    public <R> R C(R r11, p<? super R, ? super f.c, ? extends R> operation) {
        s.g(operation, "operation");
        return (R) this.f42057b.C(this.f42056a.C(r11, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1.f
    public <R> R a0(R r11, p<? super f.c, ? super R, ? extends R> operation) {
        s.g(operation, "operation");
        return (R) this.f42056a.a0(this.f42057b.a0(r11, operation), operation);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (s.c(this.f42056a, cVar.f42056a) && s.c(this.f42057b, cVar.f42057b)) {
                return true;
            }
        }
        return false;
    }

    @Override // o1.f
    public f g0(f fVar) {
        return f.b.a(this, fVar);
    }

    public int hashCode() {
        return this.f42056a.hashCode() + (this.f42057b.hashCode() * 31);
    }

    @Override // o1.f
    public boolean p(l<? super f.c, Boolean> predicate) {
        s.g(predicate, "predicate");
        return this.f42056a.p(predicate) && this.f42057b.p(predicate);
    }

    public String toString() {
        return '[' + ((String) C("", a.f42058a)) + ']';
    }
}