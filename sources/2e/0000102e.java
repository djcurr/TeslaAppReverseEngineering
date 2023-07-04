package ch.qos.logback.classic.db;

import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;

/* loaded from: classes.dex */
public class SQLBuilder {
    public static String buildCreateExceptionTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb2.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(" BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.I;
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append(" SMALLINT NOT NULL, ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb2.append(" VARCHAR(254) NOT NULL, ");
        sb2.append("PRIMARY KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(", ");
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append("), ");
        sb2.append("FOREIGN KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append("REFERENCES ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append(")");
        return sb2.toString();
    }

    public static String buildCreateLoggingEventTableSQL(DBNameResolver dBNameResolver) {
        return "CREATE TABLE IF NOT EXISTS " + dBNameResolver.getTableName(TableName.LOGGING_EVENT) + " (" + dBNameResolver.getColumnName(ColumnName.TIMESTMP) + " BIGINT NOT NULL, " + dBNameResolver.getColumnName(ColumnName.FORMATTED_MESSAGE) + " TEXT NOT NULL, " + dBNameResolver.getColumnName(ColumnName.LOGGER_NAME) + " VARCHAR(254) NOT NULL, " + dBNameResolver.getColumnName(ColumnName.LEVEL_STRING) + " VARCHAR(254) NOT NULL, " + dBNameResolver.getColumnName(ColumnName.THREAD_NAME) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.REFERENCE_FLAG) + " SMALLINT, " + dBNameResolver.getColumnName(ColumnName.ARG0) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.ARG1) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.ARG2) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.ARG3) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.CALLER_FILENAME) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.CALLER_CLASS) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.CALLER_METHOD) + " VARCHAR(254), " + dBNameResolver.getColumnName(ColumnName.CALLER_LINE) + " CHAR(4), " + dBNameResolver.getColumnName(ColumnName.EVENT_ID) + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT)";
    }

    public static String buildCreatePropertyTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb2.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(" BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.MAPPED_KEY;
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append(" VARCHAR(254) NOT NULL, ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb2.append(" VARCHAR(254) NOT NULL, ");
        sb2.append("PRIMARY KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(", ");
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append("), ");
        sb2.append("FOREIGN KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append("REFERENCES ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append(")");
        return sb2.toString();
    }

    public static String buildDeleteExpiredLogsSQL(DBNameResolver dBNameResolver, long j11) {
        return "DELETE FROM " + dBNameResolver.getTableName(TableName.LOGGING_EVENT) + " WHERE " + dBNameResolver.getColumnName(ColumnName.TIMESTMP) + " <= " + j11 + ";";
    }

    public static String buildInsertExceptionSQL(DBNameResolver dBNameResolver) {
        return "INSERT INTO " + dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION) + " (" + dBNameResolver.getColumnName(ColumnName.EVENT_ID) + ", " + dBNameResolver.getColumnName(ColumnName.I) + ", " + dBNameResolver.getColumnName(ColumnName.TRACE_LINE) + ") VALUES (?, ?, ?)";
    }

    public static String buildInsertPropertiesSQL(DBNameResolver dBNameResolver) {
        return "INSERT INTO " + dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY) + " (" + dBNameResolver.getColumnName(ColumnName.EVENT_ID) + ", " + dBNameResolver.getColumnName(ColumnName.MAPPED_KEY) + ", " + dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE) + ") VALUES (?, ?, ?)";
    }

    public static String buildInsertSQL(DBNameResolver dBNameResolver) {
        return "INSERT INTO " + dBNameResolver.getTableName(TableName.LOGGING_EVENT) + " (" + dBNameResolver.getColumnName(ColumnName.TIMESTMP) + ", " + dBNameResolver.getColumnName(ColumnName.FORMATTED_MESSAGE) + ", " + dBNameResolver.getColumnName(ColumnName.LOGGER_NAME) + ", " + dBNameResolver.getColumnName(ColumnName.LEVEL_STRING) + ", " + dBNameResolver.getColumnName(ColumnName.THREAD_NAME) + ", " + dBNameResolver.getColumnName(ColumnName.REFERENCE_FLAG) + ", " + dBNameResolver.getColumnName(ColumnName.ARG0) + ", " + dBNameResolver.getColumnName(ColumnName.ARG1) + ", " + dBNameResolver.getColumnName(ColumnName.ARG2) + ", " + dBNameResolver.getColumnName(ColumnName.ARG3) + ", " + dBNameResolver.getColumnName(ColumnName.CALLER_FILENAME) + ", " + dBNameResolver.getColumnName(ColumnName.CALLER_CLASS) + ", " + dBNameResolver.getColumnName(ColumnName.CALLER_METHOD) + ", " + dBNameResolver.getColumnName(ColumnName.CALLER_LINE) + ") VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }
}