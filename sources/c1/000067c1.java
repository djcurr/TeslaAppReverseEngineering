package ed;

import com.adobe.xmp.XMPException;
import java.util.HashMap;
import l6.k;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f25061f;

    /* renamed from: e  reason: collision with root package name */
    private k6.c f25062e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f25061f = hashMap;
        hashMap.put(Integer.valueOf((int) Settings.DEFAULT_INITIAL_WINDOW_SIZE), "XMP Value Count");
    }

    public b() {
        E(new a(this));
    }

    public k6.c V() {
        if (this.f25062e == null) {
            this.f25062e = new k();
        }
        return this.f25062e;
    }

    public void W(k6.c cVar) {
        this.f25062e = cVar;
        int i11 = 0;
        try {
            k6.b it2 = cVar.iterator();
            while (it2.hasNext()) {
                if (((o6.b) it2.next()).getPath() != null) {
                    i11++;
                }
            }
            J(Settings.DEFAULT_INITIAL_WINDOW_SIZE, i11);
        } catch (XMPException unused) {
        }
    }

    @Override // cc.b
    public String n() {
        return "XMP";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f25061f;
    }
}