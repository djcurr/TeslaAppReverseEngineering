package fh;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public class i implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f26244a;

    public i(File file) {
        if (file != null && file.exists()) {
            this.f26244a = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    private long a(d dVar, long j11, long j12) {
        for (long j13 = 0; j13 < j11; j13++) {
            e b11 = dVar.b(j13);
            if (b11.f26237a == 1) {
                long j14 = b11.f26239c;
                if (j14 <= j12 && j12 <= b11.f26240d + j14) {
                    return (j12 - j14) + b11.f26238b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long C(ByteBuffer byteBuffer, long j11) {
        l(byteBuffer, j11, 8);
        return byteBuffer.getLong();
    }

    protected String D(ByteBuffer byteBuffer, long j11) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short m11 = m(byteBuffer, j11);
            if (m11 != 0) {
                sb2.append((char) m11);
                j11 = j12;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long J(ByteBuffer byteBuffer, long j11) {
        l(byteBuffer, j11, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26244a.close();
    }

    public d g() {
        this.f26244a.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (J(allocate, 0L) == 1179403647) {
            short m11 = m(allocate, 4L);
            boolean z11 = m(allocate, 5L) == 2;
            if (m11 == 1) {
                return new g(z11, this);
            }
            if (m11 == 2) {
                return new h(z11, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> j() {
        long j11;
        this.f26244a.position(0L);
        ArrayList arrayList = new ArrayList();
        d g11 = g();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(g11.f26231a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = g11.f26235e;
        int i11 = 0;
        if (j12 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j12 = g11.c(0).f26241a;
        }
        long j13 = 0;
        while (true) {
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            e b11 = g11.b(j13);
            if (b11.f26237a == 2) {
                j11 = b11.f26238b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c a11 = g11.a(j11, i11);
            long j15 = a11.f26229a;
            if (j15 == 1) {
                arrayList2.add(Long.valueOf(a11.f26230b));
            } else if (j15 == 5) {
                j14 = a11.f26230b;
            }
            i11++;
            if (a11.f26229a == 0) {
                break;
            }
        }
        if (j14 != 0) {
            long a12 = a(g11, j12, j14);
            for (Long l11 : arrayList2) {
                arrayList.add(D(allocate, l11.longValue() + a12));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    protected void l(ByteBuffer byteBuffer, long j11, int i11) {
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        long j12 = 0;
        while (j12 < i11) {
            int read = this.f26244a.read(byteBuffer, j11 + j12);
            if (read == -1) {
                throw new EOFException();
            }
            j12 += read;
        }
        byteBuffer.position(0);
    }

    protected short m(ByteBuffer byteBuffer, long j11) {
        l(byteBuffer, j11, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int p(ByteBuffer byteBuffer, long j11) {
        l(byteBuffer, j11, 2);
        return byteBuffer.getShort() & 65535;
    }
}