package m6;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private List f38427a = new ArrayList(5);

    public void a(d dVar) {
        this.f38427a.add(dVar);
    }

    public d b(int i11) {
        return (d) this.f38427a.get(i11);
    }

    public int c() {
        return this.f38427a.size();
    }

    public String toString() {
        int b11;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 1; i11 < c(); i11++) {
            stringBuffer.append(b(i11));
            if (i11 < c() - 1 && ((b11 = b(i11 + 1).b()) == 1 || b11 == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}