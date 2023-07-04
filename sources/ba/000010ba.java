package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class OutputStreamAppender<E> extends UnsynchronizedAppenderBase<E> {
    protected Encoder<E> encoder;
    private OutputStream outputStream;
    protected final ReentrantLock lock = new ReentrantLock(false);
    private boolean immediateFlush = true;

    private void writeBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        this.lock.lock();
        try {
            this.outputStream.write(bArr);
            if (this.immediateFlush) {
                this.outputStream.flush();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    protected void append(E e11) {
        if (isStarted()) {
            subAppend(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void closeOutputStream() {
        if (this.outputStream != null) {
            try {
                encoderClose();
                this.outputStream.close();
                this.outputStream = null;
            } catch (IOException e11) {
                addStatus(new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, e11));
            }
        }
    }

    void encoderClose() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.footerBytes());
        } catch (IOException e11) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to write footer for appender named [" + this.name + "].", this, e11));
        }
    }

    void encoderInit() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.headerBytes());
        } catch (IOException e11) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to initialize encoder for appender named [" + this.name + "].", this, e11));
        }
    }

    public Encoder<E> getEncoder() {
        return this.encoder;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean isImmediateFlush() {
        return this.immediateFlush;
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }

    public void setImmediateFlush(boolean z11) {
        this.immediateFlush = z11;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setLayout(layout);
        layoutWrappingEncoder.setContext(this.context);
        this.encoder = layoutWrappingEncoder;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.lock.lock();
        try {
            closeOutputStream();
            this.outputStream = outputStream;
            if (this.encoder == null) {
                addWarn("Encoder has not been set. Cannot invoke its init method.");
            } else {
                encoderInit();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i11;
        if (this.encoder == null) {
            addStatus(new ErrorStatus("No encoder set for the appender named \"" + this.name + "\".", this));
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.outputStream == null) {
            addStatus(new ErrorStatus("No output stream set for the appender named \"" + this.name + "\".", this));
            i11++;
        }
        if (i11 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.lock.lock();
        try {
            closeOutputStream();
            super.stop();
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void subAppend(E e11) {
        if (isStarted()) {
            try {
                if (e11 instanceof DeferredProcessingAware) {
                    ((DeferredProcessingAware) e11).prepareForDeferredProcessing();
                }
                writeBytes(this.encoder.encode(e11));
            } catch (IOException e12) {
                this.started = false;
                addStatus(new ErrorStatus("IO failure in appender", this, e12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeOut(E e11) {
        writeBytes(this.encoder.encode(e11));
    }
}