package okhttp3.internal.cache;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e00.b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import kotlin.text.v;
import kotlin.text.w;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.c0;
import okio.e0;
import okio.g;
import okio.h;
import okio.l;
import okio.r;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b*\u0001T\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010\\\u001a\u000206\u0012\u0006\u0010_\u001a\u00020B\u0012\u0006\u0010`\u001a\u00020B\u0012\u0006\u00100\u001a\u00020\u0017\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u001a\u001a\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u0017J#\u0010 \u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010&\u001a\u00020\u000b2\n\u0010#\u001a\u00060\"R\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020\u0003H\u0016J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000-R*\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R,\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\"R\u00020\u00000=8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\"\u0010I\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00101R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\u00020W8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\\\u001a\u0002068\u0006@\u0006¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010DR\u001c\u0010`\u001a\u00020B8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\ba\u0010b¨\u0006k"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lvz/b0;", "readJournal", "Lokio/g;", "newJournalWriter", "", "line", "readJournalLine", "processJournal", "", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", Action.KEY_ATTRIBUTE, "validateKey", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "value", "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "Ljava/io/File;", "journalFile", "Ljava/io/File;", "journalFileTmp", "journalFileBackup", "journalWriter", "Lokio/g;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "", "redundantOpCount", "I", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "directory", "getDirectory", "()Ljava/io/File;", "appVersion", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private g journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final i LEGAL_KEY_PATTERN = new i("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/i;", "LEGAL_KEY_PATTERN", "Lkotlin/text/i;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0016R\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u00060\u0016R\u00020\u00178\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lvz/b0;", "detach$okhttp", "()V", "detach", "", "index", "Lokio/e0;", "newSource", "Lokio/c0;", "newSink", "commit", "abort", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            s.g(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (s.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        this.this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    b0 b0Var = b0.f54756a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (s.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        this.this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    b0 b0Var = b0.f54756a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (s.c(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final c0 newSink(int i11) {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (!s.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        return r.b();
                    }
                    if (!this.entry.getReadable$okhttp()) {
                        boolean[] zArr = this.written;
                        s.e(zArr);
                        zArr[i11] = true;
                    }
                    try {
                        return new FaultHidingSink(this.this$0.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i11)), new DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(this, i11));
                    } catch (FileNotFoundException unused) {
                        return r.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final e0 newSource(int i11) {
            synchronized (this.this$0) {
                if (!this.done) {
                    e0 e0Var = null;
                    if (!this.entry.getReadable$okhttp() || (!s.c(this.entry.getCurrentEditor$okhttp(), this)) || this.entry.getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        e0Var = this.this$0.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i11));
                    } catch (FileNotFoundException unused) {
                    }
                    return e0Var;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00101\u001a\b\u0018\u000100R\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", "index", "Lokio/e0;", "newSource", "Lvz/b0;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/g;", "writer", "writeLengths$okhttp", "(Lokio/g;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", Action.KEY_ATTRIBUTE, "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String key) {
            s.g(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i11 = 0; i11 < valueCount$okhttp; i11++) {
                sb2.append(i11);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final e0 newSource(int i11) {
            final e0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i11));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new l(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.l, okio.e0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    synchronized (DiskLruCache.Entry.this.this$0) {
                        DiskLruCache.Entry entry = DiskLruCache.Entry.this;
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (DiskLruCache.Entry.this.getLockingSourceCount$okhttp() == 0 && DiskLruCache.Entry.this.getZombie$okhttp()) {
                            DiskLruCache.Entry entry2 = DiskLruCache.Entry.this;
                            entry2.this$0.removeEntry$okhttp(entry2);
                        }
                        b0 b0Var = b0.f54756a;
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) {
            s.g(strings, "strings");
            if (strings.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = strings.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        this.lengths[i11] = Long.parseLong(strings.get(i11));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(strings);
                    throw new KotlinNothingValueException();
                }
            }
            invalidLengths(strings);
            throw new KotlinNothingValueException();
        }

        public final void setLockingSourceCount$okhttp(int i11) {
            this.lockingSourceCount = i11;
        }

        public final void setReadable$okhttp(boolean z11) {
            this.readable = z11;
        }

        public final void setSequenceNumber$okhttp(long j11) {
            this.sequenceNumber = j11;
        }

        public final void setZombie$okhttp(boolean z11) {
            this.zombie = z11;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                s.f(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(diskLruCache);
                throw new AssertionError(sb2.toString());
            } else if (this.readable) {
                if (this.this$0.civilizedFileSystem || (this.currentEditor == null && !this.zombie)) {
                    ArrayList<e0> arrayList = new ArrayList();
                    long[] jArr = (long[]) this.lengths.clone();
                    try {
                        int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                        for (int i11 = 0; i11 < valueCount$okhttp; i11++) {
                            arrayList.add(newSource(i11));
                        }
                        return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                    } catch (FileNotFoundException unused) {
                        for (e0 e0Var : arrayList) {
                            Util.closeQuietly(e0Var);
                        }
                        try {
                            this.this$0.removeEntry$okhttp(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }

        public final void writeLengths$okhttp(g writer) {
            s.g(writer, "writer");
            for (long j11 : this.lengths) {
                writer.O0(32).q0(j11);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", Action.KEY_ATTRIBUTE, "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", "index", "Lokio/e0;", "getSource", "", "getLength", "Lvz/b0;", "close", "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<e0> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String key, long j11, List<? extends e0> sources, long[] lengths) {
            s.g(key, "key");
            s.g(sources, "sources");
            s.g(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j11;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (e0 e0Var : this.sources) {
                Util.closeQuietly(e0Var);
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i11) {
            return this.lengths[i11];
        }

        public final e0 getSource(int i11) {
            return this.sources.get(i11);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, int i11, int i12, long j11, TaskRunner taskRunner) {
        s.g(fileSystem, "fileSystem");
        s.g(directory, "directory");
        s.g(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i11;
        this.valueCount = i12;
        this.maxSize = j11;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new Task(Util.okHttpName + " Cache") { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                synchronized (DiskLruCache.this) {
                    if (!DiskLruCache.access$getInitialized$p(DiskLruCache.this) || DiskLruCache.this.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        DiskLruCache.this.trimToSize();
                    } catch (IOException unused) {
                        DiskLruCache.access$setMostRecentTrimFailed$p(DiskLruCache.this, true);
                    }
                    try {
                        if (DiskLruCache.access$journalRebuildRequired(DiskLruCache.this)) {
                            DiskLruCache.this.rebuildJournal$okhttp();
                            DiskLruCache.access$setRedundantOpCount$p(DiskLruCache.this, 0);
                        }
                    } catch (IOException unused2) {
                        DiskLruCache.access$setMostRecentRebuildFailed$p(DiskLruCache.this, true);
                        DiskLruCache.access$setJournalWriter$p(DiskLruCache.this, r.c(r.b()));
                    }
                    return -1L;
                }
            }
        };
        if (!(j11 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i12 > 0) {
            this.journalFile = new File(directory, JOURNAL_FILE);
            this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
            this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
        return diskLruCache.initialized;
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
        return diskLruCache.journalRebuildRequired();
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, g gVar) {
        diskLruCache.journalWriter = gVar;
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean z11) {
        diskLruCache.mostRecentRebuildFailed = z11;
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean z11) {
        diskLruCache.mostRecentTrimFailed = z11;
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int i11) {
        diskLruCache.redundantOpCount = i11;
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j11);
    }

    public final boolean journalRebuildRequired() {
        int i11 = this.redundantOpCount;
        return i11 >= 2000 && i11 >= this.lruEntries.size();
    }

    private final g newJournalWriter() {
        return r.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it2 = this.lruEntries.values().iterator();
        while (it2.hasNext()) {
            Entry next = it2.next();
            s.f(next, "i.next()");
            Entry entry = next;
            int i11 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i12 = this.valueCount;
                while (i11 < i12) {
                    this.size += entry.getLengths$okhttp()[i11];
                    i11++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i13 = this.valueCount;
                while (i11 < i13) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i11));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i11));
                    i11++;
                }
                it2.remove();
            }
        }
    }

    private final void readJournal() {
        h d11 = r.d(this.fileSystem.source(this.journalFile));
        try {
            String f02 = d11.f0();
            String f03 = d11.f0();
            String f04 = d11.f0();
            String f05 = d11.f0();
            String f06 = d11.f0();
            if (!(!s.c(MAGIC, f02)) && !(!s.c(VERSION_1, f03)) && !(!s.c(String.valueOf(this.appVersion), f04)) && !(!s.c(String.valueOf(this.valueCount), f05))) {
                int i11 = 0;
                if (!(f06.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(d11.f0());
                            i11++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i11 - this.lruEntries.size();
                            if (!d11.N0()) {
                                rebuildJournal$okhttp();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            b0 b0Var = b0.f54756a;
                            b.a(d11, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + f02 + ", " + f03 + ", " + f05 + ", " + f06 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String str) {
        int Y;
        int Y2;
        String substring;
        boolean H;
        boolean H2;
        boolean H3;
        List<String> D0;
        boolean H4;
        Y = w.Y(str, ' ', 0, false, 6, null);
        if (Y != -1) {
            int i11 = Y + 1;
            Y2 = w.Y(str, ' ', i11, false, 4, null);
            if (Y2 == -1) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i11);
                s.f(substring, "(this as java.lang.String).substring(startIndex)");
                String str2 = REMOVE;
                if (Y == str2.length()) {
                    H4 = v.H(str, str2, false, 2, null);
                    if (H4) {
                        this.lruEntries.remove(substring);
                        return;
                    }
                }
            } else {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i11, Y2);
                s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (Y2 != -1) {
                String str3 = CLEAN;
                if (Y == str3.length()) {
                    H3 = v.H(str, str3, false, 2, null);
                    if (H3) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = str.substring(Y2 + 1);
                        s.f(substring2, "(this as java.lang.String).substring(startIndex)");
                        D0 = w.D0(substring2, new char[]{' '}, false, 0, 6, null);
                        entry.setReadable$okhttp(true);
                        entry.setCurrentEditor$okhttp(null);
                        entry.setLengths$okhttp(D0);
                        return;
                    }
                }
            }
            if (Y2 == -1) {
                String str4 = DIRTY;
                if (Y == str4.length()) {
                    H2 = v.H(str, str4, false, 2, null);
                    if (H2) {
                        entry.setCurrentEditor$okhttp(new Editor(this, entry));
                        return;
                    }
                }
            }
            if (Y2 == -1) {
                String str5 = READ;
                if (Y == str5.length()) {
                    H = v.H(str, str5, false, 2, null);
                    if (H) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie$okhttp()) {
                s.f(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.g(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Entry[] entryArr;
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            Collection<Entry> values = this.lruEntries.values();
            s.f(values, "lruEntries.values");
            Object[] array = values.toArray(new Entry[0]);
            if (array != null) {
                for (Entry entry : (Entry[]) array) {
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                g gVar = this.journalWriter;
                s.e(gVar);
                gVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z11) {
        s.g(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (s.c(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            if (z11 && !entry$okhttp.getReadable$okhttp()) {
                int i11 = this.valueCount;
                for (int i12 = 0; i12 < i11; i12++) {
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    s.e(written$okhttp);
                    if (written$okhttp[i12]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i12))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i12);
                    }
                }
            }
            int i13 = this.valueCount;
            for (int i14 = 0; i14 < i13; i14++) {
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i14);
                if (z11 && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i14);
                        this.fileSystem.rename(file, file2);
                        long j11 = entry$okhttp.getLengths$okhttp()[i14];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i14] = size;
                        this.size = (this.size - j11) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            g gVar = this.journalWriter;
            s.e(gVar);
            if (!entry$okhttp.getReadable$okhttp() && !z11) {
                this.lruEntries.remove(entry$okhttp.getKey$okhttp());
                gVar.T(REMOVE).O0(32);
                gVar.T(entry$okhttp.getKey$okhttp());
                gVar.O0(10);
                gVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            gVar.T(CLEAN).O0(32);
            gVar.T(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(gVar);
            gVar.O0(10);
            if (z11) {
                long j12 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j12;
                entry$okhttp.setSequenceNumber$okhttp(j12);
            }
            gVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) {
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized Editor edit(String key, long j11) {
        s.g(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (j11 == ANY_SEQUENCE_NUMBER || (entry != null && entry.getSequenceNumber$okhttp() == j11)) {
            if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
                return null;
            }
            if (entry == null || entry.getLockingSourceCount$okhttp() == 0) {
                if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                    g gVar = this.journalWriter;
                    s.e(gVar);
                    gVar.T(DIRTY).O0(32).T(key).O0(10);
                    gVar.flush();
                    if (this.hasJournalErrors) {
                        return null;
                    }
                    if (entry == null) {
                        entry = new Entry(this, key);
                        this.lruEntries.put(key, entry);
                    }
                    Editor editor = new Editor(this, entry);
                    entry.setCurrentEditor$okhttp(editor);
                    return editor;
                }
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }

    public final synchronized void evictAll() {
        Entry[] entryArr;
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        s.f(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            for (Entry entry : (Entry[]) array) {
                s.f(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            g gVar = this.journalWriter;
            s.e(gVar);
            gVar.flush();
        }
    }

    public final synchronized Snapshot get(String key) {
        s.g(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry != null) {
            s.f(entry, "lruEntries[key] ?: return null");
            Snapshot snapshot$okhttp = entry.snapshot$okhttp();
            if (snapshot$okhttp != null) {
                this.redundantOpCount++;
                g gVar = this.journalWriter;
                s.e(gVar);
                gVar.T(READ).O0(32).T(key).O0(10);
                if (journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return snapshot$okhttp;
            }
            return null;
        }
        return null;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            s.f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e11) {
                Platform platform = Platform.Companion.get();
                platform.log("DiskLruCache " + this.directory + " is corrupt: " + e11.getMessage() + ", removing", 5, e11);
                delete();
                this.closed = false;
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        g gVar = this.journalWriter;
        if (gVar != null) {
            gVar.close();
        }
        g c11 = r.c(this.fileSystem.sink(this.journalFileTmp));
        c11.T(MAGIC).O0(10);
        c11.T(VERSION_1).O0(10);
        c11.q0(this.appVersion).O0(10);
        c11.q0(this.valueCount).O0(10);
        c11.O0(10);
        for (Entry entry : this.lruEntries.values()) {
            if (entry.getCurrentEditor$okhttp() != null) {
                c11.T(DIRTY).O0(32);
                c11.T(entry.getKey$okhttp());
                c11.O0(10);
            } else {
                c11.T(CLEAN).O0(32);
                c11.T(entry.getKey$okhttp());
                entry.writeLengths$okhttp(c11);
                c11.O0(10);
            }
        }
        b0 b0Var = b0.f54756a;
        b.a(c11, null);
        if (this.fileSystem.exists(this.journalFile)) {
            this.fileSystem.rename(this.journalFile, this.journalFileBackup);
        }
        this.fileSystem.rename(this.journalFileTmp, this.journalFile);
        this.fileSystem.delete(this.journalFileBackup);
        this.journalWriter = newJournalWriter();
        this.hasJournalErrors = false;
        this.mostRecentRebuildFailed = false;
    }

    public final synchronized boolean remove(String key) {
        s.g(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry != null) {
            s.f(entry, "lruEntries[key] ?: return false");
            boolean removeEntry$okhttp = removeEntry$okhttp(entry);
            if (removeEntry$okhttp && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return removeEntry$okhttp;
        }
        return false;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        g gVar;
        s.g(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (gVar = this.journalWriter) != null) {
                gVar.T(DIRTY);
                gVar.O0(32);
                gVar.T(entry.getKey$okhttp());
                gVar.O0(10);
                gVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i11 = this.valueCount;
        for (int i12 = 0; i12 < i11; i12++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i12));
            this.size -= entry.getLengths$okhttp()[i12];
            entry.getLengths$okhttp()[i12] = 0;
        }
        this.redundantOpCount++;
        g gVar2 = this.journalWriter;
        if (gVar2 != null) {
            gVar2.T(REMOVE);
            gVar2.O0(32);
            gVar2.T(entry.getKey$okhttp());
            gVar2.O0(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z11) {
        this.closed = z11;
    }

    public final synchronized void setMaxSize(long j11) {
        this.maxSize = j11;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}