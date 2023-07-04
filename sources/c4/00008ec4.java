package okhttp3.internal.cache2;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okio.e0;
import okio.f;
import okio.f0;
import okio.i;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u00101\u001a\u0004\u0018\u00010\f\u0012\u0006\u00107\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0019\u0010>\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u0013\u0010@\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010\u001e¨\u0006E"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lokio/i;", "prefix", "", "upstreamSize", "metadataSize", "Lvz/b0;", "writeHeader", "writeMetadata", "commit", "metadata", "Lokio/e0;", "newSource", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lokio/f;", "upstreamBuffer", "Lokio/f;", "getUpstreamBuffer", "()Lokio/f;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "Ljava/io/RandomAccessFile;", Action.FILE_ATTRIBUTE, "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lokio/e0;", "getUpstream", "()Lokio/e0;", "setUpstream", "(Lokio/e0;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lokio/i;", "bufferMaxSize", "getBufferMaxSize", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lokio/e0;JLokio/i;J)V", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final i PREFIX_CLEAN;
    public static final i PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final f buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final i metadata;
    private int sourceCount;
    private e0 upstream;
    private final f upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lokio/e0;", "upstream", "Lokio/i;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/i;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Relay edit(File file, e0 upstream, i metadata, long j11) {
            s.g(file, "file");
            s.g(upstream, "upstream");
            s.g(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j11, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) {
            s.g(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            s.f(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            f fVar = new f();
            fileOperator.read(0L, fVar, 32L);
            i iVar = Relay.PREFIX_CLEAN;
            if (!(!s.c(fVar.z0(iVar.z()), iVar))) {
                long readLong = fVar.readLong();
                long readLong2 = fVar.readLong();
                f fVar2 = new f();
                fileOperator.read(readLong + 32, fVar2, readLong2);
                return new Relay(randomAccessFile, null, readLong, fVar2.j1(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/e0;", "Lokio/f;", "sink", "", "byteCount", "read", "Lokio/f0;", "timeout", "Lvz/b0;", "close", "Lokio/f0;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public final class RelaySource implements e0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final f0 timeout = new f0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            s.e(file);
            FileChannel channel = file.getChannel();
            s.f(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (Relay.this.getSourceCount() == 0) {
                    RandomAccessFile file = Relay.this.getFile();
                    Relay.this.setFile(null);
                    randomAccessFile = file;
                }
                b0 b0Var = b0.f54756a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            if (r4 != true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
            r8 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.s.e(r2);
            r2.read(r19.sourcePos + 32, r20, r8);
            r19.sourcePos += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
            r0 = r19.this$0.getUpstream();
            kotlin.jvm.internal.s.e(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
            if (r14 != (-1)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
            if (r0 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
            r0.notifyAll();
            r0 = vz.b0.f54756a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
            r9 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().m(r20, 0, r9);
            r19.sourcePos += r9;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.s.e(r13);
            r13.write(r19.this$0.getUpstreamPos() + 32, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
            r19.this$0.getBuffer().write(r19.this$0.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
            if (r19.this$0.getBuffer().P0() <= r19.this$0.getBufferMaxSize()) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
            r19.this$0.getBuffer().skip(r19.this$0.getBuffer().P0() - r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
            r0 = r19.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r14);
            r0 = vz.b0.f54756a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            if (r0 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
            monitor-enter(r19.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
            r19.this$0.setUpstreamReader(null);
            r3 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
            if (r3 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
            r3.notifyAll();
            r3 = vz.b0.f54756a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
            throw r0;
         */
        @Override // okio.e0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(okio.f r20, long r21) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.f, long):long");
        }

        @Override // okio.e0
        public f0 timeout() {
            return this.timeout;
        }
    }

    static {
        i.a aVar = i.f42657e;
        PREFIX_CLEAN = aVar.e("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.e("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, e0 e0Var, long j11, i iVar, long j12) {
        this.file = randomAccessFile;
        this.upstream = e0Var;
        this.upstreamPos = j11;
        this.metadata = iVar;
        this.bufferMaxSize = j12;
        this.upstreamBuffer = new f();
        this.complete = this.upstream == null;
        this.buffer = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(i iVar, long j11, long j12) {
        f fVar = new f();
        fVar.w1(iVar);
        fVar.D1(j11);
        fVar.D1(j12);
        if (fVar.P0() == 32) {
            RandomAccessFile randomAccessFile = this.file;
            s.e(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            s.f(channel, "file!!.channel");
            new FileOperator(channel).write(0L, fVar, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j11) {
        f fVar = new f();
        fVar.w1(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        s.e(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        s.f(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j11, fVar, this.metadata.z());
    }

    public final void commit(long j11) {
        writeMetadata(j11);
        RandomAccessFile randomAccessFile = this.file;
        s.e(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j11, this.metadata.z());
        RandomAccessFile randomAccessFile2 = this.file;
        s.e(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            b0 b0Var = b0.f54756a;
        }
        e0 e0Var = this.upstream;
        if (e0Var != null) {
            Util.closeQuietly(e0Var);
        }
        this.upstream = null;
    }

    public final f getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final e0 getUpstream() {
        return this.upstream;
    }

    public final f getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final i metadata() {
        return this.metadata;
    }

    public final e0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z11) {
        this.complete = z11;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i11) {
        this.sourceCount = i11;
    }

    public final void setUpstream(e0 e0Var) {
        this.upstream = e0Var;
    }

    public final void setUpstreamPos(long j11) {
        this.upstreamPos = j11;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, e0 e0Var, long j11, i iVar, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, e0Var, j11, iVar, j12);
    }
}