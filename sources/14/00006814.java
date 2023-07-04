package ep;

import com.adyen.checkout.components.model.payments.request.Address;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final dp.b f25224a;

    /* renamed from: b  reason: collision with root package name */
    private final dp.b f25225b;

    /* renamed from: c  reason: collision with root package name */
    private final dp.c f25226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(dp.b bVar, dp.b bVar2, dp.c cVar, boolean z11) {
        this.f25224a = bVar;
        this.f25225b = bVar2;
        this.f25226c = cVar;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dp.c b() {
        return this.f25226c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dp.b c() {
        return this.f25224a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dp.b d() {
        return this.f25225b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return a(this.f25224a, bVar.f25224a) && a(this.f25225b, bVar.f25225b) && a(this.f25226c, bVar.f25226c);
        }
        return false;
    }

    public boolean f() {
        return this.f25225b == null;
    }

    public int hashCode() {
        return (e(this.f25224a) ^ e(this.f25225b)) ^ e(this.f25226c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f25224a);
        sb2.append(" , ");
        sb2.append(this.f25225b);
        sb2.append(" : ");
        dp.c cVar = this.f25226c;
        sb2.append(cVar == null ? Address.ADDRESS_NULL_PLACEHOLDER : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}