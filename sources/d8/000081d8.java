package l1;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final i<Object, Object> f36376a = a(a.f36377a, b.f36378a);

    /* loaded from: classes.dex */
    static final class a extends u implements p<k, Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36377a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(k Saver, Object obj) {
            s.g(Saver, "$this$Saver");
            return obj;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36378a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        public final Object invoke(Object it2) {
            s.g(it2, "it");
            return it2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* loaded from: classes.dex */
    public static final class c<Original, Saveable> implements i<Original, Saveable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<k, Original, Saveable> f36379a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<Saveable, Original> f36380b;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super k, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f36379a = pVar;
            this.f36380b = lVar;
        }

        @Override // l1.i
        public Saveable a(k kVar, Original original) {
            s.g(kVar, "<this>");
            return this.f36379a.invoke(kVar, original);
        }

        @Override // l1.i
        public Original b(Saveable value) {
            s.g(value, "value");
            return this.f36380b.invoke(value);
        }
    }

    public static final <Original, Saveable> i<Original, Saveable> a(p<? super k, ? super Original, ? extends Saveable> save, l<? super Saveable, ? extends Original> restore) {
        s.g(save, "save");
        s.g(restore, "restore");
        return new c(save, restore);
    }

    public static final <T> i<T, Object> b() {
        return (i<T, Object>) f36376a;
    }
}