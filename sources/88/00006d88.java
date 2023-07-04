package f50;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private i f25876a;

    protected abstract i a();

    public synchronized i b() {
        if (this.f25876a == null) {
            this.f25876a = a();
        }
        return this.f25876a;
    }
}