package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    int port;
    String syslogHost;

    public ResilientSyslogOutputStream(String str, int i11) {
        this.syslogHost = str;
        this.port = i11;
        this.f9136os = new SyslogOutputStream(str, i11);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    String getDescription() {
        return "syslog [" + this.syslogHost + ":" + this.port + "]";
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    OutputStream openNewOutputStream() {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}