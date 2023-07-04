package ch.qos.logback.core.joran.spi;

import java.io.OutputStream;

@Deprecated
/* loaded from: classes.dex */
public enum ConsoleTarget {
    SystemOut("System.out", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.1
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            System.out.write(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            System.out.write(bArr, i11, i12);
        }
    }),
    SystemErr("System.err", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.2
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            System.err.write(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            System.err.write(bArr, i11, i12);
        }
    });
    
    private final String name;
    private final OutputStream stream;

    ConsoleTarget(String str, OutputStream outputStream) {
        this.name = str;
        this.stream = outputStream;
    }

    public static ConsoleTarget findByName(String str) {
        ConsoleTarget[] values;
        for (ConsoleTarget consoleTarget : values()) {
            if (consoleTarget.name.equalsIgnoreCase(str)) {
                return consoleTarget;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public OutputStream getStream() {
        return this.stream;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}