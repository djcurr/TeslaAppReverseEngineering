package y70;

/* loaded from: classes5.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private i f59372a;

    /* renamed from: b  reason: collision with root package name */
    private i f59373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(i iVar) {
        try {
            if (iVar != null) {
                i iVar2 = this.f59373b;
                if (iVar2 != null) {
                    iVar2.f59371c = iVar;
                    this.f59373b = iVar;
                } else if (this.f59372a == null) {
                    this.f59373b = iVar;
                    this.f59372a = iVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized i b() {
        i iVar;
        iVar = this.f59372a;
        if (iVar != null) {
            i iVar2 = iVar.f59371c;
            this.f59372a = iVar2;
            if (iVar2 == null) {
                this.f59373b = null;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized i c(int i11) {
        if (this.f59372a == null) {
            wait(i11);
        }
        return b();
    }
}