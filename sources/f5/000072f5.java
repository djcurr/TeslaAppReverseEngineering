package hc;

import ch.qos.logback.core.net.SyslogConstants;

/* loaded from: classes.dex */
public class l extends a<m> {
    public l(m mVar) {
        super(mVar);
    }

    public String Q0() {
        String r11 = ((m) this.f9060a).r(SyslogConstants.SYSLOG_PORT);
        if (r11 == null) {
            return null;
        }
        return r11 + " bytes";
    }

    public String R0() {
        String r11 = ((m) this.f9060a).r(513);
        if (r11 == null) {
            return null;
        }
        return r11 + " bytes";
    }

    @Override // hc.a, cc.h
    public String f(int i11) {
        if (i11 != 513) {
            if (i11 != 514) {
                return super.f(i11);
            }
            return Q0();
        }
        return R0();
    }
}