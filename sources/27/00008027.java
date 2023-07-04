package kotlinx.coroutines.internal;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
public final class z {

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<E, vz.b0> f35528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f35529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ zz.g f35530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super E, vz.b0> lVar, E e11, zz.g gVar) {
            super(1);
            this.f35528a = lVar;
            this.f35529b = e11;
            this.f35530c = gVar;
        }

        public final void a(Throwable th2) {
            z.b(this.f35528a, this.f35529b, this.f35530c);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    public static final <E> h00.l<Throwable, vz.b0> a(h00.l<? super E, vz.b0> lVar, E e11, zz.g gVar) {
        return new a(lVar, e11, gVar);
    }

    public static final <E> void b(h00.l<? super E, vz.b0> lVar, E e11, zz.g gVar) {
        UndeliveredElementException c11 = c(lVar, e11, null);
        if (c11 == null) {
            return;
        }
        v20.l0.a(gVar, c11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(h00.l<? super E, vz.b0> lVar, E e11, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e11);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                vz.f.a(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException(kotlin.jvm.internal.s.p("Exception in undelivered element handler for ", e11), th2);
            }
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(h00.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}