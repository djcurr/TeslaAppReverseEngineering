package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {
    static final int STATUS_COUNT_LIMIT = 8;
    private Context context;

    /* renamed from: os  reason: collision with root package name */
    protected OutputStream f9136os;
    private RecoveryCoordinator recoveryCoordinator;
    private int noContextWarning = 0;
    private int statusCount = 0;
    protected boolean presumedClean = true;

    private boolean isPresumedInError() {
        return (this.recoveryCoordinator == null || this.presumedClean) ? false : true;
    }

    private void postSuccessfulWrite() {
        if (this.recoveryCoordinator != null) {
            this.recoveryCoordinator = null;
            this.statusCount = 0;
            addStatus(new InfoStatus("Recovered from IO failure on " + getDescription(), this));
        }
    }

    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i11 = this.noContextWarning;
        this.noContextWarning = i11 + 1;
        if (i11 == 0) {
            PrintStream printStream = System.out;
            printStream.println("LOGBACK: No context given for " + this);
        }
    }

    void addStatusIfCountNotOverLimit(Status status) {
        int i11 = this.statusCount + 1;
        this.statusCount = i11;
        if (i11 < 8) {
            addStatus(status);
        }
        if (this.statusCount == 8) {
            addStatus(status);
            addStatus(new InfoStatus("Will supress future messages regarding " + getDescription(), this));
        }
    }

    void attemptRecovery() {
        try {
            close();
        } catch (IOException unused) {
        }
        addStatusIfCountNotOverLimit(new InfoStatus("Attempting to recover from IO failure on " + getDescription(), this));
        try {
            this.f9136os = openNewOutputStream();
            this.presumedClean = true;
        } catch (IOException e11) {
            addStatusIfCountNotOverLimit(new ErrorStatus("Failed to open " + getDescription(), this, e11));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream = this.f9136os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.f9136os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                postSuccessfulWrite();
            } catch (IOException e11) {
                postIOFailure(e11);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    abstract String getDescription();

    abstract OutputStream openNewOutputStream();

    public void postIOFailure(IOException iOException) {
        addStatusIfCountNotOverLimit(new ErrorStatus("IO failure while writing to " + getDescription(), this, iOException));
        this.presumedClean = false;
        if (this.recoveryCoordinator == null) {
            this.recoveryCoordinator = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
            return;
        }
        try {
            this.f9136os.write(i11);
            postSuccessfulWrite();
        } catch (IOException e11) {
            postIOFailure(e11);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
            return;
        }
        try {
            this.f9136os.write(bArr, i11, i12);
            postSuccessfulWrite();
        } catch (IOException e11) {
            postIOFailure(e11);
        }
    }
}