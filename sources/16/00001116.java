package ch.qos.logback.core.net;

import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class AutoFlushingObjectWriter implements ObjectWriter {
    private final ObjectOutputStream objectOutputStream;
    private final int resetFrequency;
    private int writeCounter = 0;

    public AutoFlushingObjectWriter(ObjectOutputStream objectOutputStream, int i11) {
        this.objectOutputStream = objectOutputStream;
        this.resetFrequency = i11;
    }

    private void preventMemoryLeak() {
        int i11 = this.writeCounter + 1;
        this.writeCounter = i11;
        if (i11 >= this.resetFrequency) {
            this.objectOutputStream.reset();
            this.writeCounter = 0;
        }
    }

    @Override // ch.qos.logback.core.net.ObjectWriter
    public void write(Object obj) {
        this.objectOutputStream.writeObject(obj);
        this.objectOutputStream.flush();
        preventMemoryLeak();
    }
}