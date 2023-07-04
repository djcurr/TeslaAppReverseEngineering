package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class SyslogStartConverter extends ClassicConverter {
    int facility;
    SimpleDateFormat simpleMonthFormat;
    SimpleDateFormat simpleTimeFormat;
    long lastTimestamp = -1;
    String timesmapStr = null;
    private final Calendar calendar = Calendar.getInstance(Locale.US);
    final String localHostName = "localhost";

    private String computeTimeStampString(long j11) {
        String str;
        synchronized (this) {
            if (j11 / 1000 != this.lastTimestamp) {
                this.lastTimestamp = j11 / 1000;
                Date date = new Date(j11);
                this.calendar.setTime(date);
                this.timesmapStr = String.format(Locale.US, "%s %2d %s", this.simpleMonthFormat.format(date), Integer.valueOf(this.calendar.get(5)), this.simpleTimeFormat.format(date));
            }
            str = this.timesmapStr;
        }
        return str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        return "<" + (this.facility + LevelToSyslogSeverity.convert(iLoggingEvent)) + ">" + computeTimeStampString(iLoggingEvent.getTimeStamp()) + " localhost ";
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z11;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        this.facility = SyslogAppenderBase.facilityStringToint(firstOption);
        try {
            Locale locale = Locale.US;
            this.simpleMonthFormat = new SimpleDateFormat("MMM", locale);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
            this.simpleTimeFormat = simpleDateFormat;
            simpleDateFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            this.simpleMonthFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            z11 = false;
        } catch (IllegalArgumentException e11) {
            addError("Could not instantiate SimpleDateFormat", e11);
            z11 = true;
        }
        if (z11) {
            return;
        }
        super.start();
    }
}