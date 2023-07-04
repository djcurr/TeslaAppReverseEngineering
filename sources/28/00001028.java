package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int ARG0_INDEX = 7;
    private static final int CALLER_CLASS_INDEX = 12;
    private static final int CALLER_FILENAME_INDEX = 11;
    private static final int CALLER_LINE_INDEX = 14;
    private static final int CALLER_METHOD_INDEX = 13;
    private static final short EXCEPTION_EXISTS = 2;
    private static final int FORMATTED_MESSAGE_INDEX = 2;
    private static final int LEVEL_STRING_INDEX = 4;
    private static final int LOGGER_NAME_INDEX = 3;
    private static final short PROPERTIES_EXIST = 1;
    private static final int REFERENCE_FLAG_INDEX = 6;
    private static final int THREAD_NAME_INDEX = 5;
    private static final int TIMESTMP_INDEX = 1;

    /* renamed from: db  reason: collision with root package name */
    private SQLiteDatabase f9127db;
    private DBNameResolver dbNameResolver;
    private String filename;
    private String insertExceptionSQL;
    private String insertPropertiesSQL;
    private String insertSQL;
    private SQLiteLogCleaner logCleaner;
    private Duration maxHistory;
    private long lastCleanupTime = 0;
    private Clock clock = new SystemClock();

    private String asStringTruncatedTo254(Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 != null && obj2.length() > 254) {
            obj2 = obj2.substring(0, 254);
        }
        return obj2 == null ? "" : obj2;
    }

    private void bindCallerData(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        bindString(sQLiteStatement, 11, stackTraceElement.getFileName());
        bindString(sQLiteStatement, 12, stackTraceElement.getClassName());
        bindString(sQLiteStatement, 13, stackTraceElement.getMethodName());
        bindString(sQLiteStatement, 14, Integer.toString(stackTraceElement.getLineNumber()));
    }

    private void bindLoggingEvent(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, computeReferenceMask(iLoggingEvent));
    }

    private void bindLoggingEventArguments(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        for (int i11 = 0; i11 < length && i11 < 4; i11++) {
            sQLiteStatement.bindString(i11 + 7, asStringTruncatedTo254(objArr[i11]));
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i11, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i11, str);
        }
    }

    private void clearExpiredLogs(SQLiteDatabase sQLiteDatabase) {
        if (lastCheckExpired(this.maxHistory, this.lastCleanupTime)) {
            this.lastCleanupTime = this.clock.currentTimeMillis();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.maxHistory);
        }
    }

    private static short computeReferenceMask(ILoggingEvent iLoggingEvent) {
        short s11 = 0;
        s11 = ((iLoggingEvent.getMDCPropertyMap() != null ? iLoggingEvent.getMDCPropertyMap().keySet().size() : 0) > 0 || (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null ? iLoggingEvent.getLoggerContextVO().getPropertyMap().size() : 0) > 0) ? (short) 1 : (short) 1;
        return iLoggingEvent.getThrowableProxy() != null ? (short) (s11 | 2) : s11;
    }

    private void insertException(SQLiteStatement sQLiteStatement, String str, short s11, long j11) {
        sQLiteStatement.bindLong(1, j11);
        sQLiteStatement.bindLong(2, s11);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    private void insertProperties(Map<String, String> map, long j11) {
        if (map.size() > 0) {
            SQLiteStatement compileStatement = this.f9127db.compileStatement(this.insertPropertiesSQL);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    compileStatement.bindLong(1, j11);
                    compileStatement.bindString(2, entry.getKey());
                    compileStatement.bindString(3, entry.getValue());
                    compileStatement.executeInsert();
                }
            } finally {
                compileStatement.close();
            }
        }
    }

    private void insertThrowable(IThrowableProxy iThrowableProxy, long j11) {
        SQLiteStatement compileStatement = this.f9127db.compileStatement(this.insertExceptionSQL);
        short s11 = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb2, iThrowableProxy);
                insertException(compileStatement, sb2.toString(), s11, j11);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s11 = (short) (s11 + 1);
                int i11 = 0;
                while (i11 < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb3, stackTraceElementProxyArray[i11]);
                    insertException(compileStatement, sb3.toString(), s11, j11);
                    i11++;
                    s11 = (short) (s11 + 1);
                }
                if (commonFrames > 0) {
                    insertException(compileStatement, "\t... " + commonFrames + " common frames omitted", s11, j11);
                    s11 = (short) (s11 + 1);
                }
                iThrowableProxy = iThrowableProxy.getCause();
            } finally {
                compileStatement.close();
            }
        }
    }

    private boolean lastCheckExpired(Duration duration, long j11) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        return j11 <= 0 || this.clock.currentTimeMillis() - j11 >= duration.getMilliseconds();
    }

    private Map<String, String> mergePropertyMaps(ILoggingEvent iLoggingEvent) {
        HashMap hashMap = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            hashMap.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            hashMap.putAll(mDCPropertyMap);
        }
        return hashMap;
    }

    private void secondarySubAppend(ILoggingEvent iLoggingEvent, long j11) {
        insertProperties(mergePropertyMaps(iLoggingEvent), j11);
        if (iLoggingEvent.getThrowableProxy() != null) {
            insertThrowable(iLoggingEvent.getThrowableProxy(), j11);
        }
    }

    private long subAppend(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) {
        bindLoggingEvent(sQLiteStatement, iLoggingEvent);
        bindLoggingEventArguments(sQLiteStatement, iLoggingEvent.getArgumentArray());
        bindCallerData(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e11) {
            addWarn("Failed to insert loggingEvent", e11);
            return -1L;
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                clearExpiredLogs(this.f9127db);
                SQLiteStatement compileStatement = this.f9127db.compileStatement(this.insertSQL);
                this.f9127db.beginTransaction();
                long subAppend = subAppend(iLoggingEvent, compileStatement);
                if (subAppend != -1) {
                    secondarySubAppend(iLoggingEvent, subAppend);
                    this.f9127db.setTransactionSuccessful();
                }
                if (this.f9127db.inTransaction()) {
                    this.f9127db.endTransaction();
                }
                compileStatement.close();
            } catch (Throwable th2) {
                addError("Cannot append event", th2);
            }
        }
    }

    protected void finalize() {
        this.f9127db.close();
    }

    public File getDatabaseFile(String str) {
        File file = (str == null || str.trim().length() <= 0) ? null : new File(str);
        return (file == null || file.isDirectory()) ? new File(new AndroidContextUtil().getDatabasePath("logback.db")) : file;
    }

    public String getFilename() {
        return this.filename;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.logCleaner == null) {
            final Clock clock = this.clock;
            this.logCleaner = new SQLiteLogCleaner() { // from class: ch.qos.logback.classic.android.SQLiteAppender.1
                @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
                public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) {
                    sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.dbNameResolver, clock.currentTimeMillis() - duration.getMilliseconds()));
                }
            };
        }
        return this.logCleaner;
    }

    public String getMaxHistory() {
        Duration duration = this.maxHistory;
        return duration != null ? duration.toString() : "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.dbNameResolver = dBNameResolver;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.logCleaner = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.maxHistory = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z11 = false;
        this.started = false;
        File databaseFile = getDatabaseFile(this.filename);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.f9127db = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            z11 = true;
        } catch (SQLiteException e11) {
            addError("Cannot open database", e11);
        }
        if (z11) {
            if (this.dbNameResolver == null) {
                this.dbNameResolver = new DefaultDBNameResolver();
            }
            this.insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(this.dbNameResolver);
            this.insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(this.dbNameResolver);
            this.insertSQL = SQLBuilder.buildInsertSQL(this.dbNameResolver);
            try {
                this.f9127db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.dbNameResolver));
                this.f9127db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.dbNameResolver));
                this.f9127db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.dbNameResolver));
                clearExpiredLogs(this.f9127db);
                super.start();
                this.started = true;
            } catch (SQLiteException e12) {
                addError("Cannot create database tables", e12);
            }
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f9127db.close();
        this.lastCleanupTime = 0L;
    }
}