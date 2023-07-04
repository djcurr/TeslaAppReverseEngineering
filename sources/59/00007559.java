package ih;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final List<String> f30399a;

    /* renamed from: b  reason: collision with root package name */
    final a f30400b = new a();

    /* renamed from: c  reason: collision with root package name */
    int f30401c = 1;

    /* renamed from: d  reason: collision with root package name */
    boolean f30402d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(List<String> list) {
        this.f30399a = Collections.unmodifiableList(list);
    }

    public int a() {
        return this.f30401c;
    }

    public List<String> b() {
        return this.f30399a;
    }

    public String c() {
        return this.f30400b.e();
    }

    public void d() {
        this.f30402d = true;
    }

    public String toString() {
        return "Context [parentComponents=" + this.f30399a + ", unfoldedLine=" + this.f30400b.e() + ", lineNumber=" + this.f30401c + ", stop=" + this.f30402d + "]";
    }
}