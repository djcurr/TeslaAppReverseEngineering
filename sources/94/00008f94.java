package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Socket f42644a;

    public d0(Socket socket) {
        kotlin.jvm.internal.s.g(socket, "socket");
        this.f42644a = socket;
    }

    @Override // okio.d
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.d
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f42644a.close();
        } catch (AssertionError e11) {
            if (r.e(e11)) {
                logger2 = s.f42681a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f42644a, (Throwable) e11);
                return;
            }
            throw e11;
        } catch (Exception e12) {
            logger = s.f42681a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f42644a, (Throwable) e12);
        }
    }
}