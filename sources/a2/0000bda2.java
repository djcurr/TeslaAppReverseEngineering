package wz;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public abstract class b<T> implements Iterator<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private a1 f56465a = a1.NotReady;

    /* renamed from: b  reason: collision with root package name */
    private T f56466b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56467a;

        static {
            int[] iArr = new int[a1.values().length];
            iArr[a1.Done.ordinal()] = 1;
            iArr[a1.Ready.ordinal()] = 2;
            f56467a = iArr;
        }
    }

    private final boolean e() {
        this.f56465a = a1.Failed;
        a();
        return this.f56465a == a1.Ready;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f56465a = a1.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(T t11) {
        this.f56466b = t11;
        this.f56465a = a1.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a1 a1Var = this.f56465a;
        if (a1Var != a1.Failed) {
            int i11 = a.f56467a[a1Var.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return e();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f56465a = a1.NotReady;
            return this.f56466b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}