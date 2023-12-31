package ch.qos.logback.core;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ch.qos.logback.core.status.WarnStatus;
import java.util.Arrays;

@Deprecated
/* loaded from: classes.dex */
public class ConsoleAppender<E> extends OutputStreamAppender<E> {
    protected ConsoleTarget target = ConsoleTarget.SystemOut;

    private void targetWarn(String str) {
        WarnStatus warnStatus = new WarnStatus("[" + str + "] should be one of " + Arrays.toString(ConsoleTarget.values()), this);
        warnStatus.add(new WarnStatus("Using previously set target, System.out by default.", this));
        addStatus(warnStatus);
    }

    public String getTarget() {
        return this.target.getName();
    }

    public void setTarget(String str) {
        ConsoleTarget findByName = ConsoleTarget.findByName(str.trim());
        if (findByName == null) {
            targetWarn(str);
        } else {
            this.target = findByName;
        }
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        setOutputStream(this.target.getStream());
        super.start();
    }
}