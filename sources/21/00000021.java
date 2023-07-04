package a00;

import h00.l;
import h00.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.r;
import zz.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class c {

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f98a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f99b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zz.d dVar, l lVar) {
            super(dVar);
            this.f99b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i11 = this.f98a;
            if (i11 == 0) {
                this.f98a = 1;
                r.b(obj);
                return ((l) r0.f(this.f99b, 1)).invoke(this);
            } else if (i11 == 1) {
                this.f98a = 2;
                r.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zz.d dVar, g gVar, l lVar) {
            super(dVar, gVar);
            this.f101b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i11 = this.f100a;
            if (i11 == 0) {
                this.f100a = 1;
                r.b(obj);
                return ((l) r0.f(this.f101b, 1)).invoke(this);
            } else if (i11 == 1) {
                this.f100a = 2;
                r.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a00.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0005c extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005c(zz.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f103b = pVar;
            this.f104c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i11 = this.f102a;
            if (i11 == 0) {
                this.f102a = 1;
                r.b(obj);
                return ((p) r0.f(this.f103b, 2)).invoke(this.f104c, this);
            } else if (i11 == 1) {
                this.f102a = 2;
                r.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zz.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f106b = pVar;
            this.f107c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i11 = this.f105a;
            if (i11 == 0) {
                this.f105a = 1;
                r.b(obj);
                return ((p) r0.f(this.f106b, 2)).invoke(this.f107c, this);
            } else if (i11 == 1) {
                this.f105a = 2;
                r.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <T> zz.d<b0> a(l<? super zz.d<? super T>, ? extends Object> lVar, zz.d<? super T> completion) {
        s.g(lVar, "<this>");
        s.g(completion, "completion");
        zz.d<?> a11 = h.a(completion);
        if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) lVar).create(a11);
        }
        g context = a11.getContext();
        if (context == zz.h.f61280a) {
            return new a(a11, lVar);
        }
        return new b(a11, context, lVar);
    }

    public static <R, T> zz.d<b0> b(p<? super R, ? super zz.d<? super T>, ? extends Object> pVar, R r11, zz.d<? super T> completion) {
        s.g(pVar, "<this>");
        s.g(completion, "completion");
        zz.d<?> a11 = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r11, a11);
        }
        g context = a11.getContext();
        if (context == zz.h.f61280a) {
            return new C0005c(a11, pVar, r11);
        }
        return new d(a11, context, pVar, r11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> zz.d<T> c(zz.d<? super T> dVar) {
        zz.d<T> dVar2;
        s.g(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (zz.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}