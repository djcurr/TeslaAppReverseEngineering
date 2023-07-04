package net.time4j.calendar;

import java.util.Objects;
import net.time4j.engine.b0;
import net.time4j.engine.g;
import net.time4j.engine.q;
import net.time4j.engine.u;
import net.time4j.engine.y;
import net.time4j.engine.z;
import net.time4j.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q<T extends net.time4j.engine.q<T> & net.time4j.engine.g> extends net.time4j.calendar.service.f<T> {
    private static final long serialVersionUID = 4275169663905222176L;

    /* renamed from: g  reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f40922g;

    /* renamed from: h  reason: collision with root package name */
    private final transient net.time4j.engine.p<x0> f40923h;

    /* loaded from: classes5.dex */
    private static class a<T extends net.time4j.engine.q<T> & net.time4j.engine.g> implements b0<T> {

        /* renamed from: a  reason: collision with root package name */
        private final q<T> f40924a;

        a(q<T> qVar) {
            this.f40924a = qVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        private int f(net.time4j.engine.q qVar) {
            int h11 = qVar.h(((q) this.f40924a).f40922g);
            while (true) {
                int i11 = h11 + 7;
                if (i11 > ((Integer) qVar.e(((q) this.f40924a).f40922g)).intValue()) {
                    return net.time4j.base.c.a(h11 - 1, 7) + 1;
                }
                h11 = i11;
            }
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/p<*>; */
        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p getChildAtCeiling(net.time4j.engine.q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/p<*>; */
        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p getChildAtFloor(net.time4j.engine.q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        @Override // net.time4j.engine.b0
        /* renamed from: e */
        public int b(net.time4j.engine.q qVar) {
            return net.time4j.base.c.a(qVar.h(((q) this.f40924a).f40922g) - 1, 7) + 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMaximum(net.time4j.engine.q qVar) {
            return Integer.valueOf(f(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getMinimum(net.time4j.engine.q qVar) {
            return 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* renamed from: i */
        public Integer getValue(net.time4j.engine.q qVar) {
            return Integer.valueOf(b(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
        public boolean j(net.time4j.engine.q qVar, int i11) {
            return i11 >= 1 && i11 <= f(qVar);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)Z */
        @Override // net.time4j.engine.y
        /* renamed from: k */
        public boolean isValid(net.time4j.engine.q qVar, Integer num) {
            return num != null && j(qVar, num.intValue());
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;IZ)TT; */
        @Override // net.time4j.engine.b0
        /* renamed from: l */
        public net.time4j.engine.q a(net.time4j.engine.q qVar, int i11, boolean z11) {
            if (j(qVar, i11)) {
                return qVar.A(this.f40924a.u(i11, (x0) qVar.l(((q) this.f40924a).f40923h)));
            }
            throw new IllegalArgumentException("Invalid value: " + i11);
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Ljava/lang/Integer;Z)TT; */
        @Override // net.time4j.engine.y
        /* renamed from: m */
        public net.time4j.engine.q withValue(net.time4j.engine.q qVar, Integer num, boolean z11) {
            if (num != null) {
                return a(qVar, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b<T extends net.time4j.engine.q<T> & net.time4j.engine.g> implements u<T> {

        /* renamed from: a  reason: collision with root package name */
        private final q<T> f40925a;

        /* renamed from: b  reason: collision with root package name */
        private final long f40926b;

        /* renamed from: c  reason: collision with root package name */
        private final x0 f40927c;

        b(q<T> qVar, int i11, x0 x0Var) {
            Objects.requireNonNull(x0Var, "Missing value.");
            this.f40925a = qVar;
            this.f40926b = i11;
            this.f40927c = x0Var;
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        @Override // net.time4j.engine.u
        /* renamed from: a */
        public net.time4j.engine.q apply(net.time4j.engine.q qVar) {
            int value;
            long a11;
            x0 x0Var = (x0) qVar.l(((q) this.f40925a).f40923h);
            int h11 = qVar.h(((q) this.f40925a).f40922g);
            if (this.f40926b == 2147483647L) {
                int intValue = ((Integer) qVar.e(((q) this.f40925a).f40922g)).intValue() - h11;
                int value2 = x0Var.getValue() + (intValue % 7);
                if (value2 > 7) {
                    value2 -= 7;
                }
                int value3 = this.f40927c.getValue() - value2;
                a11 = intValue + value3;
                if (value3 > 0) {
                    a11 -= 7;
                }
            } else {
                a11 = ((this.f40926b - (net.time4j.base.c.a((h11 + value) - 1, 7) + 1)) * 7) + (this.f40927c.getValue() - x0Var.getValue());
            }
            return qVar.y(z.UTC, ((net.time4j.engine.g) qVar).b() + a11);
        }
    }

    /* loaded from: classes5.dex */
    private static class c<T extends net.time4j.engine.q<T>> implements u<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f40928a;

        c(boolean z11) {
            this.f40928a = z11;
        }

        @Override // net.time4j.engine.u
        /* renamed from: a */
        public T apply(T t11) {
            z zVar = z.UTC;
            long longValue = ((Long) t11.l(zVar)).longValue();
            return (T) t11.y(zVar, this.f40928a ? longValue - 7 : longValue + 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Class<T> cls, net.time4j.engine.p<Integer> pVar, net.time4j.engine.p<x0> pVar2) {
        super("WEEKDAY_IN_MONTH", cls, 1, pVar.getDefaultMaximum().intValue() / 7, 'F', new c(true), new c(false));
        this.f40922g = pVar;
        this.f40923h = pVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends net.time4j.engine.q<T> & net.time4j.engine.g> y<T, Integer> t(q<T> qVar) {
        return new a(qVar);
    }

    public u<T> u(int i11, x0 x0Var) {
        return new b(this, i11, x0Var);
    }
}