package ch.qos.logback.classic.db.names;

import java.util.Locale;

/* loaded from: classes.dex */
public class SimpleDBNameResolver implements DBNameResolver {
    private String tableNamePrefix = "";
    private String tableNameSuffix = "";
    private String columnNamePrefix = "";
    private String columnNameSuffix = "";

    @Override // ch.qos.logback.classic.db.names.DBNameResolver
    public <N extends Enum<?>> String getColumnName(N n11) {
        return this.columnNamePrefix + n11.name().toLowerCase(Locale.US) + this.columnNameSuffix;
    }

    @Override // ch.qos.logback.classic.db.names.DBNameResolver
    public <N extends Enum<?>> String getTableName(N n11) {
        return this.tableNamePrefix + n11.name().toLowerCase(Locale.US) + this.tableNameSuffix;
    }

    public void setColumnNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.columnNamePrefix = str;
    }

    public void setColumnNameSuffix(String str) {
        if (str == null) {
            str = "";
        }
        this.columnNameSuffix = str;
    }

    public void setTableNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.tableNamePrefix = str;
    }

    public void setTableNameSuffix(String str) {
        if (str == null) {
            str = "";
        }
        this.tableNameSuffix = str;
    }
}