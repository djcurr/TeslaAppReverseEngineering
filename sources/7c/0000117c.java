package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TimeBasedFileNamingAndTriggeringPolicyBase<E> extends ContextAwareBase implements TimeBasedFileNamingAndTriggeringPolicy<E> {
    private static String COLLIDING_DATE_FORMAT_URL = "http://logback.qos.ch/codes.html#rfa_collision_in_dateFormat";
    protected String elapsedPeriodsFileName;
    protected long nextCheck;

    /* renamed from: rc  reason: collision with root package name */
    protected RollingCalendar f9137rc;
    protected TimeBasedRollingPolicy<E> tbrp;
    protected ArchiveRemover archiveRemover = null;
    protected long artificialCurrentTime = -1;
    protected Date dateInCurrentPeriod = null;
    protected boolean started = false;
    protected boolean errorFree = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public void computeNextCheck() {
        this.nextCheck = this.f9137rc.getNextTriggeringDate(this.dateInCurrentPeriod).getTime();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public ArchiveRemover getArchiveRemover() {
        return this.archiveRemover;
    }

    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convert(this.dateInCurrentPeriod);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public long getCurrentTime() {
        long j11 = this.artificialCurrentTime;
        return j11 >= 0 ? j11 : System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getElapsedPeriodsFileName() {
        return this.elapsedPeriodsFileName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isErrorFree() {
        return this.errorFree;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setCurrentTime(long j11) {
        this.artificialCurrentTime = j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDateInCurrentPeriod(long j11) {
        this.dateInCurrentPeriod.setTime(j11);
    }

    public void setDateInCurrentPeriod(Date date) {
        this.dateInCurrentPeriod = date;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy<E> timeBasedRollingPolicy) {
        this.tbrp = timeBasedRollingPolicy;
    }

    public void start() {
        DateTokenConverter<Object> primaryDateTokenConverter = this.tbrp.fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter == null) {
            throw new IllegalStateException("FileNamePattern [" + this.tbrp.fileNamePattern.getPattern() + "] does not contain a valid DateToken");
        }
        this.f9137rc = primaryDateTokenConverter.getTimeZone() != null ? new RollingCalendar(primaryDateTokenConverter.getDatePattern(), primaryDateTokenConverter.getTimeZone(), Locale.US) : new RollingCalendar(primaryDateTokenConverter.getDatePattern());
        addInfo("The date pattern is '" + primaryDateTokenConverter.getDatePattern() + "' from file name pattern '" + this.tbrp.fileNamePattern.getPattern() + "'.");
        this.f9137rc.printPeriodicity(this);
        if (!this.f9137rc.isCollisionFree()) {
            addError("The date format in FileNamePattern will result in collisions in the names of archived log files.");
            addError(COLLIDING_DATE_FORMAT_URL);
            withErrors();
            return;
        }
        setDateInCurrentPeriod(new Date(getCurrentTime()));
        if (this.tbrp.getParentsRawFileProperty() != null) {
            File file = new File(this.tbrp.getParentsRawFileProperty());
            if (file.exists() && file.canRead()) {
                setDateInCurrentPeriod(new Date(file.lastModified()));
            }
        }
        addInfo("Setting initial period to " + this.dateInCurrentPeriod);
        computeNextCheck();
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void withErrors() {
        this.errorFree = false;
    }
}