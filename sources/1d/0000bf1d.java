package x7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<s> f57215a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(s sVar) {
        this.f57215a.add(sVar);
    }

    public void b(Path path) {
        for (int size = this.f57215a.size() - 1; size >= 0; size--) {
            h8.h.b(path, this.f57215a.get(size));
        }
    }
}