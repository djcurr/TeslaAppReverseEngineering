package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    final int MAX_ERROR_COUNT = 4;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void checkRange() {
        StringBuilder sb2;
        String str;
        int i11;
        int i12 = this.depthStart;
        if (i12 < 0 || (i11 = this.depthEnd) < 0) {
            sb2 = new StringBuilder();
            sb2.append("Invalid depthStart/depthEnd range [");
            sb2.append(this.depthStart);
            sb2.append(", ");
            sb2.append(this.depthEnd);
            str = "] (negative values are not allowed)";
        } else if (i12 < i11) {
            return;
        } else {
            sb2 = new StringBuilder();
            sb2.append("Invalid depthEnd range [");
            sb2.append(this.depthStart);
            sb2.append(", ");
            sb2.append(this.depthEnd);
            str = "] (start greater or equal to end)";
        }
        sb2.append(str);
        addError(sb2.toString());
    }

    private boolean isRange(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        StringBuilder sb2 = new StringBuilder();
        if (this.evaluatorList != null) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= this.evaluatorList.size()) {
                    break;
                }
                try {
                } catch (EvaluationException e11) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e11);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e11);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (this.evaluatorList.get(i11).evaluate(iLoggingEvent)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (!z11) {
                return "";
            }
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i12 = this.depthStart;
            if (length > i12) {
                int i13 = this.depthEnd;
                if (i13 >= callerData.length) {
                    i13 = callerData.length;
                }
                while (i12 < i13) {
                    sb2.append(getCallerLinePrefix());
                    sb2.append(i12);
                    sb2.append("\t at ");
                    sb2.append(callerData[i12]);
                    sb2.append(CoreConstants.LINE_SEPARATOR);
                    i12++;
                }
                return sb2.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    protected String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    protected String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (isRange(firstOption)) {
                String[] splitRange = splitRange(firstOption);
                if (splitRange.length == 2) {
                    this.depthStart = Integer.parseInt(splitRange[0]);
                    this.depthEnd = Integer.parseInt(splitRange[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.depthEnd = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e11) {
            addError("Failed to parse depth option [" + firstOption + "]", e11);
        }
        List<String> optionList = getOptionList();
        if (optionList == null || optionList.size() <= 1) {
            return;
        }
        int size = optionList.size();
        for (int i11 = 1; i11 < size; i11++) {
            String str = optionList.get(i11);
            Context context = getContext();
            if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                addEvaluator(eventEvaluator);
            }
        }
    }
}