package androidx.lifecycle;

/* loaded from: classes.dex */
public class o0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public class a<X> implements g0<X> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f5194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p.a f5195b;

        a(d0 d0Var, p.a aVar) {
            this.f5194a = d0Var;
            this.f5195b = aVar;
        }

        @Override // androidx.lifecycle.g0
        public void onChanged(X x11) {
            this.f5194a.setValue(this.f5195b.apply(x11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public class b<X> implements g0<X> {

        /* renamed from: a  reason: collision with root package name */
        boolean f5196a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0 f5197b;

        b(d0 d0Var) {
            this.f5197b = d0Var;
        }

        @Override // androidx.lifecycle.g0
        public void onChanged(X x11) {
            T value = this.f5197b.getValue();
            if (this.f5196a || ((value == 0 && x11 != null) || !(value == 0 || value.equals(x11)))) {
                this.f5196a = false;
                this.f5197b.setValue(x11);
            }
        }
    }

    public static <X> LiveData<X> a(LiveData<X> liveData) {
        d0 d0Var = new d0();
        d0Var.b(liveData, new b(d0Var));
        return d0Var;
    }

    public static <X, Y> LiveData<Y> b(LiveData<X> liveData, p.a<X, Y> aVar) {
        d0 d0Var = new d0();
        d0Var.b(liveData, new a(d0Var, aVar));
        return d0Var;
    }
}