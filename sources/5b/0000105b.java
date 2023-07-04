package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* loaded from: classes.dex */
class RemoteAppenderStreamClient implements RemoteAppenderClient {

    /* renamed from: id  reason: collision with root package name */
    private final String f9129id;
    private final InputStream inputStream;

    /* renamed from: lc  reason: collision with root package name */
    private LoggerContext f9130lc;
    private Logger logger;
    private final Socket socket;

    public RemoteAppenderStreamClient(String str, InputStream inputStream) {
        this.f9129id = str;
        this.socket = null;
        this.inputStream = inputStream;
    }

    public RemoteAppenderStreamClient(String str, Socket socket) {
        this.f9129id = str;
        this.socket = socket;
        this.inputStream = null;
    }

    private HardenedObjectInputStream createObjectInputStream() {
        return this.inputStream != null ? new HardenedLoggingEventInputStream(this.inputStream) : new HardenedLoggingEventInputStream(this.socket.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb2;
        Logger logger2 = this.logger;
        logger2.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStream = null;
        try {
            try {
                try {
                    hardenedObjectInputStream = createObjectInputStream();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStream.readObject();
                        Logger logger3 = this.f9130lc.getLogger(iLoggingEvent.getLoggerName());
                        if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger3.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (IOException e11) {
                    Logger logger4 = this.logger;
                    logger4.info(this + ": " + e11);
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                } catch (RuntimeException e12) {
                    Logger logger5 = this.logger;
                    logger5.error(this + ": " + e12);
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                }
            } catch (EOFException unused) {
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.logger;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            } catch (ClassNotFoundException unused2) {
                Logger logger6 = this.logger;
                logger6.error(this + ": unknown event class");
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.logger;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            }
        } catch (Throwable th2) {
            if (hardenedObjectInputStream != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStream);
            }
            close();
            Logger logger7 = this.logger;
            logger7.info(this + ": connection closed");
            throw th2;
        }
    }

    @Override // ch.qos.logback.classic.net.server.RemoteAppenderClient
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f9130lc = loggerContext;
        this.logger = loggerContext.getLogger(getClass().getPackage().getName());
    }

    public String toString() {
        return "client " + this.f9129id;
    }
}