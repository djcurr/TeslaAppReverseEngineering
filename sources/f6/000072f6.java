package hc;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29022e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29022e = hashMap;
        b.V(hashMap);
        hashMap.put(513, "Thumbnail Offset");
        hashMap.put(Integer.valueOf((int) SyslogConstants.SYSLOG_PORT), "Thumbnail Length");
    }

    public m() {
        E(new l(this));
    }

    @Override // cc.b
    public String n() {
        return "Exif Thumbnail";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29022e;
    }
}