package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.helpers.NOPAppender;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ContextAwareImpl;

/* loaded from: classes.dex */
public class AppenderTracker<E> extends AbstractComponentTracker<Appender<E>> {
    final AppenderFactory<E> appenderFactory;
    final Context context;
    final ContextAwareImpl contextAware;
    int nopaWarningCount = 0;

    public AppenderTracker(Context context, AppenderFactory<E> appenderFactory) {
        this.context = context;
        this.appenderFactory = appenderFactory;
        this.contextAware = new ContextAwareImpl(context, this);
    }

    private NOPAppender<E> buildNOPAppender(String str) {
        int i11 = this.nopaWarningCount;
        if (i11 < 4) {
            this.nopaWarningCount = i11 + 1;
            ContextAwareImpl contextAwareImpl = this.contextAware;
            contextAwareImpl.addError("Building NOPAppender for discriminating value [" + str + "]");
        }
        NOPAppender<E> nOPAppender = new NOPAppender<>();
        nOPAppender.setContext(this.context);
        nOPAppender.start();
        return nOPAppender;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public Appender<E> buildComponent(String str) {
        Appender<E> appender;
        try {
            appender = this.appenderFactory.buildAppender(this.context, str);
        } catch (JoranException unused) {
            ContextAwareImpl contextAwareImpl = this.contextAware;
            contextAwareImpl.addError("Error while building appender with discriminating value [" + str + "]");
            appender = null;
        }
        return appender == null ? buildNOPAppender(str) : appender;
    }

    protected boolean isComponentStale(Appender<E> appender) {
        return !appender.isStarted();
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    protected /* bridge */ /* synthetic */ boolean isComponentStale(Object obj) {
        return isComponentStale((Appender) ((Appender) obj));
    }

    protected void processPriorToRemoval(Appender<E> appender) {
        appender.stop();
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    protected /* bridge */ /* synthetic */ void processPriorToRemoval(Object obj) {
        processPriorToRemoval((Appender) ((Appender) obj));
    }
}