package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class LoggerContextVO implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    final long birthTime;
    final String name;
    final Map<String, String> propertyMap;

    public LoggerContextVO(LoggerContext loggerContext) {
        this.name = loggerContext.getName();
        this.propertyMap = loggerContext.getCopyOfPropertyMap();
        this.birthTime = loggerContext.getBirthTime();
    }

    public LoggerContextVO(String str, Map<String, String> map, long j11) {
        this.name = str;
        this.propertyMap = map;
        this.birthTime = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoggerContextVO) {
            LoggerContextVO loggerContextVO = (LoggerContextVO) obj;
            if (this.birthTime != loggerContextVO.birthTime) {
                return false;
            }
            String str = this.name;
            if (str == null ? loggerContextVO.name == null : str.equals(loggerContextVO.name)) {
                Map<String, String> map = this.propertyMap;
                Map<String, String> map2 = loggerContextVO.propertyMap;
                return map == null ? map2 == null : map.equals(map2);
            }
            return false;
        }
        return false;
    }

    public long getBirthTime() {
        return this.birthTime;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getPropertyMap() {
        return this.propertyMap;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.propertyMap;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j11 = this.birthTime;
        return ((hashCode + hashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "LoggerContextVO{name='" + this.name + CoreConstants.SINGLE_QUOTE_CHAR + ", propertyMap=" + this.propertyMap + ", birthTime=" + this.birthTime + CoreConstants.CURLY_RIGHT;
    }
}