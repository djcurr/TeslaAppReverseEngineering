package x;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import w.h;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f56503a;

    public c(String str) {
        this.f56503a = str;
    }

    public List<Size> a(int i11) {
        h hVar = (h) w.f.a(h.class);
        if (hVar == null) {
            return new ArrayList();
        }
        return hVar.a(this.f56503a, i11);
    }
}